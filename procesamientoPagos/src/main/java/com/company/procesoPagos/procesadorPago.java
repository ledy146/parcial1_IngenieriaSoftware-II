/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.procesoPagos;

/**
 *
 * @author ledya
 */
public class procesadorPago {
        public boolean realizarPago(double monto, ImetodoPago metodoDePago) {
        // Lógica genérica para procesar el pago independientemente de la forma de pago
        return metodoDePago.procesarPago(monto);
    }
}
