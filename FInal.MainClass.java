
package finalproject;

public class MainClass {
    
    public static void main(String[] args){
        
        Person customer01 = new Person("Omar");
        customer01.getShoppingList().addItemToList("Milk");
        customer01.getShoppingList().addItemToList("Bread");
        customer01.getShoppingList().addItemToList("Candy");
        customer01.getShoppingList().addItemToList("Eggs");
        customer01.getShoppingList().addItemToList("Fruit");
        customer01.getShoppingList().addItemToList("Meat");
        customer01.getShoppingList2() .addItemToList("jelly");
        customer01.getShoppingList2() .addItemToList("Juice");
        customer01.getShoppingList2() .addItemToList("Butter");
        customer01.getShoppingList2() .addItemToList("Tortillas");
        customer01.display();
        
        Person customer02 = new Person("Eduardo");
        customer02.getShoppingList().addItemToList("Cookies");
        customer02.getShoppingList().addItemToList("Water");
        customer02.getShoppingList().addItemToList("Pizza");
        customer02.getShoppingList().addItemToList("Milk");
        customer02.getShoppingList().addItemToList("Cereal");
        customer02.getShoppingList2() .addItemToList("Apples");
        customer02.getShoppingList2() .addItemToList("Cheese");
        customer02.getShoppingList2() .addItemToList("Chicken");
        customer02.getShoppingList2() .addItemToList("Bacon");
        customer02.getShoppingList2() .addItemToList("Bagels");
        customer02.getShoppingList2() .addItemToList("Waffles");
        customer02.display();
        
    }
    
}
