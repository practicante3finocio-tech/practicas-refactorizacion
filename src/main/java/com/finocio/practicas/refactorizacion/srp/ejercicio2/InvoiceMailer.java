package com.finocio.practicas.refactorizacion.srp.ejercicio2;

public class InvoiceMailer {

    public void send(InvoiceRefactored invoiceRefactored, String email) {
        // En este ejemplo, solo simulamos el envío
        System.out.println("Enviando factura a " + email + "...");
        System.out.println("Contenido de la factura:");
        for (InvoiceItem item : invoiceRefactored.getItems()) {
            System.out.println(item.getProduct().getName() +
                    " x" + item.getQuantity() +
                    " - $" + String.format("%.2f", item.getSubTotal()));
        }
        System.out.println("Total: $" + String.format("%.2f", invoiceRefactored.calculateTotal()));
        System.out.println("Factura enviada correctamente.\n");
    }
}
