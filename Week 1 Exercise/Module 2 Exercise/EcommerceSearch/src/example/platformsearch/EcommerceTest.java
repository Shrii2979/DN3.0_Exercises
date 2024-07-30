package example.platformsearch;

import java.util.Arrays;

public class EcommerceTest {
    public static void main(String[] args) {
        
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Smartphone", "Electronics"),
                new Product(3, "Headphones", "Electronics"),
                new Product(4, "Camera", "Electronics"),
                new Product(5, "Smartwatch", "Electronics")
        };

        // Linear Search
        System.out.println("Linear Search:");
        Product linearResult = LinearSearch.linearSearch(products, "Smartphone");
        System.out.println(linearResult != null ? linearResult : "Product not found");

        // Sort products by productName for binary search
        Arrays.sort(products, (a, b) -> a.getProductName().compareTo(b.getProductName()));

        //  Binary Search
        System.out.println("Binary Search:");
        Product binaryResult = BinarySearch.binarySearch(products, "Smartwatch");
        System.out.println(binaryResult != null ? binaryResult : "Product not found");
    }
}
