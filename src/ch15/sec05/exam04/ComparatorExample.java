package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> set = new TreeSet<>((o1, o2) -> o1.price - o2.price);

        set.add(new Fruit("포도", 3000));
        set.add(new Fruit("수박", 10000));
        set.add(new Fruit("딸기", 6000));

        for (Fruit f : set) {
            System.out.println(f);
        }
    }
}
