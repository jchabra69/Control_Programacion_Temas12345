/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.controltemas12345_josenicolaschamerobravo;

/**
 * EJERCICIO 1 Se nos plantea realizar un programa que ayude a realizar el
 * triaje en unas urgencias hospitalarias. El triaje es la clasificación (en
 * este caso por colores) en verde (baja prioridad), amarillo (prioridad media),
 * rojo (alta prioridad), negro (fallecimiento, prioridad nula). Cada prioridad
 * determina el tiempo máximo de atención para el paciente: negra sin tiempo
 * determinado, roja atención inmediata, amarillo entre 10 y 60 minutos, verde
 * entre 60 y 2 horas.
 *
 * @author jncb
 */
import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String opcion;
        String respuesta;
        String respuesta2;
        String respuesta3;
        String respuesta4;
        String respuesta5;
        String respuesta6;
        int negro = 0, rojo = 0, verde = 0, amarillo = 0;
        boolean salir;

        do {
            System.out.println("Sistema de triaje urgencias hospitalarias: ");
            System.out.println("a. Realizar triaje");
            System.out.println("b. Mostrar estadísticas");
            System.out.println("c. Salir");

            opcion = entrada.next();

            switch (opcion) {

                case "a":

                    System.out.println("¿Puede caminar? s/n");

                    respuesta = entrada.next();

                    if (respuesta.equals("s")) {

                        System.out.println("Tiene prioridad 3, verde");
                        
                        verde = verde + 1;
                        

                    } else { //Ahora sabemos que la persona no puede caminar
                        System.out.println("¿Respira? s/n");

                        //entrada.reset();
                        //HAY QUE PEDIR EL VALOR DE LA VARIABLE ANTES DEL IF
                        respuesta2 = entrada.next();

                        //Si respira
                        if (respuesta2.equals("s")) {

                            System.out.println("¿Tiene una FR mayor a 30 veces por minuto? s/n");
                            respuesta3 = entrada.next();

                            if (respuesta3.equals("s")) {

                                System.out.println("Prioridad 1. ROJO");
                                rojo = rojo + 1;

                            } else {
                                System.out.println("¿Tiene pulso radial? s/n");

                                respuesta5 = entrada.next();

                                if (respuesta5.equals("s")) {

                                    System.out.println("¿Está orientado?");

                                    respuesta6 = entrada.next();

                                    if (respuesta6.equals("s")) {
                                        System.out.println("Prioridad 2, AMARILLO");
                                        amarillo = amarillo + 1;
                                        
                                    } else {
                                        System.out.println("Prioridad 1, ROJO");
                                        rojo = rojo + 1;
                                    }

                                } else {
                                    System.out.println("Controle hemorragia");
                                    System.out.println("Prioridad 1. ROJO");
                                    rojo = rojo + 1;
                                }

                            }

                            //Si NO respira pregunto si al hacer maniobras respira
                        } else {
                            System.out.println("¿Haciendo maniobras de reposición respira? s/n");

                            respuesta4 = entrada.next();

                            if (respuesta4.equals("s")) {

                                System.out.println("Prioridad 1. ROJO");
                                rojo = rojo + 1;

                            } else {

                                System.out.println("Prioridad 0, NEGRO");
                                negro = negro + 1;

                               

                            }

                        }

                    }

                    salir = false;
                    break;

                case "b":
                   
                    
                    System.out.println("Verde" + verde);
                    System.out.println("Amarillo" + amarillo);
                    System.out.println("Rojo" + rojo);
                    System.out.println("Negro" + negro);
                    
                    salir = false;
                    break;

                case "c":

                    System.out.println("Adew!");
                    salir = true;
                    break;

                default:
                    System.out.println("Meca, esa opción no existe");
                    salir = false;

            }

        } while (!salir);

    }
}
