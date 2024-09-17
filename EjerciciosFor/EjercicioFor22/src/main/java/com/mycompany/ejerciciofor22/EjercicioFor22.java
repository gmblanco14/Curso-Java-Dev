/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciofor22;

/**
 *
 * @author MANUEL
 */
public class EjercicioFor22 {

    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 5, 1, 9, 8, 3};
        int suma = 0;
        
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        
        double prom = (double) suma/numeros.length;
        
        System.out.println("El promedio es: " + prom);
    }
}
