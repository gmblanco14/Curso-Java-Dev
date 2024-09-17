/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciofor23;

/**
 *
 * @author MANUEL
 */
public class EjercicioFor23 {

    public static void main(String[] args) {
        Object[] elementos = {133 ,"Hola", 123 ,"Mundo", 3 ,"CursoJava"};
        int contador = 0;
        for (int i = 0; i < elementos.length; i++){
            if(elementos[i] instanceof String){
                contador++;
            }
        }
        System.out.println("La cantidad de String en el array es: " + contador);
    }
}
