package io.jking.ptlogger.gui.menu;

import io.jking.ptlogger.core.Checks;

import javax.swing.*;

public class MenuBar extends JMenuBar {

    public MenuBar() {
        setEnabled(true);
        setVisible(true);
    }

    public MenuBar addMenuWithItems(final Menu menu, final MenuItem... items) {
        Checks.notNull(menu, "Menu");
        for (MenuItem item : items) {
            menu.add(item);
        }
        add(menu);
        return this;
    }

    public MenuBar addMenu(final Menu menu) {
        addMenuWithItems(menu);
        return this;
    }

}
