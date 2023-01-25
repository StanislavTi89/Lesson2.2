import transport.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("ООП_Инкапсуляция");
        Car car = new Car("Лада", "Седан", 1.6, "Баклажан", 2005,
                "Россия", "РУчная_Коробка", "Седан", "х123йу_RUS23",
                4, true, null);
        System.out.println(car);

    }
}