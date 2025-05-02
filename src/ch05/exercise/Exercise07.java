package ch05.exercise;

import java.util.Arrays;

public class Exercise07 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);

        // sort
        System.out.println("sort ------");
        Arrays.sort(array);
        System.out.println("array[array.length - 1] = " + array[array.length - 1]);
    }
}
