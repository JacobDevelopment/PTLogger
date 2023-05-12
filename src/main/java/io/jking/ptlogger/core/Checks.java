package io.jking.ptlogger.core;

public class Checks {

    private Checks() {

    }

    public static void notNull(final Object object, final String name) {
        if (object == null) {
            throw new IllegalArgumentException(name + " is null!");
        }
    }

    public static void notEmpty(final String string, final String name) {
        notNull(string, name);
        if (string.isEmpty()) {
            throw new IllegalArgumentException(name + " is empty!");
        }
    }

    public static boolean allNotEmpty(final String... strings) {
        for (final String string : strings) {
            if (string.isEmpty())
                return false;
        }
        return true;
    }

}
