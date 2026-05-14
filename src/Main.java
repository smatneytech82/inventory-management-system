import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        InventoryManager manager = new InventoryManager();

        boolean running = true;

        while (running) {

            System.out.println("\n=== Inventory Management System ===");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Inventory");
            System.out.println("4. Update Quantity");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter item name: ");
                    String addName = scanner.nextLine();

                    System.out.print("Enter quantity: ");
                    int addQuantity = scanner.nextInt();

                    manager.addItem(addName, addQuantity);

                    break;

                case 2:

                    System.out.print("Enter item name to remove: ");
                    String removeName = scanner.nextLine();

                    manager.removeItem(removeName);

                    break;

                case 3:

                    manager.viewInventory();

                    break;

                case 4:

                    System.out.print("Enter item name: ");
                    String updateName = scanner.nextLine();

                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();

                    manager.updateQuantity(updateName, newQuantity);

                    break;

                case 5:

                    running = false;

                    System.out.println("Exiting program.");

                    break;

                default:

                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}