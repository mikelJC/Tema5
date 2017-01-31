/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 *
 * @author AlumMati
 */
public class RedPantanos {
    
    public static void main (String[] argm){
        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
   
        
        
        
        Pantano aPantanos[] = new Pantano[10];
        
        aPantanos[0] = new Pantano("nombre1", 100, 60);
        aPantanos[1] = new Pantano("nombre2", 200, 150);
        aPantanos[2] = new Pantano("nombre3", 300, 250);
        aPantanos[3] = new Pantano("nombre4", 400, 390);
        aPantanos[4] = new Pantano("nombre5", 500, 500);
        aPantanos[5] = new Pantano("nombre6", 600, 50);
        aPantanos[6] = new Pantano("nombre7", 700, 10);
        aPantanos[7] = new Pantano("nombre8", 800, 0);
        aPantanos[8] = new Pantano("nombre9", 900, 450);
        aPantanos[9] = new Pantano("nombre10", 1000, 800);
        
        
        
    }
    
    
    
}
