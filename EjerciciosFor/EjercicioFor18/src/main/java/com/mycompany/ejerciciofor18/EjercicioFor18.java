/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciofor18;

/**
 *
 * @author MANUEL
 */
public class EjercicioFor18 {

    public static void main(String[] args) {
        String[] palabras = {"hola", "mundo", "java", "pp", "curso"};
        for (int i = 0; i<palabras.length; i++){
            palabras[i] = palabras[i].toUpperCase();
        }
        System.out.println("Palabras en Mayusculas: ");
        for(String palabra : palabras){
            System.out.println(palabra);
        }
    }
}
