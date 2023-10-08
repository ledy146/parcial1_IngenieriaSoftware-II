/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.procesoPagos;

/**
 *
 * @author ledya
 */
public class pagoTarjetaCredito implements ImetodoPago {
    private String numeroTarjeta;
    private double limiteCredito;
    private String contraseña;
   

    public pagoTarjetaCredito(String numeroTarjeta,String contraseña) {
        this.numeroTarjeta = numeroTarjeta;
        this.contraseña=contraseña;
       
    }
    @Override
    public boolean procesarPago(double monto) {
       // Verificar la tarjeta, la contraseña y el límite de crédito
        if (verificarInformacionTarjeta()&& verificarLimite(monto)) {
            // Procesar el pago y actualizar el límite de crédito
            limiteCredito -= monto;
            System.out.println("Pago con Tarjeta de Crédito " + numeroTarjeta + " realizado con éxito.");
            return true; // El pago se realizó con éxito
        } else {
            System.out.println("El pago con Tarjeta de Crédito " + numeroTarjeta + " no se pudo realizar debido a problemas de verificación.");
            return false; // La tarjeta, la contraseña o el límite no son válidos
        }
    }
    private boolean verificarInformacionTarjeta() {
        // Verificar si el nombre de usuario existe y la contraseña coincide
        if ( numeroTarjeta.equals("123")&&contraseña.equals("contraseña123")) {
            return true; 
        } else {
            return false; 
        }
        
    }
    
    private boolean verificarLimite(double monto) {
        limiteCredito=1500;
        if(monto<=limiteCredito){
            return true;
        }else{
            return false;
        }
    }

   
}


