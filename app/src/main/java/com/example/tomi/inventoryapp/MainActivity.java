package com.example.tomi.inventoryapp;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tomi.inventoryapp.Data.ItemAdapter;
import com.example.tomi.inventoryapp.Data.ItemModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.add_new_item_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Adding new item", Toast.LENGTH_SHORT).show();
            }
        });

        ItemModel product1 = new ItemModel("Acer Aspire E15", 15, "3500kn");
        ItemModel product2 = new ItemModel("Samsung S8+",30, "6000kn");
        ItemModel product3 = new ItemModel("Gigatech speakers", 8, "80kn");
        ItemModel product4 = new ItemModel("Picture frame 25x15", 23, "40kn");
        ItemModel product5 = new ItemModel("Canon Pixma printer", 12, "450kn");

        ArrayList<ItemModel> productsList = new ArrayList<>();
        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        productsList.add(product4);
        productsList.add(product5);

        ItemAdapter itemModelArrayAdapter = new ItemAdapter(this, productsList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(itemModelArrayAdapter);
    }
}
