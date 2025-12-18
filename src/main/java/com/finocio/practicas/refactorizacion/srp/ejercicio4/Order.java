package com.finocio.practicas.refactorizacion.srp.ejercicio4;

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

        items.add(new OrderItem(product, quantity));
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

    public void processOrder(){
        validateStock();
        double total = calculateTotal();
        reduceStock();
        printInvoice(total);
    }

    private void validateStock() {
        for (OrderItem item : items) {
            if (item.getQuantity() > item.getProduct().getStock()) {
                throw new IllegalArgumentException("No hay stock suficiente para: " + item.getProduct().getName());
            }
        }
    }

    private void reduceStock(){
        for (OrderItem item : items) {
            Product product = item.getProduct();
            product.setStock(product.getStock() - item.getQuantity());
        }
    }

    private void printInvoice(double total) {
        System.out.println("Factura para: " + customer.getName() +
                " (" + customer.getEmail() + ")");
        for (OrderItem item : items) {
            System.out.println(item.getProduct().getName() +
                    " x" + item.getQuantity() +
                    " - $" + String.format("%.2f", item.getSubtotal()));
        }
        System.out.println("Total: $" + String.format("%.2f", total));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura para: ").append(customer.getName())
                .append(" (").append(customer.getEmail()).append(")\n");
        for (OrderItem item : items) {
            sb.append(item).append("\n");
        }
        sb.append("Total: $").append(String.format("%.2f", calculateTotal()));
        return sb.toString();
    }
}
