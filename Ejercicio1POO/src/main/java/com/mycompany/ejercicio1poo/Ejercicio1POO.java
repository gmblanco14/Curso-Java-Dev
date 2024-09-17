/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1poo;

/**
 *
 * @author MANUEL
 */
import java.util.ArrayList;

public class Ejercicio1POO {

    public static void main(String[] args) {
        
        //se crea el domicilio
        Domicilio domicilio = new Domicilio("Calle 44", 1, "Baq", "Col", 18001);
        
        //se crean los clientes
        Cliente clienteA = new Cliente(1, "Georis", domicilio, "2000", "14/01/2000");
        Cliente clienteB = new Cliente(2, "Manuel", domicilio, "3000", "14/02/1999");
        ArrayList<Cliente> clientesBanco = new ArrayList<>();
        clientesBanco.add(clienteA);
        clientesBanco.add(clienteB);
        Banco banco = new Banco("Bcol", domicilio, "444", clientesBanco);
        
        
    }
}
