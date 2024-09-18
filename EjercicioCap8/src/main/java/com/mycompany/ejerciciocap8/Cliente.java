/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocap8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MANUEL
 */
public class Cliente {
    private int numeroCliente;
    private List<Cuenta> cuentas;
    
    public Cliente(int numeroCliente){
        this.numeroCliente = numeroCliente;
        this.cuentas = new ArrayList<>();
    }
    
    public void agregarCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }
    
    public int getNumeroCliente(){
        return numeroCliente;
    }
    public List<Cuenta> getCuentas(){
        return cuentas;
    }
}
