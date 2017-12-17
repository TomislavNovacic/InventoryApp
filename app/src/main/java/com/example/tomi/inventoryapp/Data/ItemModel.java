package com.example.tomi.inventoryapp.Data;

/**
 * Created by Tomi on 17.12.2017..
 */

public class ItemModel {

    public String itemName;
    public int itemQuantity;
    public String itemPrice;

    public ItemModel(String itemName, int itemQuantity, String itemPrice) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }
}
