
package finalproject;

public class ShoppingItem {

    static int length;
    
    private String name;
    private int quantity;
    private double price;
    private ShoppingStatus status;
    
    public ShoppingItem(String name, int quantity, double price, ShoppingStatus status){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
    }
    
    public ShoppingItem(String name){
        this.name = name;
        this.status = ShoppingStatus.PURCHASED;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public double getCost(){
        return (this.quantity * this.price);
    }
    
    public ShoppingStatus getStatus(){
        return status;
    }
    
    public void setStatus(ShoppingStatus status){
        this.status = status;
    }
    
    public void display(){
        System.out.println(this.price + "\t" + this.name + "\t" + this.quantity + "\t" + this.status);
    }
}
