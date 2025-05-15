package ch16.sec05.exam01;

import static ch16.sec05.exam01.Computer.add;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((x, y) -> x + y);
        person.action((x, y) -> Computer.add(x, y));
        person.action((x, y) -> add(x, y));
        person.action(Computer::add);

        Computer c = new Computer();
        person.action((x, y) -> c.multiply(x, y));
        person.action(c::multiply);
    }
}
