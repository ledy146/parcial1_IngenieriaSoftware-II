/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Accion;
import Modelo.ObservadorNotificacion;
import Modelo.Portafolio;
import java.util.ArrayList;
import java.util.List;

public class NotificadorCambios {

    private Portafolio portafolio;
    private List<ObservadorNotificacion> observadores;

    // Constructor
    public NotificadorCambios(Portafolio portafolio) {
        this.portafolio = portafolio;
        this.observadores = new ArrayList<>();
    }

    // Método para agregar observadores
    public void agregarObservador(ObservadorNotificacion observador) {
        observadores.add(observador);
    }

    // Método para eliminar observadores
    public void eliminarObservador(ObservadorNotificacion observador) {
        observadores.remove(observador);
    }

    // Método para notificar cambios a los interesados
    public void notificarCambio() {
        List<Accion> acciones = portafolio.obtenerAcciones();

        for (Accion accion : acciones) {
            double precioActual = accion.getPrecioActual();
            double umbralInferior = accion.getUmbralInferior();
            double umbralSuperior = accion.getUmbralSuperior();

            if (precioActual < umbralInferior || precioActual > umbralSuperior) {
                // Notificar a los observadores
                for (ObservadorNotificacion observador : observadores) {
                    observador.actualizar("Cambio reciente en la accion: " + accion.getNombre()
                            + ". Precio actual: " + precioActual);
                }
            }
        }
    }
}
