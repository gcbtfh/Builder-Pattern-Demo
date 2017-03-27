package demo.perfsoft.com.builderpatterndemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("HUNG","=====VEGA MEAL=====");
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareVegaMeal();
        meal.showItems();
        Log.i("HUNG","Cost = " +meal.getCost());

        Log.i("HUNG","=====NONE VEGA MEAL=====");
        Meal meal1 = mealBuilder.prepareNoneVegaMeal();
        meal1.showItems();
        Log.i("HUNG","Cost = " +meal1.getCost());
    }
}
