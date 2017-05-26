/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minivisio_proyecto;

import AdministracionArchivo.AdmDiagramaClase;
import AdministracionArchivo.AdmDiagramaFlujo;
import Codigos.CodigosDiagramaFlujo;
import Codigos.CodigosDiagramasClases;
import DiagramaFlujo.AsignacionVariable;
import DiagramaFlujo.Condicional;
import DiagramaFlujo.DeclaracionVariable;
import DiagramaFlujo.FinCondicional;
import DiagramaFlujo.FinMientras;
import DiagramaFlujo.Final;
import DiagramaFlujo.ImpresionConVariable;
import DiagramaFlujo.Imprimir;
import DiagramaFlujo.Inicio;
import DiagramaFlujo.Lea;
import DiagramaFlujo.Mientras;
import DiagramaFlujo.OperacionVariables;
import DiagramaUML.DiagramaClase;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Arles Cerrato
 */
public class FramePrincipal extends javax.swing.JFrame {

    //Atributos personalizados
    private ArrayList<JPanel> diagramasFlujo = new ArrayList();
    private ArrayList<DiagramaClase> diagramaClase = new ArrayList();
    private int contadorInicio=0;
    private int contadorFinal=0;
    private Color color;
    private String nombreFlujo;
    private String nombreClase;
    private String copia = null;
    private File archivo = null;
    
    //Constructor
    
