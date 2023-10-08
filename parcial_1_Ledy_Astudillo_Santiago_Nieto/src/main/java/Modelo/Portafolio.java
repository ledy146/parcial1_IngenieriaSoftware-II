/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author debian
 */
import java.util.ArrayList;
import java.util.List;

public class Portafolio {

    private List<Accion> acciones;

    // Constructor
    public Portafolio() {
        this.acciones = new ArrayList<>();
    }

    // Método para agregar acciones al portafolio
    public void agregarAccion(Accion accion) {
        acciones.add(accion);
    }

    // Método para eliminar una acción del portafolio
    public void eliminarAccion(Accion accion) {
        acciones.remove(accion);
    }

    // Método para obtener la lista de acciones en el portafolio
    public List<Accion> obtenerAcciones() {
        return acciones;
    }

    // Método para listar las acciones con su información
    public void listarAcciones() {
        List<Accion> acciones = obtenerAcciones();

        System.out.println("Lista de acciones:");

        for (Accion accion : acciones) {
            System.out.println("Nombre: " + accion.getNombre());
            System.out.println("Precio Actual: " + accion.getPrecioActual());
            System.out.println("Precio Anterior: " + accion.getPrecioAnterior());
            System.out.println("Umbral Inferior: " + accion.getUmbralInferior());
            System.out.println("Umbral Superior: " + accion.getUmbralSuperior());
            System.out.println("------------------------------------");
        }
    }
}
