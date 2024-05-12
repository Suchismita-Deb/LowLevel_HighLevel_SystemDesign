package org.example.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode;

public class Item {
    ItemType type;
    int price;

    public ItemType getType(){
        return type;
    }
    public void setType(ItemType itemType){
        this.type = itemType;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int newPrice){
        this.price = newPrice;
    }
}
