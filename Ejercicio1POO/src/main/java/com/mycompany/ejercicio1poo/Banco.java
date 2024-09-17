package com.mycompany.ejercicio1poo;

import java.util.ArrayList;

public class Banco implements ServicioClientes, ServicioCuentas {
    private String nombre;
    private Domicilio domicilio;
    private String telefono;
    private ArrayList<Cliente> clientes;
    private ArrayList<Cuenta> cuentas; 

    public Banco(String nombre, Domicilio domicilio, String telefono, ArrayList<Cliente> clientes) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.clientes = clientes;
        this.cuentas = new ArrayList<>();
    }

    // Implementación de métodos de ServicioClientes
    @Override
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void eliminarCliente(int numeroCliente) {
        clientes.removeIf(cliente -> cliente.getNumero() == numeroCliente);
    }

    @Override
    public Cliente obtenerCliente(int numeroCliente) {
        return clientes.stream()
                .filter(cliente -> cliente.getNumero() == numeroCliente)
                .findFirst()
                .orElse(null);
    }

    // Implementación de métodos de ServicioCuentas
    @Override
    public void abrirCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    @Override
    public void cerrarCuenta(int numeroCuenta) {
        cuentas.removeIf(cuenta -> cuenta.getNumero() == numeroCuenta);
    }

    @Override
    public Cuenta obtenerCuenta(int numeroCuenta) {
        return cuentas.stream()
                .filter(cuenta -> cuenta.getNumero() == numeroCuenta)
                .findFirst()
                .orElse(null);
    }

    // Otros métodos de Banco
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Domicilio getDomicilio() { return domicilio; }
    public void setDomicilio(Domicilio domicilio) { this.domicilio = domicilio; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public ArrayList<Cliente> getClientes() { return clientes; }
    public void setClientes(ArrayList<Cliente> clientes) { this.clientes = clientes; }
    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio  +
                ", telefono='" + telefono + '\'' +
                ", clientes=" + clientes +
                '}';
    }
}
