package io.jking.ptlogger.utility;

public class StringUtils {

    private StringUtils() {

    }

    public static String convertPassword(final char[] password) {
        if (password.length == 0) {
            return "";
        }
        return new String(password);
    }

}
