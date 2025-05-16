package ch12.exercise.p17;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {

        // 첫 번째는 알파벳으로 시작하고 두 번째부터 숫자와 알파벳으로 구성된
        // 8〜 12자 사이
        String id = "5Angel1004";
        String regex = "[a-zA-Z][a-zA-Z0-9]{7,11}";
        boolean isMatch = Pattern.matches(regex, id);

        if (isMatch) {
            System.out.println("사용 가능");
        } else {
            System.out.println("사용 불가능");
        }
    }
}
