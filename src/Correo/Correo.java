/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author AlumMati
 */
public class Correo {
    
    BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
    
    private String origen;
    private String destino;
    private String asunto;
    private String mensaje;
    
    public Correo(){};
    
    public Correo(String o, String d,String a, String m){
        
        origen = o;
        destino = d;
        asunto = a;
        mensaje = m;
                
    };
    
    public String el_Origen(){
        String or="";
        return or;
    }

    @Override
    public String toString(){
    
    return ("\n Origen: " +origen+
            "\n Destino:" +destino+
            "\n Asunto:" +asunto+
            "\n Mensaje:" +mensaje);
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the asunto
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * @param asunto the asunto to set
     */
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
    
    
}
