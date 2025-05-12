package ch06.exercise.p18;

public class ShopService {
    private static ShopService instance;

    private ShopService() {

    }


    public static ShopService getInstance() {

        if (instance == null) {
            ShopService shopService = new ShopService();
            instance = shopService;
        }

        return instance;
    }
}
