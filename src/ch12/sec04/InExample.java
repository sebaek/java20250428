package ch12.sec04;

import org.w3c.dom.ls.LSOutput;

public class InExample {
    public static void main(String[] args) throws Exception {
//        int read = System.in.read();
//        int read1 = System.in.read();
//        int read2 = System.in.read();
//        System.out.println("read = " + read);
//        System.out.println("read1 = " + read1);
//        System.out.println("read2 = " + read2);

        int speed = 0;
        int key = 0;

        while (true) {
            if (key != 13 && key != 10) {
                if (key == 49) {
                    speed++;
                } else if (key == 50) {
                    speed--;
                } else if (key == 51) {
                    break;
                }

                System.out.println("----------");
                System.out.println("1.증속|2.감속|3.중지");
                System.out.println("----------");
                System.out.println("현재속도:" + speed);
                System.out.print("선택:");
            }

            key = System.in.read();
        }
        System.out.println("프로그램 종료");


    }


}
