/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicapoo;

import java.util.Scanner;

/**
 *
 * @author MANUEL
 */
public class Main {

    public static int buscarNumeroCuenta(Cuenta cuentas[], int n){
        int i=0, indice = 0;
        boolean encontrado = false;
        
        //Busqueda secuencial
        while ((i<cuentas.length)&& (encontrado==false)) {
            if(cuentas[i].getNumeroCuenta()==n){
                encontrado=true;
                indice = i;
            }
            i++;
        }
        if(encontrado==false){
            indice =-1; 
        }
        
        return indice;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nombre,direccion, telefono;
        int numeroCuenta, nCuentas, opcion, indiceCuenta;
        double saldo, cantidad;
        Cuenta cuentas[];
        Cliente cliente;
        
         System.out.println("Digite el nombre del cliente: ");
         nombre = entrada.nextLine();
         
         System.out.println("Digite la direccion del cliente: ");
         direccion = entrada.nextLine();
         
         System.out.println("Digite el telefono del cliente: ");
         telefono = entrada.nextLine();
        
        
        System.out.println("Cuantas cuentas tiene el cliente: ");
        nCuentas = entrada.nextInt();
        
        cuentas = new Cuenta[nCuentas];
        
        for(int i=0; i<cuentas.length; i++){
            System.out.println("Digite los datos de la cuenta" + (i+1) + ":" );
            System.out.println("Digite el numero de cuenta");
            numeroCuenta = entrada.nextInt();
            System.out.println("Digite el saldo de la cuenta");
            saldo = entrada.nextDouble();
            
            cuentas[i] = new Cuenta(numeroCuenta, saldo);
        }
        
        cliente = new Cliente(nombre, direccion, telefono, cuentas);
        
        do{
            System.out.println("\t. :Menu: .");
            System.out.println("\n1. Ingresar dinero");
            System.out.println("\n2. Retirar dinero");
            System.out.println("\n3. Consultar dinero");
            System.out.println("\n4. Salir");
            System.out.println("\n Digita la opcion deseada: ");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1: System.out.println("Digite el numero de cuenta");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                    if(indiceCuenta==-1){
                        System.out.println("El numero de cuenta No existe");
                    }else{
                        System.out.println("Digite la cantidad de dinero a Ingresar");
                        cantidad = entrada.nextDouble();
                        
                        cliente.ingresar_dinero(indiceCuenta, cantidad);
                        System.out.println("Ingreso Satisfactorio");
                        System.out.println("El saldo disponible "+cliente.consultar_Saldo(indiceCuenta));
                    }
                    break;
                    case 2: System.out.println("Digite el numero de cuenta");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                    if(indiceCuenta==-1){
                        System.out.println("El numero de cuenta No existe");
                    }else{
                        System.out.println("Ingrese la cantidad a retirar: ");
                        cantidad = entrada.nextDouble();
                        if(cantidad >cliente.consultar_Saldo(indiceCuenta)){
                            System.out.println("Saldo insuficiente");
                        }else{
                            cliente.retirar_dinero(indiceCuenta, cantidad);
                            System.out.println("Retiro Satisfactorio");
                        System.out.println("El saldo disponible "+cliente.consultar_Saldo(indiceCuenta));
                        }
                    }
                    break;
                    case 3: System.out.println("Digite el numero de cuenta");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                    if(indiceCuenta==-1){
                        System.out.println("El numero de cuenta No existe");
                    }else{
                        System.out.println("El saldo disponible "+cliente.consultar_Saldo(indiceCuenta));
                    }
                    break;
                    case 4: break;
                    default: System.out.println("Opcion Invalida");
                    break;
            }
            
        }while(opcion !=4);
        
    }
    
}
