package demo.perfsoft.com.builderpatterndemo;

/**
 * Created by Tong Hung on 27-Mar-17.
 */

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
