package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj = 100; // boxing

        int v = obj; // unboxing

        int r = v + 100;
        System.out.println("r = " + r);

        int s = obj + 300;
        
    }
}
