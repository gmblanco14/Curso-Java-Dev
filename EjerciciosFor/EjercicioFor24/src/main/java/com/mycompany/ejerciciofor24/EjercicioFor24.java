/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciofor24;

/**
 *
 * @author MANUEL
 */
public class EjercicioFor24 {
    
    

    public static void main(String[] args) {
        String[] elementos = {"Este", "es", "el", "ejercicio numero", "24 del curso", "de Java"};
        String concatenado = concatenar(elementos);
        System.out.println(concatenado);
    }
    
    public static String concatenar(String[] array) {
    StringBuilder concatenado = new StringBuilder();
    for (int i = 0; i < array.length; i++){
        concatenado.append(array[i]);
        if(i < array.length - 1){
            concatenado.append(",");
        }
    }
    return concatenado.toString();
    }
}
