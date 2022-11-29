/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.controltemas12345_josenicolaschamerobravo;

/** EJERCICIO 2
 * Realiza un programa en Java que realice la siguiente función:
- Pedir el límite inferior y superior de un intervalo. Si el límite inferior es mayor o igual
que el superior lo tiene que volver a pedir. A continuación se van introduciendo
números hasta que introduzcamos el número 0.
- Cuando termine el programa dará las siguientes informaciones
- La suma de los números que están dentro del intervalo (intervalo abierto, no
incluye los límites).
- Cuántos números están fuera del intervalo.
- Informa si hemos introducido algún número igual a los límites del intervalo.
 * @author jncb
 */

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        //Variables
        Scanner scanner = new Scanner(System.in);
        int inferior, superior, numero;
        int suma = 0;
        int contador = 0;
        boolean limite = false;

        //Pedir el límite inferior y superior de un rango/intervalo.
        do {
            System.out.print("Introduce el límite inferior: ");
            inferior = scanner.nextInt();
            System.out.print("Introduce el límite superior: ");
            superior = scanner.nextInt();
            if (inferior > superior) {
                System.out.println("Error, el límite inferior debe ser que el superior. "
                        + "Revisa los valores introducidos.");
            }
        } while (inferior > superior);

     //Cuando tenga los intervalos, empiezo a pedir numeros
        do {
            System.out.println("Introduce un número: ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (numero > inferior && numero < superior) {
                    suma += numero;
                } else if (numero <= inferior || numero >= superior) {
                    contador++;
                }
                if (numero == inferior || numero == superior) {
                    limite = true;
                }
            }//si me da 0, termino el cálculo.
        } while (numero != 0);

        System.out.println("La suma de los numeros que están dentro del intervalo: " + inferior + "-" + superior + " es de " + suma);
        System.out.println("Has introducido un total de " + contador + " números fuera del intervalo " + inferior + "-" + superior);
        if (limite) {
            System.out.println("Hay números que han coincidido con los límites del intervalo");
        } else {
            System.out.println("No ha habido números que coincidan con los límites del intervalo");
        }
    }
}
    

