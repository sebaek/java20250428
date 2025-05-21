package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person("hong", 45));
        set.add(new Person("java", 25));
        set.add(new Person("park", 31));

        set.forEach(e -> System.out.println(e.name + ", " + e.age));
    }
}
