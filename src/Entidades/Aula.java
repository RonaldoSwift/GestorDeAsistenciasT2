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
public class Aula {
    
    private int numeroDeCarpetas;
    private String codigoDeProfesor;

    public Aula(int numeroDeCarpetas, String codigoDeProfesor) {
        this.numeroDeCarpetas = numeroDeCarpetas;
        this.codigoDeProfesor = codigoDeProfesor;
    }

    /**
     * @return the numeroDeCarpetas
     */
    public int getNumeroDeCarpetas() {
        return numeroDeCarpetas;
    }

    /**
     * @param numeroDeCarpetas the numeroDeCarpetas to set
     */
    public void setNumeroDeCarpetas(int numeroDeCarpetas) {
        this.numeroDeCarpetas = numeroDeCarpetas;
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