package org.example.ClassesForQueries;

public class ProjectPrices {
    private String name;
    private String PROJECT_PRICES;

    public ProjectPrices(String name, String project_prices) {
        this.name = name;
        this.PROJECT_PRICES = project_prices;
    }

    @Override
    public String toString() {
        return "ProjectPrices{" +
                "name='" + name + '\'' +
                ", project_prices='" + PROJECT_PRICES + '\'' +
                '}';
    }
}
