package com.finocio.practicas.refactorizacion.ocp.ejercicio1;

public class Main {
    public static void main(String[] args){

        CalculadoraAreaRefactored calculadora = new CalculadoraAreaRefactored();

        Figura circulo = new Circulo(3);
        Figura triangulo = new Triangulo(3, 2);
        Figura rectangulo = new Rectangulo(5, 2);

        System.out.println(calculadora.calcularAreaRefactored(circulo));
        System.out.println(calculadora.calcularAreaRefactored(triangulo));
        System.out.println(calculadora.calcularAreaRefactored(rectangulo));

    }
}
