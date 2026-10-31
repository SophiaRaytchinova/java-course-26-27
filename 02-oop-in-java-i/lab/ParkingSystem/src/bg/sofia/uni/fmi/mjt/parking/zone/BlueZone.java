package bg.sofia.uni.fmi.mjt.parking.zone;

import bg.sofia.uni.fmi.mjt.parking.location.Location;

public class BlueZone extends AbstractZone {
    private final double radius;

    public BlueZone(String name, Location center, double radius) {
        super(name, "1302", center);
        this.radius = radius;
    }

    @Override
    public boolean contains(Location location) {
        if (location == null) {
            return false;
        }
        double distance = calculateDistance(location);
        return distance <= radius;
    }
}
