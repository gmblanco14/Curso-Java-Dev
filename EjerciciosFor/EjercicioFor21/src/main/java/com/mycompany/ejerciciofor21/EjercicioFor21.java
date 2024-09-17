/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciofor21;

/**
 *
 * @author MANUEL
 */
public class EjercicioFor21 {

    public static void main(String[] args) {
        int[] numeros = {5, 2, 6, 9, 1, 4};
        for (int i =  0; i < numeros.length; i++){
            if( i % 2 != 0){
                System.out.println("Elemento en posicion impar: " + numeros[i]);
            }
        }
    }
}
