/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import com.company.procesoPagos.ImetodoPago;
import com.company.procesoPagos.pagoPayPal;
import com.company.procesoPagos.pagoTarjetaCredito;
import com.company.procesoPagos.pagoTransferenciaBancaria;
import com.company.procesoPagos.procesadorPago;

/**
 *
 * @author ledya
 */
public class main {

    public static void main(String[] args) {
        // Crear instancias de métodos de pago específicos
        ImetodoPago metodoTarjeta = new pagoTarjetaCredito("123", "contraseña123");
        ImetodoPago metodoPayPal = new pagoPayPal("usuario1", "contraseña1");
        ImetodoPago metodoTransferencia = new pagoTransferenciaBancaria(123, "pablo", "gomez");

        // Crear una instancia del procesador de pagos
        procesadorPago procesador = new procesadorPago();

        // Realizar pagos con diferentes métodos
        double montoPago = 100.0;

        procesador.realizarPago(montoPago, metodoTarjeta);
        procesador.realizarPago(montoPago, metodoPayPal);
        procesador.realizarPago(montoPago, metodoTransferencia);
    }
}
