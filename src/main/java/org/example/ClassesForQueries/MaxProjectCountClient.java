package org.example.ClassesForQueries;

public class MaxProjectCountClient {
    private String name;
    private int project_count;
    public MaxProjectCountClient(String name, int projectCount) {
        this.name = name;
        this.project_count = projectCount;
    }
    @Override
    public String toString() {
        return "MaxProjectCountClient{" +
                "name='" + name + '\'' +
                ", projectCount=" + project_count +
                '}';
    }
}
