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
public class PruebaDVDCine {
    
    public static void main (String[] argm) throws IOException{
    BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
    

        DVDCine pelicula= new DVDCine();
        
        
        System.out.println("Introduce el Título");
        pelicula.setTitulo(tec.readLine());
        
        System.out.println("Introduce el director");
        pelicula.setDirector(tec.readLine());
        
        System.out.println("Introduce los actores");
        pelicula.setActores(tec.readLine());
        
        System.out.println("Introduce el genero");
        pelicula.setGenero(tec.readLine());
        
        System.out.println("Introduce la duracion");
        pelicula.setDuracion(Integer.parseInt(tec.readLine()));
        
        System.out.println("Introduce el resumen");
        pelicula.setResumen(tec.readLine());
     
        pelicula.muestraDVDCine();
        
        System.out.println("¿La pelicula es del género Triller?");
        if(pelicula.esTriller()==true){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
 
        System.out.println("¿La pelicula tiene resumen?");
        if (pelicula.tieneResumen()== true){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
        
        
    }
    
}
