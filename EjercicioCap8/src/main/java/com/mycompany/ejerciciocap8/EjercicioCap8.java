/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocap8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MANUEL
 */

public class EjercicioCap8 {

    public static void main(String[] args) {
         
        Cliente cliente1 = new Cliente(1);
        Cliente cliente2 = new Cliente(2);
        Cliente cliente3 = new Cliente(3);
        
        List<Cuenta> cuentas = leerCuentasDesdeArchivo("cuentas.txt");
        
        if(asignarCuentasAClientes(cuentas, cliente1, cliente2, cliente3)){
            System.out.println("Cuentas asignadas correctamente");
            mostrarCuentas(cliente1);
            mostrarCuentas(cliente2);
            mostrarCuentas(cliente3);
        } else {
            System.out.println("Error en la asignacion de cuentas.");
        }
    }
    
    private static List<Cuenta> leerCuentasDesdeArchivo(String nombreArchivo){
        List<Cuenta> cuentas = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))){
            String linea;
            while ((linea = br.readLine()) != null){
                linea = linea.replaceAll("[\\[\\]]", ""); // Cambiado a replaceAll
                String[] partes = linea.split(",");
                
                if (partes.length < 5) continue;
                
                String numeroCuenta = partes[0].trim();
                String fechaApertura = partes[1].trim();
                double saldo = Double.parseDouble(partes[2].trim());
                int clienteId = Integer.parseInt(partes[4].trim());
                
                cuentas.add(new Cuenta(numeroCuenta, fechaApertura, saldo, clienteId));
            }
        } catch (NumberFormatException e){
            System.out.println("Error al convertir un número: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return cuentas;
    }
    
  private static boolean asignarCuentasAClientes(List<Cuenta> cuentas, Cliente c1, Cliente c2, Cliente c3){
    // Validar que hay suficientes cuentas
    if(cuentas.size() < 5){
        return false; // Cambiado a 5
    }
    
    // Asignar cuentas según lo especificado
    c1.agregarCuenta(cuentas.get(0)); // Cliente 1: 1 cuenta
    
    c2.agregarCuenta(cuentas.get(1)); // Cliente 2: cuenta 1
    c2.agregarCuenta(cuentas.get(3)); // Cliente 2: cuenta 2
    
    c3.agregarCuenta(cuentas.get(2)); // Cliente 3: cuenta 1
    c3.agregarCuenta(cuentas.get(4)); // Cliente 3: cuenta 2
    
    return (c1.getCuentas().size() == 1 &&
            c2.getCuentas().size() == 2 &&
            c3.getCuentas().size() == 2); // Ajustado a 2 para el cliente 3
}
    
    private static void mostrarCuentas(Cliente cliente){
        System.out.println("Cliente: " + cliente.getNumeroCliente() + ": ");
        for (Cuenta cuenta : cliente.getCuentas()){
            System.out.println(cuenta.toString());
        }
    }
}