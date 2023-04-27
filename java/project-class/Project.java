public class Project {
    private String name, description;
    private double initialCost;
    
    public Project() { }
    
    public Project(String name) { 
        this.name = name;
    }
    
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public Project(String name, String description, double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public double getInitialCost() {
        return this.initialCost;
    }
    
    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }
    
    public String elevatorPitch() {
        return String.format("%s ($%.2f) : %s", this.name, this.initialCost, this.description);
    }
}