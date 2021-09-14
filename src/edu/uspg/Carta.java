/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg;

/**
 *
 * @author morozco
 */
public class Carta implements IMensaje{
    public String remitente;
    public String destinatario;
    public String fecha;
    public String mensaje;

    public Carta(String remitente, String destinatario, String fecha, String mensaje) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.fecha = fecha;
        this.mensaje = mensaje;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void mensaje() {
        System.out.println("Mensaje enviado desde Carta: " + this.mensaje);
    }
    
    
    
}
