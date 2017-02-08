/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correo;

/**
 *
 * @author AlumMati
 */
public class CarpetaCorreo {

    public CarpetaCorreo() {
    }
    ;

        Correo aCorreo[] = new Correo[40];
        


    public void mostrarC() {
        String cadena;

        for (int i = 0; i < aCorreo.length && aCorreo[i] != null; i++) {
            cadena = aCorreo[i].toString();
            System.out.println(cadena);
        }
    }

    public void añadirC(Correo c) {
        int i = 0;
        while (aCorreo[i] != null) {
            i++;
        }
        aCorreo[i] = c;
    }

    public Correo borrarC(int a) {

        Correo correoborrado = new Correo();
        correoborrado = aCorreo[a];

        //compactar
        aCorreo[a] = null;
        int i = a;
        do {
            aCorreo[i] = aCorreo[i + 1];
            i++;
        } while (aCorreo[i] != null && i != aCorreo.length);

        if (aCorreo[i] != null) {
            aCorreo[i] = null;
        }

        return correoborrado;
    }

    public void ordenarC() {
        int termi=1;
        Correo intercambio = new Correo();
        
        for(int i=0; i<aCorreo.length&&termi==1&&aCorreo[i]!=null; i++){
            termi=0;
            for(int j=0; j<aCorreo.length&&aCorreo[j]!=null; j++){
                if(aCorreo[i].getOrigen().compareToIgnoreCase(aCorreo[j].getOrigen())<0){
                   intercambio = aCorreo[i];
                   aCorreo[i]=aCorreo[j];
                   aCorreo[j]=intercambio;
                   termi=1;
                }
            }
        }
   
    }
    
   

    public Correo busca(String orig) {

        int i = 0;
        boolean resultado = false;

        for (i = 0; i < aCorreo.length && resultado == false; i++) {
            if (aCorreo[i].getOrigen().compareToIgnoreCase(orig) == 0) {

                resultado = true;

            }
        }

        if (resultado) {
            return aCorreo[i - 1];
        } else {
            return null;
        }

    }
}
