/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author debian
 */
public class Accion {
    private String nombre;
    private double precioActual;
    private double precioAnterior;
    private double umbralInferior;
    private double umbralSuperior;

    
    // Constructor
    public Accion(String nombre, double precioActual, double precioAnterior, double umbralInferior, double umbralSuperior) {
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.precioAnterior = precioAnterior;
        this.umbralInferior = umbralInferior;
        this.umbralSuperior = umbralSuperior;
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

    public double getPrecioAnterior() {
        return precioAnterior;
    }

    public void setPrecioAnterior(double precioAnterior) {
        this.precioAnterior = precioAnterior;
    }

    public double getUmbralInferior() {
        return umbralInferior;
    }

    public void setUmbralInferior(double umbralInferior) {
        this.umbralInferior = umbralInferior;
    }

    public double getUmbralSuperior() {
        return umbralSuperior;
    }

    public void setUmbralSuperior(double umbralSuperior) {
        this.umbralSuperior = umbralSuperior;
    }
    
}
