package transport;

import java.time.LocalDate;
import java.security.Key;
import java.util.regex.Pattern;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

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
               String regNumber, String numberSeats, boolean isSummerWinter, Key key) {
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
        return null;
    }

    private String validateCarNumber(String numberSeats) {
        return null;
    }

    private String validateCarParametrs(String brand) {
        return null;
    }

    private String validateCarYear(String year) {
        return null;
    }

    private String validateCarColor(String color) {
        return null;
    }

    private String validateCarEngine(String engineCapacity) {
        return null;
    }

    private String validateTransmission(String transmission) {
        return null;
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

    public static class Key {
        private final boolean
    }

}
