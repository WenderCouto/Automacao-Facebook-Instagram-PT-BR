package org.local.services;

import java.io.File;

/**
 * ConfigSearcher class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class ConfigSearcher {
    public String findFile(String target) {
        String relativePath = "src/main/resources/" + target;
        File targetFile = new File(relativePath);

        if (targetFile.exists()) {
            return targetFile.getAbsolutePath();
        }

        String[] directories = {System.getProperty("user.home") + "/Desktop",
                System.getProperty("user.home") + "/Downloads"};
        for (String directory : directories) {
            targetFile = findInDirectory(new File(directory), target);
            if (targetFile != null) {
                return targetFile.getAbsolutePath();
            }
        }

        return "Arquivo não encontrado.";
    }

    private File findInDirectory(File directory, String target) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isHidden()) {
                    continue;
                }

                if (file.isDirectory()) {
                    File found = findInDirectory(file, target);
                    if (found != null) {
                        return found;
                    }
                } else if (file.getName().equals(target)) {
                    return file;
                }
            }
        }
        return null;
    }
}
