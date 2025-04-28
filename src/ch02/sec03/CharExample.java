package ch02.sec03;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65; // 10진법 코드
        char c5 = '\u0041';

        char c3 = '가';
        char c4 = 44032;
        char c6 = '\uAC00';

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("c5 = " + c5);
        System.out.println("c6 = " + c6);
    }
}
