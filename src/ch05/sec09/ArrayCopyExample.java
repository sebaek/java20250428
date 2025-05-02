package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        // 배열 복사
        // for
        // Arrays.copyOf()
        // System.arraycopy()

        String[] o = {"java", "array", "copy"};
        String[] n = new String[5];

        System.arraycopy(o, 0, n, 0, o.length);

        System.out.println("Arrays.toString(n) = " + Arrays.toString(n));
    }
}
