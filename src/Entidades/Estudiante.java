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
public class Estudiante {
    
    private String profesion;
    private boolean esExelente;
    private Asistencia asistencia;

    /**
     * @return the profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * @return the esExelente
     */
    public boolean isEsExelente() {
        return esExelente;
    }

    /**
     * @param esExelente the esExelente to set
     */
    public void setEsExelente(boolean esExelente) {
        this.esExelente = esExelente;
    }

    /**
     * @return the asistencia
     */
    public Asistencia getAsistencia() {
        return asistencia;
    }

    /**
     * @param asistencia the asistencia to set
     */
    public void setAsistencia(Asistencia asistencia) {
        this.asistencia = asistencia;
    }
    
    
}
