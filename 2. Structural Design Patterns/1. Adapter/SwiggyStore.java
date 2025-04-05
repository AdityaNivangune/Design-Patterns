import java.util.ArrayList;
import java.util.List;

public class SwiggyStore {

    List<Item> items = new ArrayList<>();
    
    public List<Item> addItems(Item item) {
        items.add(item);
        return items;
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
