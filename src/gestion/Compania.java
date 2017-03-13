/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 *
 * @author AlumMati
 */
public class Compania {

    public Compania() {
    }

    Empleado aCompania[] = new Empleado[100];

    public void añadirEmpleado(Empleado e) {

        int i = 0;

        for (i = 0; i < aCompania.length - 1 && aCompania[i] != null; i++) {
        }

        if (i < aCompania.length) {
            aCompania[i] = e;
        } else {
            System.out.println("No se puede incorporar al estar lleno");
        }
    }

    public void eliminarEmpleado(String dni) {
        int i = 0;

        if (aCompania[0] == null) {
            System.out.println("No existen empleados");
        } else {

            for (i = 0; i < aCompania.length && aCompania[i].getDni().equalsIgnoreCase(dni) == false; i++) {
            }

            if (i < aCompania.length) {
                Empleado borrado = new Empleado();

                borrado = aCompania[i];

                aCompania[i] = null;
                System.out.println("Ha sido borrado \n" + borrado.toString());
            } else {
                System.out.println("No encontrado");
            }

            do {
                aCompania[i] = aCompania[i + 1];
                i++;
            } while (aCompania[i] != null && i != aCompania.length);
        }

    }

    public void incrementarsueldo() {

        if (aCompania[0] == null) {
            System.out.println("No existen empleados");
        } else {

            for (int i = 0; i < aCompania.length; i++) {
                if ((Calendar.YEAR - aCompania[i].getFingreso()) >= 10) {
                    aumentarsueldo(10, i);
                }
            }
        }
    }

    public void aumentarsueldo(int porcentaje, int i) {

        float aumento;
        
        if (aCompania[0] == null) {
            System.out.println("No existen empleados");
        } else {
            aumento = aCompania[i].getSueldob() * porcentaje / 100;
            aCompania[i].setSueldob(aumento + aCompania[i].getSueldob());
        }
    }

    public void mostrarempleados() {
        
        System.out.println(aCompania[0]);

        if (aCompania[0] == null) {
            System.out.println("No existen empleados");
        } else {
            for (int i = 0; i < aCompania.length && aCompania != null; i++) {
                aCompania[i].toString();
            }
        }
    }

    public void ordenarempleados() {
        int termi = 1;
        Empleado intercambio = new Empleado();

        if (aCompania[0] == null) {
            System.out.println("No existen empleados a ordenar");
        } else {

            for (int i = 0; i < aCompania.length && termi == 1 && aCompania[i] != null; i++) {
                termi = 0;
                for (int j = (i + 1); j < aCompania.length && aCompania[j] != null; j++) {
                    if (aCompania[i].getFingreso() > aCompania[j].getFingreso()) {
                        intercambio = aCompania[i];
                        aCompania[i] = aCompania[j];
                        aCompania[j] = intercambio;
                        termi = 1;
                    }
                }
            }
        }
    }

    public int buscarempleado(String dni) {
        int posi = 101;

        for (int i = 0; i < aCompania.length; i++) {
            if (aCompania[i].getDni() == dni) {
                posi = i;
            }
        }
        return posi;

    }

    public void guardararchivo() {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        try {
            File f = new File("archivo.txt");
            FileWriter flS = new FileWriter(f,true);
            BufferedWriter fS = new BufferedWriter(flS);

            for (int i = 0; i < aCompania.length && aCompania[i] != null; i++) {
                fS.write(aCompania[i].toString2());
                fS.newLine();
            }

            fS.close();
        } catch (IOException e) {
            System.out.println("Error en el fichero");
        }
    }

    

}
