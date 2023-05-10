package io.jking.ptlogger.gui;

import javax.swing.*;
import java.awt.*;

public class Window {

    private static final int    WIDTH  = 1200;
    private static final int    HEIGHT = 800;
    private static final String TITLE  = "PTLogger";

    private final JFrame   frame;
    private final CoreMenu coreMenu;

    public Window() {
        this.frame = new JFrame();
        this.coreMenu = new CoreMenu();
        final Dimension dimension = new Dimension(WIDTH, HEIGHT);
        frame.setMinimumSize(dimension);
        frame.setMaximumSize(dimension);
        frame.setPreferredSize(dimension);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(false);
        frame.setTitle(TITLE);
        frame.setJMenuBar(coreMenu.getMenuBar());
        frame.setVisible(true);
    }

}