    public FramePrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);   
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/logo.jpg")).getImage());        
    }
    
    //Mutadores de los atributos personalizados
        
    public ArrayList<DiagramaClase> getDiagramasClase(){
        return diagramaClase;
    }
    
    public ArrayList<JPanel> getDiagramasFlujo(){
        return diagramasFlujo;
    }
    
    public Color getColor (){
        return color;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_EleccionDiagramaNuevo = new javax.swing.JDialog();
        lb_titulo_Seleccionar = new javax.swing.JLabel();
        pn_botonesSeleccion = new javax.swing.JPanel();
        bt_eleccionDiagramaFlujo = new javax.swing.JButton();
        bt_eleccionDiagramaUML = new javax.swing.JButton();
        jd_herencia_DUML = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListHerencia1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListHerencia2 = new javax.swing.JList<>();
        lb_herencia = new javax.swing.JLabel();
        bt_Herencia = new javax.swing.JButton();
        bt_cancelarHerencia = new javax.swing.JButton();
        pn_opciones_diagramas = new javax.swing.JPanel();
        cb_fuentes = new javax.swing.JComboBox<>();
        cb_estilo_fuente = new javax.swing.JComboBox<>();
        lb_fuente = new javax.swing.JLabel();
        lb_estilo_fuente = new javax.swing.JLabel();
        lb_tamaño = new javax.swing.JLabel();
        bt_colorFigura = new javax.swing.JButton();
        bt_hacerCodigoFlujo = new javax.swing.JButton();
        lb_colorFiguras = new javax.swing.JLabel();
        bt_colorTexto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bt_copiar = new javax.swing.JButton();
        bt_pegar = new javax.swing.JButton();
        bt_eliminarFigura = new javax.swing.JButton();
        cb_tamañoTexto = new javax.swing.JComboBox<>();
        bt_lineasDfl = new javax.swing.JButton();
        bt_codigoUML = new javax.swing.JButton();
        bt_moverDiagramaFlujo = new javax.swing.JButton();
        bt_lineasHerencia = new javax.swing.JButton();
        bt_moverUML = new javax.swing.JButton();
        tpn_diagramasCodigo = new javax.swing.JTabbedPane();
        scpn_diagramas = new javax.swing.JScrollPane();
        pn_diagramas = new javax.swing.JPanel();
        pn_codigos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_codigos = new javax.swing.JTextArea();
        bt_editarCodigo = new javax.swing.JButton();
        bt_NoEditar = new javax.swing.JButton();
        tbpn_Diagramas = new javax.swing.JTabbedPane();
        spn_diagramasFlujo = new javax.swing.JScrollPane();
        pn_diagramaFlujo = new javax.swing.JPanel();
        bt_diagramaInicio = new javax.swing.JButton();
        bt_diagramaMientras = new javax.swing.JButton();
        bt_diagramaFinMientras = new javax.swing.JButton();
        bt_DiagramaCondicional = new javax.swing.JButton();
        bt_diagramaFinCondicional = new javax.swing.JButton();
        bt_diagramaFinal = new javax.swing.JButton();
        bt_diagramaDeclaracionVariable = new javax.swing.JButton();
        bt_diagramaImprimir = new javax.swing.JButton();
        bt_leaDiagramaFlujo = new javax.swing.JButton();
        bt_diagramaImprimirVariable = new javax.swing.JButton();
        bt_diagramaAsignacionVariable = new javax.swing.JButton();
        bt_diagramaOperacionVariable = new javax.swing.JButton();
        pn_diagramaUML = new javax.swing.JPanel();
        bt_diagramaClase = new javax.swing.JButton();
        bt_herencia = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        menu_archivos = new javax.swing.JMenu();
        menuItem_nuevo = new javax.swing.JMenuItem();
        menuItem_abrir = new javax.swing.JMenuItem();
        jMenuItemAbrirDFL = new javax.swing.JMenuItem();
        menuItem_guardar = new javax.swing.JMenuItem();
        jMenuItemGuardarComo = new javax.swing.JMenuItem();
        menuItem_eliminar = new javax.swing.JMenuItem();
        menuItem_imprimir = new javax.swing.JMenuItem();
        menu_formatos = new javax.swing.JMenu();
        menuItem_pdf = new javax.swing.JMenuItem();
        menuItem_jpg = new javax.swing.JMenuItem();
        menu_opciones = new javax.swing.JMenu();
        menuItem_color = new javax.swing.JMenuItem();

        lb_titulo_Seleccionar.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        lb_titulo_Seleccionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo_Seleccionar.setText("Seleccione un tipo de diagrama que desea realizar");

        pn_botonesSeleccion.setLayout(new java.awt.GridLayout(1, 0));

        bt_eleccionDiagramaFlujo.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        bt_eleccionDiagramaFlujo.setText("Diagrama de Flujo");
        bt_eleccionDiagramaFlujo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eleccionDiagramaFlujoActionPerformed(evt);
            }
        });
        pn_botonesSeleccion.add(bt_eleccionDiagramaFlujo);

        bt_eleccionDiagramaUML.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        bt_eleccionDiagramaUML.setText("Diagrama de UML");
        bt_eleccionDiagramaUML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eleccionDiagramaUMLActionPerformed(evt);
            }
        });
        pn_botonesSeleccion.add(bt_eleccionDiagramaUML);

        javax.swing.GroupLayout jd_EleccionDiagramaNuevoLayout = new javax.swing.GroupLayout(jd_EleccionDiagramaNuevo.getContentPane());
        jd_EleccionDiagramaNuevo.getContentPane().setLayout(jd_EleccionDiagramaNuevoLayout);
        jd_EleccionDiagramaNuevoLayout.setHorizontalGroup(
            jd_EleccionDiagramaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo_Seleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jd_EleccionDiagramaNuevoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(pn_botonesSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jd_EleccionDiagramaNuevoLayout.setVerticalGroup(
            jd_EleccionDiagramaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_EleccionDiagramaNuevoLayout.createSequentialGroup()
                .addComponent(lb_titulo_Seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_botonesSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jListHerencia1.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jListHerencia1);

        jListHerencia2.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jListHerencia2);

        lb_herencia.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        lb_herencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_herencia.setText("HERENCIA");

        bt_Herencia.setText("Hacer herencia");
        bt_Herencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_HerenciaActionPerformed(evt);
            }
        });

        bt_cancelarHerencia.setText("Cancelar");
        bt_cancelarHerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarHerenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_herencia_DUMLLayout = new javax.swing.GroupLayout(jd_herencia_DUML.getContentPane());
        jd_herencia_DUML.getContentPane().setLayout(jd_herencia_DUMLLayout);
        jd_herencia_DUMLLayout.setHorizontalGroup(
            jd_herencia_DUMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_herencia_DUMLLayout.createSequentialGroup()
                .addGroup(jd_herencia_DUMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_herencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jd_herencia_DUMLLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jd_herencia_DUMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Herencia))
                        .addGap(47, 47, 47)
                        .addGroup(jd_herencia_DUMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_cancelarHerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_herencia_DUMLLayout.setVerticalGroup(
            jd_herencia_DUMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_herencia_DUMLLayout.createSequentialGroup()
                .addComponent(lb_herencia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_herencia_DUMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_herencia_DUMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Herencia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cancelarHerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Visio");
        setBackground(new java.awt.Color(102, 102, 255));

        pn_opciones_diagramas.setBackground(new java.awt.Color(153, 153, 153));

        cb_fuentes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Calibri", "Arial", "Algerian", "Ar Black", "Cambria", "Verdana", "FranKlin Gothic Heavy" }));
        cb_fuentes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_fuentesItemStateChanged(evt);
            }
        });

        cb_estilo_fuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plain", "Bold", "Italic", "Bold Italic" }));
        cb_estilo_fuente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_estilo_fuenteItemStateChanged(evt);
            }
        });

        lb_fuente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_fuente.setText("Fuente:");

        lb_estilo_fuente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_estilo_fuente.setText("Estilo Fuente: ");

        lb_tamaño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_tamaño.setText("Tamaño");

        bt_colorFigura.setBackground(new java.awt.Color(0, 255, 204));
        bt_colorFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_colorFiguraActionPerformed(evt);
            }
        });

        bt_hacerCodigoFlujo.setText("Codigo de DF");
        bt_hacerCodigoFlujo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hacerCodigoFlujoActionPerformed(evt);
            }
        });

        lb_colorFiguras.setText("Color figuras");

        bt_colorTexto.setBackground(new java.awt.Color(0, 0, 0));
        bt_colorTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_colorTextoActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Color texto");

        bt_copiar.setFont(new java.awt.Font("sansserif", 0, 8)); // NOI18N
        bt_copiar.setText("Copiar");
        bt_copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_copiarActionPerformed(evt);
            }
        });

        bt_pegar.setFont(new java.awt.Font("sansserif", 0, 8)); // NOI18N
        bt_pegar.setText("Pegar");
        bt_pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pegarActionPerformed(evt);
            }
        });

        bt_eliminarFigura.setFont(new java.awt.Font("sansserif", 0, 8)); // NOI18N
        bt_eliminarFigura.setText("Eliminar");
        bt_eliminarFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarFiguraActionPerformed(evt);
            }
        });

        cb_tamañoTexto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "5", "8", "10", "12", "15", "18", "20", "24" }));
        cb_tamañoTexto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_tamañoTextoItemStateChanged(evt);
            }
        });

        bt_lineasDfl.setText("Linea DFJ");
        bt_lineasDfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lineasDflActionPerformed(evt);
            }
        });

        bt_codigoUML.setText("Codigo UML");
        bt_codigoUML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_codigoUMLActionPerformed(evt);
            }
        });

        bt_moverDiagramaFlujo.setText("Mover DF");
        bt_moverDiagramaFlujo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_moverDiagramaFlujoActionPerformed(evt);
            }
        });

        bt_lineasHerencia.setText("Linea Herencia");
        bt_lineasHerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lineasHerenciaActionPerformed(evt);
            }
        });

        bt_moverUML.setText("Mover UML");
        bt_moverUML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_moverUMLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_opciones_diagramasLayout = new javax.swing.GroupLayout(pn_opciones_diagramas);
        pn_opciones_diagramas.setLayout(pn_opciones_diagramasLayout);
        pn_opciones_diagramasLayout.setHorizontalGroup(
            pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_opciones_diagramasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_copiar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_pegar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_eliminarFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_lineasDfl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_moverDiagramaFlujo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_lineasHerencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_moverUML)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cb_fuentes, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_fuente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_estilo_fuente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_estilo_fuente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_tamaño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_tamañoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_colorFigura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_colorFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_colorTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_hacerCodigoFlujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_codigoUML, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pn_opciones_diagramasLayout.setVerticalGroup(
            pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_opciones_diagramasLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_opciones_diagramasLayout.createSequentialGroup()
                        .addGroup(pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_fuente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_estilo_fuente, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_estilo_fuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_fuentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_tamañoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pn_opciones_diagramasLayout.createSequentialGroup()
                            .addGroup(pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lb_colorFiguras)
                                .addComponent(jLabel2)
                                .addComponent(lb_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bt_colorFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_colorTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pn_opciones_diagramasLayout.createSequentialGroup()
                            .addGroup(pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bt_moverDiagramaFlujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pn_opciones_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bt_copiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_pegar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_eliminarFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_lineasDfl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(bt_lineasHerencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_moverUML, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(2, 2, 2)))
                    .addGroup(pn_opciones_diagramasLayout.createSequentialGroup()
                        .addComponent(bt_hacerCodigoFlujo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_codigoUML, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        scpn_diagramas.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scpn_diagramas.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pn_diagramas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_diagramasLayout = new javax.swing.GroupLayout(pn_diagramas);
        pn_diagramas.setLayout(pn_diagramasLayout);
        pn_diagramasLayout.setHorizontalGroup(
            pn_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1114, Short.MAX_VALUE)
        );
        pn_diagramasLayout.setVerticalGroup(
            pn_diagramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        scpn_diagramas.setViewportView(pn_diagramas);

        tpn_diagramasCodigo.addTab("Digramas", scpn_diagramas);

        ta_codigos.setEditable(false);
        ta_codigos.setColumns(20);
        ta_codigos.setRows(5);
        jScrollPane1.setViewportView(ta_codigos);

        bt_editarCodigo.setText("Editar");
        bt_editarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editarCodigoActionPerformed(evt);
            }
        });

        bt_NoEditar.setText("Fin editar");
        bt_NoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_NoEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_codigosLayout = new javax.swing.GroupLayout(pn_codigos);
        pn_codigos.setLayout(pn_codigosLayout);
        pn_codigosLayout.setHorizontalGroup(
            pn_codigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_codigosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pn_codigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_NoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_editarCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pn_codigosLayout.setVerticalGroup(
            pn_codigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_codigosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_codigosLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(bt_editarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_NoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpn_diagramasCodigo.addTab("Codigos", pn_codigos);

        pn_diagramaFlujo.setLayout(new java.awt.GridLayout(0, 1));

        bt_diagramaInicio.setText("Inicio");
        bt_diagramaInicio.setEnabled(false);
        bt_diagramaInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_diagramaInicioMouseClicked(evt);
            }
        });
        pn_diagramaFlujo.add(bt_diagramaInicio);

        bt_diagramaMientras.setText("Mientras");
        bt_diagramaMientras.setEnabled(false);
        bt_diagramaMientras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_diagramaMientrasMouseClicked(evt);
            }
        });
        pn_diagramaFlujo.add(bt_diagramaMientras);

        bt_diagramaFinMientras.setText("Fin Mientras");
        bt_diagramaFinMientras.setEnabled(false);
        bt_diagramaFinMientras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_diagramaFinMientrasMouseClicked(evt);
            }
        });
        pn_diagramaFlujo.add(bt_diagramaFinMientras);

        bt_DiagramaCondicional.setText("Condicional");
        bt_DiagramaCondicional.setEnabled(false);
        bt_DiagramaCondicional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_DiagramaCondicionalMouseClicked(evt);
            }
        });
        pn_diagramaFlujo.add(bt_DiagramaCondicional);

        bt_diagramaFinCondicional.setText("Fin Condicional");
        bt_diagramaFinCondicional.setEnabled(false);
        bt_diagramaFinCondicional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_diagramaFinCondicionalMouseClicked(evt);
            }
        });
        pn_diagramaFlujo.add(bt_diagramaFinCondicional);

        bt_diagramaFinal.setText("Final");
        bt_diagramaFinal.setEnabled(false);
        bt_diagramaFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_diagramaFinalMouseClicked(evt);
            }
        });
        pn_diagramaFlujo.add(bt_diagramaFinal);

        bt_diagramaDeclaracionVariable.setText("Declaracion Variable");
        bt_diagramaDeclaracionVariable.setEnabled(false);
        bt_diagramaDeclaracionVariable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_diagramaDeclaracionVariableMouseClicked(evt);
            }
        });
        pn_diagramaFlujo.add(bt_diagramaDeclaracionVariable);

        bt_diagramaImprimir.setText("Imprimir");
        bt_diagramaImprimir.setEnabled(false);
        bt_diagramaImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_diagramaImprimirMouseClicked(evt);
            }
        });
        pn_diagramaFlujo.add(bt_diagramaImprimir);

        bt_leaDiagramaFlujo.setText("Lea");
        bt_leaDiagramaFlujo.setEnabled(false);
        bt_leaDiagramaFlujo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_leaDiagramaFlujoActionPerformed(evt);
            }
        });
        pn_diagramaFlujo.add(bt_leaDiagramaFlujo);

        bt_diagramaImprimirVariable.setText("Imprimir con Variable");
        bt_diagramaImprimirVariable.setEnabled(false);
        bt_diagramaImprimirVariable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_diagramaImprimirVariableMouseClicked(evt);
            }
        });
        pn_diagramaFlujo.add(bt_diagramaImprimirVariable);

        bt_diagramaAsignacionVariable.setText("Asignacion Variable");
        bt_diagramaAsignacionVariable.setEnabled(false);
        bt_diagramaAsignacionVariable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_diagramaAsignacionVariableMouseClicked(evt);
            }
        });
        pn_diagramaFlujo.add(bt_diagramaAsignacionVariable);

        bt_diagramaOperacionVariable.setText("Operacion");
        bt_diagramaOperacionVariable.setEnabled(false);
        bt_diagramaOperacionVariable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_diagramaOperacionVariableMouseClicked(evt);
            }
        });
        pn_diagramaFlujo.add(bt_diagramaOperacionVariable);

        spn_diagramasFlujo.setViewportView(pn_diagramaFlujo);

        tbpn_Diagramas.addTab("Flujo", spn_diagramasFlujo);

        pn_diagramaUML.setLayout(new java.awt.GridLayout(0, 1));

        bt_diagramaClase.setText("Diagrama Clase");
        bt_diagramaClase.setEnabled(false);
        bt_diagramaClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_diagramaClaseMouseClicked(evt);
            }
        });
        pn_diagramaUML.add(bt_diagramaClase);

        bt_herencia.setText("Herencia");
        bt_herencia.setEnabled(false);
        bt_herencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_herenciaActionPerformed(evt);
            }
        });
        pn_diagramaUML.add(bt_herencia);

        tbpn_Diagramas.addTab("UML", pn_diagramaUML);

        menu_archivos.setText("Archivo");

        menuItem_nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuItem_nuevo.setText("Nuevo ");
        menuItem_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_nuevoActionPerformed(evt);
            }
        });
        menu_archivos.add(menuItem_nuevo);

        menuItem_abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        menuItem_abrir.setText("Abrir UML");
        menuItem_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_abrirActionPerformed(evt);
            }
        });
        menu_archivos.add(menuItem_abrir);

        jMenuItemAbrirDFL.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAbrirDFL.setText("Abrir DFL");
        jMenuItemAbrirDFL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirDFLActionPerformed(evt);
            }
        });
        menu_archivos.add(jMenuItemAbrirDFL);

        menuItem_guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        menuItem_guardar.setText("Guardar ");
        menuItem_guardar.setEnabled(false);
        menuItem_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_guardarActionPerformed(evt);
            }
        });
        menu_archivos.add(menuItem_guardar);

        jMenuItemGuardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemGuardarComo.setText("Guardar Como");
        jMenuItemGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarComoActionPerformed(evt);
            }
        });
        menu_archivos.add(jMenuItemGuardarComo);

        menuItem_eliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuItem_eliminar.setText("Eliminar");
        menuItem_eliminar.setEnabled(false);
        menuItem_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_eliminarActionPerformed(evt);
            }
        });
        menu_archivos.add(menuItem_eliminar);

        menuItem_imprimir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menuItem_imprimir.setText("Imprimir");
        menuItem_imprimir.setEnabled(false);
        menuItem_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_imprimirActionPerformed(evt);
            }
        });
        menu_archivos.add(menuItem_imprimir);

        BarraMenu.add(menu_archivos);

        menu_formatos.setText("Formatos");

        menuItem_pdf.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        menuItem_pdf.setText("PDF");
        menuItem_pdf.setEnabled(false);
        menuItem_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_pdfActionPerformed(evt);
            }
        });
        menu_formatos.add(menuItem_pdf);

        menuItem_jpg.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        menuItem_jpg.setText("JPG");
        menuItem_jpg.setEnabled(false);
        menuItem_jpg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_jpgActionPerformed(evt);
            }
        });
        menu_formatos.add(menuItem_jpg);

        BarraMenu.add(menu_formatos);

        menu_opciones.setText("Opciones");

        menuItem_color.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        menuItem_color.setText("Color");
        menuItem_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_colorActionPerformed(evt);
            }
        });
        menu_opciones.add(menuItem_color);

        BarraMenu.add(menu_opciones);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_opciones_diagramas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpn_Diagramas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tpn_diagramasCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 1109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_opciones_diagramas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbpn_Diagramas)
                    .addComponent(tpn_diagramasCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Evento del menuItem de nuevo para que el usuario escoja el diagrama
    private void menuItem_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_nuevoActionPerformed
        // TODO add your handling code here:
        jd_EleccionDiagramaNuevo.setModal(true);
        jd_EleccionDiagramaNuevo.pack();
        jd_EleccionDiagramaNuevo.setLocationRelativeTo(this);
        jd_EleccionDiagramaNuevo.setVisible(true);
    }//GEN-LAST:event_menuItem_nuevoActionPerformed

    //accion para agregar un diagrama de inicio al panel de diagramas
    private void bt_diagramaInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_diagramaInicioMouseClicked
        // TODO add your handling code here:
        if (contadorInicio==0 && bt_diagramaInicio.isEnabled()) {
            Inicio inicio = new Inicio();
            pn_diagramas.add(inicio);
            diagramasFlujo.add(inicio);
            inicio.setBounds(10, 10, inicio.getAnchura(), inicio.getAltura());
            contadorInicio++;
            pn_diagramas.updateUI();
        }else if (contadorInicio>0) {
            JOptionPane.showMessageDialog(this, "Error ya existe un diagrama de inicio en el lienzo");
        }else {
            JOptionPane.showMessageDialog(this, "El boton esta inhabilitado. Abra un archivo o cree uno nuevo");
        }
        
    }//GEN-LAST:event_bt_diagramaInicioMouseClicked

    //accion para agregar un diagrama de final al panel de diagramas
    private void bt_diagramaFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_diagramaFinalMouseClicked
        // TODO add your handling code here:
        if (contadorFinal==0 && bt_diagramaFinal.isEnabled()) {
            Final dFinal = new Final();
            pn_diagramas.add(dFinal);
            diagramasFlujo.add(dFinal);
            dFinal.setBounds(50, 100, dFinal.getAnchura(), dFinal.getAltura());
            contadorFinal++;
            pn_diagramas.updateUI();
        }else if (contadorFinal>0){
            JOptionPane.showMessageDialog(this, "Error ya existe un diagrama de final en el lienzo");
        } else {
            JOptionPane.showMessageDialog(this, "El boton esta inhabilitado. Abra un archivo o cree uno nuevo");
        }
    }//GEN-LAST:event_bt_diagramaFinalMouseClicked

    //accion para agregar un diagrama de declaracion de variable al panel de diagramas
    private void bt_diagramaDeclaracionVariableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_diagramaDeclaracionVariableMouseClicked
        // TODO add your handling code here:
        if (bt_diagramaDeclaracionVariable.isEnabled()) {
            DeclaracionVariable diagramaDeclaracion = new DeclaracionVariable();
            pn_diagramas.add(diagramaDeclaracion);
            diagramasFlujo.add(diagramaDeclaracion);
            diagramaDeclaracion.setBounds(10, 15, diagramaDeclaracion.getAnchura(), diagramaDeclaracion.getAltura());
            pn_diagramas.updateUI();
        }else {
            JOptionPane.showMessageDialog(this, "El boton esta inhabilitado");
        }        
    }//GEN-LAST:event_bt_diagramaDeclaracionVariableMouseClicked

    //accion para agregar un diagrama de imprimir al panel de diagramas
    private void bt_diagramaImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_diagramaImprimirMouseClicked
        // TODO add your handling code here:
        if (bt_diagramaImprimir.isEnabled()) {
            Imprimir diagramaImprimir = new Imprimir();
            pn_diagramas.add(diagramaImprimir);
            diagramasFlujo.add(diagramaImprimir);
            diagramaImprimir.setBounds(10, 15, diagramaImprimir.getAnchura(), diagramaImprimir.getAltura());
            pn_diagramas.updateUI();
        }else {
            JOptionPane.showMessageDialog(this, "El boton esta inhabilitado.");
        }        
    }//GEN-LAST:event_bt_diagramaImprimirMouseClicked

    //accion para agregar un diagrama de imprimir con variables al panel de diagramas
    private void bt_diagramaImprimirVariableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_diagramaImprimirVariableMouseClicked
        // TODO add your handling code here:
        if (bt_diagramaImprimirVariable.isEnabled()) {
            ImpresionConVariable diagramaImpresionVariable = new ImpresionConVariable();
            pn_diagramas.add(diagramaImpresionVariable);
            diagramasFlujo.add(diagramaImpresionVariable);
            diagramaImpresionVariable.setBounds(15, 26, diagramaImpresionVariable.getAnchura(), diagramaImpresionVariable.getAltura());
            pn_diagramas.updateUI();
        }else{
            JOptionPane.showMessageDialog(this, "El boton esta inhabilitado.");
        }        
    }//GEN-LAST:event_bt_diagramaImprimirVariableMouseClicked

    //accion para agregar un diagrama de asignacion de variables al panel de diagramas
    private void bt_diagramaAsignacionVariableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_diagramaAsignacionVariableMouseClicked
        // TODO add your handling code here:
        if (bt_diagramaAsignacionVariable.isEnabled()) {
            AsignacionVariable diagramaAsignacion = new AsignacionVariable();
            pn_diagramas.add(diagramaAsignacion);
            diagramasFlujo.add(diagramaAsignacion);
            diagramaAsignacion.setBounds(20, 30, diagramaAsignacion.getAnchura(), diagramaAsignacion.getAltura());
            pn_diagramas.updateUI();
        }else{
            JOptionPane.showMessageDialog(this, "El boton esta inhabilitado.");
        }        
    }//GEN-LAST:event_bt_diagramaAsignacionVariableMouseClicked

    //accion para agregar un diagrama de operacion al panel de diagramas
    private void bt_diagramaOperacionVariableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_diagramaOperacionVariableMouseClicked
        // TODO add your handling code here:
        if (bt_diagramaOperacionVariable.isEnabled()) {
            OperacionVariables operacion = new OperacionVariables();
            pn_diagramas.add(operacion);
            diagramasFlujo.add(operacion);
            operacion.setBounds(45, 50, operacion.getAnchura(), operacion.getAltura());
            pn_diagramas.updateUI();
        }else{
            JOptionPane.showMessageDialog(this, "El boton esta inhabilitado.");
        }        
    }//GEN-LAST:event_bt_diagramaOperacionVariableMouseClicked

    //accion para agregar un diagrama de clase al panel
    private void bt_diagramaClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_diagramaClaseMouseClicked
        // TODO add your handling code here:
        if (bt_diagramaClase.isEnabled()) {
            DiagramaClase diagramaClases = new DiagramaClase();
            pn_diagramas.add(diagramaClases);
            diagramaClase.add(diagramaClases);
            diagramaClases.setBounds(50, 50, diagramaClases.getAnchura(), diagramaClases.getAltura());
            pn_diagramas.updateUI();
        }else {
            JOptionPane.showMessageDialog(this, "El boton esta inhabilitado.");
        }
        
    }//GEN-LAST:event_bt_diagramaClaseMouseClicked

    //boton para habilitar los botones del diagrama de flujo
    private void bt_eleccionDiagramaFlujoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eleccionDiagramaFlujoActionPerformed
        // TODO add your handling code here:
        bt_diagramaInicio.setEnabled(true);
        bt_diagramaFinal.setEnabled(true);
        bt_diagramaAsignacionVariable.setEnabled(true);
        bt_diagramaDeclaracionVariable.setEnabled(true);
        bt_diagramaImprimir.setEnabled(true);
        bt_diagramaImprimirVariable.setEnabled(true);
        bt_diagramaOperacionVariable.setEnabled(true);
        bt_diagramaMientras.setEnabled(true);
        bt_diagramaFinMientras.setEnabled(true);
        bt_diagramaFinCondicional.setEnabled(true);
        bt_leaDiagramaFlujo.setEnabled(true);
        bt_DiagramaCondicional.setEnabled(true);
        menuItem_guardar.setEnabled(true);
        menuItem_eliminar.setEnabled(true);
        menuItem_imprimir.setEnabled(true);
        menuItem_jpg.setEnabled(true);
        menuItem_pdf.setEnabled(true);
        jd_EleccionDiagramaNuevo.setVisible(false);
        nombreFlujo = JOptionPane.showInputDialog("Ingrese el nombre de la clase para el diagrama de flujo");
        JOptionPane.showMessageDialog(this, "Se han habilitado los botones del Diagrama de Flujo");
    }//GEN-LAST:event_bt_eleccionDiagramaFlujoActionPerformed

    // boton para habilitar los botones del diagrama de clase
    private void bt_eleccionDiagramaUMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eleccionDiagramaUMLActionPerformed
        // TODO add your handling code here:+
        bt_diagramaClase.setEnabled(true);
        bt_herencia.setEnabled(true);
        menuItem_guardar.setEnabled(true);
        menuItem_eliminar.setEnabled(true);
        menuItem_imprimir.setEnabled(true);
        menuItem_jpg.setEnabled(true);
        menuItem_pdf.setEnabled(true);
        jd_EleccionDiagramaNuevo.setVisible(false);
        nombreClase = JOptionPane.showInputDialog("Ingrese el nombre del paquete ");
        JOptionPane.showMessageDialog(this, "Se han habilitado los botones del Diagrama de Clases");
    }//GEN-LAST:event_bt_eleccionDiagramaUMLActionPerformed

    //Boton para cambiar el color de la figura
    private void bt_colorFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_colorFiguraActionPerformed
        // TODO add your handling code here
        bt_colorFigura.setBackground(JColorChooser.showDialog(this, "Seleccione una color para la figura", Color.BLUE));
        color = bt_colorFigura.getBackground();
        for (JPanel diagrama : diagramasFlujo) {
            if ((diagrama instanceof Inicio) && ((Inicio)diagrama).isSeleccion()) {
                ((Inicio)diagrama).setColor(color);
                ((Inicio)diagrama).setSeleccion(false);
                ((Inicio)diagrama).updateUI();
                break;
            }else if ((diagrama instanceof Final) && ((Final)diagrama).isSeleccion()) {
                ((Final)diagrama).setColor(color);
                ((Final)diagrama).setSeleccion(false);
                ((Final)diagrama).updateUI();
                break;
            }else if ((diagrama instanceof FinMientras) && ((FinMientras)diagrama).isSeleccion()) {
                ((FinMientras)diagrama).setColor(color);
                ((FinMientras)diagrama).setSeleccion(false);
                ((FinMientras)diagrama).updateUI();
                break;
            }else if ((diagrama instanceof FinCondicional) && ((FinCondicional)diagrama).isSeleccion()) {
                ((FinCondicional)diagrama).setColor(color);
                ((FinCondicional)diagrama).setSeleccion(false);
                ((FinCondicional)diagrama).updateUI();
                break;
            }else if ((diagrama instanceof AsignacionVariable) && ((AsignacionVariable)diagrama).isSeleccion()) {
                ((AsignacionVariable)diagrama).setBackground(color);
                ((AsignacionVariable)diagrama).setSeleccion(false);
                break;
            }else if ((diagrama instanceof Condicional) && (((Condicional)diagrama).isSeleccion())) {
                ((Condicional)diagrama).setBackground(color);
                ((Condicional)diagrama).setSeleccion(false);
                break;
            }else if ((diagrama instanceof DeclaracionVariable) && (((DeclaracionVariable)diagrama).isSeleccion())) {
                ((DeclaracionVariable)diagrama).setBackground(color);
                ((DeclaracionVariable)diagrama).setSeleccion(false);
                break;
            }else if ((diagrama instanceof ImpresionConVariable) && (((ImpresionConVariable)diagrama).isSeleccion())) {
                ((ImpresionConVariable)diagrama).setBackground(color);
                ((ImpresionConVariable)diagrama).setSeleccion(true);
                break;
            }else if ((diagrama instanceof Imprimir) && (((Imprimir)diagrama).isSeleccion())) {
                ((Imprimir)diagrama).setBackground(color);
                ((Imprimir)diagrama).setSeleccion(false);
                break;
            }else if ((diagrama instanceof Mientras) && (((Mientras)diagrama).isSeleccion())) {
                ((Mientras)diagrama).setBackground(color);
                ((Mientras)diagrama).setSeleccion(false);
                break;
            }else if ((diagrama instanceof OperacionVariables) && (((OperacionVariables)diagrama).isSeleccion())) {
                ((OperacionVariables)diagrama).setBackground(color);
                ((OperacionVariables)diagrama).setSeleccion(false);
                break;
            }
        }
        for (DiagramaClase diagrama : diagramaClase) {
            if (diagrama.isSeleccion()) {
                diagrama.setBackground(color);
                diagrama.setSeleccion(false);
                break;
            }
        }        
    }//GEN-LAST:event_bt_colorFiguraActionPerformed

    //Boton para agregar diagrama de mientras al panel
    private void bt_diagramaMientrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_diagramaMientrasMouseClicked
        // TODO add your handling code here:
        if (bt_diagramaMientras.isEnabled()) {
            Mientras mientras = new Mientras();
            pn_diagramas.add(mientras);
            diagramasFlujo.add(mientras);
            mientras.setBounds(0, 0, mientras.getAnchura(), mientras.getAltura());
            pn_diagramas.updateUI();
        }else {
            JOptionPane.showMessageDialog(this, "El boton esta inhabilitado.");
        }        
    }//GEN-LAST:event_bt_diagramaMientrasMouseClicked

    //Boton para agregar un diagrama de fin mientras al panel
    private void bt_diagramaFinMientrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_diagramaFinMientrasMouseClicked
        // TODO add your handling code here:
        if (bt_diagramaFinMientras.isEnabled()) {
            FinMientras finMientras = new FinMientras();
            diagramasFlujo.add(finMientras);
            pn_diagramas.add(finMientras);
            finMientras.setBounds(80, 0, finMientras.getAnchura(), finMientras.getAltura());
            pn_diagramas.updateUI();
        }else {
            JOptionPane.showMessageDialog(this, "El boton esta inhabilitado.");
        }        
    }//GEN-LAST:event_bt_diagramaFinMientrasMouseClicked

    //Boton para agregar un diagrama condicional al panel
    private void bt_DiagramaCondicionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_DiagramaCondicionalMouseClicked
        // TODO add your handling code here:
        if (bt_DiagramaCondicional.isEnabled()) {
            Condicional condicional = new Condicional();
            diagramasFlujo.add(condicional);
            pn_diagramas.add(condicional);
            condicional.setBounds(50, 50, condicional.getAnchura(), condicional.getAltura());
            pn_diagramas.updateUI();
        }else{
            JOptionPane.showMessageDialog(this, "El boton esta inhabilitado.");
        }        
    }//GEN-LAST:event_bt_DiagramaCondicionalMouseClicked

    //Boton para agregar un diagrama de fin condicional al panel
    private void bt_diagramaFinCondicionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_diagramaFinCondicionalMouseClicked
        // TODO add your handling code here:
        if (bt_diagramaFinCondicional.isEnabled()) {
            FinCondicional finCondicional = new FinCondicional();
            diagramasFlujo.add(finCondicional);
            pn_diagramas.add(finCondicional);
            finCondicional.setBounds(50, 50, finCondicional.getAnchura(), finCondicional.getAltura());
            pn_diagramas.updateUI();
        }else{
            JOptionPane.showMessageDialog(this, "El boton esta inhabilitado.");
        }        
    }//GEN-LAST:event_bt_diagramaFinCondicionalMouseClicked

    //Boton para eliminar el diagrama del pandel de diagramas 
    private void bt_eliminarFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarFiguraActionPerformed
        // TODO add your handling code here:
        for (JPanel diagrama : diagramasFlujo) {
            if ((diagrama instanceof Inicio) && (((Inicio)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((Inicio)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((Inicio)diagrama));
                pn_diagramas.updateUI();
                contadorInicio = 0;
                break;
            }else if ((diagrama instanceof Final) && (((Final)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((Final)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((Final)diagrama));
                pn_diagramas.updateUI();
                contadorFinal = 0;
                break;
            }else if ((diagrama instanceof FinMientras) && (((FinMientras)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((FinMientras)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((FinMientras)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof FinCondicional) && (((FinCondicional)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((FinCondicional)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((FinCondicional)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof AsignacionVariable) && (((AsignacionVariable)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha elimiando el diagrama de " + ((AsignacionVariable)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((AsignacionVariable)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof Condicional) && ((Condicional)diagrama).isSeleccion()){
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((Condicional)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((Condicional)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof DeclaracionVariable) && ((DeclaracionVariable)diagrama).isSeleccion()) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((DeclaracionVariable)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((DeclaracionVariable)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof ImpresionConVariable) && ((ImpresionConVariable)diagrama).isSeleccion()) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((ImpresionConVariable)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((ImpresionConVariable)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof Imprimir) && (((Imprimir)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((Imprimir)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((Imprimir)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof Mientras) && (((Mientras)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((Mientras)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((Mientras)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof OperacionVariables) && (((OperacionVariables)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((OperacionVariables)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((OperacionVariables)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if (diagrama instanceof Lea && ((Lea)diagrama).isSeleccion()) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((Lea)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((Lea)diagrama));
                pn_diagramas.updateUI();
            }
        }
        for (DiagramaClase diagrama : diagramaClase) {
            if (diagrama.isSeleccion()) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + diagrama.getNombre());
                diagramaClase.remove(diagrama);
                pn_diagramas.remove(diagrama);
                pn_diagramas.updateUI();
                break;
            }
        }
    }//GEN-LAST:event_bt_eliminarFiguraActionPerformed
    
    //Cambio de fuente de texto en las casillas de textos de los diagramas
    private void cb_fuentesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_fuentesItemStateChanged
        // TODO add your handling code here:
        String fuente = cb_fuentes.getSelectedItem().toString();        
        for (JPanel diagrama : diagramasFlujo) {
            if ((diagrama instanceof AsignacionVariable) && ((AsignacionVariable)diagrama).isSeleccionTexto()) {                
                for (int i = 0; i < ((AsignacionVariable)diagrama).getTextos().size(); i++) {
                    Font f = ((AsignacionVariable)diagrama).getTextos().get(i).getFont();
                    ((AsignacionVariable)diagrama).getTextos().get(i).setFont(new Font(fuente,f.getStyle(),f.getSize()));
                }
                ((AsignacionVariable)diagrama).setSeleccionTexto(false);
                break;
            }else if ((diagrama instanceof Condicional) && ((Condicional)diagrama).isSeleccionTexto()) {
                Font f = ((Condicional)diagrama).getTf_condicional().getFont();
                ((Condicional)diagrama).getTf_condicional().setFont(new Font(fuente,f.getStyle(),f.getSize()));
                ((Condicional)diagrama).setSeleccionTexto(false);
                break;
            }else if ((diagrama instanceof DeclaracionVariable) && ((DeclaracionVariable)diagrama).isSeleccionTexto()) {
                Font f = ((DeclaracionVariable)diagrama).getTf_variables().getFont();
                ((DeclaracionVariable)diagrama).getTf_variables().setFont(new Font(fuente,f.getStyle(),f.getSize()));
                ((DeclaracionVariable)diagrama).setSeleccionTexto(false);
                break;
            }else if ((diagrama instanceof ImpresionConVariable) && ((ImpresionConVariable)diagrama).isSeleccionImprimir() && 
                    ((ImpresionConVariable)diagrama).isSeleccionVariable()) {
                Font f = ((ImpresionConVariable)diagrama).getTf_texto_impresion().getFont();
                Font f2 = ((ImpresionConVariable)diagrama).getTf_variable().getFont();
                ((ImpresionConVariable)diagrama).getTf_texto_impresion().setFont(new Font(fuente,f.getStyle(),f.getSize()));
                ((ImpresionConVariable)diagrama).getTf_variable().setFont(new Font(fuente,f2.getStyle(),f2.getSize()));
                ((ImpresionConVariable)diagrama).setSeleccionVariable(false);
                ((ImpresionConVariable)diagrama).setSeleccionImprimir(false);
                break;
            }else if ((diagrama instanceof Imprimir) && ((Imprimir)diagrama).isSeleccionImprimir()) {
                Font f = ((Imprimir)diagrama).getTf_texto_impresion().getFont();
                ((Imprimir)diagrama).getTf_texto_impresion().setFont(new Font(fuente,f.getStyle(),f.getSize()));
                ((Imprimir)diagrama).setSeleccionImprimir(false);
                break;
            }else if ((diagrama instanceof Mientras) && ((Mientras)diagrama).isSeleccionTexto()) {
                Font f = ((Mientras)diagrama).getTf_mientras().getFont();
                ((Mientras)diagrama).getTf_mientras().setFont(new Font(fuente,f.getStyle(),f.getSize()));
                ((Mientras)diagrama).setSeleccionTexto(false);
                break;
            }else if ((diagrama instanceof OperacionVariables) && ((OperacionVariables)diagrama).isSeleccionTexto()) {
                Font f = ((OperacionVariables)diagrama).getTf_operacion().getFont();
                ((OperacionVariables)diagrama).getTf_operacion().setFont(new Font(fuente,f.getStyle(),f.getSize()));
                ((OperacionVariables)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof Lea && ((Lea)diagrama).isSeleccionTexto()) {
                Font f = ((Lea)diagrama).getTf_lea().getFont();
                ((Lea)diagrama).getTf_lea().setFont(new Font(fuente,f.getStyle(),f.getSize()));
                ((Lea)diagrama).setSeleccionTexto(false);
                break;
            }
        }
        for (DiagramaClase diagrama : diagramaClase) {
            if (diagrama.isSeleccionAtributo()) {
                for (int i = 0; i < diagrama.getAtributos().size(); i++) {
                    Font f = diagrama.getAtributos().get(i).getFont();
                    diagrama.getAtributos().get(i).setFont(new Font(fuente,f.getStyle(),f.getSize()));
                }
                diagrama.setSeleccionAtributo(false);
                break;
            }else if (diagrama.isSeleccionMetodo()) {
                for (int i = 0; i < diagrama.getMetodos().size(); i++) {
                    Font f = diagrama.getMetodos().get(i).getFont();
                    diagrama.getMetodos().get(i).setFont(new Font(fuente,f.getStyle(),f.getSize()));
                }
                diagrama.setSeleccionMetodo(false);
                break;
            }else if (diagrama.isSeleccionNombre()) {
                Font f = diagrama.getTf_nombre_clase().getFont();
                diagrama.getTf_nombre_clase().setFont(new Font(fuente,f.getStyle(),f.getSize()));
                diagrama.setSeleccionNombre(false);
                break;
            }
        }
    }//GEN-LAST:event_cb_fuentesItemStateChanged

    //Cambio de tipo de fuente de texto en las casillas de textos de los diagramas
    private void cb_estilo_fuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_estilo_fuenteItemStateChanged
        // TODO add your handling code here:
        int estilo = cb_estilo_fuente.getSelectedIndex();
        for (JPanel diagrama : diagramasFlujo) {
            if ((diagrama instanceof AsignacionVariable) && ((AsignacionVariable)diagrama).isSeleccionTexto() ) {
                for (int i = 0; i < ((AsignacionVariable)diagrama).getTextos().size(); i++) {
                    Font f = ((AsignacionVariable)diagrama).getTextos().get(i).getFont();
                    ((AsignacionVariable)diagrama).getTextos().get(i).setFont(new Font(f.getFontName(),estilo,f.getSize()));
                }
                ((AsignacionVariable)diagrama).setSeleccionTexto(false);
                break;
            }else if ((diagrama instanceof Condicional) && ((Condicional)diagrama).isSeleccionTexto()) {
                Font f = ((Condicional)diagrama).getTf_condicional().getFont();
                ((Condicional)diagrama).getTf_condicional().setFont(new Font(f.getFontName(),estilo,f.getSize()));
                ((Condicional)diagrama).setSeleccionTexto(false);
                break;
            }else if ((diagrama instanceof DeclaracionVariable) && ((DeclaracionVariable)diagrama).isSeleccionTexto()) {
                Font f = ((DeclaracionVariable)diagrama).getTf_variables().getFont();
                ((DeclaracionVariable)diagrama).getTf_variables().setFont(new Font(f.getFontName(),estilo,f.getSize()));
                ((DeclaracionVariable)diagrama).setSeleccionTexto(false);
                break;
            }else if ((diagrama instanceof ImpresionConVariable) && ((ImpresionConVariable)diagrama).isSeleccionImprimir() && 
                    ((ImpresionConVariable)diagrama).isSeleccionVariable()) {
                Font f = ((ImpresionConVariable)diagrama).getTf_texto_impresion().getFont();
                Font f2 = ((ImpresionConVariable)diagrama).getTf_variable().getFont();
                ((ImpresionConVariable)diagrama).getTf_texto_impresion().setFont(new Font(f.getFontName(),estilo,f.getSize()));
                ((ImpresionConVariable)diagrama).getTf_variable().setFont(new Font(f2.getFontName(),estilo,f2.getSize()));
                ((ImpresionConVariable)diagrama).setSeleccionImprimir(false);
                ((ImpresionConVariable)diagrama).setSeleccionVariable(false);
                break;
            }else if ((diagrama instanceof Imprimir) && ((Imprimir)diagrama).isSeleccionImprimir()) {
                Font f = ((Imprimir)diagrama).getTf_texto_impresion().getFont();
                ((Imprimir)diagrama).getTf_texto_impresion().setFont(new Font(f.getFontName(),estilo,f.getSize()));
                ((Imprimir)diagrama).setSeleccionImprimir(false);
                break;
            }else if ((diagrama instanceof Mientras) && ((Mientras)diagrama).isSeleccionTexto()) {
                Font f = ((Mientras)diagrama).getTf_mientras().getFont();
                ((Mientras)diagrama).getTf_mientras().setFont(new Font(f.getFontName(),estilo,f.getSize()));
                ((Mientras)diagrama).setSeleccionTexto(false);
                break;
            }else if ((diagrama instanceof OperacionVariables) && ((OperacionVariables)diagrama).isSeleccionTexto()) {
                Font f = ((OperacionVariables)diagrama).getTf_operacion().getFont();
                ((OperacionVariables)diagrama).getTf_operacion().setFont(new Font(f.getFontName(),estilo,f.getSize()));
                ((OperacionVariables)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof Lea && ((Lea)diagrama).isSeleccionTexto()) {
                Font f = ((Lea)diagrama).getTf_lea().getFont();
                ((Lea)diagrama).getTf_lea().setFont(new Font(f.getFontName(),estilo,f.getSize()));
                ((Lea)diagrama).setSeleccionTexto(false);
                break;
            }
        }
        for (DiagramaClase diagrama : diagramaClase) {
            if (diagrama.isSeleccionAtributo()) {
                for (int i = 0; i < diagrama.getAtributos().size(); i++) {
                    Font f = diagrama.getAtributos().get(i).getFont();
                    diagrama.getAtributos().get(i).setFont(new Font(f.getFontName(),estilo,f.getSize()));
                }
                diagrama.setSeleccionAtributo(false);
                break;
            }else if (diagrama.isSeleccionMetodo()) {
                for (int i = 0; i < diagrama.getMetodos().size(); i++) {
                    Font f = diagrama.getMetodos().get(i).getFont();
                    diagrama.getMetodos().get(i).setFont(new Font(f.getFontName(),estilo,f.getSize()));
                }
                diagrama.setSeleccionMetodo(false);
                break;
            }else if (diagrama.isSeleccionNombre()) {
                Font f = diagrama.getTf_nombre_clase().getFont();
                diagrama.getTf_nombre_clase().setFont(new Font(f.getFontName(),estilo,f.getSize()));
                break;
            }
        }
    }//GEN-LAST:event_cb_estilo_fuenteItemStateChanged

    //Cambio de tamaño de texto en las casillas de textos de los diagramas
    private void cb_tamañoTextoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_tamañoTextoItemStateChanged
        // TODO add your handling code here:
        int tamaño = Integer.parseInt(cb_tamañoTexto.getSelectedItem().toString());
        for (JPanel diagrama : diagramasFlujo) {
            if ((diagrama instanceof AsignacionVariable) && ((AsignacionVariable)diagrama).isSeleccionTexto()) {
                for (int i = 0; i < ((AsignacionVariable)diagrama).getTextos().size(); i++) {
                    Font f = ((AsignacionVariable)diagrama).getTextos().get(i).getFont();
                    ((AsignacionVariable)diagrama).getTextos().get(i).setFont(new Font(f.getFontName(),f.getStyle(),tamaño));
                }
                ((AsignacionVariable)diagrama).setSeleccionTexto(false);
                break;
            }else if ((diagrama instanceof Condicional) && ((Condicional)diagrama).isSeleccionTexto()) {
                Font f = ((Condicional)diagrama).getTf_condicional().getFont();
                ((Condicional)diagrama).getTf_condicional().setFont(new Font(f.getFontName(),f.getStyle(),tamaño));
                ((Condicional)diagrama).setSeleccionTexto(false);
                break;
            }else if ((diagrama instanceof DeclaracionVariable) && ((DeclaracionVariable)diagrama).isSeleccionTexto()) {
                Font f = ((DeclaracionVariable)diagrama).getFont();
                ((DeclaracionVariable)diagrama).getTf_variables().setFont(new Font(f.getFontName(),f.getStyle(),tamaño));
                ((DeclaracionVariable)diagrama).setSeleccionTexto(false);
                break;
            }else if ((diagrama instanceof ImpresionConVariable) && ((DeclaracionVariable)diagrama).isSeleccionTexto()) {
                Font f = ((ImpresionConVariable)diagrama).getTf_texto_impresion().getFont();
                Font f2 = ((ImpresionConVariable)diagrama).getTf_variable().getFont();
                ((ImpresionConVariable)diagrama).getTf_texto_impresion().setFont(new Font(f.getFontName(),f.getStyle(),tamaño));
                ((ImpresionConVariable)diagrama).getTf_variable().setFont(new Font(f2.getFontName(),f2.getStyle(),tamaño));
                ((ImpresionConVariable)diagrama).setSeleccionImprimir(false);
                ((ImpresionConVariable)diagrama).setSeleccionVariable(false);
                break;
            }else if ((diagrama instanceof Imprimir) && ((Imprimir)diagrama).isSeleccionImprimir()) {
                Font f = ((Imprimir)diagrama).getTf_texto_impresion().getFont();
                ((Imprimir)diagrama).getTf_texto_impresion().setFont(new Font(f.getFontName(),f.getStyle(),tamaño));
                ((Imprimir)diagrama).setSeleccionImprimir(false);
                break;
            }else if ((diagrama instanceof Mientras) && ((Mientras)diagrama).isSeleccionTexto()) {
                Font f = ((Mientras)diagrama).getTf_mientras().getFont();
                ((Mientras)diagrama).getTf_mientras().setFont(new Font(f.getFontName(),f.getStyle(),tamaño));
                ((Mientras)diagrama).setSeleccionTexto(false);
                break;
            }else if ((diagrama instanceof OperacionVariables) && ((OperacionVariables)diagrama).isSeleccionTexto()) {
                Font f = ((OperacionVariables)diagrama).getTf_operacion().getFont();
                ((OperacionVariables)diagrama).getTf_operacion().setFont(new Font(f.getFontName(),f.getStyle(),tamaño));
                ((OperacionVariables)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof Lea && ((Lea)diagrama).isSeleccionTexto()) {
                Font f = ((Lea)diagrama).getTf_lea().getFont();
                ((Lea)diagrama).getTf_lea().setFont(new Font(f.getFontName(),f.getStyle(),tamaño));
                ((Lea)diagrama).setSeleccionTexto(false);
                break;
            }
        }
        for (DiagramaClase diagrama : diagramaClase) {
            if (diagrama.isSeleccionAtributo()) {
                for (int i = 0; i < diagrama.getAtributos().size(); i++) {
                    Font f = diagrama.getAtributos().get(i).getFont();
                    diagrama.getAtributos().get(i).setFont(new Font(f.getFontName(),f.getStyle(),tamaño));
                }
                diagrama.setSeleccionAtributo(false);
                break;
            }else if (diagrama.isSeleccionMetodo()) {
                for (int i = 0; i < diagrama.getMetodos().size(); i++) {
                    Font f = diagrama.getMetodos().get(i).getFont();
                    diagrama.getMetodos().get(i).setFont(new Font(f.getFontName(),f.getStyle(),tamaño));
                }
                diagrama.setSeleccionMetodo(false);
                break;
            }else if (diagrama.isSeleccionNombre()) {
                Font f = diagrama.getTf_nombre_clase().getFont();
                diagrama.getTf_nombre_clase().setFont(new Font(f.getFontName(),f.getStyle(),tamaño));
                diagrama.setSeleccionNombre(false);
                break;
            }
        }
    }//GEN-LAST:event_cb_tamañoTextoItemStateChanged

    //Cambio de color de las letras de las casillas de textos de los diagramas
    private void bt_colorTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_colorTextoActionPerformed
        // TODO add your handling code here:
        Color color = JColorChooser.showDialog(this, "Seleccione un color", Color.yellow);
        for (JPanel diagrama : diagramasFlujo) {
            if ((diagrama instanceof AsignacionVariable) && ((AsignacionVariable)diagrama).isSeleccionTexto()) {
                for (int i = 0; i < ((AsignacionVariable)diagrama).getTextos().size(); i++) {
                    ((AsignacionVariable)diagrama).getTextos().get(i).setForeground(color);
                }
                ((AsignacionVariable)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof Condicional && ((Condicional)diagrama).isSeleccionTexto()) {
                ((Condicional)diagrama).getTf_condicional().setForeground(color);
                ((Condicional)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof DeclaracionVariable && ((DeclaracionVariable)diagrama).isSeleccionTexto()) {
                ((DeclaracionVariable)diagrama).getTf_variables().setForeground(color);
                ((DeclaracionVariable)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof ImpresionConVariable && ((ImpresionConVariable)diagrama).isSeleccionImprimir() && 
                    ((ImpresionConVariable)diagrama).isSeleccionVariable()) {
                ((ImpresionConVariable)diagrama).getTf_texto_impresion().setForeground(color);
                ((ImpresionConVariable)diagrama).getTf_variable().setForeground(color);
                ((ImpresionConVariable)diagrama).setSeleccionImprimir(false);
                ((ImpresionConVariable)diagrama).setSeleccionVariable(false);
                break;
            }else if (diagrama instanceof Imprimir && ((Imprimir)diagrama).isSeleccionImprimir()) {
                ((Imprimir)diagrama).getTf_texto_impresion().setForeground(color);
                ((Imprimir)diagrama).setSeleccionImprimir(false);
                break;
            }else if (diagrama instanceof Mientras && ((Mientras)diagrama).isSeleccionTexto()) {
                ((Mientras)diagrama).getTf_mientras().setForeground(color);
                ((Mientras)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof OperacionVariables && ((OperacionVariables)diagrama).isSeleccionTexto()) {
                ((OperacionVariables)diagrama).getTf_operacion().setForeground(color);
                ((OperacionVariables)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof Lea && ((Lea)diagrama).isSeleccionTexto()) {
                ((Lea)diagrama).getTf_lea().setForeground(color);
                ((Lea)diagrama).setSeleccionTexto(false);
                break;
            }
        }
        for (DiagramaClase diagrama : diagramaClase) {
            if (diagrama.isSeleccionAtributo()) {
                for (int i = 0; i < diagrama.getAtributos().size(); i++) {
                    diagrama.getAtributos().get(i).setForeground(color);
                }
                diagrama.setSeleccionAtributo(false);
                break;
            }else if (diagrama.isSeleccionMetodo()) {
                for (int i = 0; i < diagrama.getMetodos().size(); i++) {
                    diagrama.getMetodos().get(i).setForeground(color);
                }
                diagrama.setSeleccionMetodo(false);
                break;
            }else if (diagrama.isSeleccionNombre()) {
                diagrama.getTf_nombre_clase().setForeground(color);
                diagrama.setSeleccionNombre(false);
                break;
            }
        }
    }//GEN-LAST:event_bt_colorTextoActionPerformed

    //Boton para agregar un diagrama de lea al panel de diagramas
    private void bt_leaDiagramaFlujoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_leaDiagramaFlujoActionPerformed
        // TODO add your handling code here:
        if (bt_leaDiagramaFlujo.isEnabled()) {
            Lea l = new Lea();
            diagramasFlujo.add(l);
            pn_diagramas.add(l);
            l.setBounds(50, 50, l.getAnchura(), l.getAltura());
            pn_diagramas.updateUI();
        }else {
            JOptionPane.showMessageDialog(this, "El boton esta inhabilitado.");
        }        
    }//GEN-LAST:event_bt_leaDiagramaFlujoActionPerformed

    //Boton para hacer codigo de diagrama de flujo
    private void bt_hacerCodigoFlujoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hacerCodigoFlujoActionPerformed
        // TODO add your handling code here:
        ta_codigos.setText("");
        CodigosDiagramaFlujo codigo = new CodigosDiagramaFlujo(nombreFlujo);
        ArrayList<DeclaracionVariable> declaracion = new ArrayList();
        String codigos = "";
        for (JPanel  diagrama : diagramasFlujo) {
            if (diagrama instanceof Inicio) {
                codigos += codigo.Inicio(((Inicio)diagrama));
            }else if (diagrama instanceof Final) {
                codigos += codigo.Fin(((Final)diagrama));
            }else if (diagrama instanceof AsignacionVariable) {
                codigos += codigo.Asignacion(((AsignacionVariable)diagrama));
            }else if (diagrama instanceof DeclaracionVariable) {
                codigos += codigo.Declaracion(((DeclaracionVariable)diagrama));
                declaracion.add(((DeclaracionVariable)diagrama));
            }else if (diagrama instanceof FinCondicional) {
                codigos += codigo.FinCondicinal(((FinCondicional)diagrama));
            }else if (diagrama instanceof FinMientras) {
                codigos += codigo.FinMientras(((FinMientras)diagrama));
            }else if (diagrama instanceof ImpresionConVariable) {
                codigos += codigo.ImpresionVariable(((ImpresionConVariable)diagrama));
            }else if (diagrama instanceof Imprimir) {
                codigos += codigo.Impimir(((Imprimir)diagrama));
            }else if (diagrama instanceof Lea) {
                codigos += codigo.Lea(((Lea)diagrama), declaracion);
            }else if (diagrama instanceof Mientras) {
                codigos += codigo.mientras(((Mientras)diagrama));
            }else if (diagrama instanceof OperacionVariables) {
                codigos += codigo.Operacion(((OperacionVariables)diagrama));
            }else if (diagrama instanceof Condicional) {
                codigos += codigo.Condicional(((Condicional)diagrama));
            }
        }
        ta_codigos.setText(codigos);
        JOptionPane.showMessageDialog(this, "Se ha generado el codigo del diagrama de flujo");
    }//GEN-LAST:event_bt_hacerCodigoFlujoActionPerformed

    //Boton para copiar el texto de un componente
    private void bt_copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_copiarActionPerformed
        // TODO add your handling code here:
        for (JPanel diagrama : diagramasFlujo) {
            if (diagrama instanceof AsignacionVariable && ((AsignacionVariable)diagrama).isSeleccionTexto()) {
                JOptionPane.showMessageDialog(this, "No se puede copiar el contenido del texto del diagrama de asignacion de variable");
                ((AsignacionVariable)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof Condicional && ((Condicional)diagrama).isSeleccionTexto()) {
                copia = ((Condicional)diagrama).getTf_condicional().getSelectedText();
                ((Condicional)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof DeclaracionVariable && ((DeclaracionVariable)diagrama).isSeleccionTexto()) {
                copia = ((DeclaracionVariable)diagrama).getTf_variables().getSelectedText();
                ((DeclaracionVariable)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof ImpresionConVariable && ((ImpresionConVariable)diagrama).isSeleccionImprimir()) {
                copia = ((ImpresionConVariable)diagrama).getTf_texto_impresion().getSelectedText();
                ((ImpresionConVariable)diagrama).setSeleccionImprimir(false);
                break;
            }else if (diagrama instanceof ImpresionConVariable && ((ImpresionConVariable)diagrama).isSeleccionVariable()) {
                copia = ((ImpresionConVariable)diagrama).getTf_variable().getSelectedText();
                ((ImpresionConVariable)diagrama).setSeleccionVariable(false);
                break;
            }else if (diagrama instanceof Imprimir && ((Imprimir)diagrama).isSeleccionImprimir()) {
                copia = ((Imprimir)diagrama).getTf_texto_impresion().getSelectedText();
                ((Imprimir)diagrama).setSeleccionImprimir(false);
                break;
            }else if (diagrama instanceof Lea && ((Lea)diagrama).isSeleccionTexto()) {
                copia = ((Lea)diagrama).getTf_lea().getSelectedText();
                ((Lea)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof Mientras && ((Mientras)diagrama).isSeleccionTexto()) {
                copia = ((Mientras)diagrama).getTf_mientras().getSelectedText();
                ((Mientras)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof OperacionVariables && ((OperacionVariables)diagrama).isSeleccionTexto()) {
                copia = ((OperacionVariables)diagrama).getTf_operacion().getSelectedText();
                ((OperacionVariables)diagrama).setSeleccionTexto(false);
                break;
            }
        }
        for (DiagramaClase diagrama : diagramaClase) {
            if (diagrama.isSeleccionAtributo()) {
                JOptionPane.showMessageDialog(this, "No se puede copiar el contenido de las casillas de atributos de esta clase");
                diagrama.setSeleccionAtributo(false);
                break;
            }else if (diagrama.isSeleccionMetodo()) {
                JOptionPane.showMessageDialog(this, "No se puede copiar el contenido de las casillas de metodos de esta clase");
                diagrama.setSeleccionMetodo(false);
                break;
            }else if (diagrama.isSeleccionNombre()) {
                copia = diagrama.getTf_nombre_clase().getSelectedText();
                diagrama.setSeleccionNombre(false);
                break;
            }
        }
    }//GEN-LAST:event_bt_copiarActionPerformed

    
    //Boton para realizar las lineas de los diagramas de flujo
    private void bt_lineasDflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lineasDflActionPerformed
        // TODO add your handling code here:
        Graphics g = pn_diagramas.getGraphics();
        for (int i = 0; i < diagramasFlujo.size(); i++) {
            if (i>=1) {
                g.drawLine(diagramasFlujo.get(i-1).getX(), diagramasFlujo.get(i-1).getY(), 
                        diagramasFlujo.get(i).getX(), diagramasFlujo.get(i).getY());
            }
        }
        for (JPanel diagrama : diagramasFlujo) {
            if (diagrama instanceof Inicio) {
                ((Inicio)diagrama).setMover(false);
            }else if (diagrama instanceof Final) {
                ((Final)diagrama).setMover(false);
            }else if (diagrama instanceof AsignacionVariable) {
                ((AsignacionVariable)diagrama).setMover(false);
            }else if (diagrama instanceof Condicional) {
                ((Condicional)diagrama).setMover(false);
            }else if (diagrama instanceof FinCondicional) {
                ((FinCondicional)diagrama).setMover(false);
            }else if (diagrama instanceof FinMientras) {
                ((FinMientras)diagrama).setMover(false);
            }else if (diagrama instanceof DeclaracionVariable) {
                ((DeclaracionVariable)diagrama).setMover(false);
            }else if (diagrama instanceof ImpresionConVariable) {
                ((ImpresionConVariable)diagrama).setMover(false);
            }else if (diagrama instanceof Imprimir) {
                ((Imprimir)diagrama).setMover(false);
            }else if (diagrama instanceof Lea) {
                ((Lea)diagrama).setMover(false);
            }else if (diagrama instanceof Mientras) {
                ((Mientras)diagrama).setMover(false);
            }else if (diagrama instanceof OperacionVariables) {
                ((OperacionVariables)diagrama).setMover(false);
            }
        }
        JOptionPane.showMessageDialog(this, "Se han creado las lineas. Por consecuencia de esto no se podran mover los diagramas");
    }//GEN-LAST:event_bt_lineasDflActionPerformed

    //Boton para pegar el texto de un componente
    private void bt_pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pegarActionPerformed
        // TODO add your handling code here:
        for (JPanel diagrama : diagramasFlujo) {
            if (diagrama instanceof Condicional && ((Condicional)diagrama).isSeleccionTexto()) {
                ((Condicional)diagrama).getTf_condicional().setText(((Condicional)diagrama).getTf_condicional().getText() + 
                        copia);
                ((Condicional)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof DeclaracionVariable && ((DeclaracionVariable)diagrama).isSeleccionTexto()) {
                ((DeclaracionVariable)diagrama).getTf_variables().setText(((DeclaracionVariable)diagrama).getTexto() + copia);
                ((DeclaracionVariable)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof ImpresionConVariable && ((ImpresionConVariable)diagrama).isSeleccionImprimir()) {
                ((ImpresionConVariable)diagrama).getTf_texto_impresion().setText(((ImpresionConVariable)diagrama).getTextoImpresion() + copia);
                ((ImpresionConVariable)diagrama).setSeleccionImprimir(false);
                break;
            }else if (diagrama instanceof ImpresionConVariable && ((ImpresionConVariable)diagrama).isSeleccionVariable()) {
                ((ImpresionConVariable)diagrama).getTf_variable().setText(((ImpresionConVariable)diagrama).getTexttoVariable() + copia);
                ((ImpresionConVariable)diagrama).setSeleccionVariable(false);
                break;
            }else if (diagrama instanceof Imprimir && ((Imprimir)diagrama).isSeleccionImprimir()) {
                ((Imprimir)diagrama).getTf_texto_impresion().setText(((Imprimir)diagrama).getTexto() + copia);
                ((Imprimir)diagrama).setSeleccionImprimir(false);
                break;
            }else if (diagrama instanceof Mientras && ((Mientras)diagrama).isSeleccionTexto()) {
                ((Mientras)diagrama).getTf_mientras().setText(((Mientras)diagrama).getTexto() + copia);
                ((Mientras)diagrama).setSeleccionTexto(false);
                break;
            }else if (diagrama instanceof OperacionVariables && ((OperacionVariables)diagrama).isSeleccionTexto()) {
                ((OperacionVariables)diagrama).getTf_operacion().setText(((OperacionVariables)diagrama).getTexto() + copia);
                ((OperacionVariables)diagrama).setSeleccionTexto(false);
                break;
            }
        }
        for (DiagramaClase diagrama : diagramaClase) {
            if (diagrama.isSeleccionNombre()) {
                diagrama.getTf_nombre_clase().setText(diagrama.getNombre() + copia);
                diagrama.setSeleccionNombre(false);
                break;
            }
        }
    }//GEN-LAST:event_bt_pegarActionPerformed

    //Boton para hacer codigo del diagrama de UML   
    private void bt_codigoUMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_codigoUMLActionPerformed
        // TODO add your handling code here:
        ta_codigos.setText("");
        CodigosDiagramasClases codigo = new CodigosDiagramasClases(nombreClase);
        String cadena = codigo.inicio();
        for (DiagramaClase diagrama : diagramaClase) {
            if (diagrama.isHerencia()) {
                cadena += codigo.CodigoHerenciaClase(diagrama);
            }else{
                cadena += codigo.CodigoClase(diagrama);
            }
        }
        ta_codigos.setText(cadena);
        JOptionPane.showMessageDialog(this, "Se ha generado el codigo de los diagramas de UML.");
    }//GEN-LAST:event_bt_codigoUMLActionPerformed

    //Menu items de guardar el pograma
    private void jMenuItemGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarComoActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        int seleccion = jfc.showSaveDialog(this);
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        ArrayList<AdmDiagramaClase> dc = new ArrayList();
        ArrayList<AdmDiagramaFlujo> df = new ArrayList();
        if (diagramaClase.size()>0) {
            for (DiagramaClase diagrama : diagramaClase) {
                AdmDiagramaClase ad = new AdmDiagramaClase(nombreClase, diagrama.getNombre(), diagrama.getX(), diagrama.getY());
                for (int i = 0; i < diagrama.getAtributos().size(); i++) {
                    ad.setAtributo(diagrama.getAtributos().get(i).getText());
                }
                for (int i = 0; i < diagrama.getMetodos().size(); i++) {
                    ad.setAtributo(diagrama.getMetodos().get(i).getText());
                }
                dc.add(ad);
            }
            if (seleccion == JFileChooser.APPROVE_OPTION) {            
                try {
                    archivo = jfc.getSelectedFile();
                    fw = new FileOutputStream(archivo+".uml");
                    bw = new ObjectOutputStream(fw);
                    for (AdmDiagramaClase d : dc) {
                        bw.writeObject(d);
                    }
                    bw.flush();
                } catch (Exception e) {
                }finally {
                    try {
                        fw.close();
                        bw.close();
                    } catch (Exception e) {
                    }
                }
            }
        }else {
            for (JPanel diagrama : diagramasFlujo) {
                if (diagrama instanceof Inicio) {
                    df.add(new AdmDiagramaFlujo(nombreFlujo,((Inicio)diagrama).getNombre(), ((Inicio)diagrama).getX()
                            , ((Inicio)diagrama).getY()));
                }else if (diagrama instanceof AsignacionVariable) {
                    AdmDiagramaFlujo dm = new AdmDiagramaFlujo(nombreFlujo,((AsignacionVariable)diagrama).getNombre(), 
                            ((AsignacionVariable)diagrama).getX(), ((AsignacionVariable)diagrama).getY());
                    for (int i = 0; i < ((AsignacionVariable)diagrama).getTextos().size(); i++) {
                        dm.setCasilla(((AsignacionVariable)diagrama).getTextos().get(i).getText());
                    }
                    df.add(dm);
                }else if (diagrama instanceof Condicional) {
                    df.add(new AdmDiagramaFlujo(nombreFlujo,((Condicional)diagrama).getNombre(), 
                            ((Condicional)diagrama).getX(), ((Condicional)diagrama).getY(), 
                            ((Condicional)diagrama).getTexto()));
                }else if (diagrama instanceof DeclaracionVariable) {
                    df.add(new AdmDiagramaFlujo(nombreFlujo,((DeclaracionVariable)diagrama).getNombre(), 
                            ((DeclaracionVariable)diagrama).getX(), ((DeclaracionVariable)diagrama).getY(), 
                            ((DeclaracionVariable)diagrama).getTexto()));
                }else if (diagrama instanceof FinCondicional) {
                    df.add(new AdmDiagramaFlujo(nombreFlujo,((FinCondicional)diagrama).getNombre(), ((FinCondicional)diagrama).getX(), 
                            ((FinCondicional)diagrama).getY()));
                }else if (diagrama instanceof FinMientras) {
                    df.add(new AdmDiagramaFlujo(nombreFlujo,((FinMientras)diagrama).getNombre(), 
                            ((FinMientras)diagrama).getX(), ((FinMientras)diagrama).getY()));
                }else if (diagrama instanceof Final) {
                    df.add(new AdmDiagramaFlujo(nombreFlujo,((Final)diagrama).getNombre(), ((Final)diagrama).getX(), 
                            ((Final)diagrama).getY()));
                }else if (diagrama instanceof ImpresionConVariable) {
                    AdmDiagramaFlujo dg = new AdmDiagramaFlujo(nombreFlujo,((ImpresionConVariable)diagrama).getNombre(), 
                            ((ImpresionConVariable)diagrama).getX(), ((ImpresionConVariable)diagrama).getY(),
                            ((ImpresionConVariable)diagrama).getTextoImpresion(),((ImpresionConVariable)diagrama).getTexttoVariable());
                    df.add(dg);
                }else if (diagrama instanceof Imprimir) {
                    df.add(new AdmDiagramaFlujo(nombreFlujo,((Imprimir)diagrama).getNombre(), ((Imprimir)diagrama).getX(), 
                            ((Imprimir)diagrama).getY(), ((Imprimir)diagrama).getTexto()));
                }else if (diagrama instanceof Lea) {
                    df.add(new AdmDiagramaFlujo(nombreFlujo,((Lea)diagrama).getNombre(), ((Lea)diagrama).getX(), 
                            ((Lea)diagrama).getY(), ((Lea)diagrama).getTf_lea().getText()));
                }else if (diagrama instanceof Mientras) {
                    df.add(new AdmDiagramaFlujo(nombreFlujo,((Mientras)diagrama).getNombre(), ((Mientras)diagrama).getX(), 
                            ((Mientras)diagrama).getY(), ((Mientras)diagrama).getTexto()));
                }else if (diagrama instanceof OperacionVariables) {
                    df.add(new AdmDiagramaFlujo(nombreFlujo,((OperacionVariables)diagrama).getNombre(), 
                            ((OperacionVariables)diagrama).getX(), ((OperacionVariables)diagrama).getY(), 
                            ((OperacionVariables)diagrama).getTexto()));
                }
            }
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                try {
                    archivo = jfc.getSelectedFile();
                    fw = new FileOutputStream(archivo+".dfl");
                    bw = new ObjectOutputStream(fw);
                    for (AdmDiagramaFlujo diagrama : df) {
                        bw.writeObject(diagrama);
                    }
                    bw.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    try {
                        fw.close();
                        bw.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Se ha guardado el archivo");
    }//GEN-LAST:event_jMenuItemGuardarComoActionPerformed

    //Boton para realizar la herencia de clases
    private void bt_herenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_herenciaActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo1 = (DefaultListModel)jListHerencia1.getModel();
        DefaultListModel modelo2 = (DefaultListModel)jListHerencia2.getModel();
        modelo1.removeAllElements();
        modelo2.removeAllElements();
        for (DiagramaClase diagrama : diagramaClase) {
            modelo1.addElement(diagrama.getNombre());
        }
        for (DiagramaClase diagrama : diagramaClase) {
            modelo2.addElement(diagrama.getNombre());
        }
        jd_herencia_DUML.setModal(true);
        jd_herencia_DUML.pack();
        jd_herencia_DUML.setLocationRelativeTo(this);
        jd_herencia_DUML.setVisible(true);        
    }//GEN-LAST:event_bt_herenciaActionPerformed

    //Boton para cancelar la herencia de los diagramas de UML   
    private void bt_cancelarHerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarHerenciaActionPerformed
        // TODO add your handling code here:
        jd_herencia_DUML.setVisible(false);
    }//GEN-LAST:event_bt_cancelarHerenciaActionPerformed

    //Boton para hacer la herencia 
    private void bt_HerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_HerenciaActionPerformed
        // TODO add your handling code here:
        String clasePadre = jListHerencia1.getSelectedValue();
        String subclase = jListHerencia2.getSelectedValue();
        DiagramaClase superclase = null;
        if (clasePadre.equals(subclase)) {
            JOptionPane.showMessageDialog(this, "Error no se puede hacer la herencia");
            return;
        }
        for (DiagramaClase diagrama : diagramaClase) {
            if (clasePadre.equals(diagrama.getNombre())) {
                superclase = diagrama;
                break;
            }
        }
        for (DiagramaClase diagrama : diagramaClase) {
            if (diagrama.getNombre().equals(subclase)) {
                diagrama.setHerencia(true);
                diagrama.setClasePadre(superclase);
                break;
            }
        }
        jd_herencia_DUML.setVisible(false);
        JOptionPane.showMessageDialog(this, "Se ha hecho la herencia con exito");
    }//GEN-LAST:event_bt_HerenciaActionPerformed

    // menu item de cambiar color
    private void menuItem_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_colorActionPerformed
        // TODO add your handling code here:
        bt_colorFigura.setBackground(JColorChooser.showDialog(this, "Seleccione una color para la figura", Color.BLUE));
        color = bt_colorFigura.getBackground();
        for (JPanel diagrama : diagramasFlujo) {
            if ((diagrama instanceof Inicio) && ((Inicio)diagrama).isSeleccion()) {
                ((Inicio)diagrama).setColor(color);
                ((Inicio)diagrama).setSeleccion(false);
                ((Inicio)diagrama).updateUI();
                break;
            }else if ((diagrama instanceof Final) && ((Final)diagrama).isSeleccion()) {
                ((Final)diagrama).setColor(color);
                ((Final)diagrama).setSeleccion(false);
                ((Final)diagrama).updateUI();
                break;
            }else if ((diagrama instanceof FinMientras) && ((FinMientras)diagrama).isSeleccion()) {
                ((FinMientras)diagrama).setColor(color);
                ((FinMientras)diagrama).setSeleccion(false);
                ((FinMientras)diagrama).updateUI();
                break;
            }else if ((diagrama instanceof FinCondicional) && ((FinCondicional)diagrama).isSeleccion()) {
                ((FinCondicional)diagrama).setColor(color);
                ((FinCondicional)diagrama).setSeleccion(false);
                ((FinCondicional)diagrama).updateUI();
                break;
            }else if ((diagrama instanceof AsignacionVariable) && ((AsignacionVariable)diagrama).isSeleccion()) {
                ((AsignacionVariable)diagrama).setBackground(color);
                ((AsignacionVariable)diagrama).setSeleccion(false);
                break;
            }else if ((diagrama instanceof Condicional) && (((Condicional)diagrama).isSeleccion())) {
                ((Condicional)diagrama).setBackground(color);
                ((Condicional)diagrama).setSeleccion(false);
                break;
            }else if ((diagrama instanceof DeclaracionVariable) && (((DeclaracionVariable)diagrama).isSeleccion())) {
                ((DeclaracionVariable)diagrama).setBackground(color);
                ((DeclaracionVariable)diagrama).setSeleccion(false);
                break;
            }else if ((diagrama instanceof ImpresionConVariable) && (((ImpresionConVariable)diagrama).isSeleccion())) {
                ((ImpresionConVariable)diagrama).setBackground(color);
                ((ImpresionConVariable)diagrama).setSeleccion(true);
                break;
            }else if ((diagrama instanceof Imprimir) && (((Imprimir)diagrama).isSeleccion())) {
                ((Imprimir)diagrama).setBackground(color);
                ((Imprimir)diagrama).setSeleccion(false);
                break;
            }else if ((diagrama instanceof Mientras) && (((Mientras)diagrama).isSeleccion())) {
                ((Mientras)diagrama).setBackground(color);
                ((Mientras)diagrama).setSeleccion(false);
                break;
            }else if ((diagrama instanceof OperacionVariables) && (((OperacionVariables)diagrama).isSeleccion())) {
                ((OperacionVariables)diagrama).setBackground(color);
                ((OperacionVariables)diagrama).setSeleccion(false);
                break;
            }
        }
        for (DiagramaClase diagrama : diagramaClase) {
            if (diagrama.isSeleccion()) {
                diagrama.setBackground(color);
                diagrama.setSeleccion(false);
                break;
            }
        }
    }//GEN-LAST:event_menuItem_colorActionPerformed

    //Abrir el archivo binario para seguir trabajando con los diagramas de UML
    private void menuItem_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_abrirActionPerformed
        // TODO add your handling code here:
        FileInputStream fr = null;
        ObjectInputStream br = null;
        AdmDiagramaClase dc;
        ArrayList<AdmDiagramaClase> ad = new ArrayList();
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo diagrama", "uml");
            jfc.setFileFilter(filtro);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                pn_diagramas.removeAll();
                for (int i = 0; i < diagramasFlujo.size(); i++) {
                    diagramasFlujo.remove(i);
                }
                for (int i = 0; i < diagramaClase.size(); i++) {
                    diagramaClase.remove(i);
                }
                archivo = jfc.getSelectedFile();
                if (archivo.exists()) {
                    fr = new FileInputStream(archivo);
                    br = new ObjectInputStream(fr);
                    //try {
                    try {
                        while((dc = (AdmDiagramaClase) br.readObject())!= null){
                            ad.add(dc);
                        }
                    } catch (EOFException e) {
                    //Encuentro del final del archivo
                    }
                    for (AdmDiagramaClase adm : ad) {
                        DiagramaClase diagrama = new DiagramaClase();
                        nombreClase = adm.getNombrePaquete();
                        diagrama.getTf_nombre_clase().setText(adm.getNombre());
                        for (int i = 0; i < adm.getAtributos().size(); i++) {
                            if (i<3) {
                                diagrama.getAtributos().get(i).setText(adm.getAtributos().get(i));
                            }else {
                                diagrama.CreacionCasillaAtributo();
                                diagrama.getAtributos().get(i).setText(adm.getAtributos().get(i));
                            }
                        }
                        for (int i = 0; i < adm.getMetodos().size(); i++) {
                            if (i<3) {
                                diagrama.getMetodos().get(i).setText(adm.getMetodos().get(i));
                            }else if (i>=3){
                                diagrama.CreacionCasillaMetodo();
                                diagrama.getMetodos().get(i).setText(adm.getMetodos().get(i));
                            }
                        }
                        diagramaClase.add(diagrama);
                        pn_diagramas.add(diagrama);
                        diagrama.setBounds(adm.getX(), adm.getY(), diagrama.getAnchura(), diagrama.getAltura());   
                        pn_diagramas.updateUI();                        
                    }
                    JOptionPane.showMessageDialog(this, "Se ha abierto el archivo");
                    bt_diagramaClase.setEnabled(true);
                    bt_herencia.setEnabled(true);
                    menuItem_guardar.setEnabled(true);
                    menuItem_eliminar.setEnabled(true);
                    menuItem_imprimir.setEnabled(true);
                    menuItem_jpg.setEnabled(true);
                    menuItem_pdf.setEnabled(true);                                        
                }
                try {
                    fr.close();
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }                          
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       
    }//GEN-LAST:event_menuItem_abrirActionPerformed

    //Boton para habilitar la movilidad de los diagramas de flujo
    private void bt_moverDiagramaFlujoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_moverDiagramaFlujoActionPerformed
        // TODO add your handling code here:
        for (JPanel diagrama : diagramasFlujo) {
            if (diagrama instanceof Inicio) {
                ((Inicio)diagrama).setMover(true);
            }else if (diagrama instanceof Final) {
                ((Final)diagrama).setMover(true);
            }else if (diagrama instanceof AsignacionVariable) {
                ((AsignacionVariable)diagrama).setMover(true);
            }else if (diagrama instanceof Condicional) {
                ((Condicional)diagrama).setMover(true);
            }else if (diagrama instanceof FinCondicional) {
                ((FinCondicional)diagrama).setMover(true);
            }else if (diagrama instanceof FinMientras) {
                ((FinMientras)diagrama).setMover(true);
            }else if (diagrama instanceof DeclaracionVariable) {
                ((DeclaracionVariable)diagrama).setMover(true);
            }else if (diagrama instanceof ImpresionConVariable) {
                ((ImpresionConVariable)diagrama).setMover(true);
            }else if (diagrama instanceof Imprimir) {
                ((Imprimir)diagrama).setMover(true);
            }else if (diagrama instanceof Lea) {
                ((Lea)diagrama).setMover(true);
            }else if (diagrama instanceof Mientras) {
                ((Mientras)diagrama).setMover(true);
            }else if (diagrama instanceof OperacionVariables) {
                ((OperacionVariables)diagrama).setMover(true);
            }
        }
        pn_diagramas.updateUI();
        JOptionPane.showMessageDialog(this, "Ya puede mover los diagramas si lo desea.");
    }//GEN-LAST:event_bt_moverDiagramaFlujoActionPerformed

    //Menu Item para guardar lo que contiene el panel en formato jpg
    private void menuItem_jpgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_jpgActionPerformed
        // TODO add your handling code here:
        int altura = pn_diagramas.getHeight();
        int ancho = pn_diagramas.getWidth();
        BufferedImage image = new BufferedImage(ancho, altura, BufferedImage.TYPE_INT_BGR);
        Graphics2D g = image.createGraphics();
        pn_diagramas.print(g);
        try {
            JFileChooser jfc = new JFileChooser();
            jfc.showSaveDialog(this);
            String a = jfc.getSelectedFile() + ".jpg";
            File archivos = new File(a);
            ImageIO.write(image, "jpg", archivos);
            JOptionPane.showMessageDialog(this, "Se ha guardado en formato jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_menuItem_jpgActionPerformed

    //Boton para mover los diagramas de UML
    private void bt_moverUMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_moverUMLActionPerformed
        // TODO add your handling code here:
        for (DiagramaClase diagrama : diagramaClase) {
            diagrama.setMover(true);
        }
        JOptionPane.showMessageDialog(this, "Se ha habilitado la movilizacion de los diagramas.");
        pn_diagramas.updateUI();
    }//GEN-LAST:event_bt_moverUMLActionPerformed

    //Boton para hacer las lineas de los diagramas de uml que heredan   
    private void bt_lineasHerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lineasHerenciaActionPerformed
        // TODO add your handling code here:
        Graphics g = pn_diagramas.getGraphics();
        for (DiagramaClase diagrama : diagramaClase) {
            if (diagrama.isHerencia()) {
                g.drawLine(diagrama.getClasePadre().getX() + diagrama.getWidth()/2, 
                        diagrama.getClasePadre().getY() + diagrama.getHeight()/2, 
                        diagrama.getX() + diagrama.getWidth(), diagrama.getY() + diagrama.getHeight()/2);
            }
        }
        for (DiagramaClase diagrama : diagramaClase) {
            diagrama.setMover(false);
        }
        JOptionPane.showMessageDialog(this, "Se ha creados las lineas de herencia. Por consecuencia los diagramas no se podran mover");
    }//GEN-LAST:event_bt_lineasHerenciaActionPerformed

    //Menu Item para guardar el archivo en formato pdf
    private void menuItem_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_pdfActionPerformed
        // TODO add your handling code here:
        int altura = pn_diagramas.getHeight();
        int ancho = pn_diagramas.getWidth();
        BufferedImage image = new BufferedImage(ancho, altura, BufferedImage.TYPE_INT_BGR);
        Graphics2D g = image.createGraphics();
        pn_diagramas.print(g);
        try {
            JFileChooser jfc = new JFileChooser();
            jfc.showSaveDialog(this);
            String a = jfc.getSelectedFile() + ".pdf";
            File archivos = new File(a);
            ImageIO.write(image, "jpg", archivos);
            JOptionPane.showMessageDialog(this, "Se ha guardado en formato pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_menuItem_pdfActionPerformed

    //Menu Item para eliminar
    private void menuItem_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_eliminarActionPerformed
        // TODO add your handling code here:
        for (JPanel diagrama : diagramasFlujo) {
            if ((diagrama instanceof Inicio) && (((Inicio)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((Inicio)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((Inicio)diagrama));
                pn_diagramas.updateUI();
                contadorInicio = 0;
                break;
            }else if ((diagrama instanceof Final) && (((Final)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((Final)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((Final)diagrama));
                pn_diagramas.updateUI();
                contadorFinal = 0;
                break;
            }else if ((diagrama instanceof FinMientras) && (((FinMientras)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((FinMientras)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((FinMientras)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof FinCondicional) && (((FinCondicional)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((FinCondicional)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((FinCondicional)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof AsignacionVariable) && (((AsignacionVariable)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha elimiando el diagrama de " + ((AsignacionVariable)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((AsignacionVariable)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof Condicional) && ((Condicional)diagrama).isSeleccion()){
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((Condicional)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((Condicional)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof DeclaracionVariable) && ((DeclaracionVariable)diagrama).isSeleccion()) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((DeclaracionVariable)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((DeclaracionVariable)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof ImpresionConVariable) && ((ImpresionConVariable)diagrama).isSeleccion()) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((ImpresionConVariable)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((ImpresionConVariable)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof Imprimir) && (((Imprimir)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((Imprimir)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((Imprimir)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof Mientras) && (((Mientras)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((Mientras)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((Mientras)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if ((diagrama instanceof OperacionVariables) && (((OperacionVariables)diagrama).isSeleccion())) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((OperacionVariables)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((OperacionVariables)diagrama));
                pn_diagramas.updateUI();
                break;
            }else if (diagrama instanceof Lea && ((Lea)diagrama).isSeleccion()) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + ((Lea)diagrama).getNombre());
                diagramasFlujo.remove(diagrama);
                pn_diagramas.remove(((Lea)diagrama));
                pn_diagramas.updateUI();
            }
        }
        for (DiagramaClase diagrama : diagramaClase) {
            if (diagrama.isSeleccion()) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el diagrama de " + diagrama.getNombre());
                diagramaClase.remove(diagrama);
                pn_diagramas.remove(diagrama);
                pn_diagramas.updateUI();
                break;
            }
        }
    }//GEN-LAST:event_menuItem_eliminarActionPerformed

    //Menu Item para abrir un archivo dfl (Diagrama de Flujo)
    private void jMenuItemAbrirDFLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirDFLActionPerformed
        // TODO add your handling code here:
        FileInputStream fi = null;
        ObjectInputStream oi = null;
        AdmDiagramaFlujo df;
        ArrayList<AdmDiagramaFlujo> dfs = new ArrayList();
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo DFL", "dfl");
            jfc.setFileFilter(filtro);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                pn_diagramas.removeAll();
                for (int i = 0; i < diagramasFlujo.size(); i++) {
                    diagramasFlujo.remove(i);
                }
                for (int i = 0; i < diagramaClase.size(); i++) {
                    diagramaClase.remove(i);
                }
                pn_diagramas.updateUI();
                archivo = jfc.getSelectedFile();
                fi = new FileInputStream(archivo);
                oi = new ObjectInputStream(fi);
                try {
                    while ((df = (AdmDiagramaFlujo)oi.readObject())!=null){
                        dfs.add(df);
                    }
                } catch (Exception e) {
                }
                for (AdmDiagramaFlujo d : dfs) {
                    nombreFlujo = d.getNombreClase();
                    if (d.getNombre().equals("Asignacion variable")) {
                        AsignacionVariable asg = new AsignacionVariable();
                        for (int i = 0; i < d.getCasillas().size(); i++) {
                            if (i<3) {
                                asg.getTextos().get(i).setText(d.getCasillas().get(i));
                            }else if (i>=3) {
                                asg.CreacionCasillaTexto();
                                asg.getTextos().get(i).setText(d.getCasillas().get(i));
                            }
                        }
                        diagramasFlujo.add(asg);
                        pn_diagramas.add(asg);
                        asg.setBounds(d.getX(), d.getY(), asg.getAnchura(), asg.getAltura());
                        pn_diagramas.updateUI();
                    }else if (d.getNombre().equals("Condicional")) {
                        Condicional cond = new Condicional();
                        cond.getTf_condicional().setText(d.getTexto1());
                        diagramasFlujo.add(cond);
                        pn_diagramas.add(cond);
                        cond.setBounds(d.getX(), d.getY(), cond.getAnchura(), cond.getAltura());
                        pn_diagramas.updateUI();
                    }else if (d.getNombre().equals("Declaracion variable")) {
                        DeclaracionVariable dcl = new DeclaracionVariable();
                        dcl.getTf_variables().setText(d.getTexto1());
                        diagramasFlujo.add(dcl);
                        pn_diagramas.add(dcl);
                        dcl.setBounds(d.getX(), d.getY(), dcl.getAnchura(), dcl.getAltura());
                        pn_diagramas.updateUI();
                    }else if (d.getNombre().equals("Fin condicional")) {
                        FinCondicional fcd = new FinCondicional();
                        diagramasFlujo.add(fcd);
                        pn_diagramas.add(fcd);
                        fcd.setBounds(d.getX(), d.getY(), fcd.getAnchura(), fcd.getAltura());
                        pn_diagramas.updateUI();
                    }else if (d.getNombre().equals("Fin mientras")) {
                        FinMientras fm = new FinMientras();
                        diagramasFlujo.add(fm);
                        pn_diagramas.add(fm);
                        fm.setBounds(d.getX(), d.getY(), fm.getAnchura(), fm.getAltura());
                        pn_diagramas.updateUI();
                    }else if (d.getNombre().equals("Final")) {
                        Final f = new Final();
                        diagramasFlujo.add(f);
                        pn_diagramas.add(f);
                        f.setBounds(d.getX(), d.getY(), f.getAnchura(), f.getAltura());
                        pn_diagramas.updateUI();
                    }else if (d.getNombre().equals("Impresion con variable")) {
                        ImpresionConVariable icv = new ImpresionConVariable();
                        icv.getTf_texto_impresion().setText(d.getTexto1());
                        icv.getTf_variable().setText(d.getTexto2());
                        diagramasFlujo.add(icv);
                        pn_diagramas.add(icv);
                        icv.setBounds(d.getX(), d.getY(), icv.getAnchura(), icv.getAltura());
                        pn_diagramas.updateUI();
                    }else if (d.getNombre().equals("Imprimir")) {
                        Imprimir i = new Imprimir();
                        i.getTf_texto_impresion().setText(d.getTexto1());
                        diagramasFlujo.add(i);
                        pn_diagramas.add(i);
                        i.setBounds(d.getX(), d.getY(), i.getAnchura(), i.getAltura());
                        pn_diagramas.updateUI();
                    }else if (d.getNombre().equals("Inicio")) {
                        Inicio in = new Inicio();
                        diagramasFlujo.add(in);
                        pn_diagramas.add(in);
                        in.setBounds(d.getX(), d.getY(), in.getAnchura(), in.getAltura());
                        pn_diagramas.updateUI();
                    }else if (d.getNombre().equals("Lea")) {
                        Lea l = new Lea();
                        l.getTf_lea().setText(d.getTexto1());
                        diagramasFlujo.add(l);
                        pn_diagramas.add(l);
                        l.setBounds(d.getX(), d.getY(), l.getAnchura(), l.getAltura());
                        pn_diagramas.updateUI();
                    }else if (d.getNombre().equals("Mientras")) {
                        Mientras m = new Mientras();
                        m.getTf_mientras().setText(d.getTexto1());
                        diagramasFlujo.add(m);
                        pn_diagramas.add(m);
                        m.setBounds(d.getX(), d.getY(), m.getAnchura(), m.getAltura());
                        pn_diagramas.updateUI();
                    }else if (d.getNombre().equals("Operacion variable")) {
                        OperacionVariables op = new OperacionVariables();
                        op.getTf_operacion().setText(d.getTexto1());
                        diagramasFlujo.add(op);
                        pn_diagramas.add(op);
                        op.setBounds(d.getX(), d.getY(), op.getAnchura(), op.getAltura());
                        pn_diagramas.updateUI();
                    }
                }
                JOptionPane.showMessageDialog(this, "Se ha abierto el archivo");
                bt_diagramaInicio.setEnabled(true);
                bt_diagramaFinal.setEnabled(true);
                bt_diagramaAsignacionVariable.setEnabled(true);
                bt_diagramaDeclaracionVariable.setEnabled(true);
                bt_diagramaImprimir.setEnabled(true);
                bt_diagramaImprimirVariable.setEnabled(true);
                bt_diagramaOperacionVariable.setEnabled(true);
                bt_diagramaMientras.setEnabled(true);
                bt_diagramaFinMientras.setEnabled(true);
                bt_diagramaFinCondicional.setEnabled(true);
                bt_leaDiagramaFlujo.setEnabled(true);
                bt_DiagramaCondicional.setEnabled(true);
                menuItem_guardar.setEnabled(true);
                menuItem_eliminar.setEnabled(true);
                menuItem_imprimir.setEnabled(true);
                menuItem_jpg.setEnabled(true);
                menuItem_pdf.setEnabled(true);
            }
        } catch (Exception e) {
        }finally {
            try {
                fi.close();
                oi.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jMenuItemAbrirDFLActionPerformed

    //Boton para habilitar la edicion del codigo
    private void bt_editarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarCodigoActionPerformed
        // TODO add your handling code here:
        ta_codigos.setEditable(true);
        JOptionPane.showMessageDialog(this, "Puede editar el codigo");
    }//GEN-LAST:event_bt_editarCodigoActionPerformed

    //Boton para inhabilitar la edicion del codigo
    private void bt_NoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_NoEditarActionPerformed
        // TODO add your handling code here:
        ta_codigos.setEditable(false);
        JOptionPane.showMessageDialog(this, "Fin de la edicion del codigo");
    }//GEN-LAST:event_bt_NoEditarActionPerformed

    private void menuItem_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_imprimirActionPerformed
        // TODO add your handling code here:
        int altura = pn_diagramas.getHeight();
        int ancho = pn_diagramas.getWidth();
        BufferedImage image = new BufferedImage(ancho, altura, BufferedImage.TYPE_INT_BGR);
        Graphics2D g = image.createGraphics();
        pn_diagramas.print(g);
        PrintService printService = PrintServiceLookup.lookupDefaultPrintService();
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        DocPrintJob docPrint = printService.createPrintJob();
        Doc doc = new SimpleDoc(image, flavor, null);
        try {
            docPrint.print(doc, null);
            JOptionPane.showMessageDialog(this, "Se a enviado a imprimir los diagramas");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_menuItem_imprimirActionPerformed

    //Menu Item para guardar cambios de los diagramas
    private void menuItem_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_guardarActionPerformed
        // TODO add your handling code here:
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        if (archivo ==  null) {
            JOptionPane.showMessageDialog(this, "El archivo no esta guardado. Seleccion la opcion guardar como.");
        }else {
            if (diagramaClase.size()>0) {
                ArrayList<AdmDiagramaClase> dc = new ArrayList();
                for (DiagramaClase diagrama : diagramaClase) {
                    AdmDiagramaClase ad = new AdmDiagramaClase(nombreClase, diagrama.getNombre(), diagrama.getX(), diagrama.getY());
                    for (int i = 0; i < diagrama.getAtributos().size(); i++) {
                        ad.setAtributo(diagrama.getAtributos().get(i).getText());
                    }
                    for (int i = 0; i < diagrama.getMetodos().size(); i++) {
                        ad.setAtributo(diagrama.getMetodos().get(i).getText());
                    }
                    dc.add(ad);
                    try {
                        fw = new FileOutputStream(archivo);
                        bw = new ObjectOutputStream(fw);
                        for (AdmDiagramaClase d : dc) {
                            bw.writeObject(d);
                        }
                        bw.flush();
                    } catch (Exception e) {
                    }finally {
                        try {
                            fw.close();
                            bw.close();
                        } catch (Exception e) {
                        }
                    }
                }
                
            }else {
                ArrayList<AdmDiagramaFlujo> df = new ArrayList();
                for (JPanel diagrama : diagramasFlujo) {
                    if (diagrama instanceof Inicio) {
                        df.add(new AdmDiagramaFlujo(nombreFlujo,((Inicio)diagrama).getNombre(), ((Inicio)diagrama).getX()
                                , ((Inicio)diagrama).getY()));
                    }else if (diagrama instanceof AsignacionVariable) {
                        AdmDiagramaFlujo dm = new AdmDiagramaFlujo(nombreFlujo,((AsignacionVariable)diagrama).getNombre(), 
                                ((AsignacionVariable)diagrama).getX(), ((AsignacionVariable)diagrama).getY());
                        for (int i = 0; i < ((AsignacionVariable)diagrama).getTextos().size(); i++) {
                            dm.setCasilla(((AsignacionVariable)diagrama).getTextos().get(i).getText());
                        }
                        df.add(dm);
                    }else if (diagrama instanceof Condicional) {
                        df.add(new AdmDiagramaFlujo(nombreFlujo,((Condicional)diagrama).getNombre(), 
                                ((Condicional)diagrama).getX(), ((Condicional)diagrama).getY(), 
                                ((Condicional)diagrama).getTexto()));
                    }else if (diagrama instanceof DeclaracionVariable) {
                        df.add(new AdmDiagramaFlujo(nombreFlujo,((DeclaracionVariable)diagrama).getNombre(), 
                                ((DeclaracionVariable)diagrama).getX(), ((DeclaracionVariable)diagrama).getY(), 
                                ((DeclaracionVariable)diagrama).getTexto()));
                    }else if (diagrama instanceof FinCondicional) {
                        df.add(new AdmDiagramaFlujo(nombreFlujo,((FinCondicional)diagrama).getNombre(), ((FinCondicional)diagrama).getX(), 
                                ((FinCondicional)diagrama).getY()));
                    }else if (diagrama instanceof FinMientras) {
                        df.add(new AdmDiagramaFlujo(nombreFlujo,((FinMientras)diagrama).getNombre(), 
                                ((FinMientras)diagrama).getX(), ((FinMientras)diagrama).getY()));
                    }else if (diagrama instanceof Final) {
                        df.add(new AdmDiagramaFlujo(nombreFlujo,((Final)diagrama).getNombre(), ((Final)diagrama).getX(), 
                                ((Final)diagrama).getY()));
                    }else if (diagrama instanceof ImpresionConVariable) {
                        AdmDiagramaFlujo dg = new AdmDiagramaFlujo(nombreFlujo,((ImpresionConVariable)diagrama).getNombre(), 
                                ((ImpresionConVariable)diagrama).getX(), ((ImpresionConVariable)diagrama).getY(),
                                ((ImpresionConVariable)diagrama).getTextoImpresion(),((ImpresionConVariable)diagrama).getTexttoVariable());
                        df.add(dg);
                    }else if (diagrama instanceof Imprimir) {
                        df.add(new AdmDiagramaFlujo(nombreFlujo,((Imprimir)diagrama).getNombre(), ((Imprimir)diagrama).getX(), 
                                ((Imprimir)diagrama).getY(), ((Imprimir)diagrama).getTexto()));
                    }else if (diagrama instanceof Lea) {
                        df.add(new AdmDiagramaFlujo(nombreFlujo,((Lea)diagrama).getNombre(), ((Lea)diagrama).getX(), 
                                ((Lea)diagrama).getY(), ((Lea)diagrama).getTf_lea().getText()));
                    }else if (diagrama instanceof Mientras) {
                        df.add(new AdmDiagramaFlujo(nombreFlujo,((Mientras)diagrama).getNombre(), ((Mientras)diagrama).getX(), 
                                ((Mientras)diagrama).getY(), ((Mientras)diagrama).getTexto()));
                    }else if (diagrama instanceof OperacionVariables) {
                        df.add(new AdmDiagramaFlujo(nombreFlujo,((OperacionVariables)diagrama).getNombre(), 
                                ((OperacionVariables)diagrama).getX(), ((OperacionVariables)diagrama).getY(), 
                                ((OperacionVariables)diagrama).getTexto()));
                    }
                }
                try {
                    fw = new FileOutputStream(archivo);
                    bw = new ObjectOutputStream(fw);
                    for (AdmDiagramaFlujo diagrama : df) {
                        bw.writeObject(diagrama);
                    }
                    bw.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    try {
                        fw.close();
                        bw.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Se han guardado los cambios");
        }
    }//GEN-LAST:event_menuItem_guardarActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JButton bt_DiagramaCondicional;
    private javax.swing.JButton bt_Herencia;
    private javax.swing.JButton bt_NoEditar;
    private javax.swing.JButton bt_cancelarHerencia;
    private javax.swing.JButton bt_codigoUML;
    private javax.swing.JButton bt_colorFigura;
    private javax.swing.JButton bt_colorTexto;
    private javax.swing.JButton bt_copiar;
    private javax.swing.JButton bt_diagramaAsignacionVariable;
    private javax.swing.JButton bt_diagramaClase;
    private javax.swing.JButton bt_diagramaDeclaracionVariable;
    private javax.swing.JButton bt_diagramaFinCondicional;
    private javax.swing.JButton bt_diagramaFinMientras;
    private javax.swing.JButton bt_diagramaFinal;
    private javax.swing.JButton bt_diagramaImprimir;
    private javax.swing.JButton bt_diagramaImprimirVariable;
    private javax.swing.JButton bt_diagramaInicio;
    private javax.swing.JButton bt_diagramaMientras;
    private javax.swing.JButton bt_diagramaOperacionVariable;
    private javax.swing.JButton bt_editarCodigo;
    private javax.swing.JButton bt_eleccionDiagramaFlujo;
    private javax.swing.JButton bt_eleccionDiagramaUML;
    private javax.swing.JButton bt_eliminarFigura;
    private javax.swing.JButton bt_hacerCodigoFlujo;
    private javax.swing.JButton bt_herencia;
    private javax.swing.JButton bt_leaDiagramaFlujo;
    private javax.swing.JButton bt_lineasDfl;
    private javax.swing.JButton bt_lineasHerencia;
    private javax.swing.JButton bt_moverDiagramaFlujo;
    private javax.swing.JButton bt_moverUML;
    private javax.swing.JButton bt_pegar;
    private javax.swing.JComboBox<String> cb_estilo_fuente;
    private javax.swing.JComboBox<String> cb_fuentes;
    private javax.swing.JComboBox<String> cb_tamañoTexto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListHerencia1;
    private javax.swing.JList<String> jListHerencia2;
    private javax.swing.JMenuItem jMenuItemAbrirDFL;
    private javax.swing.JMenuItem jMenuItemGuardarComo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog jd_EleccionDiagramaNuevo;
    private javax.swing.JDialog jd_herencia_DUML;
    private javax.swing.JLabel lb_colorFiguras;
    private javax.swing.JLabel lb_estilo_fuente;
    private javax.swing.JLabel lb_fuente;
    private javax.swing.JLabel lb_herencia;
    private javax.swing.JLabel lb_tamaño;
    private javax.swing.JLabel lb_titulo_Seleccionar;
    private javax.swing.JMenuItem menuItem_abrir;
    private javax.swing.JMenuItem menuItem_color;
    private javax.swing.JMenuItem menuItem_eliminar;
    private javax.swing.JMenuItem menuItem_guardar;
    private javax.swing.JMenuItem menuItem_imprimir;
    private javax.swing.JMenuItem menuItem_jpg;
    private javax.swing.JMenuItem menuItem_nuevo;
    private javax.swing.JMenuItem menuItem_pdf;
    private javax.swing.JMenu menu_archivos;
    private javax.swing.JMenu menu_formatos;
    private javax.swing.JMenu menu_opciones;
    private javax.swing.JPanel pn_botonesSeleccion;
    private javax.swing.JPanel pn_codigos;
    private javax.swing.JPanel pn_diagramaFlujo;
    private javax.swing.JPanel pn_diagramaUML;
    private javax.swing.JPanel pn_diagramas;
    private javax.swing.JPanel pn_opciones_diagramas;
    private javax.swing.JScrollPane scpn_diagramas;
    private javax.swing.JScrollPane spn_diagramasFlujo;
    private javax.swing.JTextArea ta_codigos;
    private javax.swing.JTabbedPane tbpn_Diagramas;
    private javax.swing.JTabbedPane tpn_diagramasCodigo;
    // End of variables declaration//GEN-END:variables
    
}

