package org.example;

import java.io.*;
import java.util.Arrays;

public class DatabaseInitService {
    public static void main(String[] args) {

        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("src/sql/init_db.sql"));
            String line;
            String string = ".";
            int c = 0;
            String[] query = new String[4];
            while ((line = reader1.readLine()) != null) {
                string += line;
                string = string.replace(".", "");
                if (line.equals(")")) {
                    query[c] = string;
                    string = ".";
                    c++;
                }
            }

            for (int i = 0; i < query.length; i++) {
                Database.getInstance().executeUpdate(query[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
