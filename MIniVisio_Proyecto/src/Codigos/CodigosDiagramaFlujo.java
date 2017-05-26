
package Codigos;

import DiagramaFlujo.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Arles Cerrato
 */
public class CodigosDiagramaFlujo extends Codigo{
    
    //Cosntructores
    
    public CodigosDiagramaFlujo (){
        super();
    }

    public CodigosDiagramaFlujo(String nombre) {
        super(nombre);
    }
    
    //Metodos de adiministracion
    
    //metodo para el diagrama de inicio
    public String Inicio(Inicio inicio) {
        String cadena = "package " + nombre + " { \n\n"
                + "import java.util.*;\n\n"
                + "public class " + nombre + " {\n\n"
                + "     public static void main(String args[]) {\n"
                + "         Scanner lea = new Scanner(System.in);\n";
        return cadena;
    }
    
    //metodo para el diagrama de final
    public String Fin (Final fin){
        String cadena = "     }\n\n"
                + "}";
        return cadena;
    }
    
    //metodo para el diagrama de asignacion de variables
    public String Asignacion (AsignacionVariable asig){
        String cadena="";
        for (int i = 0; i < asig.getTextos().size(); i++) {
            if (!"".equals(asig.getTextos().get(i).getText())) {
                cadena += "        " + asig.getTextos().get(i).getText() + "; \n";
            }            
        }
        return cadena;
    }
    
    //metodo para el diagrama de condicional
    public String Condicional (Condicional c){
        String cadena = "        if (" + c.getTexto() + "){\n" ;
        return cadena;
    }
    
    //metodo para el diagrama de fin condicional
    public String FinCondicinal (FinCondicional c){
        String cadena = "        }\n";
        return cadena;
    }
    
    //metodo para el diagrama de mientras
    public String mientras(Mientras m){
        String cadena = "        while (" + m.getTexto() + "){\n";
        return cadena;
    }
    
    //metodo para el diagrama de fin mientras
    public String FinMientras (FinMientras m){
        String cadena = "        }\n";
        return cadena;
    }
    
    //metodo para el diagrama de impresion con variable
    public String ImpresionVariable(ImpresionConVariable i){
        String cadena = "        System.out.prinln(\"" + i.getTextoImpresion() + "\" + " + i.getTexttoVariable() +
                ");\n";
        return cadena;
    }
    
    //metodo para el diagrama de imprimir
    public String Impimir (Imprimir i){
        String cadena = "        System.out.print(\"" + i.getTexto()+"\");\n";
        return cadena;
    }
    
    //metodo para el diagrama de lea
    public String Lea(Lea l, ArrayList<DeclaracionVariable> d){
        ArrayList<String> depuracion =  new ArrayList();
        ArrayList<String> variable = new ArrayList();
        String subcadena="";
        String cadena="";
        Scanner sc1;
        Scanner sc2;
        boolean parar = false;
        for (int i = 0; i < d.size(); i++) {
            sc1 = new Scanner (d.get(i).getTexto());
            sc1.useDelimiter(",");
            while (sc1.hasNext()){
                depuracion.add(sc1.next());
            }
            for (int j = 0; j < depuracion.size(); j++) {
                subcadena+= depuracion.get(j);
            }
            sc2 = new Scanner(subcadena);
            sc2.useDelimiter(" ");
            while (sc2.hasNext()){
                variable.add(sc2.next());
            }
            for (int j = 0; j < variable.size(); j++) {
                if (variable.get(j).equals("String") && variable.get(j+1).equals(l.getTf_lea().getText())) {
                    cadena += "        " + l.getTf_lea().getText() + "= lea.next();\n";
                    parar = true;
                    break;                    
                }else if (variable.get(j).equals("int") && variable.get(j+1).equals(l.getTf_lea().getText())) {
                    cadena += "        " + l.getTf_lea().getText() + "= lea.nextInt();\n";
                    parar = true;
                    break;
                }else if (variable.get(j).equals("double") && variable.get(j+1).equals(l.getTf_lea().getText())) {
                    cadena += "        " + l.getTf_lea().getText() + "= lea.nextDouble();\n";
                    parar = true;
                    break;
                }
            }
            if (parar) {
                break;
            }
        }
        return cadena;
    }
    
    //metodo para el diagrama de operacion de variables
    public String Operacion(OperacionVariables o){
        String cadena = "        " + o.getTexto() + ";\n";
        return cadena;
    }
    
    //Metodo para el diagrama de Declaracion de variable
    public String Declaracion (DeclaracionVariable d){
        ArrayList <String> cadenas = new ArrayList();
        String cadena = "";
        Scanner sc = new Scanner(d.getTexto());
        sc.useDelimiter(",");
        while (sc.hasNext()){
            cadenas.add(sc.next());
        }
        for (int i = 0; i < cadenas.size(); i++) {
            cadena += "        " + cadenas.get(i) + ";\n";
        }
        return cadena;
    }
    
}
