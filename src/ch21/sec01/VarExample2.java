package ch21.sec01;

import java.util.HashMap;
import java.util.Map;

public class VarExample2 {
    public static void main(String[] args) {

    }

    public static void method1() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("shin", 85);
        map.put("hong", 90);
        map.put("dong", 80);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key);
            System.out.println("value = " + value);
        }

    }

    public static void method2() {
        var map = new HashMap<String, Integer>();
        map.put("shin", 85);
        map.put("hong", 90);
        map.put("dong", 80);

        for (var entry : map.entrySet()) {
            var key = entry.getKey();
            var value = entry.getValue();
            System.out.println("key = " + key);
            System.out.println("value = " + value);
        }

    }
}
