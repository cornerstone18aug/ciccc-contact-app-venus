package controller;

import model.Contact;

/**
 * Created by katayama on 2018/10/25.
 */
public class InputCollector {
    private String prompString;

    public String getPrompString() {
        return prompString;
    }

    public void setPrompString(String prompString) {
        this.prompString = prompString;
    }

    public String inputForPrompt(String input) {
        this.prompString = input;
        return getPrompString();
    }
}
