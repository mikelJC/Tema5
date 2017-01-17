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
public class PruebaAlumno1 {
     public static void main(String argm[]){
         
        Alumno alumno1; //valen null por defecto
        Alumno alumno2;
        Alumno alumno3;
        Alumno alumno4;
        Alumno alumno5;
        Alumno delegado;
        
        alumno1 = new Alumno();
        delegado = alumno1;
        alumno1.setNombre("Juan");
        alumno1.setApellidos("Lopez Sanz");
        alumno1.setAñoDeNacimiento(1983);
        alumno1.setNumeroPersonal(4258962);
        alumno1.setGrupo("465-43");
        alumno1.setHorario('M');
        alumno1.setNotaSelect(6.8f);
        
        alumno4 = new Alumno();
        alumno4.setNombre("Clara");
        alumno4.setApellidos("Garcia Fernandez");
        alumno4.setAñoDeNacimiento(1980);
        alumno4.setNumeroPersonal(123456789);
        alumno4.setGrupo("7031-91");
        alumno4.setHorario('M');
        alumno4.setNotaSelect(5.5f);
        
        alumno5 = new Alumno();
        alumno5.setNombre("Juan");
        alumno5.setApellidos("Sanchez Matin");
        alumno5.setAñoDeNacimiento(1987);
        alumno5.setNumeroPersonal(4258962);
        alumno5.setGrupo("7789-47");
        alumno5.setHorario('T');
        alumno5.setNotaSelect(8.8f);
         
         System.out.println(alumno1 == delegado);
         System.out.println(alumno1 == alumno5);
         System.out.println(alumno5 != alumno4);

         System.out.println("\n"+ alumno1.equals(delegado));
         System.out.println(alumno1.equals(alumno5));
         System.out.println(!alumno5.equals(alumno4));
        
     }
}
