package ch06.exercise.p18;

public class App {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
    }
}
