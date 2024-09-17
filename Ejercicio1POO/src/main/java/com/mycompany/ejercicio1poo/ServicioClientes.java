/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejercicio1poo;

/**
 *
 * @author MANUEL
 */

public interface ServicioClientes {
    void agregarCliente(Cliente cliente);
    void eliminarCliente(int numeroCliente);
    Cliente obtenerCliente(int numeroCliente);
}
