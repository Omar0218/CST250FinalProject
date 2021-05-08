
package finalproject;

public class Person {
    
    private String name;
    private ShoppingList shoppingList;
    private ShoppingList shoppingList2;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public ShoppingList getShoppingList(){
            return shoppingList;
    }
    
    public void setShoppingList(ShoppingList shoppingList){
        this.shoppingList = shoppingList;
    }
    
    public ShoppingList getShoppingList2(){
            return shoppingList2;
    }
    
    public Person(String name, ShoppingList shoppingList){
        this.name = name;
        this.shoppingList = shoppingList;
        this.shoppingList2 = shoppingList2;
    }
    
    public Person(String name){
        this.name = name;
        this.shoppingList = new ShoppingList();
        this.shoppingList2 = new ShoppingList();
    }
    
    public void display(){
        System.out.println(this.name);
        this.shoppingList.display();
        this.shoppingList2.display();
    }
    
}
