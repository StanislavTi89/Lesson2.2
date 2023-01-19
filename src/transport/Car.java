package transport;

public class Car {
    private final String brand;
    private final String model;
    private String engineCapacity;
    private String color;
    private final String year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final String numberSeats;
    private boolean isSummerWinter;
    private Key key;

    public Car(String brand, String model, String engineCapacity, String color,
               String year, String country, String transmission, String bodyType,
               String regNumber, String numberSeats, Key key) {
        this.brand = validateCarParametrs(brand);
        this.model = validateCarParametrs(model);
        this.engineCapacity = validateCarEngine(engineCapacity);
        this.color = validateCarColor(color);
        this.year = validateCarYear(year);
        this.country = validateCoutry(country);
        this.transmission = validateTransmission(transmission);
        this.bodyType = validateCarParametrs(bodyType);
        this.regNumber = validateCarNumber(regNumber);
        this.numberSeats = validateCarNumber(numberSeats);
    }

    private String validateCoutry(String country) {
        return country;
    }

    private String validateCarNumber(String numberSeats) {
        return numberSeats;
    }

    private String validateCarParametrs(String brand) {
        return brand;
    }

    private String validateCarYear(String year) {
        return year;
    }

    private String validateCarColor(String color) {
        return color;
    }

    private String validateCarEngine(String engineCapacity) {
        return engineCapacity;
    }

    private String validateTransmission(String transmission) {
        return transmission;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getNumberSeats() {
        return numberSeats;
    }

    public boolean isSummerWinter() {
        return isSummerWinter;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void changeType(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            isSummerWinter = false;
        }
        if (month >= 4 && month <= 10) {
            isSummerWinter = true;
        }
    }
    public static class Key {
        private final Boolean remoteStart;
        private final Boolean keyAccess;

        public Key(Boolean remoteStart, Boolean keyAccess) {
            this.remoteStart = validateBoolean(remoteStart);
            this.keyAccess = validateBoolean(keyAccess);
        }

        private Boolean validateBoolean(Boolean remoteStart) {
            return remoteStart;
        }
    }

    public String toString() {
        return getBrand() + " " + getModel() + ", " + getEngineCapacity() + ", " + getColor()
                + ", " + getYear() + ", " + getCountry() + " " + getTransmission() + ", " +
                getBodyType() + ", " + getNumberSeats() + ", " + getRegNumber() + ", ";

    }

}
