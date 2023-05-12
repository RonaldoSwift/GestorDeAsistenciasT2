/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Ronaldo Vargas
 */
public class Profesor {
    private String nombre;
    private String codigoDeProfesor;
    private Aula aula;

    public Profesor(String nombre, String codigoDeProfesor, Aula aula) {
        this.nombre = nombre;
        this.codigoDeProfesor = codigoDeProfesor;
        this.aula = aula;
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
     * @return the aula
     */
    public Aula getAula() {
        return aula;
    }

    /**
     * @param aula the aula to set
     */
    public void setAula(Aula aula) {
        this.aula = aula;
    }

    /**
     * @return the codigoDeProfesor
     */
    public String getCodigoDeProfesor() {
        return codigoDeProfesor;
    }

    /**
     * @param codigoDeProfesor the codigoDeProfesor to set
     */
    public void setCodigoDeProfesor(String codigoDeProfesor) {
        this.codigoDeProfesor = codigoDeProfesor;
    }
    
    
}
