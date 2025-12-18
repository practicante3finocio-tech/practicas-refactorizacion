package com.finocio.practicas.refactorizacion.srp.ejercicio2;


import com.finocio.practicas.refactorizacion.srp.ejercicio3.Product;

public class InvoiceItem {

    private Product product;
    private int quantity;

    public InvoiceItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubTotal() {
        return product.getPrice() * quantity;
    }
}
