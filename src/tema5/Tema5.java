/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Tema5 {

    public static void main(String argm[]){
        Scanner tec = new Scanner(System.in);
        
        String nom;
        int ed;
        
        Alumnoo al1 = new Alumnoo();
        
        System.out.println("Introduce tu nombre y edad");
        nom = tec.nextLine();
        ed = tec.nextInt();
        
        Alumnoo al2 = new Alumnoo(nom, ed);
        Alumnoo al3 = new Alumnoo("Luis", 25);
        
        al1.setNombre("Pepe");
        al1.setEdad(18);
        
        System.out.println(al1.toString());
        System.out.println(al2.toString());
        System.out.println(al3.getNombre()+" "+al3.getEdad());
    }

}



class Alumnoo{
    
    private String nombre;
    private int edad;
    Alumnoo(){};
    
    Alumnoo(String nombre, int edad){
    this.nombre=nombre;
    this.edad=edad;
    
    }
    
        
    @Override
    public String toString(){
        return nombre+" "+edad;
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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}