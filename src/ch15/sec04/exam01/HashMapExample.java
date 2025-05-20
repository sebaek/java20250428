package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);

        System.out.println("map.size() = " + map.size());

        String key = "홍길동";
        Integer v = map.get(key);
        System.out.println("v = " + v);
    }
}
