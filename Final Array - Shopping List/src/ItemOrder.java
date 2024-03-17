public class ItemOrder {
    public Item itemName;
    public int amount;


    public ItemOrder(Item item, int amount) {
         itemName = item;
         this.amount = amount;
    }
    public void changeAmount(boolean x) {
         if (x){
             amount += 1;
         }
         else{
             amount -= 1;
         }
    }
    public int getAmount(){
        return amount;
    }

    public int getTotalPrice(){

        return itemName.getItemPrice() * amount;
    }
    public Item getItem(){
        return itemName;
    }
}
