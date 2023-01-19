import transport.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("ООП_Инкапсуляция");

        Car car = new Car("Subaru", "Impreza WRX STI", "280", "Blue", "2005", "Japan",
                "Manual", "sedan", "x12SRT", "4",
                new Car.Key(false,true));
        Car.Key key = new Car.Key(false, true);
        System.out.println(car);
        System.out.println(key);
    }
}