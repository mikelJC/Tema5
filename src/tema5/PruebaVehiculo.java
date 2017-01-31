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
        Vehiculo coche=null;
       
        System.out.println("Introduce modelo");
        Smodelo = tec.readLine();
        
        while(Smodelo.compareToIgnoreCase("fin")!=0){
            
                coche = new Vehiculo(Smodelo);
                System.out.println("Introducir potencia");
                texto = tec.readLine();
                coche.setPotencia(Double.parseDouble(texto));
                System.out.println("¿Traccion a las 4 ruedas?"); 
                texto = tec.readLine();
                if(texto.equals("si")){
                    coche.setTraccion(true);
                }else{
                    coche.setTraccion(false);
                }
                aCoche[conta]= coche;
                conta = conta+1;
                System.out.println("Introduce modelo");
                Smodelo = tec.readLine();
            }
                System.out.println("Hemos concluido");
                sigue=false;
                
                for(int i=0; i<aCoche.length && aCoche[i]!=null;i++){
                    coche = aCoche[i];
                    coche.visualizar();
                }
        }
        
        
        
        
        
    }
    

