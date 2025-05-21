package ch15.exercise.p10;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();

        set.add(new Student("blue", 96));
        set.add(new Student("hong", 86));
        set.add(new Student("white", 92));
        set.add(new Student("red", 96));

        System.out.println(set.size());

        Student last = set.last();
        System.out.println("last.score = " + last.score);
        System.out.println("last.id = " + last.id);
    }
}
