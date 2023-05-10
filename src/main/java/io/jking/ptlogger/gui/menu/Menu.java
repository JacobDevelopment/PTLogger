package io.jking.ptlogger.gui.menu;

import io.jking.ptlogger.core.Checks;

import javax.swing.*;
public class Menu extends JMenu {

    public Menu(final String title) {
        Checks.notEmpty(title, "Menu Title");
        setText(title);
    }

    public Menu addItems(final MenuItem... items) {
        for (final MenuItem item : items) {
            Checks.notNull(item, "MenuItem");
            add(item);
        }
        return this;
    }


}
