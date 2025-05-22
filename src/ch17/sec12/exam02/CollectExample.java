package ch17.sec12.exam02;

import ch17.sec12.exam01.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("hong", "m", 92),
                new Student("kim", "f", 87),
                new Student("java", "m", 95),
                new Student("oh", "f", 93)
        );

        Map<String, List<Student>> result = list.stream()
                .collect(Collectors.groupingBy(s -> s.getSex()));

        result.entrySet()
                .forEach(System.out::println);
    }
}
