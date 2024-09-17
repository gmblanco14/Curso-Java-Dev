/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1poo;

/**
 *
 * @author MANUEL
 */

import java.util.SortedSet;
import java.util.TreeSet;

public class Ejercicio1POO {

    public static void main(String[] args) {
        // Crear el domicilio
        Domicilio domicilio = new Domicilio("Calle 44", 1, "Colonia", "Estado", 18001);
        
        // Crear los clientes
        Cliente clienteA = new Cliente(1, "Georis", domicilio, "2000", "14/01/2000");
        Cliente clienteB = new Cliente(2, "Manuel", domicilio, "3000", "14/02/1999");
        
        // Crear un conjunto ordenado de clientes
        SortedSet<Cliente> clientesBanco = new TreeSet<>();
        clientesBanco.add(clienteA);
        clientesBanco.add(clienteB);
        
        // Crear el banco
        Banco banco = new Banco("Bcol", domicilio, "444", clientesBanco);
        
        // Crear cuentas
        Cuenta cuenta1 = new CuentaAhorro(1, 1000.0, 5.0);
        Cuenta cuenta2 = new CuentaCheque(2, 500.0, 10.0);
        
        // Agregar cuentas al banco
        banco.abrirCuenta(cuenta1);
        banco.abrirCuenta(cuenta2);
        
        // Imprimir datos
        System.out.println(banco);
        
        // Buscar cliente por número
        Cliente encontrado = banco.obtenerCliente(1);
        System.out.println("Cliente encontrado: " + encontrado);
        
        // Buscar cuenta por número
        Cuenta cuentaEncontrada = banco.obtenerCuenta(2);
        System.out.println("Cuenta encontrada: " + cuentaEncontrada);
        
        // Imprimir cuentas ordenadas
        System.out.println("Cuentas ordenadas por saldo:");
        banco.getCuentas().forEach(System.out::println);
    }
}
