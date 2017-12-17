package com.example.tomi.inventoryapp.Data;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.tomi.inventoryapp.R;

import java.util.ArrayList;

/**
 * Created by Tomi on 17.12.2017..
 */

public class ItemAdapter extends ArrayAdapter<ItemModel>{
    public ItemAdapter(@NonNull Context context, ArrayList<ItemModel> products){
        super(context, 0, products);
    }

    @Override
    public View getView(int postion, View convertView, ViewGroup parent) {

        ItemModel item = getItem(postion);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
         }
        TextView productName = convertView.findViewById(R.id.product_name);
        String name = item.itemName;
        productName.setText(name);
        TextView productQuantity = convertView.findViewById(R.id.quantity);
        String quantity = "Quantity: " + String.valueOf(item.itemQuantity);
        productQuantity.setText(quantity);
        TextView productPrice = convertView.findViewById(R.id.price);
        String price = "Price: " + item.itemPrice;
        productPrice.setText(price);

        return convertView;
    }
}
