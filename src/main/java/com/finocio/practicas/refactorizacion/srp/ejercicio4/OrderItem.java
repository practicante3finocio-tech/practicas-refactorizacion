package com.finocio.practicas.refactorizacion.srp.ejercicio4;

public class OrderItem {

    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return getQuantity();
    }

    public double getSubtotal() {
        return product.getPrice() * quantity;
    }

    public String toString(){
        return product.getName() + " x" + quantity + " - $" + String.format("%.2f", getSubtotal());
    }
}
