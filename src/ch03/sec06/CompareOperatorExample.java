package ch03.sec06;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        boolean result1 = (num1 == num2);
        System.out.println("result1 = " + result1); // true
        boolean result2 = (num1 != num2);
        System.out.println("result2 = " + result2); // false
        boolean result3 = (num1 <= num2);
        System.out.println("result3 = " + result3); // true

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2);
        System.out.println("result4 = " + result4);// true

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println("result5 = " + result5);

        double num5 = 0.7;
        double num6 = 0.3;
        double num7 = num5 + num6;
        System.out.println("(num3 == num7) = " + (num3 == num7));

        float num8 = 0.1f;
        double num9 = 0.1;
        boolean result6 = (num8 == num9);
        System.out.println("result6 = " + result6);
        boolean result7 = (num8 == (float) num9);
        System.out.println("result7 = " + result7);

        String str1 = "자바";
        String str2 = "JAVA";
        boolean result8 = str1.equals(str2);
        boolean result9 = !str1.equals(str2);
        System.out.println("result8 = " + result8);
        System.out.println("result9 = " + result9);

    }
}
