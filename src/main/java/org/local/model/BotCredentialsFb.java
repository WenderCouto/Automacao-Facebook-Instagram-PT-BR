package org.local.model;

/**
 * BotCredentialsFb class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class BotCredentialsFb {
    private final String username;
    private final String password;
    private final boolean facebookBot;
    private final boolean instagramBot;
    private final String fbReportUrls;
    private final int rowIndex;

    public BotCredentialsFb(String fbUsername, String fbPassword, boolean isFacebook, boolean isInstagram, String fbReportUrlsCell, int rowIndex) {
        this.username = fbUsername;
        this.password = fbPassword;
        this.facebookBot = isFacebook;
        this.instagramBot = isInstagram;
        this.fbReportUrls = fbReportUrlsCell;
        this.rowIndex = rowIndex;
    }

    public boolean isFacebookBot() {
        return facebookBot;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFbReportUrls() {
        return fbReportUrls;
    }

    public int getRowIndex() {
        return rowIndex;
    }
}