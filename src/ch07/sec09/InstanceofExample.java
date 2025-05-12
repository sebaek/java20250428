package ch07.sec09;

public class InstanceofExample {
    public static void personInfo(Person person) {
        person.walk();

        if (person instanceof Student student) {
            student.study();
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        personInfo(p1);

        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
