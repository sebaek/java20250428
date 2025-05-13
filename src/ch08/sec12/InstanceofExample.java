package ch08.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        ride(new Taxi());
        System.out.println();
        ride(new Bus());
    }

    public static void ride(Vehicle vehicle) {

        if (vehicle instanceof Bus bus) {
            bus.checkFare();
        }

        vehicle.run();
    }
}
