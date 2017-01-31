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

    public CarpetaCorreo(){};

        Correo aCorreo[] = new Correo[40];

        public void mostrarC(){
            String cadena;
            
            for(int i=0; i<aCorreo.length && aCorreo[i]!=null; i++){
                cadena=aCorreo[i].toString();
                System.out.println(cadena);
            }
        }
        
        public void añadirC(Correo c){
            int i=0;
            while(aCorreo[i]!=null){
                i++;
            }
            aCorreo[i]=c;
        }

        public Correo borrarC(int a){

            Correo correoborrado = new Correo();
            correoborrado = aCorreo[a];
            
            //compactar
            aCorreo[a]=null;
            int i = a;
            do{
                aCorreo[i] = aCorreo[i+1];
                i++;
            }while(aCorreo[i]!=null && i!=aCorreo.length);
            
            if(aCorreo[i]!=null){aCorreo[i]=null;}
            
            return correoborrado;
        }
        
        public void ordenarC(){}
        
        public Correo busca(String orig){
            int i=0;
            Correo compara;
            
            do{ 
                compara = aCorreo[i];
                i++;
            }while(compara.getOrigen()!= orig && i!=aCorreo.length);
            
            if(compara.getOrigen()==orig){
                return compara;
            }else{
                return null;
            }
        }
}
