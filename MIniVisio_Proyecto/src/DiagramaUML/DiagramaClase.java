/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagramaUML;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Arles Cerrato
 */
public class DiagramaClase extends javax.swing.JPanel {

    //Atributos personalizados
    private ArrayList<JTextField> atributos = new ArrayList();
    private ArrayList<JTextField> metodos = new ArrayList();
    //variable para la posicion del objeto
    private int x;
    private int y;    
    private boolean click;//Variable booleano sobre el evento de click
    private boolean seleccionado=false;
    private boolean seleccionAtributo = false;
    private boolean seleccionMetodo = false;
    private boolean seleccionNombre = false;
    private boolean herencia = false;
    private DiagramaClase clasePadre;
    private boolean mover = true;
    private int altura=213;
    private int anchura=270;
    
    //Constructor
    
    public DiagramaClase() {
        initComponents();
        atributos.add(tf_atributo1);
        atributos.add(tf_atributo2);
        atributos.add(tf_atributo3);
        metodos.add(tf_metodo1);
        metodos.add(tf_metodo2);
        metodos.add(tf_metodo3);
    }
    
    //Mutadores

    public ArrayList<JTextField> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<JTextField> atributos) {
        this.atributos = atributos;
    }

    public ArrayList<JTextField> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<JTextField> metodos) {
        this.metodos = metodos;
    }
    
    public String getNombre(){
        return tf_nombre_clase.getText();
    }
    
    public void setSeleccion(boolean seleccion){
        seleccionado = seleccion;
    }
    public boolean isSeleccion(){
        return seleccionado;
    }

    public boolean isSeleccionNombre() {
        return seleccionNombre;
    }

    public void setSeleccionNombre(boolean seleccionNombre) {
        this.seleccionNombre = seleccionNombre;
    }

    public boolean isSeleccionAtributo() {
        return seleccionAtributo;
    }

    public void setSeleccionAtributo(boolean seleccionAtributo) {
        this.seleccionAtributo = seleccionAtributo;
    }

    public boolean isSeleccionMetodo() {
        return seleccionMetodo;
    }

    public void setSeleccionMetodo(boolean seleccionMetodo) {
        this.seleccionMetodo = seleccionMetodo;
    }

    public JTextField getTf_nombre_clase() {
        return tf_nombre_clase;
    }

    public void setTf_nombre_clase(JTextField tf_nombre_clase) {
        this.tf_nombre_clase = tf_nombre_clase;
    }

    public boolean isHerencia() {
        return herencia;
    }

    public void setHerencia(boolean herencia) {
        this.herencia = herencia;
    }

    public DiagramaClase getClasePadre() {
        return clasePadre;
    }

    public void setClasePadre(DiagramaClase clasePadre) {
        this.clasePadre = clasePadre;
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
    
    //Metodos de administracion
    
    public void CreacionCasillaAtributo(){
        JTextField txt = new JTextField();
        atributos.add(txt);
        pn_atributos.add(txt);
        pn_atributos.updateUI();
        txt.addMouseListener(new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent me) {
                seleccionAtributo = true;
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
    }
    
    public void CreacionCasillaMetodo(){
        JTextField txt = new JTextField();        
        metodos.add(txt);
        pn_metodos.add(txt);
        pn_metodos.updateUI();
        txt.addMouseListener(new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent me) {
                seleccionMetodo = true;
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_nombre_clase = new javax.swing.JLabel();
        tf_nombre_clase = new javax.swing.JTextField();
        lb_clase = new javax.swing.JLabel();
        lb_atributos = new javax.swing.JLabel();
        scp_atributos = new javax.swing.JScrollPane();
        pn_atributos = new javax.swing.JPanel();
        tf_atributo1 = new javax.swing.JTextField();
        tf_atributo2 = new javax.swing.JTextField();
        tf_atributo3 = new javax.swing.JTextField();
        bt_agregar_atributo = new javax.swing.JButton();
        bt_eliminarAtributo = new javax.swing.JButton();
        lb_metodosAdiministracion = new javax.swing.JLabel();
        scp_metodos = new javax.swing.JScrollPane();
        pn_metodos = new javax.swing.JPanel();
        tf_metodo1 = new javax.swing.JTextField();
        tf_metodo2 = new javax.swing.JTextField();
        tf_metodo3 = new javax.swing.JTextField();
        bt_agregarMetodos = new javax.swing.JButton();
        bt_eliminarMetodos = new javax.swing.JButton();

        setForeground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(355, 200));
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

        lb_nombre_clase.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lb_nombre_clase.setText("Nombre");

        tf_nombre_clase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_nombre_claseMouseClicked(evt);
            }
        });

        lb_clase.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        lb_clase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_clase.setText("CLASE");

        lb_atributos.setFont(new java.awt.Font("sansserif", 3, 8)); // NOI18N
        lb_atributos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_atributos.setText("Atributos");

        pn_atributos.setLayout(new java.awt.GridLayout(0, 1));

        tf_atributo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_atributo1MouseClicked(evt);
            }
        });
        pn_atributos.add(tf_atributo1);

        tf_atributo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_atributo2MouseClicked(evt);
            }
        });
        pn_atributos.add(tf_atributo2);

        tf_atributo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_atributo3MouseClicked(evt);
            }
        });
        pn_atributos.add(tf_atributo3);

        scp_atributos.setViewportView(pn_atributos);

        bt_agregar_atributo.setFont(new java.awt.Font("sansserif", 0, 8)); // NOI18N
        bt_agregar_atributo.setText("Agregar");
        bt_agregar_atributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregar_atributoActionPerformed(evt);
            }
        });

        bt_eliminarAtributo.setFont(new java.awt.Font("sansserif", 0, 8)); // NOI18N
        bt_eliminarAtributo.setText("Eliminar");
        bt_eliminarAtributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarAtributoActionPerformed(evt);
            }
        });

        lb_metodosAdiministracion.setFont(new java.awt.Font("sansserif", 3, 8)); // NOI18N
        lb_metodosAdiministracion.setText("Metodos de Administracion");

        pn_metodos.setLayout(new java.awt.GridLayout(0, 1));

        tf_metodo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_metodo1MouseClicked(evt);
            }
        });
        pn_metodos.add(tf_metodo1);

        tf_metodo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_metodo2MouseClicked(evt);
            }
        });
        pn_metodos.add(tf_metodo2);

        tf_metodo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_metodo3MouseClicked(evt);
            }
        });
        pn_metodos.add(tf_metodo3);

        scp_metodos.setViewportView(pn_metodos);

        bt_agregarMetodos.setFont(new java.awt.Font("sansserif", 0, 8)); // NOI18N
        bt_agregarMetodos.setText("Agregar");
        bt_agregarMetodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarMetodosActionPerformed(evt);
            }
        });

        bt_eliminarMetodos.setFont(new java.awt.Font("sansserif", 0, 8)); // NOI18N
        bt_eliminarMetodos.setText("Eliminar");
        bt_eliminarMetodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarMetodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lb_nombre_clase, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tf_nombre_clase, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(scp_atributos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scp_metodos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_agregar_atributo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_eliminarAtributo)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_agregarMetodos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(bt_eliminarMetodos))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lb_clase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lb_atributos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(lb_metodosAdiministracion)
                            .addGap(17, 17, 17))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb_clase, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_nombre_clase, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(tf_nombre_clase, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_atributos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_metodosAdiministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scp_atributos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scp_metodos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_eliminarAtributo)
                    .addComponent(bt_agregarMetodos)
                    .addComponent(bt_eliminarMetodos)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_agregar_atributo)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        click = true;
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
            x2 += evt.getX()-x;
            y2 += evt.getY()-y;
            this.setLocation(x2, y2);
        }    
    }//GEN-LAST:event_formMouseDragged

    private void bt_agregar_atributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregar_atributoActionPerformed
        // TODO add your handling code here:
        CreacionCasillaAtributo();
    }//GEN-LAST:event_bt_agregar_atributoActionPerformed

    private void bt_agregarMetodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarMetodosActionPerformed
        // TODO add your handling code here:
        CreacionCasillaMetodo();
    }//GEN-LAST:event_bt_agregarMetodosActionPerformed

    private void bt_eliminarAtributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarAtributoActionPerformed
        // TODO add your handling code here:
        for (JTextField atributo : atributos) {
            if (atributo.getText().equals("")) {                
                    atributos.remove(atributo);
                    pn_atributos.remove(atributo);
                    pn_atributos.updateUI();
                    break;
            }
        }
    }//GEN-LAST:event_bt_eliminarAtributoActionPerformed

    private void bt_eliminarMetodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarMetodosActionPerformed
        // TODO add your handling code here:
        for (JTextField metodo : metodos) {
            if (metodo.getText().equals("")) {
                metodos.remove(metodo);
                pn_metodos.remove(metodo);
                pn_metodos.updateUI();
                break;
            }
        }
    }//GEN-LAST:event_bt_eliminarMetodosActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        seleccionado = true;
    }//GEN-LAST:event_formMouseClicked

    private void tf_atributo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_atributo1MouseClicked
        // TODO add your handling code here:
        seleccionAtributo = true;
    }//GEN-LAST:event_tf_atributo1MouseClicked

    private void tf_atributo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_atributo2MouseClicked
        // TODO add your handling code here:
        seleccionAtributo = true;
    }//GEN-LAST:event_tf_atributo2MouseClicked

    private void tf_atributo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_atributo3MouseClicked
        // TODO add your handling code here:
        seleccionAtributo = true;
    }//GEN-LAST:event_tf_atributo3MouseClicked

    private void tf_metodo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_metodo1MouseClicked
        // TODO add your handling code here:
        seleccionMetodo = true;
    }//GEN-LAST:event_tf_metodo1MouseClicked

    private void tf_metodo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_metodo2MouseClicked
        // TODO add your handling code here:
        seleccionMetodo = true;
    }//GEN-LAST:event_tf_metodo2MouseClicked

    private void tf_metodo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_metodo3MouseClicked
        // TODO add your handling code here:
        seleccionMetodo = true;
    }//GEN-LAST:event_tf_metodo3MouseClicked

    private void tf_nombre_claseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nombre_claseMouseClicked
        // TODO add your handling code here:
        seleccionNombre = true;
    }//GEN-LAST:event_tf_nombre_claseMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregarMetodos;
    private javax.swing.JButton bt_agregar_atributo;
    private javax.swing.JButton bt_eliminarAtributo;
    private javax.swing.JButton bt_eliminarMetodos;
    private javax.swing.JLabel lb_atributos;
    private javax.swing.JLabel lb_clase;
    private javax.swing.JLabel lb_metodosAdiministracion;
    private javax.swing.JLabel lb_nombre_clase;
    private javax.swing.JPanel pn_atributos;
    private javax.swing.JPanel pn_metodos;
    private javax.swing.JScrollPane scp_atributos;
    private javax.swing.JScrollPane scp_metodos;
    private javax.swing.JTextField tf_atributo1;
    private javax.swing.JTextField tf_atributo2;
    private javax.swing.JTextField tf_atributo3;
    private javax.swing.JTextField tf_metodo1;
    private javax.swing.JTextField tf_metodo2;
    private javax.swing.JTextField tf_metodo3;
    private javax.swing.JTextField tf_nombre_clase;
    // End of variables declaration//GEN-END:variables
}
