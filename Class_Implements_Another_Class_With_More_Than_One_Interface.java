public class Class_Implements_Another_Class_With_More_Than_One_Interface {
}
class Vehicle {
    public void start() {
        System.out.println("The vehicle has started");
    }
}

interface Drivable {
    void drive();
}

interface Parkable {
    void park();
}

class Car extends Vehicle implements Drivable, Parkable {
    public void drive() {
        System.out.println("The car is driving");
    }

    public void park() {
        System.out.println("The car is parking");
    }
}

class ExtendsClassAndImplementsInterfac {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
        car.park();
    }
}
