/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1poo;

/**
 *
 * @author MANUEL
 */
import java.util.*;

public class Banco {

    private String nombre;
    private Domicilio domicilio;
    private String telefono;
    private SortedSet<Cliente> clientes;
    private SortedSet<Cuenta> cuentas;

    public Banco(String nombre, Domicilio domicilio, String telefono, SortedSet<Cliente> clientes) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.clientes = clientes;
        this.cuentas = new TreeSet<>();  // Inicializar el conjunto de cuentas
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Domicilio getDomicilio() { return domicilio; }
    public void setDomicilio(Domicilio domicilio) { this.domicilio = domicilio; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public SortedSet<Cliente> getClientes() { return clientes; }
    public void setClientes(SortedSet<Cliente> clientes) { this.clientes = clientes; }
    public SortedSet<Cuenta> getCuentas() { return cuentas; }  // Método getter para cuentas
    public void setCuentas(SortedSet<Cuenta> cuentas) { this.cuentas = cuentas; }

    public void abrirCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void cerrarCuenta(int numeroCuenta) {
        cuentas.removeIf(cuenta -> cuenta.getNumero() == numeroCuenta);
    }

    public Cliente obtenerCliente(int numeroCliente) {
        return clientes.stream()
                .filter(cliente -> cliente.getNumero() == numeroCliente)
                .findFirst()
                .orElse(null);
    }

    public Cuenta obtenerCuenta(int numeroCuenta) {
        return cuentas.stream()
                .filter(cuenta -> cuenta.getNumero() == numeroCuenta)
                .findFirst()
                .orElse(null);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", telefono='" + telefono + '\'' +
                ", clientes=" + clientes +
                ", cuentas=" + cuentas +
                '}';
    }
}
