import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String itemId) {
        items.removeIf(item -> item.getItemId().equals(itemId));
    }

    public void updateQuantity(String itemId, int newQuantity) {
        for (Item item : items) {
            if (item.getItemId().equals(itemId)) {
                item.setQuantity(newQuantity);
                return;
            }
        }
        System.out.println("Item not found!");
    }

    public Item searchById(String itemId) {
        for (Item item : items) {
            if (item.getItemId().equals(itemId)) {
                return item;
            }
        }
        return null;
    }

    public Item searchByName(String name) {
        for (Item item : items) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty!");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }
}
