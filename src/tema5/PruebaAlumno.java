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
public class PruebaAlumno {
   
  
    public static void main(String argm[]){
        
        Scanner tec = new Scanner(System.in);
        

        Alumno alumno1 = new Alumno();
        
        
        alumno1.setNombre("Juan");
        alumno1.setApellidos("Garcia Fernandez");
        alumno1.setAñoDeNacimiento(1980);
        alumno1.setNumeroPersonal(123456789);
        alumno1.setGrupo("7031-91");
        alumno1.setHorario('M');
        alumno1.setNotaSelect(5.5f);

        Alumno alumno2 = new Alumno("Ana", "Martinez Sanz", 1983, 123456789, "4097-87", 'H',8.9f );
        
        Alumno alumno3 = new Alumno();
        
        

        
        System.out.println("Introducir nombre");
        alumno3.setNombre(tec.nextLine());
        
        System.out.println("Introducir Apellidos");
        alumno3.setApellidos(tec.nextLine());
        
        System.out.println("Introducir Grupo");
        alumno3.setGrupo(tec.nextLine());
        
        System.out.println("Introducir Horario");
        alumno3.setHorario(tec.nextLine().charAt(0));
        
        System.out.println("Introducir Fecha Nacimiento");
        alumno3.setAñoDeNacimiento(tec.nextInt());
        
        System.out.println("Introducir Numero personal");
        alumno3.setNumeroPersonal(tec.nextInt());
        
        System.out.println("Introducir Nota de Selectividad");
        alumno3.setNotaSelect(tec.nextFloat());
             
        
        Alumno alum[] = new Alumno[3];
        
        alum[0] = alumno1;
        alum[1] = alumno2;
        alum[2] = alumno3;
        
        
        
        for(int i=0; i<alum.length; i++){
            alum[i].imprimirAlumno();  
        }
        
        
        float sumanota=0;

        for(int i=0; i<alum.length; i++){
            alum[i].getNotaSelect();
            sumanota= sumanota+(alum[i].getNotaSelect());
        }
            System.out.println("La nota media es: "+ (sumanota/alum.length));
        
    
    }

}