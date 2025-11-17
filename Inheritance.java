class Vehicle {
    String brand;

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String brand;
    String model;
    String color;
    int yearmodel;
    String gas;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year Model: " + yearmodel);
        System.out.println("Gas: " + gas );
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Vios";
        myCar.color = "Red";
        myCar.yearmodel = 2013;
        myCar.gas = "Petron";
        
        myCar.start();
        myCar.displayInfo();
    }
}
