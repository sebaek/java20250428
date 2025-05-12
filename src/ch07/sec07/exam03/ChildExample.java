package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent p = new Child();

        p.method1();
        p.method2();

//        p.method3(); // x

        // 강제형변환(type casting)(위험)
        Child c = (Child) p;
        c.method3();
    }
}
