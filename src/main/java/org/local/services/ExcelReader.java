package org.local.services;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.local.model.BotCredentialsContainer;
import org.local.model.BotCredentialsFb;
import org.local.model.BotCredentialsIg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ExcelReader class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */
public class ExcelReader {
    private static final Logger excelReaderLog = LoggerFactory.getLogger(ExcelReader.class);

    private static final String commentsExcel = "/Users/Developer/Downloads/Projetos Programacao/Automacao-Facebook-Instagram-PT-BR/src/main/resources/comentarios.xlsx";

    public BotCredentialsContainer excelCredentialReader(String excelFilePath, boolean autoInactivate) {
        List<BotCredentialsFb> fbCredentialsList = new ArrayList<>();
        List<BotCredentialsIg> igCredentialsList = new ArrayList<>();

        excelReaderLog.info("Caminho do arquivo Xlsx identificado: {}", excelFilePath);

        try (FileInputStream inputStream = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(inputStream)) {

            Sheet firstSheet = workbook.getSheetAt(0);
            DataFormatter formatter = new DataFormatter();

            for (int colIndex = 3; colIndex <= 9; colIndex++) {
                int rowIndex = 1;

                while (true) {
                    Row nextRow = firstSheet.getRow(rowIndex);
                    if (nextRow == null) break;

                    String fbUserCell = getCellAsString(nextRow, 6, formatter);
                    String fbPassCell = getCellAsString(nextRow, 7, formatter);
                    String igUserCell = getCellAsString(nextRow, 3, formatter);
                    String igPassCell = getCellAsString(nextRow, 4, formatter);
                    String fbReportUrlsCell = getCellAsString(nextRow, 9, formatter);
                    String stateCell = getCellAsString(nextRow, colIndex, formatter);

                    if (fbUserCell == null || fbPassCell == null || igUserCell == null || igPassCell == null) {
                        rowIndex++;
                        continue;
                    }

                    boolean fbActive = "Ativo".equalsIgnoreCase(stateCell) || "Ativado".equalsIgnoreCase(stateCell);
                    boolean igActive = "Ativo".equalsIgnoreCase(stateCell) || "Ativado".equalsIgnoreCase(stateCell);

                    if (igActive && fbActive && fbReportUrlsCell != null) {
                        BotCredentialsFb botCredentialsFb = new BotCredentialsFb(fbUserCell, fbPassCell, true, false, fbReportUrlsCell, rowIndex);
                        BotCredentialsIg botCredentialsIg = new BotCredentialsIg(igUserCell, igPassCell, false, true, rowIndex);
                        fbCredentialsList.add(botCredentialsFb);
                        igCredentialsList.add(botCredentialsIg);
                    } else if (igActive && fbActive) {
                        BotCredentialsFb botCredentialsFb = new BotCredentialsFb(fbUserCell, fbPassCell, true, false, null, rowIndex);
                        BotCredentialsIg botCredentialsIg = new BotCredentialsIg(igUserCell, igPassCell, false, true, rowIndex);
                        fbCredentialsList.add(botCredentialsFb);
                        igCredentialsList.add(botCredentialsIg);
                    } else if (fbActive && fbReportUrlsCell != null) {
                        BotCredentialsFb botCredentialsFb = new BotCredentialsFb(fbUserCell, fbPassCell, true, false, fbReportUrlsCell, rowIndex);
                        fbCredentialsList.add(botCredentialsFb);
                    } else if (fbActive) {
                        BotCredentialsFb botCredentialsFb = new BotCredentialsFb(fbUserCell, fbPassCell, true, false, null, rowIndex);
                        fbCredentialsList.add(botCredentialsFb);
                    } else if (igActive) {
                        BotCredentialsIg botCredentialsIg = new BotCredentialsIg(igUserCell, igPassCell, false, true, rowIndex);
                        igCredentialsList.add(botCredentialsIg);
                    }

                    rowIndex++;
                }
            }

            if (autoInactivate) {
                try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
                    workbook.write(outputStream);
                }
            }

        } catch (IOException e) {
            excelReaderLog.error("Erro ao processar o arquivo Excel ", e);
        }
        return new BotCredentialsContainer(fbCredentialsList, igCredentialsList);
    }

    public static String getCommentFromExcel(int rowIndex) {
        try (FileInputStream inputStream = new FileInputStream(commentsExcel);
             Workbook workbook = new XSSFWorkbook(inputStream)) {
            DataFormatter formatter = new DataFormatter();

            Row row = workbook.getSheetAt(0).getRow(rowIndex);
            if (row == null || row.getCell(0) == null) return null;

            Cell cell = row.getCell(0);
            return formatter.formatCellValue(cell);

        } catch (IOException e) {
            excelReaderLog.error("Erro ao ler o arquivo Excel: ", e);
            return null;
        }
    }

    private String getCellAsString(Row row, int cellNum, DataFormatter formatter) {
        Cell cell = row.getCell(cellNum, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
        return cell == null ? null : formatter.formatCellValue(cell);
    }

    public void markAccountAsInactive(String excelFilePath, int rowIndex, int fbStateColIndex, int igStateColIndex) {
        try (FileInputStream inputStream = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(inputStream);
             FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {

            Row row = workbook.getSheetAt(0).getRow(rowIndex);

            if (row != null) {
                Cell fbStateCell = row.getCell(fbStateColIndex, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                fbStateCell.setCellValue("Inativo");

                Cell igStateCell = row.getCell(igStateColIndex, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                igStateCell.setCellValue("Inativo");

                workbook.write(outputStream);
            }
        } catch (IOException e) {
            excelReaderLog.error("Erro ao marcar a conta como Inativa no arquivo Excel ", e);
        }
    }
}