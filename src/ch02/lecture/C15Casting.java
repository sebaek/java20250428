package ch02.lecture;

public class C15Casting {
    public static void main(String[] args) {
        // 작은 타입 -> 큰 타입 (문제없음)

        // 큰 타입 -> 작은 타입 (문제가 있을 수 있음, 매우 조심해야함)

        byte a;
        short b;
        b = 100;
        System.out.println("b = " + b); // 100
        
        // 기본적으론 안됨, 강제로 해야함 (type casting)
        a = (byte) b;
        System.out.println("a = " + a);

        b = 128;
        a = (byte) b;
        System.out.println("b = " + b);
        System.out.println("a = " + a); // 128?

        b = 987;
        a = (byte) b;
        System.out.println("b = " + b);
        System.out.println("a = " + a);


    }
}
