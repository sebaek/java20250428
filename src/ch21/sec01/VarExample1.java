package ch21.sec01;

public class VarExample1 {
    public static void main(String[] args) {
        String data1 = getData();
        var data2 = getData();
        var data3 = getData();
    }

    public static String getData() {
        return "hong";
    }
}
