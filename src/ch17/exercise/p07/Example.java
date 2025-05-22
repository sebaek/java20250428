package ch17.exercise.p07;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("hong", "developer"),
                new Member("kim", "designer"),
                new Member("shin", "developer")
        );

        // 고전적for
        List<Member> devs = new ArrayList<>();
        for (Member member : list) {
            if (member.getJob().equals("developer")) {
                devs.add(member);
            }
        }
        for (Member member : devs) {
            System.out.println(member);
        }

        System.out.println();
        // Stream 사용
        List<Member> devs2 = list.stream()
                .filter(s -> s.getJob().equals("developer"))
                .toList();

        devs2.forEach(System.out::println);
    }
}
