public class ShoppingList {
    public static void main(String[] args) {
    String[] items = {
        "carrots" ,
         "oat milk",
         "flour tortillas",
          "rice",
          "blueberries" ,
          "coffee",
          "water",
          "pokys",
          "cheese",
          "dog treats"
    };
        System.out.println("My shopping list!: ");
        //prints only shopping list without items
        for (String item : items) {
          System.out.println("- " + item);
        }
    }
}