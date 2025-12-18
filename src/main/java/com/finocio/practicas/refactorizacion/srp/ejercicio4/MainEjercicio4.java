package com.finocio.practicas.refactorizacion.srp.ejercicio4;

public class MainEjercicio4 {
    public static void main(String[] args){

        Customer customer = new Customer("Jose Javier", "jose@gmail.com");

        Product portatil = new Product("Portatil msi", 1000, 5);
        Product raton = new Product("Ratón razer", 80, 10);

        Order order = new Order(customer);
        order.addProduct(portatil, 1);
        order.addProduct(raton, 5);


        System.out.println("===================");
        System.out.println(order);
        System.out.println("===================");
        System.out.println("\n");
        order.removeProduct(raton);
        System.out.println("===================");
        System.out.println("Factura con el ratón eliminado");
        System.out.println("===================");
        System.out.println(order);


    }
}
