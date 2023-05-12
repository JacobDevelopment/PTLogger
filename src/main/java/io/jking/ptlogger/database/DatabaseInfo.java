package io.jking.ptlogger.database;

public class DatabaseInfo {

    private final String url;
    private final String username;
    private final String password;

    public DatabaseInfo(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
