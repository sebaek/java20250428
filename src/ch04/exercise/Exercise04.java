package ch04.exercise;

public class Exercise04 {
    public static void main(String[] args) {

        int a;
        int b;
        do {
            // 주사위 두 개 던지고
            a = (int) (Math.random() * 6) + 1;
            b = (int) (Math.random() * 6) + 1;

            System.out.println("(" + a + ", " + b + ")");
        } while ((a + b) != 5);
        // 합이 5가 아니면 다시
    }
}
