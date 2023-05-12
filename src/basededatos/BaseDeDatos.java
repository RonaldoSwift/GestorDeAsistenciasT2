/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import Entidades.Aula;
import Entidades.Profesor;

/**
 *
 * @author 
 */
public class BaseDeDatos {
    Aula aula = new Aula(10,"P109");
    public Profesor profesor = new Profesor("Juan","P109", aula);
}
