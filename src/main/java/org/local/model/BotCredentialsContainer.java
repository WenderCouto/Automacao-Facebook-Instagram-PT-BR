package org.local.model;

import java.util.List;

/**
 * BotCredentialContainer class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class BotCredentialsContainer {
    private final  List<BotCredentialsFb> fbCredentialsList;
    private final List<BotCredentialsIg> igCredentialsList;

    public BotCredentialsContainer(List<BotCredentialsFb> fbCredentialsList, List<BotCredentialsIg> igCredentialsList) {
        this.fbCredentialsList = fbCredentialsList;
        this.igCredentialsList = igCredentialsList;
    }

    public List<BotCredentialsFb> getFbCredentialsList() {
        return fbCredentialsList;
    }

    public List<BotCredentialsIg> getIgCredentialsList() {
        return igCredentialsList;
    }
}
