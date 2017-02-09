/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.util.Calendar;

/**
 *
 * @author AlumMati
 */
public class Compania {
    
    
    public Compania() {}
    
    Empleado aCompania[] = new Empleado[100];
    

    
    public void añadirEmpleado(Empleado e){
        
        int i=0;
        
        for(i=0; i<aCompania.length && aCompania[i]!=null;i++){}

        if(i<aCompania.length){
            aCompania[i]=e;}
        else{
            System.out.println("No se puede incorporar al estar lleno");
        } 
    }
    
    public void eliminarEmpleado(String dni){
            int i=0;
        
        for(i=0; i<aCompania.length && aCompania[i].getDni().equalsIgnoreCase(dni)==false;i++){}
        
        if(i<aCompania.length){
            Empleado borrado = new Empleado();
            
            borrado = aCompania[i];
            
            aCompania[i]=null;
            System.out.println("Ha sido borrado \n" + borrado.toString());
        }else{
            System.out.println("No encontrado");
        }

        do {
            aCompania[i] = aCompania[i + 1];
            i++;
        } while (aCompania[i] != null && i != aCompania.length);
    
        
    }
    
    
    public void incrementarsueldo(){
        
        for(int i=0;i<aCompania.length;i++){
            if((Calendar.YEAR - aCompania[i].getFingreso()) >=10){
                aCompania[i].aumentarsueldo(10);
            }
        }  
    }
    
    public void mostrarempleados(){
        for(int i=0;i<aCompania.length;i++){
            aCompania[i].toString();
        }
    }
    
    public void ordenarempleados(){
        int termi=1;
        Empleado intercambio =new Empleado();
        
        for(int i=0;i<aCompania.length &&termi==1 && aCompania[i]!=null;i++){
            termi=0;
            for(int j=0;j<aCompania.length && aCompania[j]!=null;j++){
                if(aCompania[i].getFingreso()>aCompania[j].getFingreso()){
                    intercambio=aCompania[i];
                    aCompania[i]=aCompania[j];
                    aCompania[j]=intercambio;
                    termi=1;
                }
            }
        }
    
    }
    
    
  
}
