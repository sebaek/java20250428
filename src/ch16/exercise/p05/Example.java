package ch16.exercise.p05;

public class Example {
    public static void main(String[] args) {
        Button o = new Button();
        o.setClickListener(() -> System.out.println("ok 버튼 클릭"));
        o.click();


        Button c = new Button();
        c.setClickListener(() -> System.out.println("취소 버튼 클릭"));
        c.click();
    }
}
