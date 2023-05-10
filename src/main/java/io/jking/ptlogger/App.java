package io.jking.ptlogger;

import io.jking.ptlogger.core.PTLogger;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PTLogger::getInstance);
    }

}
