package org.example.ClassesForQueries;

public class MaxSalaryWorker {
    private String name;
    private Long salary;

    public MaxSalaryWorker(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "MaxSalaryWorker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
