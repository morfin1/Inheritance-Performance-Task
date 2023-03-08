public class Planet extends SolarSystem{
    private boolean atmosphere;
    private double population;

    public boolean isAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public void printHasAtmpsphere() {
        System.out.println("Earth's atmosphere is composed of about 78% nitrogen, 21% oxygen, and one percent other gases.");
    }

    public void printPopulation() {
        System.out.println("The population on Earth is around 7.888 billion");
    }

}