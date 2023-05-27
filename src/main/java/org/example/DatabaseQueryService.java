package org.example;

import org.example.ClassesForQueries.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    private String readFile(String query) {
        String string = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/sql/find_max_projects_client.sql"));
            String line;
            while ((line = reader.readLine()) != null) {
                string += " " + line;
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
       return string;
    }

    List<MaxProjectCountClient> findMaxProjectsClient() throws SQLException {
        String query = readFile("src/sql/find_max_projects_client.sql");


        System.out.println(query);
        Statement statement = Database.getInstance().getCONNECTION().createStatement();
        ResultSet result = statement.executeQuery(query);
        List<MaxProjectCountClient> list = new ArrayList<>();
        while (result.next()) {
            MaxProjectCountClient countClient = new MaxProjectCountClient();
            list.add(countClient);
        }
        System.out.println(list.get(0));
        return list;
    }
    List<LongestProject>  findLongestProject() {
        String query = readFile("src/sql/find_longest_project.sql");
        System.out.println(query);
        List<LongestProject> list = new ArrayList<>();
        try {
            Statement statement = Database.getInstance().getCONNECTION().createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                LongestProject longestProject = new LongestProject(result.getInt("ID"), result.getInt("MONTH"));
                int month = result.getInt("name");
                int salary = result.getInt("salary");

                System.out.println("name: " + month);
                System.out.println("salary: " + salary);
                list.add(longestProject);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list.get(0));
        return list;
    }
    List<MaxSalaryWorker> findMaxSalaryWorker() {
        String query = readFile("src/sql/find_max_salary_worker.sql");
        System.out.println(query);
        List<MaxSalaryWorker> list = new ArrayList<>();
        try {
            Statement statement = Database.getInstance().getCONNECTION().createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                MaxSalaryWorker maxSalary = new MaxSalaryWorker(result.getString("name"), result.getLong("salary"));
                String name = result.getString("name");
                int salary = result.getInt("salary");

                System.out.println("name: " + name);
                System.out.println("salary: " + salary);
                System.out.println(maxSalary.toString());
//                list.add(maxSalary);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list.get(0));
        return list;
    }
    List<YoungestEldestWorker> findYoungestEldestWorker() {
        String query = readFile("src/sql/find_youngest_eldest_workers.sql");
        System.out.println(query);
        List<YoungestEldestWorker> list = new ArrayList<>();
        try {
            Statement statement = Database.getInstance().getCONNECTION().createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                YoungestEldestWorker worker = new YoungestEldestWorker(result.getString("type"), result.getString("name"), result.getString("birthday"));
                String type = result.getString("type");
                String name = result.getString("name");
                String birthday = result.getString("birthday");

                System.out.println("name: " + type);
                System.out.println("salary: " + name);
                System.out.println("salary: " + birthday);

                list.add(worker);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list.get(0));
        return list;
    }
    List<ProjectPrices> findProjectPrices() {
        String query = readFile("src/sql/print_project_prices.sql");
        System.out.println(query);
        List<ProjectPrices> list = new ArrayList<>();
        try {
            Statement statement = Database.getInstance().getCONNECTION().createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                ProjectPrices projectPrices = new ProjectPrices(result.getString("name"), result.getString("PROJECT_PRICES"));
                System.out.println(projectPrices.toString());
                list.add(projectPrices);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list.get(0));
        return list;
    }
}
