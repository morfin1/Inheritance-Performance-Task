public class AsteroidBelt extends SolarSystem{
    private double radius;
    private double numAsteroids;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getNumAsteroids() {
        return numAsteroids;
    }
    public void setNumAsteroids(double numAsteroids) {
        this.numAsteroids = numAsteroids;
    }

    public void printRadius() {
        System.out.println("The radius of the asteroid belt is around 450 million km or 279 miles.");
    }

    public void printNumAsteroids() {
        System.out.println("There are between 1.1-1.9 million asteroids in the asteroid belt.");
    }
}
