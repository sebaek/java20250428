package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        System.out.println("메세지를 입력하세요.");
        System.out.println("프로그램 종료하려면 q입력하세요");

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            // 입력
            System.out.print(">");
            input = scanner.nextLine();
            System.out.println(input);
        } while (!input.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");


    }
}
