package bg.sofia.uni.fmi.mjt.parking.zone;

import bg.sofia.uni.fmi.mjt.parking.location.Location;

public abstract class AbstractZone implements ParkingZone {
    private final String name;
    private final String smsNumber;
    protected final Location center;

    protected AbstractZone(String name, String smsNumber, Location center) {
        this.name = name;
        this.smsNumber = smsNumber;
        this.center = center;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSmsNumber() {
        return smsNumber;
    }

    protected double calculateDistance(Location location) {
        double dx = location.getX() - center.getX();
        double dy = location.getY() - center.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public abstract boolean contains(Location location);
}


