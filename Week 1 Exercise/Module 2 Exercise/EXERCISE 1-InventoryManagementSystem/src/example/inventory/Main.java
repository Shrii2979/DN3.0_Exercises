package example.inventory;

public class Main {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();

        Product product1 = new Product("P001", "Laptop", 10, 800.00);
        Product product2 = new Product("P002", "Smartphone", 25, 500.00);
        Product product3 = new Product("P003", "Tablet", 15, 300.00);

        
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        
        System.out.println("Inventory after adding products:");
        inventory.displayInventory();

       
        Product updatedProduct1 = new Product("P001", "Laptop", 8, 750.00);
        inventory.updateProduct(updatedProduct1);

        
        System.out.println("Inventory after updating product P001:");
        inventory.displayInventory();

        
        inventory.deleteProduct("P002");

        
        System.out.println("Inventory after deleting product P002:");
        inventory.displayInventory();
    }
	}


