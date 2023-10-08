/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.procesoPagos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ledya
 */
public class pagoTransferenciaBancaria implements ImetodoPago{
    private double numeroCuenta;
    private String nombreTitular;
    private String apellidoTitular;
    

    public pagoTransferenciaBancaria(double numeroCuenta,String nombreTitular,String apellidoTitular) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular=nombreTitular;
        this.apellidoTitular=apellidoTitular;
    }
    @Override
    public boolean procesarPago(double monto) {
       // Verificar si la información de la cuenta bancaria está completa y válida
        if (informacionCuentaValida()) {
            // Procesar el pago mediante transferencia bancaria
            // Lógica para realizar la transferencia bancaria
            System.out.println("Pago  de:  "+nombreTitular+" mediante transferencia bancaria realizado con éxito.");
            return true; // El pago se realizó con éxito
        } else {
            System.out.println("El pago de: "+nombreTitular+" mediante transferencia bancaria no se pudo realizar debido a problemas con la información de la cuenta.");
            return false; // La información de la cuenta bancaria es inválida
        }
    }
    private boolean informacionCuentaValida() {
       // Verificar si el nombre de usuario existe y la contraseña coincide
       if(numeroCuenta==123){
            if(nombreTitular.equals("pablo")&&apellidoTitular.equals("gomez")) {
            return true; // La autenticación con PayPal fue exitosa
        } else {
            return false; // La autenticación con PayPal falló
        }
       }else{
           return false;
       }
       
    }

   
}
