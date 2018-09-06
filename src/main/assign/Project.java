package assign;

import java.util.ArrayList;

public class Project {

    private String name;
    private String description;
    private double initialCost;
    private ArrayList<String> elevatorPitchList = new ArrayList<String>();

    public Project()  { name=""; description=""; }
    public Project(String myname) { name=myname; description=""; }
    public Project(String myname, String mydescription) { name=myname; description=mydescription; }

    public String getName() {  return name; }

    public String getDescription() {  return description; }

    public void setCost(double initCost) { initialCost = initCost; }
    public double getCost() { return initialCost; }

    public void setElevatorPitch(Project other) {
        String str = other.getName()+ " (" + other.getCost() +"):" + other.getDescription();
        elevatorPitchList.add(str);
    }
    public ArrayList getElevatorPitchs() {
        return elevatorPitchList;
    }

    public void displayAttrs() {
        System.out.println(name);
        System.out.println(description);
        System.out.println(initialCost);
        for(String str:elevatorPitchList) {
            System.out.print(str+"  ");
        }
    }

}
