package com.finocio.practicas.refactorizacion.srp.ejercicio1;

public class BookRefactored {

    private String title;
    private String author;
    private double price;
    private int stock;

    public BookRefactored(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
            if(price <= 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo");
            }
            this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
        this.stock = stock;
    }

    public String toString() {

        return "Título: " + getTitle() + "\n"
                + "Autor: " + getAuthor() + "\n"
                + "Precio: " + getPrice() + "\n" +
                "Stock: " + getStock();
    }
}
