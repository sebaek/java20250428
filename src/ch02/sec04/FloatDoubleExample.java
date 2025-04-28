package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        float var1 = 0.1234567890123456789F;
        double var2 = 0.1234567890123456789;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        double var31 = 3e6;
        double var32 = 3E6;
        double var33 = 3.0 * 1000000;
        System.out.println("var31 = " + var31);
        System.out.println("var32 = " + var32);
        System.out.println("var33 = " + var33);

        double var41 = 3e6F;
        double var42 = 3E6F;
        double var43 = 3.0F * 1000000;
        System.out.println("var41 = " + var41);
        System.out.println("var42 = " + var42);
        System.out.println("var43 = " + var43);

        double var51 = 2e-3;
        double var52 = 2E-3;
        double var53 = 2.0 * 0.001;
        System.out.println("var51 = " + var51);
        System.out.println("var52 = " + var52);
        System.out.println("var53 = " + var53);
    }
}
