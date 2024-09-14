/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciofor11;

/**
 *
 * @author MANUEL
 */
public class EjercicioFor11 {

    public static void main(String[] args) {
        
       int[] numeros = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
       int suma=0;
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        System.out.println("La suma de los elementos del array es: "+suma);
    }
}
