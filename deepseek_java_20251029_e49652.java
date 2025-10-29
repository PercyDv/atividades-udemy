package com.example.model.entities;

import com.example.model.enums.OrderStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Long id;
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items;
    
    public Order() {
        this.items = new ArrayList<>();
    }
    
    public Order(Long id, Date moment, OrderStatus status, Client client) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.client = client;
        this.items = new ArrayList<>();
    }
    
    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Date getMoment() { return moment; }
    public void setMoment(Date moment) { this.moment = moment; }
    
    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }
    
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    
    public List<OrderItem> getItems() { return items; }
    
    public void addItem(OrderItem item) {
        items.add(item);
    }
    
    public void removeItem(OrderItem item) {
        items.remove(item);
    }
    
    public Double getTotal() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.getSubTotal();
        }
        return sum;
    }
    
    @Override
    public String toString() {
        return "Order [id=" + id + ", moment=" + moment + ", status=" + status + ", client=" + client.getName() + "]";
    }
}