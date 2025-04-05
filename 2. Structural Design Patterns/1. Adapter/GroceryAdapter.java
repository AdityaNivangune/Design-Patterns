public class GroceryAdapter implements Item {
    
    private GroceryItem groceryItem;
    public GroceryAdapter(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }

    @Override
    public String getItemName() {
        return groceryItem.getName();
    }

    @Override
    public String getPrice() {
        return groceryItem.getPrice();
    }
  
    @Override
    public String getRestaurantName() {
        return groceryItem.getStoreName();
    }
}
