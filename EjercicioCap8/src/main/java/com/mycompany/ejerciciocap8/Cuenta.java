/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocap8;

/**
 *
 * @author MANUEL
 */
public class Cuenta {
    
    protected String numeroCuenta;
    protected String fechaApertura;
    protected double saldo;
    protected int clienteId;

    public Cuenta(String numeroCuenta, String fechaApertura, double saldo, int clienteId) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.clienteId = clienteId;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getClienteId() {
        return clienteId;
    }
    
    
@Override
public String toString(){
    return "Cuenta: "+ numeroCuenta + ", Saldo: " + saldo + ", Cliente ID: "+ clienteId;
}
   
    
    
}
