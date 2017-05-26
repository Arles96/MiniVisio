/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

import java.io.Serializable;

/**
 *
 * @author Arles Cerrato
 */
public class Codigo implements Serializable{
    
    //Atributos
    protected String nombre;
    private static final long SerialVersionUID = 11L;
    //Constructores

    public Codigo() {
    }

    public Codigo(String nombre) {
        this.nombre = nombre;
    }
    
    //Mutadores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
