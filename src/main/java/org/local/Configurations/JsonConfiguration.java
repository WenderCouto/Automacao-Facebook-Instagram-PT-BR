package org.local.Configurations;

import org.json.JSONObject;
import org.local.model.ConfigurationInfo;
import org.local.model.SupportedBrowser;
import org.local.services.ConfigSearcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * JsonConfiguration class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class JsonConfiguration {
    private static final Logger jsonConfigurationLog = LoggerFactory.getLogger(JsonConfiguration.class);

    public ConfigurationInfo setConfig() {
        ConfigSearcher configSearcher = new ConfigSearcher();
        String configFilePath = configSearcher.findFile("config.json");
        jsonConfigurationLog.info("Caminho de arquivo Json identificado: {}", configFilePath);

        if (configFilePath.equals("Arquivo não encontrado.")) {
            jsonConfigurationLog.error("Arquivo de configuração não encontrado.");
        }

        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get(configFilePath)));
        } catch (IOException e) {
            jsonConfigurationLog.error("Ocorreu um erro ao ler o arquivo: {}", configFilePath);
        }

        assert content != null;
        JSONObject config = standardizeKeys(new JSONObject(content));
        String browser = config.getString(standardizeKey("navegador")).toUpperCase();
        SupportedBrowser supportedBrowser = SupportedBrowser.valueOf(browser);

        return new ConfigurationInfo(
                config.getString("$CAMINHO_ARQUIVO + XLSX"),
                supportedBrowser,
                config.getBoolean(standardizeKey("ativarbotfacebook")),
                config.getString(standardizeKey("linkcontacliente/alvofacebook")),
                config.getString(standardizeKey("nomedousuariocliente/alvofacebook")),
                config.getInt(standardizeKey("numerobotsfacebook")),
                config.getBoolean(standardizeKey("ativarbotinstagram")),
                config.getString(standardizeKey("linkcontacliente/alvoinstagram")),
                config.getString(standardizeKey("igdousuariocliente/alvoinstagram")),
                config.getInt(standardizeKey("numerobotsinstagram")),
                config.getBoolean(standardizeKey("reportfacebookpostbylink")),
                config.getBoolean(standardizeKey("inativarbotsautomaticamente")),
                config.getInt(standardizeKey("numerodeinstanciasporvez")),
                config.getInt(standardizeKey("timerdetrabalhoemcontasemminutos"))
        );
    }

    private static String standardizeKey(String key) {
        return key.toLowerCase().replaceAll(" ", "").replaceAll("-", "").replaceAll("_", "");
    }

    private static JSONObject standardizeKeys(JSONObject config) {
        JSONObject newConfig = new JSONObject();
        for(String key : config.keySet()) {
            if (key.equalsIgnoreCase("$CAMINHO_ARQUIVO + XLSX")) {
                newConfig.put(key, config.get(key));
            } else {
                newConfig.put(standardizeKey(key), config.get(key));
            }
        }
        return newConfig;
    }
}