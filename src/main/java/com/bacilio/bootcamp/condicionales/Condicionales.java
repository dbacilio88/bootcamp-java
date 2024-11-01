/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bacilio.bootcamp.condicionales;

/**
 *
 * @author bxcode
 */
public class Condicionales {

    //if, else if, else 
    void validarCondicional() {
        int nota = 20;

        if (nota > 18) {
            System.out.println("Sobresaliente");
        } else if (nota <= 18 && nota > 15) {
            System.out.println("Bueno");
        } else if (nota <= 15 && nota > 13) {
            System.out.println("Regular");
        } else if (nota <= 13 && nota > 10.5) {
            System.out.println("A las justas");
        } else {
            System.out.println("Desaporbado");
        }
    }

    // switch
    void validarSwitchCondicional() {
        char letra = 'A';

        switch (letra) {
            case 'A':
                System.out.println("A");
                break;
            case 'E':
                System.out.println("E");
                break;
            case 'I':
                System.out.println("I");
                break;
            case 'O':
                System.out.println("O");
                break;
            case 'U':
                System.out.println("U");
                break;
            default:
                System.out.println("No es vocal");
        }
    }

    //operador ternario:
    void validarTernarioCondicional() {
        int edad = 18;
        String texto = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
        System.out.println(texto);

    }
}
