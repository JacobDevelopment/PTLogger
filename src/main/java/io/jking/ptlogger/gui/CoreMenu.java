package io.jking.ptlogger.gui;

import io.jking.ptlogger.gui.dialog.DatabaseLoginDialog;
import io.jking.ptlogger.gui.menu.Menu;
import io.jking.ptlogger.gui.menu.MenuBar;
import io.jking.ptlogger.gui.menu.MenuItem;

public class CoreMenu {

    private final MenuBar menuBar;

    public CoreMenu() {
        this.menuBar = new MenuBar();
        menuBar.addMenu(getSettingsMenu());
    }

    private Menu getSettingsMenu() {
        final Menu settings = new Menu("Settings");
        settings.addItems(new MenuItem("Connect To Database").onPressed(event -> {
            new DatabaseLoginDialog();
        }));
        return settings;
    }

    public MenuBar getMenuBar() {
        return menuBar;
    }
}
