package bg.sofia.uni.fmi.mjt.parking.vehicle;

import java.util.regex.Pattern;

public class LicensePlate {
    private final String plate;
    private LicensePlate (String plate) {
        this.plate = plate;
    }

    public static LicensePlate parse(Stirng text) {
        if (text == null) {
            return null;
        }

        String cleaned = text.replace(" ", "").replace("-", "").toUpperCase();

        cleaned = cleaned.replace('A', 'А')
                        .replace('B', 'В')
                        .replace('E', 'Е')
                        .replace('K', 'К')
                        .replace('M', 'М')
                        .replace('H', 'Н')
                        .replace('O', 'О')
                        .replace('P', 'Р')
                        .replace('C', 'С')
                        .replace('T', 'Т')
                        .replace('Y', 'У')
                        .replace('X', 'Х');

        if (!Pattern.matches("^[A-Z]{1,2}[0-9]{4}[A-Z]{1,2}$", cleaned)) {
            return null;
        }

        return new LicensePlate(cleaned);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LicensePlate that)) return false;
        return plate.equals(that.plate);
    }

    @Override
    public int hashCode() {
        return plate.hashCode();
    }

    @Override
    public String toString() {
        return plate;
    }

}
