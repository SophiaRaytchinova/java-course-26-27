package bg.sofia.uni.fmi.mjt.parking.zone;

import bg.sofia.uni.fmi.mjt.parking.location.Location;

public class GreenZone extends AbstractZone {
    private final double innerRadius;
    private final double outerRadius;

    public GreenZone(String name, Location center, double innerRadius, double outerRadius) {
        super(name, "1303", center);
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
    }

    @Override
    public boolean contains(Location location) {
        if (location == null) {
            return false;
        }
        double distance = calculateDistance(location);
        return distance > innerRadius && distance <= outerRadius;
    }
}