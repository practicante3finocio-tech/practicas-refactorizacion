package com.finocio.practicas.refactorizacion.srp.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private Customer customer;
    private List<OrderItem> items;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        if (quantity <= 0) throw new IllegalArgumentException("Cantidad debe ser mayor a 0");
        if (quantity > product.getStock()) throw new IllegalArgumentException("No hay stock suficiente");

        items.add(new OrderItem(product, quantity));
        product.setStock(product.getStock() - quantity);
    }

    public void removeProduct(Product product){
        items.removeIf(item -> item.getProduct().equals(product));
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura para: ").append(customer.getName())
                .append(" (").append(customer.getEmail()).append(")\n"); // agregamos email

        for (OrderItem item : items) {
            sb.append(item).append("\n");
        }
        sb.append("Total: $").append(String.format("%.2f", calculateTotal()));
        return sb.toString();
    }
}
