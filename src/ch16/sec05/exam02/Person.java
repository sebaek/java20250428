package ch16.sec05.exam02;

public class Person {
    public void ordering(Comparable comparable) {
        String a = "java";
        String b = "react";

        int r = comparable.compare(a, b);
        if (r < 0) {
            System.out.println("작다");
        } else if (r == 0) {
            System.out.println("같다");
        } else {
            System.out.println("크다");
        }

    }
}
