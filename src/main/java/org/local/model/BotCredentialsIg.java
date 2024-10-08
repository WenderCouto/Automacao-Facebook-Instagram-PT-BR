package org.local.model;

/**
 * BotCredentialsIg class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class BotCredentialsIg {
    private final String username;
    private final String password;
    private final boolean facebookBot;
    private final boolean instagramBot;
    //Maybe for future additions
    private String fbReportUrls;
    private final int rowIndex;

    public BotCredentialsIg(String IgUsername, String IgPassword, boolean isFacebook, boolean isInstagram, int rowIndex) {
        this.username = IgUsername;
        this.password = IgPassword;
        this.facebookBot = isFacebook;
        this.instagramBot = isInstagram;
        this.rowIndex = rowIndex;
    }

    public boolean isInstagramBot() {
        return instagramBot;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getRowIndex() {
        return rowIndex;
    }
}
