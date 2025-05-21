package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);
        scores.add(80);

        System.out.println(scores);

        System.out.println(scores.first());
        System.out.println(scores.last());
        System.out.println(scores.lower(95));
        System.out.println(scores.higher(95));

        System.out.println(scores.floor(95));
        System.out.println(scores.ceiling(95));

        NavigableSet<Integer> set2 = scores.descendingSet();
        System.out.println(set2);

        NavigableSet<Integer> set3 = scores.tailSet(80, true);
        System.out.println(set3);

        NavigableSet<Integer> set4 = scores.subSet(80, true, 90, false);
        System.out.println(set4);
    }
}
