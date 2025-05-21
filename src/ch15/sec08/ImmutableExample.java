package ch15.sec08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExample {
    public static void main(String[] args) {
        List<String> list1 = List.of("a", "b", "c");
        Set<String> set1 = Set.of("a", "b", "c");
        Map<Integer, String> map1 = Map.of(
                1, "a",
                2, "b",
                3, "c");

        // copyOf : unmodifiable collection
        // Collections.unmodifiableList
        // Collections.unmodifiableSet
        // Collections.unmodifiableMap

        // Arrays.asList : 배열을 List로 만드는 메소드
        String[] arr = {"a", "b", "c"};
        List<String> list2 = Arrays.asList(arr);
        System.out.println(list2);
//        list2.add("d");
        list2.set(1, "d");
        System.out.println(list2);
    }
}
