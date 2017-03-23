/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AlumMati
 */
public class Principal {
     Compania comp = new Compania();
     Empleado empmuestra =new Empleado();
    
    public static void main(String[] argm){
    
    new Principal();
        
    }
    
    
    public Principal(){
        leerarchivo();
        menuprincipal();
    }
    
    
    public void menuprincipal(){
        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
      
        //Empleado emp1 = new Empleado("Pepe","0123456789A",'C',1980,1583.24f);
        //Empleado emp2 = new Empleado("Juan","0123456789B",'S',1960,2000);
        //Empleado emp3 = new Empleado("Antonio","0123456789C",'C',1990,1023.84f);
        
        
        
        
                int respuesta;
                int r;
                Empleado emp = new Empleado();

                
       
       
       
        try {
        do {
            System.out.println("\n******MENU PRINCIPAL****** \n"
                    + "      " + "1. Añadir empleado\n"
                    + "      " + "2. Eliminar empleado\n"
                    + "      " + "3. Subir sueldo empleado\n"
                    + "      " + "4. Subir sueldo a mas de 10 años\n"
                    + "      " + "5. Imprimir empleados\n"
                    + "      " + "6. Ordenar por antiguedad\n"
                    + "      " + "0. Salir\n"
                    + "Elige una opción:");
            
            respuesta = Integer.parseInt(tec.readLine());

            switch (respuesta) {
                case 1:
                    String n;
                    String d;
                    char e;
                    int fi;
                    float sb;
                    int res3;
                    int porcentaje;
                    
                    System.out.println("Introduce el Nombre del Empleado");
                        n=tec.toString();
                    System.out.println("Introduce el Dni del Empleado");
                        d=tec.toString();
                    System.out.println("Introduce el Estado del Empleado( (S)oltero o (C)asado )");
                        e= tec.readLine().charAt(0);
                    System.out.println("Introduce el Fecha Ingreso del Empleado");
                        fi= Integer.parseInt(tec.readLine());
                    System.out.println("Introduce el Salario Bruto del Empleado");
                        sb= Float.parseFloat(tec.readLine());
                    
                    Empleado emple = new Empleado(n,d,e,fi,sb);
                    comp.añadirEmpleado(emp);
                        
                    break;

                case 2:
                    
                    
                    System.out.println("Introduce Dni de la persona a borrar");
                    d=tec.toString();
                    comp.eliminarEmpleado(d);
                    
                    break;
                case 3:
  
                    
                    System.out.println("Introduce el Dni del empleado a subir el sueldo");
                    d=tec.toString();
                    System.out.println("Introduce el Porcentaje a subir");
                    porcentaje=tec.read();
                    
                    res3 = comp.buscarempleado(d);
                    
                    if(res3==101){
                        System.out.println("El empleado no existe");
                    }else{
                        comp.aumentarsueldo(porcentaje, res3);
                        System.out.println("Sueldo aumentado correctamente a: "+ d);
                    }  
                    break;
                case 4:
                    
                    comp.incrementarsueldo();

                    break;
                case 5:
                    
                 
                comp.mostrarempleados();
                    

                    break;    
                    
                case 6:
                    
                    comp.ordenarempleados();

                    break;    
                
                
                
                
            }
        } while (respuesta != 0);
        
        comp.guardararchivo();
        
        
        }catch (IOException ex){System.err.println("error de entrada"+ex.getMessage());}
    }
    
        
    public void leerarchivo() {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        String texto = "";
        int posi;
        int posiant;
        int cont=0;
        
        
        try {
            FileReader flE = new FileReader("archivo.txt");
            BufferedReader fE = new BufferedReader(flE);
            
            ;
            
            
            
            texto = fE.readLine();
            

               while (texto != null) {
                   
                   
                    posi = texto.indexOf(",");
                    empmuestra.setNombre(texto.substring(0, posi));
                    posiant=posi+1;

                     
                    
                    posi = texto.indexOf(",", posiant);
                    empmuestra.setDni(texto.substring(posiant, posi)); 
                    posiant=posi+1; 
                    
                    
                    
                    posi = texto.indexOf(",", posiant);
                    empmuestra.setEstado(texto.charAt(posiant));
                    posiant = posi+1;
  
                    

                    
                    posi = texto.indexOf(",", posiant);
                    empmuestra.setFingreso(Integer.parseInt(texto.substring(posiant, posi)));
                    

                    posiant= posi+1;
                    empmuestra.setSueldob(Float.parseFloat(texto.substring(posiant)));
                    

                    comp.añadirEmpleado(empmuestra);
                    

                    texto = fE.readLine();
              }
               
                
                fE.close();
                
                
        } catch (IOException e) {
            System.out.println("Error en el fichero");
        }

    }
    
    
    
    
    
        
        
        }
   

    
