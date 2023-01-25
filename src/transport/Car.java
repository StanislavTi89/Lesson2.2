package transport;

public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String gear;
    private final String typeOfBody;
    private String regNumber;
    private final int capacity;
    private boolean summerTyres;
    private Key key;

    public static class Key {

        private final boolean remoteRun;
        private final boolean withoutAccess;

        public Key(boolean remoteRun, boolean withoutAccess) {
            this.remoteRun = remoteRun;
            this.withoutAccess = withoutAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithoutAccess() {
            return withoutAccess;
        }

        @Override
        public String toString() {
            return (remoteRun ? "удаленный Старт" : "без удаленного Старта") + ", " + (withoutAccess ? "удаленный ключ доступ" : "удаленный ключ доступ отсутствует");
        }

    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String gear,
               String typeOfBody,
               String regNumber,
               int capacity,
               boolean summerTyres,
               Key key) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setColor(color);
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isEmpty()) {
            country = "default";
        }
        this.country = country;
        setGear(gear);
        if (typeOfBody == null || typeOfBody.isEmpty()) {
            typeOfBody = "седан";
        }
        this.typeOfBody = typeOfBody;
        setRegNumber(regNumber);
        if (capacity <= 0) {
            capacity = 5;
        }
        this.capacity = capacity;
        this.summerTyres = summerTyres;
        setKey(key);
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "белый";
        }
        this.color = color;
    }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }
    public String getGear() {
        return gear;
    }
    public void setGear(String gear) {
        if (gear == null || gear.isEmpty()) {
            gear = "МКПП";
        }
        this.gear = gear;
    }
    public String getTypeOfBody() {
        return typeOfBody;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isEmpty()) {
            regNumber = "x000xx000";
        }
        this.regNumber = regNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }
    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }
    public void changeTyres(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            summerTyres = false;
        }
        if (month >= 4 && month <= 10) {
            summerTyres = true;
        }
    }
    public String toString() {
        return "Марка: " + brand + ", " + "модель: " + model + ", " + "объём двигателя в литрах: " + engineVolume + ", " +
                "цвет кузова: " + color + ", " + "год производства: " + year + ", " + "страна сборки: " + country + ", " +
                "коробка передач: " + gear + ", " + "тип кузова: " + typeOfBody + ", " + "регистрационный номер: " + regNumber + ", " +
                "кол-во мест: " + capacity + ", " + (summerTyres ? "летняя" : "зимняя") + " резина";
    }

}
