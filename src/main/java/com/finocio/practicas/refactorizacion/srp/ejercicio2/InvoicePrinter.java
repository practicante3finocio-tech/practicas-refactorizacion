package com.finocio.practicas.refactorizacion.srp.ejercicio2;

public class InvoicePrinter {

    public void print(InvoiceRefactored invoiceRefactored) {
        StringBuilder sb = new StringBuilder();
        sb.append("----Factura----");

        for(InvoiceItem item : invoiceRefactored.getItems()) {
            sb.append(item.getProduct().getName())
                    .append(" x")
                    .append(item.getQuantity())
                    .append(" - $")
                    .append(String.format("%.2f", item.getSubTotal()))
                    .append("\n");

        }

        sb.append("Total: $")
                .append(String.format("%.2f", invoiceRefactored.calculateTotal()))
                .append("\n");

        System.out.println(sb.toString());
    }

}
