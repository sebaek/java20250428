package ch05.lecture;

public class C01Array {
    public static void main(String[] args) {
        //배열(array): 여러 값을 담을 수 있는 자료형(data type)

        // 기본타입
        int a;
        a = 3; // 하나의 값만 담을 수 있음

        // 배열
        int[] b;
        b = new int[5]; // 여러개의 값을 담을 수 있음

        // b는 5개의 int 값을 담을 수 있음
        b[0] = 9; // b의 0번 index에 9라는 값 대입
        b[1] = 8;
        b[2] = 7;
        b[3] = 77;
        b[4] = 1234;
//        b[5] = 987; // 존재하지 않는 index 사용시 오류(Exception)

        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);

        // 연습
        // 3개의 int 값을 담을 수 있는 배열 c를 만들어보세요.
    }
}
