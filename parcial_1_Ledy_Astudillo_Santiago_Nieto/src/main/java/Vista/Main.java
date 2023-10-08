/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Controlador.ControladorAcciones;
import Controlador.NotificadorCambios;
import Modelo.Accion;
import Modelo.SMS_System;
import Modelo.ObservadorNotificacion;
import Modelo.Portafolio;
import javax.swing.SwingUtilities;

/**
 *
 * @author debian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Crear un portafolio
        Portafolio miPortafolio = new Portafolio();

        // Crear un controlador de acciones y asociarlo al portafolio
        ControladorAcciones controladorAcciones = new ControladorAcciones(miPortafolio);

        // Crear algunas acciones y agregarlas al portafolio
        Accion accion1 = new Accion("Café Juan el Pez", 100000.0, 280.0, 50000.0, 200000.0);
        Accion accion2 = new Accion("EmpresaB", 50.0, 48.0, 45.0, 60.0);

        controladorAcciones.agregarAccion(accion1);
        controladorAcciones.agregarAccion(accion2);

        // Crear un notificador de cambios y asociarlo al portafolio
        NotificadorCambios notificadorCambios = new NotificadorCambios(miPortafolio);

        // Crear un observador de notificaciones (SMS) y registrarlo en el notificador
        ObservadorNotificacion notificadorSMS = new SMS_System("+57 3188341764");
        notificadorCambios.agregarObservador(notificadorSMS);

        // Simular cambios en los precios de las acciones
        accion1.setPrecioActual(400000.0);
        accion2.setPrecioActual(1000.0);

        // Notificar cambios
        miPortafolio.listarAcciones();
        notificadorCambios.notificarCambio();
    }

}
