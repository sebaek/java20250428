package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = "홍길동";


        // 참조값이 같은 지 확인
        // 좋은 습관이 아님!!
        System.out.println(str1 == str2); // true

        // 문자열이 같은 지 확인
        System.out.println(str1.equals(str2)); // true

        String str3 = new String("홍길동");
        String str4 = new String("홍길동");

        // 참조값이 같은 지 확인
        System.out.println(str3 == str4); // false
        // 문자열이 같은 지 확인
        System.out.println(str3.equals(str4)); // true

    }
}
