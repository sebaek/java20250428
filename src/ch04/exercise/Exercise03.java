package ch04.exercise;

public class Exercise03 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            if ((i % 3) == 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("sum = " + sum);

        System.out.println("----------");
        int sum2 = 0;
        int j = 0;
        while (j <= 100) {
            sum2 += j;
            j += 3;
        }

        System.out.println("sum2 = " + sum2);
    }
}
