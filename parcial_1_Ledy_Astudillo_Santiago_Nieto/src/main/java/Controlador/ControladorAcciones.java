/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Accion;
import Modelo.Portafolio;
import java.util.List;

public class ControladorAcciones {

    private Portafolio portafolio;

    // Constructor
    public ControladorAcciones(Portafolio portafolio) {
        this.portafolio = portafolio;
    }

    // Método para agregar una nueva acción al portafolio
    public void agregarAccion(Accion accion) {
        portafolio.agregarAccion(accion);
    }

    // Método para eliminar una acción existente del portafolio
    public void eliminarAccion(Accion accion) {
        portafolio.eliminarAccion(accion);
    }

    // Método para establecer los umbrales de precio para las notificaciones
    public void establecerUmbrales(Accion accion, double umbralInferior, double umbralSuperior) {
        accion.setUmbralInferior(umbralInferior);
        accion.setUmbralSuperior(umbralSuperior);
    }
 
}
