package demo.perfsoft.com.builderpatterndemo;

/**
 * Created by Tong Hung on 27-Mar-17.
 */

public class MealBuilder {
    public Meal prepareVegaMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegeBurger());
        meal.addItem(new Coca());
        return meal;
    }

    public Meal prepareNoneVegaMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
