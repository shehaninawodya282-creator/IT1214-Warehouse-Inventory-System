import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Warehouse Inventory Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. Search Item by ID");
            System.out.println("5. Search Item by Name");
            System.out.println("6. Display All Items");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Item ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    inventory.addItem(new Item(id, name, qty, price));
                    break;

                case 2:
                    System.out.print("Enter Item ID to remove: ");
                    String removeId = sc.nextLine();
                    inventory.removeItem(removeId);
                    break;

                case 3:
                    System.out.print("Enter Item ID to update: ");
                    String updateId = sc.nextLine();
                    System.out.print("Enter new Quantity: ");
                    int newQty = sc.nextInt();
                    inventory.updateQuantity(updateId, newQty);
                    break;

                case 4:
                    System.out.print("Enter Item ID to search: ");
                    String searchId = sc.nextLine();
                    Item foundById = inventory.searchById(searchId);
                    System.out.println(foundById != null ? foundById : "Item not found!");
                    break;

                case 5:
                    System.out.print("Enter Item Name to search: ");
                    String searchName = sc.nextLine();
                    Item foundByName = inventory.searchByName(searchName);
                    System.out.println(foundByName != null ? foundByName : "Item not found!");
                    break;

                case 6:
                    inventory.displayItems();
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
