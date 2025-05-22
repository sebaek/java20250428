package leetcode.p2206;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.groupingBy;

public class Solution {
    public boolean divideArray(int[] nums) {
        /*
        Map<Integer, Integer> map = new HashMap<>();

        // nums에 있는 요소들의 갯수 세기
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        // map을 전체 탐색해서 value가 모두 짝수인지 확인
        for (Integer value : map.values()) {
            if (value % 2 == 1) {
                return false;
            }
        }

        return true;

         */

        // Stream 사용

        return Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting()))
                .values()
                .stream()
                .allMatch(e -> e % 2 == 0);


    }
}
