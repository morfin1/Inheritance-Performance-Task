public class SolarSystem {
    private double diameter;
    private int numPlanets;

    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public int getNumPlanets() {
        return numPlanets;
    }
    public void setNumPlanets(int numPlanets) {
        this.numPlanets = numPlanets;
    }

    public void printDiameter() {
        System.out.println("The diameter of the solar system is 287.46");
    }

    public void printNumPlanets() {
        System.out.println("There are 8 planets in our solar system.");
    }
}