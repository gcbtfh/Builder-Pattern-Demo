package demo.perfsoft.com.builderpatterndemo;

/**
 * Created by Tong Hung on 27-Mar-17.
 */

public class Coca extends ColdDrink {
    @Override
    public String name() {
        return "Coca";
    }

    @Override
    public float price() {
        return 3;
    }
}
