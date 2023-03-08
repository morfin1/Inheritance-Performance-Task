public class Comet extends AsteroidBelt{
    private double metersOfGass;
    private double massOfComet;

    public double getMetersOfGass() {
        return metersOfGass;
    }

    public void setMetersOfGass(double MetersOfGass) {
        this.metersOfGass = MetersOfGass;
    }

    public double getMassOfComet() {
        return massOfComet;
    }

    public void setMassOfComet(double massOfComet) {
        this.massOfComet = massOfComet;
    }

    public void printMetersOfMinerals() {
        System.out.println(metersOfGass);
    }

    public void printMass() {
        System.out.println(massOfComet);
    }

    @Override
    public void printRadius() {
        System.out.println("The radius of a standard comet is 0.2-15 km");
    }

    @Override
    public void printDiameter() {
        System.out.println("The diameter of a standard comet is 0.4-30 km");
    }
}