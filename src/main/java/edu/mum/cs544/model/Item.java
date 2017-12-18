package edu.mum.cs544.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

    public Item() {

    }

    @Id
    @GeneratedValue
    private int id;

    private String itemName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

//    public static List<Item> itemList(){
//        List<Item> itemList = new ArrayList<>();
//
//        itemList.add(new Item(1, "Chair"));
//        itemList.add(new Item(1, "Desk"));
//        itemList.add(new Item(1, "Wardrob"));
//        itemList.add(new Item(1, "Bed"));
//
//        return itemList;
//    }

    public Item(int id, String itemName) {
        this.id = id;
        this.itemName = itemName;
    }
}
