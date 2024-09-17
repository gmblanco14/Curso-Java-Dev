/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1poo;

/**
 *
 * @author MANUEL
 */

public class CuentaAhorro extends Cuenta{

    private double interesMenual;

    public CuentaAhorro(int numero, double saldo, double interesMenual) {
        super(numero, saldo);
        this.interesMenual=interesMenual;
    }

    public double getInteresMenual() {
        return interesMenual;
    }

    public void setInteresMenual(double interesMenual) {
        this.interesMenual = interesMenual;
    }

    public double calcularIntereses(){
        double interes= getSaldo()*(getInteresMenual()/100);
        return interes;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "interesMenual:" + interesMenual +
                '}';
    }
}