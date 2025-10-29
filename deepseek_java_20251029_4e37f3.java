package com.example.model.application;

import com.example.model.entities.Client;
import com.example.model.entities.Order;
import com.example.model.entities.OrderItem;
import com.example.model.entities.Product;
import com.example.model.enums.OrderStatus;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product(1L, "TV", "Smart TV 55", 1200.0);
        Product p2 = new Product(2L, "Mouse", "Wireless Mouse", 30.0);
        Product p3 = new Product(3L, "Keyboard", "Mechanical Keyboard", 80.0);
        
        // Create client
        Client client = new Client(1L, "John Doe", "john.doe@example.com");
        
        // Create order
        Order order = new Order(1L, new Date(), OrderStatus.PENDING_PAYMENT, client);
        
        // Add items to order
        order.addItem(new OrderItem(1, p1.getPrice(), p1));
        order.addItem(new OrderItem(2, p2.getPrice(), p2));
        order.addItem(new OrderItem(1, p3.getPrice(), p3));
        
        // Display order summary
        System.out.println("ORDER SUMMARY:");
        System.out.println("Client: " + client.getName());
        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Order Items:");
        
        for (OrderItem item : order.getItems()) {
            System.out.println("  " + item);
        }
        
        System.out.println("Total: $" + String.format("%.2f", order.getTotal()));
    }
}