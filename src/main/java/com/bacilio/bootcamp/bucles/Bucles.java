/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bacilio.bootcamp.bucles;

/**
 *
 * @author bxcode
 */
public class Bucles {

    public static void main(String[] args) {
        //programacion orientada a objetos:
        Bucles bucles = new Bucles();
        String name = bucles.getName("Jose", 20);
        System.out.println(name);
        bucles.generarNumRandom();
    }

    //1. Genetar un metodo que imprima 10 numeros random:
    // create to code:
    //2. Generar un metodo que imprima un numero que este dentro 1>= N <=10
    // create to code:
    //3. Generar un metodo que retorne un numero que este dentro 20>= N <=30
    // create to code:
    //4. Generar un metodo que retorne un arreglo de 10 de numeros que este dentro 1>= N <=20
    public int[] getNumberArray() {
        int[] arr = new int[10];
        // implemetar codigo
        return arr;
    }
    //5. Generar un metodo que imprima numeros impares del 1 al 100
    //6. Generar un metodo que imprima numeros pares del 1 al 100
    //7. Generar un metodo que imprima fizz  
    // explicacion: 
    // -divisor 3 imprimr "fizz"
    // -divisor 5 imprimr "buzz"
    // -divisor 3 y 5 imprimr "fizz buzz"
    //
    
    void generarNumRandom() {
        double random = Math.random();
        System.out.println("El numero random es: " + random); //0.0 > y < 1.0
        //0.23898583367831538
        //0.706637906410825
        //0.19967884506371725
        //0.12714306698594657
        //0.5003787237320263
    }

    //crear metodos:
    //generar numeros aleatorios: Math.random();
    //for, while, do-while
    void printNumbers() {
        //inicializacion; condicion o control; incremento o decremento 
        for (int i = 0; i <= 10; i++) {
            System.out.println("valor " + i);
        }
    }

    void printNombres() {
        //inicializacion; condicion o control; incremento o decremento 
        //[] indice, valor [i]
        String[] nombres = {"Jose", "Ruben", "Erick", "Adrinao", "Christian"};
        for (String m : nombres) {
            System.out.println(m);
        }
    }

    void validarWhile() {
        //algo
        while (true) {
            System.out.println("algo");
        }
    }

    void validarDoWhile() {

        do {
            //algo o ejecutar 1 accion
        } while (true);
    }

    //definir un metodo 
    //- accesso (private,public, protected)
    //- tipo de dato a devolver: int, long, short, String, List, Map,....
    //- parametros si solo es requerido
    //- nombre del metodo
    public int getNumber() {
        return 10;
    }

    public String getName() {
        return "Jose";
    }

    public String getName(String name, int edad) {
        return "Mi nombre es " + name + " y mi edad es  " + edad;
    }

}
