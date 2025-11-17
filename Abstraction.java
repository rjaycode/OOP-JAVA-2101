// Abstract class
abstract class Car {
    String brand = "Toyota";

    abstract void startEngine();
    abstract void stopEngine();

    void showBrand() {
        System.out.println("Car Brand: " + brand);
    }
}

// Subclass Toyota Vios
class ToyotaVios extends Car {

    @Override
    void startEngine() {
        System.out.println("Toyota Vios engine started using push button.");
    }

    @Override
    void stopEngine() {
        System.out.println("Toyota Vios engine stopped using brake.");
    }

    void happenInside() {
        System.out.println("When you press the brake, the car uses fluid to push the brake pads "
                + "against the wheels, creating friction that slows the car down.");
    }

    void showModel() {
        System.out.println("Model: Toyota Vios 2024");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar = new ToyotaVios();   // Abstraction + Polymorphism

        myCar.showBrand();
        myCar.startEngine();
        myCar.stopEngine();

        // Access subclass-specific methods using casting
        ((ToyotaVios) myCar).happenInside();
        ((ToyotaVios) myCar).showModel();
    }
}
Write to Rjay Brucal
