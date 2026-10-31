package bg.sofia.uni.fmi.mjt.parking.vehicle;

public abstract class AbstractVehicle implements Vehicle{
    private final LicensePlate licensePlate;
    private final int surcharge;

    protected AbstractVehicle(LicensePlate licensePlate, int surcharge) {
        this.licensePlate = licensePlate;
        this.surcharge = surcharge;
    }

    @Override
    public LicensePlate getLicensePlate() {
        return licensePlate;
    }

    @Override
    public int getSurcharge() {
        return surcharge;
    }
}
