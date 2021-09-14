/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author morozco
 */
public class EjemploInterface {

    static List<Persona> listaPersona = new ArrayList();
   
    public static void main(String[] args) {
              
        
        Persona persona1 = new Persona();
        persona1.setNombre("Carlos");
        persona1.setApellido("Sazo");
        persona1.setDireccion("Escuintla");
                     
        Persona persona2 = new Persona();
        persona2.setNombre("Mario");
        persona2.setApellido("Sazo");
        persona2.setDireccion("Guatemala");
        
        Persona persona3 = new Persona();
        persona3.setNombre("Mario");
        persona3.setApellido("Castillo");
        persona3.setDireccion("Guatemala");
        
        for(int i = 0; i<= 2; i++){
            if(i == 0){agregarPersona(persona1);}
            if(i == 1){agregarPersona(persona2);}
            if(i == 2){agregarPersona(persona3);}
        }
       
        Iterator<Persona> iterador = listaPersona.iterator();
        while(iterador.hasNext()){
            iterador.next().mostrarDatos();  
        } 
             
        
    }
    
    static public void agregarPersona(Persona persona){
        if(existeRegistro(persona)) {
            System.out.println("El registro ya existe.");
        } else {
            listaPersona.add(persona);
        }
    }
    
    static public boolean existeRegistro(Persona persona){
        Iterator<Persona> iterador = listaPersona.iterator();
        while(iterador.hasNext()){
            if(persona.getNombre() == iterador.next().getNombre()){
                return true;
            }
        } 
        return false;
    }
    
}
