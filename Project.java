public class Project {
    public String name;
    public String desc;
    public double initialCost;

    public Project() {
        this("My Project", "The project that is mine");
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public Project(String name, String desc, double initialCost) {
        this.name = name;
        this.desc = desc;
        this.initialCost = initialCost;
    }

    public String elevatorPitch() {
        return name + " $" + initialCost + "0" + " : " + desc;
    }

    // getter
    public double getInitialCost() {
        return initialCost;
    }

    // setter
    public void setInitialCost(double initialCostInput) {
        initialCost = initialCostInput;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String nameInput) {
        name = nameInput;
    }

    // getter
    public String getDesc() {
        return desc;
    }

    // setter
    public void setDesc(String descInput) {
        desc = descInput;
    }

    
}