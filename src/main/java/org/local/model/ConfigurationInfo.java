package org.local.model;

/**
 * ConfigurationInfo class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class ConfigurationInfo {
    private final String filePath;
    private final SupportedBrowser browser;
    private final boolean facebookBot;
    private final String facebookClientAcc;
    private final String clientName;
    private final int facebookBotQuantity;
    private final boolean instagramBot;
    private final String instagramClientAcc;
    private final String clientIg;
    private final int instagramBotQuantity;
    private final boolean fbReportUrls;
    private final boolean autoInactivate;
    private final int eachInstanceNumberPerAcc;
    private final int timeInMinutePerAcc;

    public ConfigurationInfo(String filePath, SupportedBrowser browser,
                             boolean facebookBot, String facebookClientAcc, String clientName, int facebookBotQuantity,
                             boolean instagramBot, String instagramClientAcc, String clientIg, int instagramBotQuantity,
                             boolean fbReportUrls, boolean autoInactivate, int eachInstanceNumberPerAcc,
                             int timeInMinutePerAcc) {
        this.filePath = filePath;
        this.browser = browser;
        this.facebookBot = facebookBot;
        this.facebookClientAcc = facebookClientAcc;
        this.clientName = clientName;
        this.facebookBotQuantity = facebookBotQuantity;
        this.instagramBot = instagramBot;
        this.instagramClientAcc = instagramClientAcc;
        this.clientIg = clientIg;
        this.instagramBotQuantity = instagramBotQuantity;
        this.fbReportUrls = fbReportUrls;
        this.autoInactivate = autoInactivate;
        this.eachInstanceNumberPerAcc = eachInstanceNumberPerAcc;
        this.timeInMinutePerAcc = timeInMinutePerAcc;
    }

    public String getFilePath() {
        return filePath;
    }

    public SupportedBrowser getBrowser() {
        return browser;
    }

    public boolean isFacebookBot() {
        return facebookBot;
    }

    public String getFacebookClientAcc() {
        return facebookClientAcc;
    }

    public String getClientName() {
        return clientName;
    }

    public int getFacebookBotQuantity() {
        return facebookBotQuantity;
    }

    public boolean isInstagramBot() {
        return instagramBot;
    }

    public String getInstagramClientAcc() {
        return instagramClientAcc;
    }

    public String getClientIg() {
        return clientIg;
    }

    public int getInstagramBotQuantity() {
        return instagramBotQuantity;
    }

    public boolean isFbReportUrls() {
        return fbReportUrls;
    }

    public boolean isAutoInactivate() {
        return autoInactivate;
    }

    public int getEachInstanceNumberPerAcc() {
        return eachInstanceNumberPerAcc;
    }

    public int getTimeInMinutePerAcc() {
        return timeInMinutePerAcc;
    }
}