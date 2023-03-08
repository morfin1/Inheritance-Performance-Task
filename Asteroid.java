public class Asteroid extends AsteroidBelt{
    private double metersOfMinerals;
    private int color;
    public double getMetersOfMinerals() {
        return metersOfMinerals;
    }
    public void setMetersOfMinerals(double metersOfMinerals) {
        this.metersOfMinerals = metersOfMinerals;
    }
    public int getColor() {
        return color;
    }
    public void setColor(int color) {
        this.color = color;
    }

    public void printColor() {
        System.out.println("The color of the asteroid is grey");
    }

    public void printMetersOfMinerals() {
        System.out.println(metersOfMinerals
        );
    }
}