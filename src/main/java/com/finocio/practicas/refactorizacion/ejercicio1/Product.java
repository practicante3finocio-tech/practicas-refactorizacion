package com.finocio.practicas.refactorizacion.ejercicio1;

public class Product {

        public String name;
        public double price;
        public int stock;

        public Product(String name, double price, int stock) {
            this.name = name;
            this.price = price;
            this.stock = stock;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getStock() {
            return stock;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public void printProductDetails() {
            System.out.println("Product name: " + name);
            System.out.println("Price: $" + price);
            System.out.println("Stock: " + stock);
        }
    }


