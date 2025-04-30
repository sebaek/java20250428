package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while (run) {
            System.out.println("--------------------");
            System.out.println("1.증속|2.감속|3.중지");
            System.out.println("--------------------");
            System.out.print("선택:");

            // 사용자 입력 받아서
            String str = scanner.nextLine();

            switch (str) {
                case "1" -> {
                    // 1이면 속도증가
                    speed++;
                    System.out.println("speed = " + speed);
                }
                case "2" -> {
                    // 2이면 속도감소
                    speed--;
                    System.out.println("speed = " + speed);
                }
                case "3" ->
                    // 3이면 종료
                        run = false;
            }
        }

        System.out.println("프로그램 종료");
    }
}
