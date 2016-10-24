/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Josué Cifuentes 15275
 * Pablo Muñoz 15258
 * @author Josue
 */
public class Paciente implements Comparable<Paciente>{
    
    private String nombre;
    private String enfermedad;
    private String prioridad;

    /**
     *
     * @param nombre
     * @param enfermedad
     * @param prioridad
     */
    public Paciente(String nombre, String enfermedad, String prioridad) {
        this.nombre = nombre;
        this.enfermedad = enfermedad;
        this.prioridad = prioridad;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getEnfermedad() {
        return enfermedad;
    }

    /**
     *
     * @param enfermedad
     */
    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    /**
     *
     * @return
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     *
     * @param prioridad
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return  nombre + ", " + enfermedad + ", "+ prioridad;
    }

    @Override
    //Compara la prioridad del paciente actual con la del paciente o.
    /**
     * 
     * @param o
     * @return
     */
    public int compareTo(Paciente o) {
        String priority = o.getPrioridad();
        return prioridad.compareTo(priority);
    }
    
    
    
}
