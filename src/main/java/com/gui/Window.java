/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gui;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author PC
 */
public class Window extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Window() {
        initComponents();
        Principal p = new Principal();
        p.setSize(730, 540);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        menuOpciones = new javax.swing.JPanel();
        principalPanel = new javax.swing.JPanel();
        imgPrincipal = new javax.swing.JLabel();
        txtPrincipal = new javax.swing.JLabel();
        movimientosPanel = new javax.swing.JPanel();
        imgMovimientos = new javax.swing.JLabel();
        txtMovimientos = new javax.swing.JLabel();
        ingresosPanel = new javax.swing.JPanel();
        imgIngresos = new javax.swing.JLabel();
        txtIngresos = new javax.swing.JLabel();
        gastosPanel = new javax.swing.JPanel();
        imgGastos = new javax.swing.JLabel();
        txtGastos = new javax.swing.JLabel();
        barra = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        panelSaludo = new javax.swing.JPanel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(0, 51, 204));
        menu.setPreferredSize(new java.awt.Dimension(300, 768));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GastoOK");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setToolTipText("");
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jSeparator1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        menuOpciones.setBackground(new java.awt.Color(0, 102, 204));
        menuOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        principalPanel.setBackground(new java.awt.Color(0, 102, 204));
        principalPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        principalPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                principalPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                principalPanelMouseExited(evt);
            }
        });

        imgPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/home.png"))); // NOI18N
        imgPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        txtPrincipal.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        txtPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        txtPrincipal.setText("Principal");

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(imgPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtPrincipal)
                .addGap(29, 29, 29))
        );

        menuOpciones.add(principalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        movimientosPanel.setBackground(new java.awt.Color(0, 102, 204));
        movimientosPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movimientosPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                movimientosPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                movimientosPanelMouseExited(evt);
            }
        });

        imgMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/movement.png"))); // NOI18N
        imgMovimientos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtMovimientos.setBackground(new java.awt.Color(255, 255, 255));
        txtMovimientos.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        txtMovimientos.setForeground(new java.awt.Color(255, 255, 255));
        txtMovimientos.setText("Movimientos");

        javax.swing.GroupLayout movimientosPanelLayout = new javax.swing.GroupLayout(movimientosPanel);
        movimientosPanel.setLayout(movimientosPanelLayout);
        movimientosPanelLayout.setHorizontalGroup(
            movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movimientosPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(imgMovimientos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        movimientosPanelLayout.setVerticalGroup(
            movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgMovimientos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(movimientosPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtMovimientos)
                .addContainerGap())
        );

        menuOpciones.add(movimientosPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 306, -1));

        ingresosPanel.setBackground(new java.awt.Color(0, 102, 204));
        ingresosPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresosPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresosPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresosPanelMouseExited(evt);
            }
        });

        imgIngresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/moneIn.png"))); // NOI18N
        imgIngresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtIngresos.setBackground(new java.awt.Color(255, 255, 255));
        txtIngresos.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        txtIngresos.setForeground(new java.awt.Color(255, 255, 255));
        txtIngresos.setText("Ingresos");

        javax.swing.GroupLayout ingresosPanelLayout = new javax.swing.GroupLayout(ingresosPanel);
        ingresosPanel.setLayout(ingresosPanelLayout);
        ingresosPanelLayout.setHorizontalGroup(
            ingresosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresosPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(imgIngresos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ingresosPanelLayout.setVerticalGroup(
            ingresosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgIngresos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(ingresosPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtIngresos)
                .addContainerGap())
        );

        menuOpciones.add(ingresosPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 300, -1));

        gastosPanel.setBackground(new java.awt.Color(0, 102, 204));
        gastosPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gastosPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gastosPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gastosPanelMouseExited(evt);
            }
        });

        imgGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/moneyOut.png"))); // NOI18N
        imgGastos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtGastos.setBackground(new java.awt.Color(255, 255, 255));
        txtGastos.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        txtGastos.setForeground(new java.awt.Color(255, 255, 255));
        txtGastos.setText("Gastos");

        javax.swing.GroupLayout gastosPanelLayout = new javax.swing.GroupLayout(gastosPanel);
        gastosPanel.setLayout(gastosPanelLayout);
        gastosPanelLayout.setHorizontalGroup(
            gastosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gastosPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(imgGastos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        gastosPanelLayout.setVerticalGroup(
            gastosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgGastos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(gastosPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtGastos)
                .addContainerGap())
        );

        menuOpciones.add(gastosPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 300, -1));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(menuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));

        txtCerrar.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        txtCerrar.setForeground(new java.awt.Color(0, 0, 0));
        txtCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCerrar.setText("X");
        txtCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCerrarLayout = new javax.swing.GroupLayout(btnCerrar);
        btnCerrar.setLayout(btnCerrarLayout);
        btnCerrarLayout.setHorizontalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        btnCerrarLayout.setVerticalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarLayout.createSequentialGroup()
                .addComponent(txtCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(974, 974, 974)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 40));

        panelSaludo.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout panelSaludoLayout = new javax.swing.GroupLayout(panelSaludo);
        panelSaludo.setLayout(panelSaludoLayout);
        panelSaludoLayout.setHorizontalGroup(
            panelSaludoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        panelSaludoLayout.setVerticalGroup(
            panelSaludoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        getContentPane().add(panelSaludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 730, 190));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 730, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtCerrarMouseClicked

    private void txtCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseEntered
       txtCerrar.setForeground(Color.WHITE);
       btnCerrar.setBackground(Color.red);
    }//GEN-LAST:event_txtCerrarMouseEntered

    private void txtCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseExited
       txtCerrar.setForeground(Color.BLACK);
       btnCerrar.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtCerrarMouseExited

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
       xMouse = evt.getX();
       yMouse = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraMouseDragged

    private void principalPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalPanelMouseEntered
        principalPanel.setBackground(new Color(0, 120, 240));
    }//GEN-LAST:event_principalPanelMouseEntered

    private void principalPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalPanelMouseExited
        principalPanel.setBackground(new Color(0, 102, 204));
    }//GEN-LAST:event_principalPanelMouseExited

    private void movimientosPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movimientosPanelMouseEntered
        movimientosPanel.setBackground(new Color(0, 120, 240));
    }//GEN-LAST:event_movimientosPanelMouseEntered

    private void movimientosPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movimientosPanelMouseExited
        movimientosPanel.setBackground(new Color(0, 102, 204));
    }//GEN-LAST:event_movimientosPanelMouseExited

    private void ingresosPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresosPanelMouseEntered
        ingresosPanel.setBackground(new Color(0, 120, 240));
    }//GEN-LAST:event_ingresosPanelMouseEntered

    private void ingresosPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresosPanelMouseExited
        ingresosPanel.setBackground(new Color(0, 102, 204));
    }//GEN-LAST:event_ingresosPanelMouseExited

    private void gastosPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gastosPanelMouseEntered
        gastosPanel.setBackground(new Color(0, 120, 240));
    }//GEN-LAST:event_gastosPanelMouseEntered

    private void gastosPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gastosPanelMouseExited
        gastosPanel.setBackground(new Color(0, 102, 204));
    }//GEN-LAST:event_gastosPanelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel content;
    private javax.swing.JPanel gastosPanel;
    private javax.swing.JLabel imgGastos;
    private javax.swing.JLabel imgIngresos;
    private javax.swing.JLabel imgMovimientos;
    private javax.swing.JLabel imgMovimientos2;
    private javax.swing.JLabel imgPrincipal;
    private javax.swing.JPanel ingresosPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuOpciones;
    private javax.swing.JPanel movimientosPanel;
    private javax.swing.JPanel movimientosPanel2;
    private javax.swing.JPanel panelSaludo;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JLabel txtCerrar;
    private javax.swing.JLabel txtGastos;
    private javax.swing.JLabel txtIngresos;
    private javax.swing.JLabel txtMovimientos;
    private javax.swing.JLabel txtMovimientos2;
    private javax.swing.JLabel txtPrincipal;
    // End of variables declaration//GEN-END:variables
}
