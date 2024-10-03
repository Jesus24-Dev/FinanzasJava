/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.gui;

import finanzasapp.modelos.Cuenta;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Principal extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        actualizarSaldo();
        colocarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla10mov = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        saldoActual = new javax.swing.JLabel();
        btnEliminarCuenta = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(730, 540));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        tabla10mov.setAutoCreateRowSorter(true);
        tabla10mov.setBackground(new java.awt.Color(255, 255, 255));
        tabla10mov.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        tabla10mov.setForeground(new java.awt.Color(0, 0, 0));
        tabla10mov.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Monto", "Descripción", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla10mov.setEnabled(false);
        tabla10mov.setFocusable(false);
        tabla10mov.setGridColor(new java.awt.Color(204, 204, 204));
        tabla10mov.setRowSelectionAllowed(false);
        tabla10mov.setShowGrid(true);
        tabla10mov.getTableHeader().setResizingAllowed(false);
        tabla10mov.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla10mov);
        if (tabla10mov.getColumnModel().getColumnCount() > 0) {
            tabla10mov.getColumnModel().getColumn(0).setMinWidth(100);
            tabla10mov.getColumnModel().getColumn(0).setPreferredWidth(100);
            tabla10mov.getColumnModel().getColumn(0).setMaxWidth(100);
            tabla10mov.getColumnModel().getColumn(1).setMinWidth(120);
            tabla10mov.getColumnModel().getColumn(1).setPreferredWidth(120);
            tabla10mov.getColumnModel().getColumn(1).setMaxWidth(120);
            tabla10mov.getColumnModel().getColumn(2).setMinWidth(300);
            tabla10mov.getColumnModel().getColumn(2).setPreferredWidth(300);
            tabla10mov.getColumnModel().getColumn(2).setMaxWidth(300);
            tabla10mov.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 300, 690, 190));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ultimos movimientos");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, 100));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Saldo actual:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 250, 80));

        saldoActual.setFont(new java.awt.Font("Lucida Sans", 0, 48)); // NOI18N
        saldoActual.setForeground(new java.awt.Color(0, 0, 0));
        add(saldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        btnEliminarCuenta.setBackground(new java.awt.Color(102, 204, 255));
        btnEliminarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarCuentaMouseExited(evt);
            }
        });
        btnEliminarCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reiniciar cuenta");
        btnEliminarCuenta.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 50));

        add(btnEliminarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 140, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCuentaMouseClicked
        int respuesta = JOptionPane.showConfirmDialog(null, "Desea reiniciar la cuenta y eliminar TODOS los registros?", "Confirmar reinicio de cuenta", 1);
        if (respuesta == 0){
            Cuenta.eliminarCuenta();
            colocarDatos();
            actualizarSaldo();
        }
    }//GEN-LAST:event_btnEliminarCuentaMouseClicked

    private void btnEliminarCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCuentaMouseEntered
        btnEliminarCuenta.setBackground(new Color(0, 204, 255));
    }//GEN-LAST:event_btnEliminarCuentaMouseEntered

    private void btnEliminarCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCuentaMouseExited
        btnEliminarCuenta.setBackground(new Color(102, 204, 255));
    }//GEN-LAST:event_btnEliminarCuentaMouseExited
    public void colocarDatos(){
       DefaultTableModel modelo = (DefaultTableModel) tabla10mov.getModel();
        modelo.setRowCount(0);
        Object[][] movimientos = Cuenta.mostrarUltimosMovimientos();
    
        for(Object[] mov:movimientos){
            String tipo = (String) mov[0];      
            Double monto = (Double) mov[1];     
            String descripcion = (String) mov[2]; 
            String fecha = (String) mov[3];      
            Object[] nuevaFila = {tipo, monto, descripcion, fecha};
            modelo.addRow(nuevaFila);
        }
        tabla10mov.revalidate();
        tabla10mov.repaint();
    }

    public void actualizarSaldo(){
        double saldo = Cuenta.obtenerSaldo();
        String saldoTxt = saldo+"$";
        
        saldoActual.setText(saldoTxt);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEliminarCuenta;
    private javax.swing.JPanel btnEliminarGasto;
    private javax.swing.JPanel btnEliminarGasto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel saldoActual;
    private javax.swing.JTable tabla10mov;
    // End of variables declaration//GEN-END:variables
}
