package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<Message> queue = new LinkedList<>();

        queue.offer(new Message("sendMail", "hong"));
        queue.offer(new Message("sendSMS", "shin"));
        queue.offer(new Message("sendKKT", "java"));

        while (!queue.isEmpty()) {
            Message message = queue.poll();

            switch (message.command) {
                case "sendMail" -> System.out.println(message.to + "메일 보내기");
                case "sendSMS" -> System.out.println(message.to + "SMS 보내기");
                case "sendKKT" -> System.out.println(message.to + "카톡 보내기");
            }
        }

    }
}
