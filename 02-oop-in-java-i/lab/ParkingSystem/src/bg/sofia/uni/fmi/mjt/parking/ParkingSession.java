package bg.sofia.uni.fmi.mjt.parking;

import java.time.LocalDateTime;
import java.util.Objects;

public class ParkingSession {
    private final String plate;
    private final String smsNumber;
    private final LocalDateTime expiryTime;

    public ParkingSession(String plate, String smsNumber, LocalDateTime expiryTime) {
        if (plate == null || smsNumber == null || expiryTime == null) {
            throw new IllegalArgumentException("ParkingSession parameters cannot be null");
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSession that = (ParkingSession) o;
        return Objects.equals(plate, that.plate) &&
                Objects.equals(smsNumber, that.smsNumber) &&
                Objects.equals(expiryTime, that.expiryTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plate, smsNumber, expiryTime);
    }

    @Override
    public String toString() {
        return "ParkingSession{" +
                "plate='" + plate + '\'' +
                ", smsNumber='" + smsNumber + '\'' +
                ", expiryTime=" + expiryTime +
                '}';
    }
}