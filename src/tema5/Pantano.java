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
public class Pantano {
    
    private String nombre;
    private int capacidad;
    private int almacenada;

    
    Pantano(){}
    
    Pantano(String nombre, int capacidad, int almacenada){}
    
    
    void visualizarPantanos(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Capacidad: " + capacidad);
            System.out.println("Cantitad almacenada: " + almacenada);
            System.out.println("Porcentaje de ocupación: " + porcentaje());
    }
    
    
    int porcentaje(){
        int resultado;
        resultado = (almacenada*100)/capacidad;
        return resultado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the almacenada
     */
    public int getAlmacenada() {
        return almacenada;
    }

    /**
     * @param almacenada the almacenada to set
     */
    public void setAlmacenada(int almacenada) {
        this.almacenada = almacenada;
    }
    
    
    
    
}
