package ch04.sec05;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        // 1 ~ 100 사이의 자연수의 합 구하기

        int sum = 0;

        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("sum = " + sum);
    }
}
