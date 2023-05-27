package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DatabasePopulateService {
    public static void main(String[] args) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("src/sql/populate_db.sql"));
            String line;
            int c = 0;
            String[] query = new String[22];
            while ((line = reader1.readLine()) != null) {
                    query[c] = line;
                    c++;
            }
            for (String s : query) {
                Database.getInstance().executeUpdate(s);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
