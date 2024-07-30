package example.sortingorders;

import java.util.Arrays;


public class SortingOrdersTest {

	public static void main(String[] args) {
		Order[] orders = {
                new Order(1, "Alice", 300.0),
                new Order(2, "Bob", 150.0),
                new Order(3, "Charlie", 450.0),
                new Order(4, "David", 200.0),
                new Order(5, "Eve", 500.0)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        // Bubble Sort
        BubbleSort.bubbleSort(orders);
        System.out.println("Orders after Bubble Sort:");
        printOrders(orders);

        // Quick Sort
        Order[] ordersForQuickSort = {
                new Order(1, "Alice", 300.0),
                new Order(2, "Bob", 150.0),
                new Order(3, "Charlie", 450.0),
                new Order(4, "David", 200.0),
                new Order(5, "Eve", 500.0)
        };
        QuickSort.quickSort(ordersForQuickSort, 0, ordersForQuickSort.length - 1);
        System.out.println("Orders after Quick Sort:");
        printOrders(ordersForQuickSort);
    }

    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

	}

