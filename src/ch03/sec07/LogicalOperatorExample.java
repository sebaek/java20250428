package ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';

        // 'A' <= charCode & charCode <= 'Z'
        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자군요.");
        }

        // 97 <= charCode && charCode <= 122
        if (('a' <= charCode) && (charCode <= 'z')) {
            System.out.println("소문자군요.");
        }

        if (('0' <= charCode) && (charCode <= '9')) {
            System.out.println("숫자군요.");
        }

        int value = 6;

        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수다.");
        }

        boolean result = (value % 2 == 0) || (value % 3 == 0);

        // ! : not
        // false -> true, true -> false

        System.out.println("result = " + result);
        System.out.println("!result = " + !result);

        if (!result) {
            System.out.println("2 또는 3의 배수가 아니다.");
        }
    }
}
