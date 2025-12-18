package com.finocio.practicas.refactorizacion.srp.ejercicio2;

/*
Clase simple y refactorización
Objetivo: Crear una clase y luego refactorizarla.
Ejercicio:
Crea una clase Book con atributos title, author, price, stock.
Incluye métodos getters, setters y un método printBookDetails().
Refactoriza la clase:
Haz los atributos private.
Agrega validación para price y stock.
Crea un método toString().
Agrega un ejemplo de uso en main.
 */



import com.finocio.practicas.refactorizacion.srp.ejercicio1.BookRefactored;
import com.finocio.practicas.refactorizacion.srp.ejercicio3.Product;

public class Main {
    public static void main(String[] args) {

        BookRefactored book = new BookRefactored("Como cuidar de un gato", "Zhengda", 14, 10);

        Product portatil = new Product("Portatil", 250, 5);
        Product sobremesa = new Product("Sobremesa", 500, 3);

        InvoiceRefactored invoiceRefactored = new InvoiceRefactored();
        invoiceRefactored.addProduct(portatil, 1);
        invoiceRefactored.addProduct(sobremesa, 2);

        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoiceRefactored);

        InvoiceMailer mailer = new InvoiceMailer();
        mailer.send(invoiceRefactored, "cliente@correo.com");


        System.out.println(invoiceRefactored);
        System.out.println(book);
    }
}
