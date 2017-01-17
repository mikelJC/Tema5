/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;






/**
 *
 * @author AlumMati
 */
public class PruebaVehiculo {
    
    public static void main (String[] argm) throws IOException{
        BufferedReader tec = new BufferedReader (new InputStreamReader(System.in));
        
        String Smodelo, texto;
        boolean sigue=true;
        Vehiculo aCoche[] = new Vehiculo[10];
        int conta = 0;    
       
        while(sigue=true){
            Vehiculo coche = new Vehiculo();
            System.out.println("Introduce modelo");
            Smodelo = tec.readLine();
            
            if(Smodelo.equalsIgnoreCase("fin")){
                System.out.println("Hemos concluido");
                sigue=false;
                coche.visualizar(aCoche, conta);
            }else{
                coche = new Vehiculo(Smodelo);
                System.out.println("Introducir potencia");
                texto = tec.readLine();
                coche.setPotencia(Double.parseDouble(texto));
                System.out.println("¿Traccion a las 4 ruedas? (si=True y no=False)");
                texto = tec.readLine();
                coche.setTraccion(Boolean.parseBoolean(texto));
                aCoche[conta]= coche;
                conta = conta+1;
            }
        }   
        
        
        
        
        
    }
    
}
