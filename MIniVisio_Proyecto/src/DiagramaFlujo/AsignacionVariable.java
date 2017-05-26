/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagramaFlujo;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Arles Cerrato
 */
public class AsignacionVariable extends javax.swing.JPanel {

    //Atributos personalizados
    private ArrayList<JTextField> textos;
    private final String nombre = "Asignacion variable";
    private int x;
    private int y;
    private boolean click;
    private boolean seleccion=false;
    private boolean seleccionTexto = false;
    private boolean mover = true;
    private int altura=140;
    private int anchura = 247;
    
    //Constuctor
    public AsignacionVariable() {
        initComponents();
        textos = new ArrayList();
        textos.add(tf_asignacion_variable1);
        textos.add(tf_asignacion_variable2);
        textos.add(tf_asignacion_variable3);
        this.setBackground(Color.blue);
    }

    //Mutadores

    public ArrayList<JTextField> getTextos() {
        return textos;
    }

    public void setTextos(ArrayList<JTextField> textos) {
        this.textos = textos;
    }
    
    public String getTexto(int pos){
        return textos.get(pos).getSelectedText();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setSeleccion (boolean s){
        seleccion = s;
    }
    
    public boolean isSeleccion (){
        return seleccion;
    }

    public boolean isSeleccionTexto() {
        return seleccionTexto;
    }

    public void setSeleccionTexto(boolean seleccionTexto) {
        this.seleccionTexto = seleccionTexto;
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
    
    //Metodo de administracion
    
    public void CreacionCasillaTexto(){
        JTextField txt = new JTextField();
        textos.add(txt);
        pn_asignacionVariable.add(txt);
        pn_asignacionVariable.updateUI();      
        txt.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                seleccionTexto = true;
            }

            @Override
            public void mousePressed(MouseEvent me) { }

            @Override
            public void mouseReleased(MouseEvent me) { }

            @Override
            public void mouseEntered(MouseEvent me) { }

            @Override
            public void mouseExited(MouseEvent me) { }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scpn_asignacion_variables = new javax.swing.JScrollPane();
        pn_asignacionVariable = new javax.swing.JPanel();
        tf_asignacion_variable1 = new javax.swing.JTextField();
        tf_asignacion_variable2 = new javax.swing.JTextField();
        tf_asignacion_variable3 = new javax.swing.JTextField();
        bt_agregar_asignacion = new javax.swing.JButton();
        lb_titulo = new javax.swing.JLabel();
        bt_eliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
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

        pn_asignacionVariable.setLayout(new java.awt.GridLayout(0, 1));

        tf_asignacion_variable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_asignacion_variable1MouseClicked(evt);
            }
        });
        pn_asignacionVariable.add(tf_asignacion_variable1);

        tf_asignacion_variable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_asignacion_variable2MouseClicked(evt);
            }
        });
        pn_asignacionVariable.add(tf_asignacion_variable2);

        tf_asignacion_variable3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_asignacion_variable3ActionPerformed(evt);
            }
        });
        pn_asignacionVariable.add(tf_asignacion_variable3);

        scpn_asignacion_variables.setViewportView(pn_asignacionVariable);

        bt_agregar_asignacion.setText("Agregar");
        bt_agregar_asignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregar_asignacionActionPerformed(evt);
            }
        });

        lb_titulo.setFont(new java.awt.Font("sansserif", 3, 10)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(0, 0, 0));
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("ASIGNACION DE VALORES A LOS VARIABLES");

        bt_eliminar.setText("Eliminar");
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpn_asignacion_variables, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_agregar_asignacion)
                    .addComponent(bt_eliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_agregar_asignacion)
                        .addGap(18, 18, 18)
                        .addComponent(bt_eliminar))
                    .addComponent(scpn_asignacion_variables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void bt_agregar_asignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregar_asignacionActionPerformed
        // TODO add your handling code here:
        CreacionCasillaTexto();
    }//GEN-LAST:event_bt_agregar_asignacionActionPerformed

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        // TODO add your handling code here:
        for (JTextField texto : textos) {
            if (texto.getText().equals("")) {
                textos.remove(texto);
                pn_asignacionVariable.remove(texto);
                pn_asignacionVariable.updateUI();
                break;
            }
        }
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        seleccion = true;
    }//GEN-LAST:event_formMouseClicked

    private void tf_asignacion_variable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_asignacion_variable1MouseClicked
        // TODO add your handling code here:
        seleccionTexto = true;
    }//GEN-LAST:event_tf_asignacion_variable1MouseClicked

    private void tf_asignacion_variable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_asignacion_variable2MouseClicked
        // TODO add your handling code here:
        seleccionTexto = true;
    }//GEN-LAST:event_tf_asignacion_variable2MouseClicked

    private void tf_asignacion_variable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_asignacion_variable3ActionPerformed
        // TODO add your handling code here:
        seleccionTexto = true;
    }//GEN-LAST:event_tf_asignacion_variable3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregar_asignacion;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPanel pn_asignacionVariable;
    private javax.swing.JScrollPane scpn_asignacion_variables;
    private javax.swing.JTextField tf_asignacion_variable1;
    private javax.swing.JTextField tf_asignacion_variable2;
    private javax.swing.JTextField tf_asignacion_variable3;
    // End of variables declaration//GEN-END:variables
}
