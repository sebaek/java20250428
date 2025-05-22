package leetcode.p1748;

import java.util.Arrays;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Solution {
    public int sumOfUnique(int[] nums) {

        /*
        // nums를 전체 탐색해서 각 아이템이 몇번 나오는지 세기
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            if (map.containsKey(n)) {
                // n이 map에 있으면
                Integer v = map.get(n);
                map.put(n, v + 1);
            } else {
                // n이 map에 없으면
                map.put(n, 1);
            }
        }

        int sum = 0;
        // map을 전체 탐색해서 value가 1인 key들을 더하기
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }


        // 결과 return
        return sum;

         */


        return Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting())).entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .mapToInt(Integer::intValue)
                .sum();
    }
}