package com.mycompany.ejercicio1poo;

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
        
        // Crear el banco y agregar clientes
        Banco banco = new Banco("Bcol", domicilio, "444", clientesBanco);
        
        // Crear cuentas
        Cuenta cuentaAhorro = new CuentaAhorro(1, 5000.0, 2.5);
        Cuenta cuentaCheque = new CuentaCheque(2, 1000.0, 20.0);
        
        // Abrir cuentas en el banco
        banco.abrirCuenta(cuentaAhorro);
        banco.abrirCuenta(cuentaCheque);
        
        // Obtener y mostrar una cuenta
        Cuenta cuentaObtenida = banco.obtenerCuenta(1);
        System.out.println("Cuenta obtenida: " + cuentaObtenida);
        
        // Cerrar una cuenta
        banco.cerrarCuenta(2);
        
        // Mostrar clientes y cuentas
        System.out.println("Clientes del banco: " + banco.getClientes());
        System.out.println("Cuentas del banco: " + banco.getClientes());
        
        // Mostrar banco
        System.out.println(banco);
    }
}
