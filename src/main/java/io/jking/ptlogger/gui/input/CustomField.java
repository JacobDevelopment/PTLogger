package io.jking.ptlogger.gui.input;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CustomField extends JTextField {

    public CustomField(int width, int height) {
        final Dimension dimension = new Dimension(width, height);
        setPreferredSize(dimension);
        setMinimumSize(dimension);
        setMaximumSize(dimension);
    }

    public CustomField setVisibility(final boolean visibility) {
        setVisible(visibility);
        return this;
    }

    public CustomField setStatus(final boolean status) {
        setEnabled(status);
        return this;
    }

    public CustomField addKeyAdapter(final KeyAdapter keyAdapter) {
        addKeyListener(keyAdapter);
        return this;
    }

    public boolean hasText() {
        return getText().length() > 0;
    }
}