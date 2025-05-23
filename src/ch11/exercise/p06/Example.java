package ch11.exercise.p06;

public class Example {
    public static void main(String[] args) {
        String[] arr = {"10", "2a"};

        int value = 0;
        for (int i = 0; i <= 2; i++) {
            try {
                value = Integer.parseInt(arr[i]);
            } catch (NumberFormatException e) {
                System.out.println("숫자 변환할 수 없음");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스를 초과했음");
            } finally {
                System.out.println("value = " + value);
            }
        }
    }
}
