package com.finocio.practicas.refactorizacion.ocp.ejercicio1;

public class Rectangulo implements Figura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return base * altura;
    }
}

