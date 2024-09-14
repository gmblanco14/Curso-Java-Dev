/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciofor20;

import java.util.Scanner;

/**
 *
 * @author MANUEL
 */
public class EjercicioFor20 {

    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a buscar: ");
        int numeroBuscado = scanner.nextInt();
        
        boolean encontrado = false;
        for(int i=0; i < numeros.length; i++){
            if(numeros[i] == numeroBuscado){
            encontrado = true;
            break;
        }
    }
    if(encontrado){
            System.out.println("Encontrado");
} else{
            System.out.println("No encontrado");
}
    scanner.close();
}
}
