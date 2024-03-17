public class Item {
    public String itemName;
    public int itemPrice;
    public Item(String name, int price) {
        itemName = name;
        itemPrice = price;
    }
    public String getItemName() {
        return itemName;
    }
    public int getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(int x){
        itemPrice -= x;
    }
}

