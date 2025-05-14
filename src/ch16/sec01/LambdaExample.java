package ch16.sec01;

public class LambdaExample {

    public static void main(String[] args) {
        action((x, y) -> {
            int r = x + y;
            System.out.println("r = " + r);
        });
        action((x, y) -> {
            int r = x - y;
            System.out.println("r = " + r);
        });
    }

    public static void action(Calculable calculable) {
        calculable.calculate(10, 4);
    }
}
