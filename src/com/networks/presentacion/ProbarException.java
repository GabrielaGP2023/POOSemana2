package com.networks.presentacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProbarException {
    public static void main(String[] args) {
        //Declarar un Scanner
        Scanner s1 = new Scanner(System.in);
        //Recibir por pantalla un número - nextInt()
        System.out.println("Escriba un número -> ");
        try {
            int dato = s1.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e.toString());
        }
        //Escribir una letra en lugar del número

        //Tratar el error con una estructura try - catch

        //Declarar un array de números con los siguientes números 1,2,5,2
        //Mostrar el número de la posición 5
        int[] numeros = {1, 2, 5, 2};
        //Usar una estructura catch para evitar que se detenga el programa
        try {
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}
