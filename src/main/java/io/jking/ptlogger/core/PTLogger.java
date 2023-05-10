package io.jking.ptlogger.core;

import io.jking.ptlogger.gui.Window;

public class PTLogger {

    private static final PTLogger instance = new PTLogger();

    private final Window window;

    private PTLogger() {
        this.window = new Window();
    }

    public static PTLogger getInstance() {
        if (instance == null)
            return new PTLogger();
        return instance;
    }


}
