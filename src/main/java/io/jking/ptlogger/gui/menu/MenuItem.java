package io.jking.ptlogger.gui.menu;

import io.jking.ptlogger.core.Checks;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.function.Consumer;

public class MenuItem extends JMenuItem {

    public MenuItem(final String text) {
        Checks.notEmpty(text, "MenuItem Title");
        setText(text);
    }

    public MenuItem onPressed(Consumer<ActionEvent> event) {
        addActionListener(event::accept);
        return this;
    }
}
