package leetcode.p1431;

import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> kids = Arrays.stream(candies).boxed().toList();

        // 1. kids List에서 가장 큰 값 구하기

        // 2. List<Boolean> result 객체 만들기

        // 3. kids의 각 요소에 extraCandy 더해서 (1에서 구한 가장 큰값)보다 크거나 같으면
        //    result에 true 추가
        //    아니면 false 추가

        // result 리턴
        return null;
    }
}
