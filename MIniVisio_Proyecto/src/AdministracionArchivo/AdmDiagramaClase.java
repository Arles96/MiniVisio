/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdministracionArchivo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Arles Cerrato
 */

public class AdmDiagramaClase implements Serializable{
    
    //Atributos
    private String nombre;
    private String nombrePaquete;
    private int x;
    private int y;
    private ArrayList<String> atributos = new ArrayList();
    private ArrayList<String> metodos = new ArrayList();
    private static final long SerialVersionUID = 25L;
    
    //Cosntructores

    public AdmDiagramaClase() {
    }

    public AdmDiagramaClase(String nombrePaquete, String nombre, int x, int y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.nombrePaquete = nombrePaquete;
    }
    
    //Mutadores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ArrayList<String> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<String> atributos) {
        this.atributos = atributos;
    }
    
    public void setAtributo(String atributo){
        this.atributos.add(atributo);
    }

    public ArrayList<String> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<String> metodos) {
        this.metodos = metodos;
    }
    
    public void setMetodo(String metodo){
        this.metodos.add(metodo);
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }
    
}
