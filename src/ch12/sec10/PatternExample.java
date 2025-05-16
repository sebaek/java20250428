package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regex = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4567";

        boolean result = Pattern.matches(regex, data);
        if (result) {
            System.out.println("일치");
        } else {
            System.out.println("불일치");
        }

        regex = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@mycomcom";
        result = Pattern.matches(regex, data);
        if (result) {
            System.out.println("일치");
        } else {
            System.out.println("불일치");
        }
    }
}
