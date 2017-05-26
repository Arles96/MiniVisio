/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagramaFlujo;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Arles Cerrato
 */
public class DeclaracionVariable extends javax.swing.JPanel {

    //Atributos personalizados
    private boolean mover = true;
    int x;
    int y;
    boolean click;
    private final String nombre = "Declaracion variable";
    private boolean seleccion = false;
    private boolean seleccionTexto = false;
    private int altura=73;
    private int anchura=151;
    
    //Constructor
    
    public DeclaracionVariable() {
        initComponents();
        this.setBackground(Color.blue);
    }

    //Mutadores
    
    public String getTexto (){
        return tf_variables.getText();
    }
    
    public String getNombre(){
        return nombre;
    }

    public boolean isSeleccion() {
        return seleccion;
    }

    public void setSeleccion(boolean seleccion) {
        this.seleccion = seleccion;
    }

    public boolean isSeleccionTexto() {
        return seleccionTexto;
    }

    public void setSeleccionTexto(boolean seleccionTexto) {
        this.seleccionTexto = seleccionTexto;
    }

    public JTextField getTf_variables() {
        return tf_variables;
    }

    public void setTf_variables(JTextField tf_variables) {
        this.tf_variables = tf_variables;
    }

    public boolean isMover() {
        return mover;
    }

    public void setMover(boolean mover) {
        this.mover = mover;
    }

    public int getAltura() {
        return altura;
    }

    public int getAnchura() {
        return anchura;
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_declaracionVariables = new javax.swing.JLabel();
        tf_variables = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 102, 255));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        lb_declaracionVariables.setFont(new java.awt.Font("sansserif", 3, 10)); // NOI18N
        lb_declaracionVariables.setForeground(new java.awt.Color(0, 0, 0));
        lb_declaracionVariables.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_declaracionVariables.setText("DECLARACION DE VARIABLES");

        tf_variables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_variablesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_declaracionVariables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_variables)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb_declaracionVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_variables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        click=true;
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        click = false;
    }//GEN-LAST:event_formMouseReleased

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x2 = this.getX();
        int y2 = this.getY();
        if (click && mover) {
            x2 += evt.getX() - x;
            y2 += evt.getY() - y;
            this.setLocation(x2, y2);
        }      
    }//GEN-LAST:event_formMouseDragged

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        seleccion = true;
    }//GEN-LAST:event_formMouseClicked

    private void tf_variablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_variablesMouseClicked
        // TODO add your handling code here:
        seleccionTexto = true;
    }//GEN-LAST:event_tf_variablesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_declaracionVariables;
    private javax.swing.JTextField tf_variables;
    // End of variables declaration//GEN-END:variables
}
