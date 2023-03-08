public class Star extends SolarSystem{
    private double localApparentGravity;
    private double lumens;

    public double getLocalApparentGravity() {
        return localApparentGravity;
    }

    public void setLocalApparentGravity(double localApparentGravity) {
        this.localApparentGravity = localApparentGravity;
    }

    public double getLumens() {
        return lumens;
    }

    public void setLumens(double lumens) {
        this.lumens = lumens;
    }

    public void printLumens() {
        System.out.println(lumens);
    }

    public void printLAG() {
        System.out.println(localApparentGravity
        );
    }
}