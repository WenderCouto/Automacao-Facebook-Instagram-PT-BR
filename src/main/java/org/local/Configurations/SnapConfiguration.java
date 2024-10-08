package org.local.Configurations;

import org.local.model.WindowPosition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SnapConfiguration class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class SnapConfiguration {
    private static final Logger snapConfigurationLog = LoggerFactory.getLogger(SnapConfiguration.class);

    public native WindowPosition positionWindowInCorner(int x, int y, int width, int height, int windowPositionIndex);
    public native WindowPosition positionWindowInHalf(int x, int y, int width, int height, int windowPositionIndex);

    public SnapConfiguration() {
        String osName = System.getProperty("os.name").toUpperCase();
        String osArch = System.getProperty("os.arch");
        if(osName.contains("WINDOWS")){
            String currentDir = System.getProperty("user.dir");
            if(osArch.contains("64")) {
                String dllpath = currentDir + "\\src\\main\\java\\org\\local\\JNI\\Cpp\\WindowsSnapConfigurationLibrary_x64.dll";
                System.load(dllpath);
            } else if (osArch.contains("x86")) {
                String dllpath = currentDir + "\\src\\main\\java\\org\\local\\JNI\\Cpp\\WindowsSnapConfigurationLibrary_x32.dll";
                System.load(dllpath);
            }
        } else if (osName.contains("UNIX")) {
            String currentDir = System.getProperty("user.dir");
            System.load(currentDir+ "/home/teste/githubPath/Automacao-Facebook-Instagram/src/main/java/org/local/JNI/Cpp/LinuxSnapConfigurationLibrary_x86_64.so");
        } else if (osName.contains("MAC")) {
            String currentDir = System.getProperty("user.dir");
            String dylibPath = currentDir + "/src/main/java/org/local/JNI/Cpp/libMacOSSnapConfiguration.dylib";
            System.load(dylibPath);
        } else {
            snapConfigurationLog.error("Operação não suportada");
        }
    }
}