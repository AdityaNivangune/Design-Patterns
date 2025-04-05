import java.util.List;

public class Main {
    public static void main(String[] args) {
        SwiggyStore swiggyStore = new SwiggyStore();
        List<Item> food = swiggyStore.addItems(new FoodItem());
        swiggyStore.addItems(new FoodItem());

        List<Item> grocery = swiggyStore.addItems(new GroceryAdapter(new GroceryProduct()));

        System.out.println(food);
        System.out.println(grocery);

    }
}
