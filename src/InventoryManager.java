import java.util.ArrayList;

public class InventoryManager {

    private ArrayList<InventoryItem> inventoryList;

    public InventoryManager() {
        inventoryList = new ArrayList<>();
    }

    public void addItem(String itemName, int quantity) {

        InventoryItem item = new InventoryItem(itemName, quantity);

        inventoryList.add(item);

        System.out.println("Item added successfully.");
    }

    public void viewInventory() {

        if (inventoryList.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for (InventoryItem item : inventoryList) {
            System.out.println(item);
        }
    }

    public void removeItem(String itemName) {

        for (InventoryItem item : inventoryList) {

            if (item.getItemName().equalsIgnoreCase(itemName)) {

                inventoryList.remove(item);

                System.out.println("Item removed successfully.");

                return;
            }
        }

        System.out.println("Item not found.");
    }

    public void updateQuantity(String itemName, int quantity) {

        for (InventoryItem item : inventoryList) {

            if (item.getItemName().equalsIgnoreCase(itemName)) {

                item.setQuantity(quantity);

                System.out.println("Quantity updated.");

                return;
            }
        }

        System.out.println("Item not found.");
    }
}