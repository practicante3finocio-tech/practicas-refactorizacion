package com.finocio.practicas.refactorizacion.srp.ejercicio2;



import com.finocio.practicas.refactorizacion.srp.ejercicio3.Product;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRefactored {

    private List<InvoiceItem> items;

    public InvoiceRefactored() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
        if (quantity > product.getStock()) {
            throw new IllegalArgumentException("No hay suficiente stock");
        }
        items.add(new InvoiceItem(product, quantity));
    }

    public double calculateTotal() {
        double total = 0;
        for (InvoiceItem item : items) {
            total += item.getSubTotal();
        }
        return total;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----Factura----\n");
        for (InvoiceItem item : items) {
            sb.append(item.getProduct().getName())
                    .append(" x")
                    .append(item.getQuantity())
                    .append(" - $")
                    .append(String.format("%.2f", item.getSubTotal()))
                    .append("\n");
        }
        sb.append("Total: $")
                .append(String.format("%.2f", calculateTotal()))
                .append("\n");
        return sb.toString();
    }

}
