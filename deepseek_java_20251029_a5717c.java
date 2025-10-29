package com.example.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private Long id;
    private String name;
    private String email;
    private List<Order> orders;
    
    public Client() {
        this.orders = new ArrayList<>();
    }
    
    public Client(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }
    
    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public List<Order> getOrders() { return orders; }
    public void addOrder(Order order) { this.orders.add(order); }
    
    @Override
    public String toString() {
        return "Client [id=" + id + ", name=" + name + ", email=" + email + "]";
    }
}