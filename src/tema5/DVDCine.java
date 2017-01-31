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
public class DVDCine {
    
    private String titulo;
    private String actores;
    private String director;
    private String genero;
    private int duracion;
    private String resumen;
    
    
    //constructor//
    DVDCine(){};
    
    //constructor con variables//
    DVDCine(String titulo, String actores, String director, String genero, int duracion, String resumen){};
   
    
    //metodos//
    void muestraDVDCine(){
        System.out.println("\n" + titulo);
        System.out.println("De " + director);
        System.out.println("Con " + actores);
        System.out.println(genero + " - " + muestraDuracion());
        System.out.println("Resumen: " + resumen);
    }

    String muestraDuracion(){
        String cadena;
        
        cadena = getDuracion() + " min.";
        return cadena;
    }
    
    boolean esTriller(){
        boolean a;
        
        if ("triller".equals(genero)){
            a=true;
        }else{
            a=false;
        }
        return a;
    }
    
    
    boolean tieneResumen(){
        boolean a;
        
        if(!resumen.isEmpty()){
            a = true;
        }else{
            a =false;
        }
        
        return a;
    }
    
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the actores
     */
    public String getActores() {
        return actores;
    }

    /**
     * @param actores the actores to set
     */
    public void setActores(String actores) {
        this.actores = actores;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the resumen
     */
    public String getResumen() {
        return resumen;
    }

    /**
     * @param resumen the resumen to set
     */
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    
    
    
}
