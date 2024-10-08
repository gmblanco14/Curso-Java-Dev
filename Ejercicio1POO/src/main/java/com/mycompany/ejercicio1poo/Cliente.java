/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1poo;

import java.util.ArrayList;

/**
 *
 * @author MANUEL
 */
public class Cliente implements Comparable<Cliente> {

    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private String fechaNacimiento;

    public Cliente(int numero, String nombre, Domicilio domicilio, String telefono, String fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuentas = new ArrayList<>();
    }

    @Override
    public int compareTo(Cliente otroCliente) {
        return Integer.compare(this.numero, otroCliente.numero);
    }

    // Getters y Setters
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Domicilio getDomicilio() { return domicilio; }
    public void setDomicilio(Domicilio domicilio) { this.domicilio = domicilio; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public ArrayList<Cuenta> getCuentas() { return cuentas; }
    public void setCuentas(ArrayList<Cuenta> cuentas) { this.cuentas = cuentas; }
    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    @Override
    public String toString() {
        return "Cliente{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", telefono='" + telefono + '\'' +
                ", cuentas=" + cuentas +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
