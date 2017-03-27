package demo.perfsoft.com.builderpatterndemo;

/**
 * Created by Tong Hung on 27-Mar-17.
 */

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 2;
    }
}
