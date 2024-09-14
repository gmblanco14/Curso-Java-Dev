/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciofor16;

/**
 *
 * @author MANUEL
 */
public class EjercicioFor16 {

    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        System.out.println("Los primeros "+n+" numeros de la secuencia Fibonnaci son:");
        for(int i=1; i<= n; i++){
            System.out.println(a+" ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
                    
        }
    }
}
