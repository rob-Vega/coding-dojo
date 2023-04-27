import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;

    public Portfolio() { }

    public Portfolio(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public ArrayList<Project> getProjects() {
        return this.projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public int getPortafolioCost() {
        int totalCost = 0;
        for (Project project : this.projects) {
            totalCost += project.getInitialCost();
        }
        return totalCost;
    } 

    public void showPortafolio() {
        System.out.println("----- Portafolio -----\n");
        for (Project project : this.projects) {
            System.out.println(project.elevatorPitch());
        }
        System.out.println("Total Cost: $" + getPortafolioCost());
    }
}
