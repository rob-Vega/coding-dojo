import java.util.ArrayList;

public class ProjectTest {
    public static void main(String[] args) {
        Project firstProject = 
            new Project("First Project", ".............!", 250.0);
        Project secondProject = 
            new Project("Second Project", ".............!", 500.0);
        Project thirdProject = 
            new Project("Third Project", ".............!", 120.0);

        System.out.println(firstProject.elevatorPitch());

        ArrayList<Project> projects = new ArrayList<>();
        projects.add(firstProject);
        projects.add(secondProject);
        projects.add(thirdProject);

        Portfolio portfolio = new Portfolio(projects);
        System.out.println(portfolio.getPortafolioCost());
        portfolio.showPortafolio();
    }
}
