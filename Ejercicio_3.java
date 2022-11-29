/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.controltemas12345_josenicolaschamerobravo;

/** EJERCICIO 3
 * Realiza un programa que muestre en pantalla
 * dado un número N, el siguiente resultado: 
 * @author jncb
 */

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int entrada;
        System.out.println("Introduce el número N: ");
        entrada = teclado.nextInt();

        int inicio = 1;
        int entradaAux = entrada;

        while(inicio <= entrada && entradaAux >= 1) {
            System.out.println(inicio + " " + entradaAux);
            inicio++;
            entradaAux--;
        }
    }
}
   