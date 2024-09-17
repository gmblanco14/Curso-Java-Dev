/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejercicio1poo;

/**
 *
 * @author MANUEL
 */

public interface ServicioCuentas {
    void abrirCuenta(Cuenta cuenta);
    void cerrarCuenta(int numeroCuenta);
    Cuenta obtenerCuenta(int numeroCuenta);
}

