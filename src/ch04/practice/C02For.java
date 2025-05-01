package ch04.practice;

public class C02For {
    public static void main(String[] args) {
        /*
        0
        1
        2
        3
        4
         */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("---------------");
        /*
        1
        2
        3
        4
        5
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 0 2 4 6 8
        // 2 4 6 8 10
        // 4 3 2 1 0
        // 5 4 3 2 1
        // * * * * *
        /*
         *****
         *****
         *****
         *****
         *****
         */
    }
}
