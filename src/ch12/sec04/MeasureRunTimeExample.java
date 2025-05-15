package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long start = System.nanoTime();

        // 프로그램
        int sum = 0;
        for (int i = 0; i <= 1000000; i++) {
            sum += i;
        }

        long end = System.nanoTime();
        System.out.println("1부터 백만까지 합:" + sum);

        System.out.println((end - start) + "ns");
    }
}
