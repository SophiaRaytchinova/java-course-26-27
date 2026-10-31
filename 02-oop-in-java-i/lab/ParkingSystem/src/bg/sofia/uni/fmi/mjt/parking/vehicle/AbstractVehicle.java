package bg.sofia.uni.fmi.mjt.parking.vehicle;

public abstract class AbstractVehicle implements Vehicle{
    private final LicensePlate licensePlate;
    private final int surchange;

    protected AbstractVehicle(LicensePlate licensePlate, int surchange) {
        this.licensePlate = licensePlate;
        this.surchange = surchange;
    }

    @Override
    public LicensePlate getLicensePlate() {
        return licensePlate;
    }

    @Override
    public int getSurcharge() {
        return surchange;
    }
}
