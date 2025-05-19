package leetcode.p1200;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<Integer> input = new ArrayList<>();
        for (int n : arr) {
            input.add(n);
        }

        List<List<Integer>> result = new ArrayList<>();

        // 1. input 정렬
        // 2. 인접한 두 값의 차가 가장 적은 차이를 구해서 저장
        // 3. 인접한 두 값의 차가 (2)에서 구한 값과 같으면
        //    두 값을 원소로 같는 List를 만들어서
        //    결과 list에 추가 하기


        return result;

    }
}
