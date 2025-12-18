package com.finocio.practicas.refactorizacion;

public class Main {
    public static void main(String[] args){

         //Una clase no debe hacer varias cosas a la vez.
        //
        //Si mezclas responsabilidades, el código se vuelve difícil de mantener y probar.
        //
        //Separando responsabilidades, cada clase se vuelve más simple, entendible y reutilizable.

        /*
        1️⃣ Clase simple y refactorización

Objetivo: Crear una clase y luego refactorizarla.

Ejercicio:

Crea una clase Book con atributos title, author, price, stock.

Incluye métodos getters, setters y un método printBookDetails().

Refactoriza la clase:

Haz los atributos private.

Agrega validación para price y stock.

Crea un método toString().

Agrega un ejemplo de uso en main.

2️⃣ Ejemplo del Single Responsibility Principle (SRP)

Objetivo: Separar responsabilidades de una clase en varias.

Ejercicio:

Crea una clase Invoice que:

Calcula el total de la factura.

Imprime la factura.

Envía la factura por email.

Refactoriza según SRP:

Invoice → solo almacena datos y calcula total.

InvoicePrinter → se encarga de imprimir.

InvoiceMailer → se encarga de enviar por email.

3️⃣ Uso de composición y clases auxiliares

Objetivo: Mejorar la organización de clases.

Ejercicio:

Crea clases Customer, Order y Product.

Order contiene una lista de Product y un Customer.

Agrega métodos para:

Calcular el total de la orden.

Agregar y eliminar productos.

Refactoriza para que cada clase tenga una sola responsabilidad.

4️⃣ Refactorización de métodos largos

Objetivo: Dividir métodos grandes en métodos más pequeños.

Ejercicio:

Crea un método processOrder() en la clase Order que:

Valide stock.

Calcule total.

Descuente stock.

Imprima detalles.

Refactoriza processOrder() en varios métodos privados, cada uno con una sola responsabilidad.

5️⃣ Ejercicio avanzado: ejemplos de SRP con archivos

Objetivo: Separar responsabilidades incluso al trabajar con archivos.

Ejercicio:

Crea una clase ReportGenerator que genera un informe.

Inicialmente, que:

Cree los datos.

Formatee el informe.

Lo guarde en un archivo.

Refactoriza:

ReportData → genera los datos.

ReportFormatter → da formato al informe.

ReportSaver → guarda el archivo.
         */


    }
}