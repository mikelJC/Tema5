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
public class Alumno {
    
    private String nombre;
    private String apellidos;
    private int añoDeNacimiento;
    private int numeroPersonal;
    private String grupo;
    private char horario; //'M': mañana, 'T': Tarde
    private float notaSelect;

    Alumno(){};
    
    Alumno(String nombre, String apellidos, int añoDeNacimiento, int numeroPersonal, String grupo, char horario, float notaSelect){
        this.nombre  = nombre;
        this.apellidos = apellidos;
        this.añoDeNacimiento = añoDeNacimiento;
        this.numeroPersonal = numeroPersonal;
        this.grupo = grupo;
        this.horario = horario;
        this.notaSelect = notaSelect;
    }
    

    
    
    void imprimirAlumno(){
        System.out.println("            Datos del alumno:");
        System.out.println("==========================================");
        System.out.println("Nombre:             "+getNombre());
        System.out.println("Apellidos:          "+getApellidos());
        System.out.println("Año de Nacimiento:  "+getAñoDeNacimiento());
        System.out.println("Número Personal:    "+getNumeroPersonal());
        System.out.println("Grupo:              "+getGrupo());
        System.out.println("Horario             "+getHorario());
        System.out.println("Nota                "+getNotaSelect());
        
    }
    
    public boolean equals (Alumno alumno){
        boolean T;
        T = this.numeroPersonal == alumno.numeroPersonal;
        return T;
    }
   
    
    
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the añoDeNacimiento
     */
    public int getAñoDeNacimiento() {
        return añoDeNacimiento;
    }

    /**
     * @param añoDeNacimiento the añoDeNacimiento to set
     */
    public void setAñoDeNacimiento(int añoDeNacimiento) {
        this.añoDeNacimiento = añoDeNacimiento;
    }

    /**
     * @return the numeroPersonal
     */
    public int getNumeroPersonal() {
        return numeroPersonal;
    }

    /**
     * @param numeroPersonal the numeroPersonal to set
     */
    public void setNumeroPersonal(int numeroPersonal) {
        this.numeroPersonal = numeroPersonal;
    }

    /**
     * @return the grupo
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the horario
     */
    public char getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(char horario) {
        this.horario = horario;
    }

    /**
     * @return the notaSelect
     */
    public float getNotaSelect() {
        return notaSelect;
    }

    /**
     * @param notaSelect the notaSelect to set
     */
    public void setNotaSelect(float notaSelect) {
        this.notaSelect = notaSelect;
    }
    
    
    
    
}
