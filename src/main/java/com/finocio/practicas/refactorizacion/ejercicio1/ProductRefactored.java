package com.finocio.practicas.refactorizacion.ejercicio1;

public class ProductRefactored {

    private String name;
    private double price;
    private int stock;

    // Constructor
    public ProductRefactored(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) {  // Basic validation
            this.price = price;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {  // Basic validation
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
        }
    }

}
