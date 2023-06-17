package lesson8;

import javax.swing.*;

public class ApplicationForm extends JFrame {
    private final String appTitle;

    public ApplicationForm(String appTitle) {
        super(appTitle);
        this.appTitle = appTitle;
        setVisible(true);
    }
}
