package bg.sofia.uni.fmi.mjt.parking;

import java.time.LocalDateTime;

public class ParkingSession {
    private final String plate;
    private final String smsNumber;
    private final LocalDateTime expiryTime;

    public ParkingSession(String plate, String smsNumber, LocalDateTime expiryTime) {
        this.plate = plate;
        this.smsNumber = smsNumber;
        this.expiryTime = expiryTime;
    }

    public String getPlate() {
        return plate;
    }

    public String getSmsNumber() {
        return smsNumber;
    }

    public LocalDateTime getExpiryTime() {
        return expiryTime;
    }
}