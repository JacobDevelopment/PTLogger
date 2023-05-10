package io.jking.ptlogger.gui.dialog;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class DatabaseLoginDialog {

    private static final String TITLE  = "Connect To Database";
    private static final int    WIDTH  = 450;
    private static final int    HEIGHT = 185;

    private static final int       INPUT_WIDTH     = 300;
    private static final int       INPUT_HEIGHT    = 25;

    private static final Dimension INPUT_DIMENSION = new Dimension(INPUT_WIDTH, INPUT_HEIGHT);
    private final JDialog dialog;

    public DatabaseLoginDialog() {
        final Dimension dimension = new Dimension(WIDTH, HEIGHT);
        this.dialog = new JDialog();
        dialog.setLayout(new MigLayout());
        dialog.setMinimumSize(INPUT_DIMENSION);

        dialog.add(new JLabel("Database URL"), "align label");
        dialog.add(getURLInput(), "wrap");

        dialog.add(new JLabel("Database Username"), "align label");
        dialog.add(getUsernameInput(), "wrap");

        dialog.add(new JLabel("Database Password"), "align label");
        dialog.add(getPasswordInput(), "wrap");

        dialog.add(getConnectButton(), "center center");
        dialog.add(getRememberCheckBox(), "center center");

        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setTitle(TITLE);
        dialog.setMinimumSize(dimension);
        dialog.setPreferredSize(dimension);
        dialog.setMaximumSize(dimension);
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    private JTextField getURLInput() {
        final JTextField field = new JTextField();
        field.setMinimumSize(INPUT_DIMENSION);
        field.setVisible(true);
        return field;
    }

    private JTextField getUsernameInput() {
        final JTextField field = new JTextField();
        field.setMinimumSize(INPUT_DIMENSION);
        field.setVisible(true);
        return field;
    }

    private JPasswordField getPasswordInput() {
        final JPasswordField field = new JPasswordField();
        field.setMinimumSize(INPUT_DIMENSION);
        field.setVisible(true);
        return field;
    }

    private JButton getConnectButton() {
        return new JButton("Connect");
    }

    private JCheckBox getRememberCheckBox() {
        return new JCheckBox("Remember Information?");
    }


}
