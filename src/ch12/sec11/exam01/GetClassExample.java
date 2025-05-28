package ch12.sec11.exam01;

public class GetClassExample {
    public static void main(String[] args) {
        Class c = Car.class;

        System.out.println("c.getName() = " + c.getName());
        System.out.println("c.getSimpleName() = " + c.getSimpleName());
        System.out.println("c.getPackageName() = " + c.getPackageName());

    }
}
