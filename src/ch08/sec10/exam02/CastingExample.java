package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle bus = new Bus();

        bus.run();

        Bus b = (Bus) bus;
        b.run();
        b.checkFare();
    }
}
