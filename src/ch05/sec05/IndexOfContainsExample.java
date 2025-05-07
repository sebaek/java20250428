package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String s = "자바 프로그래밍";
        int l = s.indexOf("프로그래밍");
        System.out.println("l = " + l);

        String substring = s.substring(l);
        System.out.println("substring = " + substring);

        int i = s.indexOf("자바");
        if (i != -1) {
            System.out.println("자바 관련됨");
        } else {
            System.out.println("자바 관련없음");
        }

        boolean r = s.contains("자바");
        if (r) {
            System.out.println("자바 관련됨");
        } else {
            System.out.println("자바 관련없음");
        }
    }

}
