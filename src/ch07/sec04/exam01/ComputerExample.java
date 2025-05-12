package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;
        Calculator c = new Calculator();
        double r1 = c.areaCircle(r);
        System.out.println("r1 = " + r1);
        System.out.println();

        Computer d = new Computer();
        double r2 = d.areaCircle(r);
        System.out.println("r2 = " + r2);
        
    }
}
