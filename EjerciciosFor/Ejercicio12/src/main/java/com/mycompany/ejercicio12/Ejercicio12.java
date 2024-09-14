/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12;

/**
 *
 * @author MANUEL
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        int[] numeros = {5, 30, 35, 40, 45, 50,10, 15, 20, 25};
        int mayor = numeros[0];
        
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("El numero mas grande en el array es: "+mayor);
    }
}
