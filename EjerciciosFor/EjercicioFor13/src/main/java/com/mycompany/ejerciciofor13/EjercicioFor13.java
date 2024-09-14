/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciofor13;

/**
 *
 * @author MANUEL
 */
public class EjercicioFor13 {

    public static void main(String[] args) {
        int[] numeros = {5, 7, 35, 40, 9, 50,10, 15, 2, 1, 200, 23};
        int contador = 0;
        
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > 10){
                contador++;
            }
        }
        System.out.println("La cantidad de numeros mayores a 10 en el array es: "+contador);
    }
}
