/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.procesoPagos;



/**
 *
 * @author ledya
 */
public class pagoPayPal implements ImetodoPago {
    private String nombreUsuario;
    private String contraseña;
  
    

    public pagoPayPal(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
    @Override
    public boolean procesarPago(double monto) {
     // Autenticar con las credenciales de PayPal
        if (autenticarConPayPal()) {
            // Procesar el pago utilizando la cuenta de PayPal
            // Lógica para realizar el pago
            System.out.println("Pago con PayPal " + nombreUsuario + " realizado con éxito.");
            return true; // El pago se realizó con éxito
        } else {
            System.out.println("El pago con PayPal " + nombreUsuario + " no se pudo realizar debido a problemas de autenticación.");
            return false; // La autenticación con PayPal falló
        }
    }
   private boolean autenticarConPayPal() {
        // Verificar si el nombre de usuario existe y la contraseña coincide
        if ( nombreUsuario.equals("usuario1")&&contraseña.equals("contraseña1")) {
            return true; // La autenticación con PayPal fue exitosa
        } else {
            return false; // La autenticación con PayPal falló
        }
    }
    
   
}

