package ch03.exercise;

public class Exercise05 {
    public static void main(String[] args) {
        // (윗변 + 아랫변) * 높이 / 2

        int top = 5;
        int bottom = 10;
        int height = 7;
        double area = (top + bottom) * height / 2.0;
        area = (top + bottom) * height / 2.0;
        System.out.println("area = " + area);
        area = (top + bottom) * height * 1.0 / 2;
        System.out.println("area = " + area);
        area = ((double) (top + bottom)) * height / 2;
        System.out.println("area = " + area);
        area = (double) (top + bottom) * height / 2;
        System.out.println("area = " + area);
        area = (double) ((top + bottom) * height / 2);
        System.out.println("area = " + area);
    }
}
