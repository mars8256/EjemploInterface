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
public class Email implements IMensaje {
    public String asunto;
    public String copia;
    public String direccion;
    public String mensaje;

    public Email(String asunto, String copia, String mensaje) {
        this.asunto = asunto;
        this.copia = copia;
        this.mensaje = mensaje;
    }

        
    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCopia() {
        return copia;
    }

    public void setCopia(String copia) {
        this.copia = copia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void mensaje() {
        System.out.println("Mensaje enviado desde Email:" + this.mensaje);
    }
    
    
}
