package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> box = new Stack<>();
        box.push(new Coin(100));
        box.push(new Coin(50));
        box.push(new Coin(500));
        box.push(new Coin(10));

        while (!box.isEmpty()) {
            Coin coin = box.pop();
            System.out.println("coin.getValue() = " + coin.getValue());
        }
    }
}
