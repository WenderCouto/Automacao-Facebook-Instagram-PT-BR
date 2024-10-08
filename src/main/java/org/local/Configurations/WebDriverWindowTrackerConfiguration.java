package org.local.Configurations;

import org.local.model.WindowPosition;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * WebDriverWindowTrackerConfiguration class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class WebDriverWindowTrackerConfiguration {
    private static final Logger windowTrackerLog = LoggerFactory.getLogger(WebDriverWindowTrackerConfiguration.class);

    private final Set<WebDriver.Window> trackedWindows;

    public WebDriverWindowTrackerConfiguration() {
        trackedWindows = new HashSet<>();
    }

    public void registerWindow(WebDriver.Window window) {
        trackedWindows.add(window);
    }

    public void removeWindow(WebDriver.Window window) {
        trackedWindows.remove(window);
    }

    public void applySnappingFour(int windowPositionIndex) {
        for (WebDriver.Window window : trackedWindows) {
            Point currentPosition = window.getPosition();
            int currentX = currentPosition.getX();
            int currentY = currentPosition.getY();
            int width = window.getSize().getWidth();
            int height = window.getSize().getHeight();

            WindowPosition newPosition = null;
            try {
                newPosition = new SnapConfiguration().positionWindowInCorner(currentX, currentY, width, height, windowPositionIndex);
            } catch (Exception e) {
                windowTrackerLog.error("Erro ao aplicar dados de posição da janela ", e);
            }

            int x = newPosition.x;
            int y = newPosition.y;
            int newWidth = newPosition.width;
            int newHeight = newPosition.height;

            window.setPosition(new Point(x, y));
            window.setSize(new Dimension(newWidth, newHeight));

            windowPositionIndex = (windowPositionIndex + 1) % 4;
        }
    }

    public void applySnappingTwo(int windowPositionIndex) {
        for (WebDriver.Window window : trackedWindows) {
            Point currentPosition = window.getPosition();
            int currentX = currentPosition.getX();
            int currentY = currentPosition.getY();
            int width = window.getSize().getWidth();
            int height = window.getSize().getHeight();

            WindowPosition newPosition = null;
            try {
                newPosition = new SnapConfiguration().positionWindowInHalf(currentX, currentY, width, height, windowPositionIndex);
            } catch (Exception e) {
                windowTrackerLog.error("Erro ao aplicar dados de posição da janela ", e);
            }

            int x = newPosition.x;
            int y = newPosition.y;
            int newWidth = newPosition.width;
            int newHeight = newPosition.height;

            window.setPosition(new Point(x, y));
            window.setSize(new Dimension(newWidth, newHeight));

            windowPositionIndex = (windowPositionIndex + 1) % 2;
        }
    }
}