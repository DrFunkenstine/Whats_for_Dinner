package com.appshed.whatsfordinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.appshed.whatsfordinner.util.Dish;
import com.appshed.whatsfordinner.util.DishList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by john.toal on 7/11/16.
 */
public class ShowMenu extends Activity{
    private ListView menu;
    private List<String> items;
    private DishList dishList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //activity_view_menu
        setContentView(R.layout.activity_tabHost);
        super.onCreate(savedInstanceState);
        menu =  (ListView) findViewById(R.id.listView);
        displayList();


        Button newMenu = (Button) findViewById(R.id.newMenu);
        newMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayList();
            }
        });

        Button saveList = (Button) findViewById(R.id.saveList);
        saveList.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                saveList(items);
            }
        });
    }

    private void saveList(List<String> items) {
        if(items == null){
            items = new ArrayList<>();
        }
        ArrayAdapter<String> saveAdapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item,android.R.id.text1,items);
        ListView savedList = (ListView) findViewById(R.id.savedList);
        savedList.setAdapter(saveAdapter);
    }

    public static int randInt(int listSize) {
        Random rand = new Random();
        int randomNum = rand.nextInt(listSize);

        return randomNum;
    }

    public void DishList(){

            dishList = new DishList();


    }

    public void displayList(){
        DishList();
        final ArrayList<Dish> list = (ArrayList) dishList.getDishList();
        items  = new ArrayList<>();

        for (int i = 0; i < 7; ++i) {
            int rand = randInt(list.size());
            items.add(list.get(rand).getName());
            list.remove(rand);


        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, android.R.id.text1, items);
        menu.setAdapter(adapter);

    }




}
