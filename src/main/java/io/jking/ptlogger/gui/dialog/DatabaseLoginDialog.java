package io.jking.ptlogger.gui.dialog;

import io.jking.ptlogger.core.Checks;
import io.jking.ptlogger.database.DatabaseInfo;
import io.jking.ptlogger.gui.input.CustomField;
import io.jking.ptlogger.io.DatabaseInfoSaver;
import io.jking.ptlogger.utility.StringUtils;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.security.Key;

public class DatabaseLoginDialog {

    private static final String TITLE  = "Connect To Database";
    private static final int    WIDTH  = 450;
    private static final int    HEIGHT = 185;

    private static final int INPUT_WIDTH  = 300;
    private static final int INPUT_HEIGHT = 25;

    private static final Dimension INPUT_DIMENSION     = new Dimension(INPUT_WIDTH, INPUT_HEIGHT);
    private final        JButton   connectButton       = new JButton("Connect");
    private final        JCheckBox rememberInformation = new JCheckBox("Remember Information");

    private final CustomField usernameInput = new CustomField(INPUT_WIDTH, INPUT_HEIGHT)
            .addKeyAdapter(getKeyAdapter())
            .setStatus(true)
            .setVisibility(true);

    private final CustomField urlInput = new CustomField(INPUT_WIDTH, INPUT_HEIGHT)
            .addKeyAdapter(getKeyAdapter())
            .setStatus(true)
            .setVisibility(true);

    private final CustomField passwordInput = new CustomField(INPUT_WIDTH, INPUT_HEIGHT)
            .addKeyAdapter(getKeyAdapter())
            .setStatus(true)
            .setVisibility(true);

    public DatabaseLoginDialog() {
        final Dimension dimension = new Dimension(WIDTH, HEIGHT);
        configureButton();
        JDialog dialog = new JDialog();
        dialog.setLayout(new MigLayout());
        dialog.setMinimumSize(INPUT_DIMENSION);

        dialog.add(new JLabel("Database URL"), "align label");
        dialog.add(urlInput, "wrap");

        dialog.add(new JLabel("Database Username"), "align label");
        dialog.add(usernameInput, "wrap");

        dialog.add(new JLabel("Database Password"), "align label");
        dialog.add(passwordInput, "wrap");

        dialog.add(connectButton, "center center");
        dialog.add(rememberInformation, "center center");

        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setTitle(TITLE);
        dialog.setMinimumSize(dimension);
        dialog.setPreferredSize(dimension);
        dialog.setMaximumSize(dimension);
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    private KeyAdapter getKeyAdapter() {
        return new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                final boolean urlText = urlInput.hasText();
                final boolean usernameText = usernameInput.hasText();
                final boolean passwordText = passwordInput.hasText();

                if (urlText && usernameText && passwordText) {
                    connectButton.setEnabled(true);
                }
            }
        };
    }

    private void configureButton() {
        connectButton.setEnabled(false);
        connectButton.setActionCommand("connect");
        connectButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                final boolean isSelected = rememberInformation.isSelected();
                if (isSelected) {
                    handleSavingInformation();
                }
            }
        });
    }

    private void handleSavingInformation() {
        try {
            final String url = urlInput.getText();
            final String username = usernameInput.getText();
            final String password = passwordInput.getText();
            new DatabaseInfoSaver().save(new DatabaseInfo(url, username, password));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isLoginSuccessful() {
        return false;
    }
}
