package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone p = new SmartPhone("samsung", "android");

        System.out.println(p.toString());
        System.out.println(p);
    }
}
