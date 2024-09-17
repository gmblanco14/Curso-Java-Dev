/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1poo;

/**
 *
 * @author MANUEL
 */
public class CuentaAhorro extends Cuenta {

    private double interesMensual;

    public CuentaAhorro(int numero, double saldo, double interesMensual) {
        super(numero, saldo);  // Llamada al constructor de la clase base
        this.interesMensual = interesMensual;
    }

    public double getInteresMensual() { return interesMensual; }
    public void setInteresMensual(double interesMensual) { this.interesMensual = interesMensual; }

    public double calcularIntereses() {
        // Asegúrate de que el método getSaldo() existe en la clase Cuenta
        return getSaldo() * (interesMensual / 100);
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "numero=" + getNumero() +
                ", saldo=" + getSaldo() +
                ", interesMensual=" + interesMensual +
                '}';
    }
}

