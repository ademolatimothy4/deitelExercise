package Chapter3.Car;

public class CarApplication {

    public static void main(String[] args) {
        Car car1 = new Car("lexus", "2024", 4000000.0);
        Car car2 = new Car("Toyota", "2005", 200000.0);

        System.out.println("Car.Car 1 price is:$" + car1.getPrice());
        System.out.println("Car.Car 2 price is:$" + car2.getPrice());



        System.out.println("Car.Car 1 price after 5% discount is:$" + car1.getPrice() * 0.95);
        System.out.println("Car.Car 2 price after 7% discount is:$" + car2.getPrice() * 0.97);
    }
}
