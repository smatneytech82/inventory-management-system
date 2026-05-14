public class InventoryItem {
    
    private String itemName;
    int quantity;

    public InventoryItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }
    
    public String getItemName() {
        return itemName;

        public int getQuantity() {
            return quantity;
        }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }
    @Override
    public String toString() {
        return itemName + " - Quantity: " + quantity;
    }

}