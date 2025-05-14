package ch16.sec02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        Button ok = new Button();

        ok.setClickListener(() -> System.out.println("ok 버튼 클릭"));
        ok.click();

        Button cancel = new Button();
        cancel.setClickListener(() -> System.out.println("취소 버튼 클릭"));
        cancel.click();
    }
}
