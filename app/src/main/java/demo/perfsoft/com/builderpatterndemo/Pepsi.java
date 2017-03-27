package demo.perfsoft.com.builderpatterndemo;

/**
 * Created by Tong Hung on 27-Mar-17.
 */

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 4;
    }
}
