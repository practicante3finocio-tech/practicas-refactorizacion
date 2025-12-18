package com.finocio.practicas.refactorizacion.srp.ejercicio1;

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


public class Main {
    public static void main(String[] args) {

        BookRefactored book = new BookRefactored("Como cuidar de un gato", "Zhengda", 14, 10);

        System.out.println(book);
    }
}
