/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

/**
 *
 * @author AlumMati
 */
public class Empleado {
    
    private String nombre;
    private String dni;
    private char estado;
    private int fingreso;
    private float sueldob;
    

    public Empleado(){};
    
    public Empleado(String n,String d,char e,int fi,float sb){
        nombre = n;
        dni = d;
        estado = e;
        fingreso = fi;
        sueldob = sb;
    }

    public int tiempoempresa(int año){
        int resultado;

        resultado = año - getFingreso();

        if(resultado<=0){return 0;}else{return resultado;}  
    }
    

    
    @Override
    public String toString(){
          return ("\n Nombre: " +nombre+
                    "\n Dni:" +dni+
                    "\n Estado:" +estado+
                    "\n Fecha Ingreso:" +fingreso+
                    "\n Sueldo Bruto:" + sueldob);
    }
    
    
    public String toString2(){
          return (nombre+ "," +dni+"," +estado+ "," +fingreso+ "," + sueldob);
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
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the estado
     */
    public char getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(char estado) {
        this.estado = estado;
    }

    /**
     * @return the fingreso
     */
    public int getFingreso() {
        return fingreso;
    }

    /**
     * @param fingreso the fingreso to set
     */
    public void setFingreso(int fingreso) {
        this.fingreso = fingreso;
    }

    /**
     * @return the sueldob
     */
    public float getSueldob() {
        return sueldob;
    }

    /**
     * @param sueldob the sueldob to set
     */
    public void setSueldob(float sueldob) {
        this.sueldob = sueldob;
    }

    
    
    
    
}
