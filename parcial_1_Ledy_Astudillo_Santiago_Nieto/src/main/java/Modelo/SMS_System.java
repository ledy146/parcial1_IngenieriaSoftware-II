/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author debian
 */
public class SMS_System implements ObservadorNotificacion {
    private String numeroDestino;

    // Constructor
    public SMS_System(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    // Método para enviar mensajes SMS
    public void sendMessage(String mensaje) {
        // Lógica para enviar un mensaje SMS al número destino
        System.out.println("Enviando SMS al número " + numeroDestino + ": " + mensaje);
    }

    @Override
    public void actualizar(String mensaje) {
        sendMessage(mensaje);
    }
}
