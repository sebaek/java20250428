package ch03.sec05;

public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;


        System.out.println(z + 2);

        double a = x % y;
        System.out.println("a = " + a);
        System.out.println(a + 2);

        if (Double.isNaN(z) || Double.isInfinite(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }

    }
}
