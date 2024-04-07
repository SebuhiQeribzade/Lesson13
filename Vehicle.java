package Lesson13;
class Vehicle {
    String make;
    String model;

    Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
}

class Car extends Vehicle {
    int numDoors;

    Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }
}

class Bike extends Vehicle {
    int numWheels;

    Bike(String make, String model, int numWheels) {
        super(make, model);
        this.numWheels = numWheels;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 4);
        System.out.println("Car: " + car.make + " " + car.model + ", Number of doors: " + car.numDoors);

        Bike bike = new Bike("Honda", "CBR600RR", 2);
        System.out.println("Bike: " + bike.make + " " + bike.model + ", Number of wheels: " + bike.numWheels);
    }
}

