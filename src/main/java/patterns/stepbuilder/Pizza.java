package patterns.stepbuilder;

import java.util.List;

public class Pizza {

    private final String name;
    private String doughType;
    private String fish;
    private String cheese;
    private String meat;
    private List vegetables;

    public Pizza(String name) {
        this.name = name;
    }

    public String getDoughType() {
        return doughType;
    }

    protected void setDoughType(String doughType) {
        this.doughType = doughType;
    }

    public String getFish() {
        return fish;
    }

    protected void setFish(String fish) {
        this.fish = fish;
    }

    public String getCheese() {
        return cheese;
    }

    protected void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getMeat() {
        return meat;
    }

    protected void setMeat(String meat) {
        this.meat = meat;
    }

    public List getVegetables() {
        return vegetables;
    }

    protected void setVegetables(List vegetables) {
        this.vegetables = vegetables;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza [name=" + name + ", doughType=" + doughType + ", fish="
                + fish + ", cheese=" + cheese + ", meat=" + meat
                + ", vegetables=" + vegetables + "]";
    }
}
