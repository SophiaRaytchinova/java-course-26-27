package bg.sofia.uni.fmi.mjt.parking.location;

public class Location {
    private final double x;
    private final double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
