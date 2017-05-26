/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

import DiagramaUML.DiagramaClase;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Arles Cerrato
 */
public class CodigosDiagramasClases extends Codigo{
    
    //Contructores
    public CodigosDiagramasClases (){
        super();
    }

    public CodigosDiagramasClases(String nombre) {
        super(nombre);
    }
    
    //Metodos de adiministracion
    
    //metodo de hacer codigo de diagrama de uml
    public String CodigoClase(DiagramaClase c) {
        String clase = "public class " + c.getNombre() + " { \n\n";
        String atributos = "";
        String declaracionAtributo = "";
        String mutadores="";
        String metodos= "";
        String finClase="}\n\n";
        String cadena="";
        for (int i = 0; i < c.getAtributos().size(); i++) {
            if (!"".equals(c.getAtributos().get(i).getText())) {
                declaracionAtributo +=CodigoDeclaracionAtributos(c.getAtributos().get(i).getText());
                atributos += c.getAtributos().get(i).getText() + ":";
            }
        }
        String constructor = "\n    public " + c.getNombre() + "() { \n    }\n\n";
        String constructor2 = Constructor(atributos, c.getNombre());
        for (int i = 0; i < c.getAtributos().size(); i++) {
            if (!"".equals(c.getAtributos().get(i).getText())) {
                mutadores+= CodigoMutadoresAtributos(c.getAtributos().get(i).getText());
            }
        }
        for (int i = 0; i < c.getMetodos().size(); i++) {
            if (!"".equals(c.getMetodos().get(i).getText())) {
                metodos += CodigoMetodos(c.getMetodos().get(i).getText());
            }
        }
        cadena += clase;
        cadena += declaracionAtributo;
        cadena += constructor;
        cadena += constructor2;
        cadena += mutadores;
        cadena += metodos;
        cadena += finClase;
        return cadena;
    }
    
    public String inicio(){
        return "package "  + nombre + ";\n\nimport java.util.*;\n\n";
    }
    
    //metodo para hacer la declaracion de los atributos del diagrama
    public String CodigoDeclaracionAtributos (String a){
        ArrayList<String> atributos = new ArrayList();
        String cadena = "";
        Scanner sc = new Scanner(a);
        sc.useDelimiter(":");
        while (sc.hasNext()){
            atributos.add(sc.next());
        }
        for (int i = 0; i < atributos.size(); i+=2) {
            if (atributos.get(i).equals("ArrayList")) {
                cadena += "    private " + atributos.get(i) + " " + atributos.get(i+1) + 
                        " = new ArrayList();\n";
            }else {
                cadena += "    private " + atributos.get(i) + " " + atributos.get(i+1) + ";\n";
            }            
        }
        return cadena;        
    }
    
    //metodo para hacer mutadores de los atributos del diagrama
    public String CodigoMutadoresAtributos(String m){
        ArrayList<String> mutadores = new ArrayList();
        String cadena="";
        Scanner sc = new Scanner(m);
        sc.useDelimiter(":");
        while (sc.hasNext()){
            mutadores.add(sc.next());
        }
        for (int i = 1; i < mutadores.size(); i+=2) {
            if (!"".equals(mutadores.get(i))) {
                cadena += "    public void set" + mutadores.get(i) + "(){\n    " + 
                        "    return " + mutadores.get(i) + "; \n    }\n\n";
                cadena += "    public " + mutadores.get(i-1) + " get" + mutadores.get(i) + "(" +
                        mutadores.get(i-1) + " " + mutadores.get(i) + "){ \n    " + "    this." + mutadores.get(i) +
                                "=" + mutadores.get(i) + "; \n    }\n\n";
            }
        }
        return cadena;
    }
    
    //metodo para hacer metodos de adiminstracion del diagrama
    public String CodigoMetodos(String e){
        ArrayList<String> metodos = new ArrayList();
        String cadena="";
        Scanner sc = new Scanner (e);
        sc.useDelimiter(":");
        while (sc.hasNext()){
            metodos.add(sc.next());
        }
        for (int i = 0; i < metodos.size(); i+=2) {
            cadena += "    public " + metodos.get(i+1) + " " + metodos.get(i) + "{\n\n    }\n\n";
        }
        return cadena;
    }
    
    //metodo para el constructor compuesto
    public String Constructor(String s, String n){
        ArrayList<String> variable = new ArrayList();
        String inicio = "    public " + n + "(";
        String variables = "";
        String cadena= "";
        Scanner sc = new Scanner(s);
        sc.useDelimiter(":");
        while (sc.hasNext()){
            variable.add(sc.next());
        }
        for (int i = 0; i < variable.size(); i+=2) {            
            if (i<variable.size()-2) {
                if (!variable.get(i).equals("ArrayList")) {
                    variables+=" " + variable.get(i) + " " + variable.get(i+1) + ", ";
                }                
            }else {
                if (!variable.get(i).equals("ArrayList")) {
                    variables+= variable.get(i) + " " + variable.get(i+1) + " ";
                }                
            }
        }
        variables += " ){\n";
        for (int i = 1; i < variable.size(); i+=2) {
            if (!variable.get(i-1).equals("ArrayList")) {
                variables += "        this." + variable.get(i) + "=" + variable.get(i) + "; \n";
            }            
        }
        variables+="    }\n\n";
        cadena+= inicio;
        cadena+= variables;
        return cadena;
    }
    
