package com.finocio.practicas.refactorizacion.srp.ejercicio2;



import com.finocio.practicas.refactorizacion.srp.ejercicio3.Product;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private List<Product> products;

    public Invoice () {
        products = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        if (quantity <= 0) throw new IllegalArgumentException("La cantidad debe de ser mayor a 0");
        if (quantity > product.getStock()) throw new IllegalArgumentException("No hay stock");
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----Factura----\n");

        for (Product p : products) {
            sb.append(p.getName())
                    .append(" - $")
                    .append(String.format("%.2f", p.getPrice()))
                    .append("\n");
        }

        sb.append("Total: $")
                .append(String.format("%.2f", calculateTotal()))
                .append("\n");

        return sb.toString();

    }
}
