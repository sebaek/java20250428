package ch12.sec03.exam01;

public class EqualsExample {
    public static void main(String[] args) {
        Member o1 = new Member("blue");
        Member o2 = new Member("blue");
        Member o3 = new Member("red");

        // true 기대
        System.out.println(o1.equals(o2));

        // false 기대
        System.out.println(o1.equals(o3));
    }
}
