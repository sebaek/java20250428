package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car a = new Car();

        a.run();

        a.tire1 = new KumhoTire();
        a.tire2 = new KumhoTire();

        a.run();
    }
}
