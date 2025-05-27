package ch18.sec10;

import java.io.*;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String file = "C:/Temp/object.dat";
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Member m1 = new Member("fall", "단풍");
        Product p1 = new Product("notebook", 1500000);
        int[] arr1 = {1, 2, 3};

        try (oos; fos) {
            oos.writeObject(m1);
            oos.writeObject(p1);
            oos.writeObject(arr1);

            oos.flush();

        }

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try (fis; ois) {
            Member m2 = (Member) ois.readObject();
            Product p2 = (Product) ois.readObject();
            int[] arr2 = (int[]) ois.readObject();

            System.out.println("m2 = " + m2);
            System.out.println("p2 = " + p2);
            System.out.println("arr2 = " + Arrays.toString(arr2));

        }
    }
}
