/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author AlumMati
 */
public class Vehiculo {
    
           String modelo;
           private double potencia;
           private boolean traccion;
    
           
    Vehiculo(){};
    
    Vehiculo(String modelo){
        this.modelo = modelo;
        this.potencia = potencia;
        this.traccion = traccion;
    };

    
    void visualizar(Vehiculo array[],int conta){
        
        for(int i=0; i<array.length; i++){
            System.out.println("\n Modelo" + array[i].modelo);
            System.out.println("Potencia" + array[i].potencia);
                if(traccion==true){
                    System.out.println("Tracción: Total");
                }else{
                    System.out.println("Tracción: 2 Ruedas");
                    }
        }
   
    }
    
    
    
    
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the potencia
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the traccion
     */
    public boolean isTraccion() {
        return traccion;
    }

    /**
     * @param traccion the traccion to set
     */
    public void setTraccion(boolean traccion) {
        this.traccion = traccion;
    }
}
