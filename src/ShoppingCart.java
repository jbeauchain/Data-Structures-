import java.util.ArrayList;
public class ShoppingCart {
    public int totalprice = 0;
    private ArrayList<ItemOrder> items;

    public ShoppingCart(ArrayList<ItemOrder> arr) {
        this.items = arr;

    }
    public ShoppingCart(){
        this.items = new ArrayList<>();
    }
    public void addItem(ItemOrder itemOrder) {
        items.add(itemOrder);
    }

    public void removeItem(ItemOrder itemOrder) {

        items.remove(itemOrder);
    }

    public String getItems() {
        String ret = "Your items are ";
        for (ItemOrder x : items){
            ret += x.getAmount() + " ";
            ret += x.getItem().getItemName() + " which will cost ";
            ret += x.getTotalPrice() + " dollars, ";
            ret += "\r";
        }

        return ret ;
    }

    public int getTotalPrice() {
        for (ItemOrder x : items){
            totalprice += (x.getTotalPrice());
        }
        return totalprice;

    }
    public ArrayList<ItemOrder> searchItemByName(String itemName) {
        ArrayList<ItemOrder> foundItems = new ArrayList<>();
        for (ItemOrder itemOrder : items) {
            if (itemOrder.itemName.getItemName().equalsIgnoreCase(itemName)) {
                foundItems.add(itemOrder);
            }
        }
        return foundItems;
    }
}
