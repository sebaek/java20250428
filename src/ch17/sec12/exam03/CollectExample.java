package ch17.sec12.exam03;

import ch17.sec12.exam01.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("hong", "m", 92),
                new Student("kim", "f", 87),
                new Student("java", "m", 95),
                new Student("oh", "f", 93)
        );

        Map<String, Double> result = list.stream()
                .collect(groupingBy(Student::getSex,
                        averagingDouble(Student::getScore)));

        System.out.println(result);
    }
}
