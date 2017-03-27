package demo.perfsoft.com.builderpatterndemo;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tong Hung on 27-Mar-17.
 */

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void showItems(){
        for(Item i : items){
            Log.i("HUNG", "Name: " +i.name()+ " , ");
            Log.i("HUNG", "Packing: " +i.packing().pack()+ " , ");
            Log.i("HUNG", "Price: " +i.price()+ " , ");
        }
    }

    public float getCost(){
        float cost = 0f;
        for(Item i : items){
            cost += i.price();
        }
        return cost;
    }
}