    public String CodigoHerenciaClase(DiagramaClase c){
        String clase = "public class " + c.getNombre() + " extends " + c.getClasePadre().getNombre() + " {\n\n";
        String atributos = "";
        String atributosPadre = "";
        String declaracionAtributos="";
        String mutadores= "";
        String metodos = "";
        String finClase = "}";
        String cadena = "";
        for (int i = 0; i < c.getAtributos().size(); i++) {
            if (!"".equals(c.getAtributos().get(i).getText())) {
                declaracionAtributos+= CodigoDeclaracionAtributos(c.getAtributos().get(i).getText());
                atributos += c.getAtributos().get(i).getText() + ":";
            }
            
        }
        String constructor = "    public " + c.getNombre() + " {\n        "
                + "super();\n    }\n\n";
        for (int i = 0; i < c.getClasePadre().getAtributos().size(); i++) {
            if (!"".equals(c.getClasePadre().getAtributos().get(i).getText())) {
                atributosPadre += c.getClasePadre().getAtributos().get(i).getText() + ":";
            }            
        }
        String constructor2 = AtributosClasePadreConstructor(atributos, atributosPadre, c.getNombre());
        for (int i = 0; i < c.getAtributos().size(); i++) {
            if (!"".equals(c.getAtributos().get(i).getText())) {
               mutadores += CodigoMutadoresAtributos(c.getAtributos().get(i).getText()); 
            }            
        }
        for (int i = 0; i < c.getMetodos().size(); i++) {
            if (!"".equals(c.getMetodos().get(i).getText())) {
                metodos+= CodigoMetodos(c.getMetodos().get(i).getText());
            }            
        }
        cadena += clase;
        cadena += declaracionAtributos + "\n";
        cadena += constructor;
        cadena += constructor2 + "\n\n";
        cadena += mutadores;
        cadena += metodos;
        cadena += finClase;
        return cadena;
    }
    
    //metodo para declarar los atributos de la clase padre en el constructor
    public String AtributosClasePadreConstructor (String c,String g,String n){
        String inicio = "    public " + n  +" ( " ;
        String superC = "        super( ";
        String variables ="";
        String cadena = "";        
        ArrayList<String> atributos = new ArrayList();
        ArrayList<String> atributosPadre = new ArrayList();
        Scanner sc = new Scanner (c);
        Scanner sc2 = new Scanner(g);
        sc.useDelimiter(":");
        sc2.useDelimiter(":");
        while (sc.hasNext()){
            atributos.add(sc.next());
        }
        while (sc2.hasNext()){
            atributosPadre.add(sc2.next());
        }
        for (int i = 0; i < atributosPadre.size(); i+=2) {
            if (i<atributosPadre.size()-2) {
                if (!atributosPadre.get(i).equals("ArrayList")) {
                    inicio+=" " + atributosPadre.get(i) + " " + atributosPadre.get(i+1) + ", ";
                }                
            }else {
                if (!atributosPadre.get(i).equals("ArrayList")) {
                    inicio+= atributosPadre.get(i) + " " + atributosPadre.get(i+1) + ", ";
                }                
            }
            //inicio += atributosPadre.get(i) + " " + atributosPadre.get(i+1) + ", ";
        }
        for (int i = 0; i < atributos.size(); i+=2) {
            if (i<atributos.size()-2) {
                if (!atributos.get(i).equals("ArrayList")) {
                    inicio +=" " + atributos.get(i) + " " + atributos.get(i+1) + ", ";
                }                
            }else {
                if (!atributos.get(i).equals("ArrayList")) {
                    inicio+= atributos.get(i) + " " + atributos.get(i+1) + " ";
                }                
            }
            //inicio += atributos.get(i) + " " + atributos.get(i+1) + ", ";
        }
        inicio += ")\n";
        for (int i = 1; i < atributosPadre.size(); i+=2) {
            if (i<atributosPadre.size()-2) {
                if (!atributosPadre.get(i-1).equals("ArrayList")) {
                    superC+=" " + atributosPadre.get(i) + ", ";
                }                
            }else {
                if (!atributosPadre.get(i-1).equals("ArrayList")) {
                    superC+= atributosPadre.get(i) + " " ;
                }                
            }
            //superC += atributosPadre.get(i) + ", ";
        }
        superC += " );\n";
        for (int i = 1; i < atributos.size(); i+=2) {
            variables += "       this." + atributos.get(i) + "=" + atributos.get(i) + ";\n";
        }
        cadena += inicio;
        cadena += superC;
        cadena += variables;
        cadena+= "      }";
        return cadena;
    }
    
}
