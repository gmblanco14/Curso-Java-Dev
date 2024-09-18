/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocap5;

/**
 *
 * @author MANUEL
 */
public class EjercicioCap5 {

    public static void main(String[] args) {
       Funcionalidad f1 = new Funcionalidad(){
           @Override
           public double operacion(double a, double b){
               return a+b;
           }
           
           @Override
           public boolean buscar(String donde, String que){
               return donde.contains(que);
           }
       };
    }
}
