package ch04.exercise;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0;
        boolean run = true;

        while (run) {
            System.out.println("------------------------");
            System.out.println("1.예금|2.출금|3.잔고|4.종료");
            System.out.println("------------------------");
            System.out.print("선택>");
            String select = scanner.nextLine();
            switch (select) {
                case "1" -> {
                    // 1 : 예금
                    // 예금액을 받아서
                    // 잔고에 더해줌
                    System.out.print("예금액>");
                    int money = Integer.parseInt(scanner.nextLine());
                    balance += money;
                }
                case "2" -> {
                    // 2 : 출금
                    // 출금액을 받아서
                    // 잔고에서 빼주기
                    System.out.print("출금액>");
                    int money = Integer.parseInt(scanner.nextLine());
                    balance -= money;
                }
                case "3" -> {
                    // 3 : 잔고
                    // 잔고 출력
                    System.out.println("잔고>" + balance);
                }
                case "4" -> {
                    // 4 : 종료
                    run = false;

                }
            }


        }

        System.out.println("프로그램 종료");


    }
}
