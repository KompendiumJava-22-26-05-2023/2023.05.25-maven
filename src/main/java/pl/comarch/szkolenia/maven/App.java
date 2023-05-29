package pl.comarch.szkolenia.maven;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("BMW");
        System.out.println(car.getBrand());
        System.out.println(car);

        Car car2 = new Car("BMW", "3", "KR11", 400.00, true);
        car2.setBrand("Audi");

        System.out.println(car.equals(car2));

    }
}
