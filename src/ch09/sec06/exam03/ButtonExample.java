package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {

        Button ok = new Button();

        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("OK 버튼 클릭");
            }
        }

        ok.setClickListener(new OkListener());
        ok.click();


        Button cancel = new Button();
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("취소 버튼 클릭");
            }
        }
        cancel.setClickListener(new CancelListener());
        cancel.click();
        
    }
}
