package demo.perfsoft.com.builderpatterndemo;

/**
 * Created by Tong Hung on 27-Mar-17.
 */

public class VegeBurger extends Burger {
    @Override
    public String name() {
        return "Vega Burger";
    }

    @Override
    public float price() {
        return 1;
    }
}
