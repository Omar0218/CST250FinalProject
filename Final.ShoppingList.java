
package finalproject;

import java.util.ArrayList;

public class ShoppingList {
    
    private ArrayList<ShoppingItem> items;
    int num;
    
    public ShoppingList(ArrayList<ShoppingItem> items){
        this.items = items;
    }
    
    public ShoppingList(){
        this.items = new ArrayList<>();
    }
    
    public ArrayList<ShoppingItem> getItems(){
        return items;
    }
    
    public void addItemToList(String itemName){
        ShoppingItem newItem = new ShoppingItem(itemName);
        this.items.add(newItem);
    }
    
    public void display(){
        System.out.println("Items: ");
        for(ShoppingItem item : this.items){
            item.display();
        }
        System.out.println("********************");
    }
    
   public double getTotalCost(){
        double totalCost = 0;
        for(int i = 0; i < ShoppingItem.length; i++){
            totalCost += getShoppingItem(getCost());
        }
        return totalCost;
    }
    
    
            
    public class ShoppingList2 {
    
    private ArrayList<ShoppingItem> items;
    
    public ShoppingList2(ArrayList<ShoppingItem> items){
        this.items = items;
    }
    
    public ShoppingList2(){
        this.items = new ArrayList<>();
    }
    
    public ArrayList<ShoppingItem> getItems(){
        return items;
    }
    
    public void addItemToList(String itemName){
        ShoppingItem newItem = new ShoppingItem(itemName);
        this.items.add(newItem);
    }
    
    public void display(){
        System.out.println("Items: ");
        for(ShoppingItem item : this.items){
            item.display();
        }
        System.out.println("----------");
    }
    
    }
}
    
