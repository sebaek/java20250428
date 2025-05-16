package ch13.sec02.exam02;

public class GenericExample {
    public static void main(String[] args) {
        HomeAgency agency1 = new HomeAgency();
        Home home = agency1.rent();
        home.turnOnLight();

        CarAgency agency2 = new CarAgency();
        Car car = agency2.rent();
        car.run();
    }
}
