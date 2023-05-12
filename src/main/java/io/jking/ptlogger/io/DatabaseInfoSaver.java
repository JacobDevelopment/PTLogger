package io.jking.ptlogger.io;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.jking.ptlogger.database.DatabaseInfo;

import java.io.File;
import java.io.IOException;

public class DatabaseInfoSaver {



    public void save(final DatabaseInfo databaseInfo) throws IOException {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("config.json"), databaseInfo);
        System.out.println("Saved?");
    }
}
