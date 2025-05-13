package ch07.sec03.exam02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        Phone p = new SmartPhone("아이폰", "검은색");
        System.out.println(p.getModel());
        System.out.println(p.getColor());
    }
}
