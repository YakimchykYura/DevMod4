package org.example;

import org.example.ClassesForQueries.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
//        List<MaxProjectCountClient> maxProjectCountClients = new DatabaseQueryService().findMaxProjectsClient();
//        System.out.println(maxProjectCountClients.size());
//        System.out.println(maxProjectCountClients.get(0));

//        List<LongestProject> list = new DatabaseQueryService().findLongestProject();
//        System.out.println(list.size());
//        System.out.println(list.get(0));
        List<MaxSalaryWorker> list = new DatabaseQueryService().findMaxSalaryWorker();
        System.out.println(list.size());
        System.out.println(list.get(0));
//        List<YoungestEldestWorker> list = new DatabaseQueryService().findYoungestEldestWorker();
//        System.out.println(list.size());
//        System.out.println(list.get(0).toString());

//        List<ProjectPrices> list = new DatabaseQueryService().findProjectPrices();
//        System.out.println(list.size());
//        System.out.println(list.get(0).toString());
    }
}