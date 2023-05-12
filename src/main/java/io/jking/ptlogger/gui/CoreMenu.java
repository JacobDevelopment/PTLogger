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
        final Menu settings = new Menu("Database");
        settings.addItems(new MenuItem("Connect").onPressed(event -> {
            final DatabaseLoginDialog loginDialog = new DatabaseLoginDialog();
            if (loginDialog.isLoginSuccessful()) {
                // TODO: Implement connecting to database.
            }
        }));

        settings.addItems(new MenuItem("Disconnect").onPressed(event -> {
            // TODO: Implement disconnecting from the database.
        }));


        return settings;
    }

    public MenuBar getMenuBar() {
        return menuBar;
    }
}
