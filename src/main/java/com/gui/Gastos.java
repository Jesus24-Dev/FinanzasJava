/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.gui;

import finanzasapp.Form;
import finanzasapp.modelos.Gasto;
import java.awt.Color;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Gastos extends javax.swing.JPanel {

    Gasto gasto;
    public Gastos() {
        initComponents();
        llenaMeses(mesComboBox);
        llenarAnios(yearComboBox);
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
        tablaGastos = new javax.swing.JTable();
        yearComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mesComboBox = new javax.swing.JComboBox<>();
        btnEliminarGasto = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnEditarGasto = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        errorTxt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Monto", "Descripción", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaGastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaGastosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaGastos);
        if (tablaGastos.getColumnModel().getColumnCount() > 0) {
            tablaGastos.getColumnModel().getColumn(0).setResizable(false);
            tablaGastos.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablaGastos.getColumnModel().getColumn(1).setResizable(false);
            tablaGastos.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaGastos.getColumnModel().getColumn(2).setResizable(false);
            tablaGastos.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 410, 420));

        yearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboBoxActionPerformed(evt);
            }
        });
        add(yearComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Buscar por...");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Año");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mes");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        mesComboBox.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        mesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesComboBoxActionPerformed(evt);
            }
        });
        add(mesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        btnEliminarGasto.setBackground(new java.awt.Color(102, 204, 255));
        btnEliminarGasto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarGasto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarGastoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarGastoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarGastoMouseExited(evt);
            }
        });
        btnEliminarGasto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eliminar");
        btnEliminarGasto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 50));

        add(btnEliminarGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 140, 50));

        btnEditarGasto.setBackground(new java.awt.Color(102, 204, 255));
        btnEditarGasto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarGasto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarGastoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarGastoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarGastoMouseExited(evt);
            }
        });
        btnEditarGasto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Editar");
        btnEditarGasto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 50));

        add(btnEditarGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 140, 50));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registro de gastos");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        errorTxt.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        errorTxt.setToolTipText("");
        errorTxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(errorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 260, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarGastoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarGastoMouseEntered
        btnEliminarGasto.setBackground(new Color(0, 204, 255));
    }//GEN-LAST:event_btnEliminarGastoMouseEntered

    private void btnEliminarGastoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarGastoMouseExited
        btnEliminarGasto.setBackground(new Color(102, 204, 255));
    }//GEN-LAST:event_btnEliminarGastoMouseExited

    private void btnEditarGastoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarGastoMouseEntered
        btnEditarGasto.setBackground(new Color(0, 204, 255));
    }//GEN-LAST:event_btnEditarGastoMouseEntered

    private void btnEditarGastoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarGastoMouseExited
        btnEditarGasto.setBackground(new Color(102, 204, 255));
    }//GEN-LAST:event_btnEditarGastoMouseExited

    private void yearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBoxActionPerformed
        colocarDatos();
    }//GEN-LAST:event_yearComboBoxActionPerformed

    private void mesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesComboBoxActionPerformed
        colocarDatos();
    }//GEN-LAST:event_mesComboBoxActionPerformed

    private void tablaGastosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGastosMouseClicked
        int row = tablaGastos.getSelectedRow();
        double monto = (double) tablaGastos.getValueAt(row, 0);
        String descripcion = (String) tablaGastos.getValueAt(row, 1);
        String fecha = (String) tablaGastos.getValueAt(row, 2);
        String[] partesFecha = fecha.split("-");
        String dia = partesFecha[0];
        String mes = partesFecha[1];
        String anio = partesFecha[2];
        
        gasto = new Gasto(1, dia, mes, anio, descripcion, monto);
    }//GEN-LAST:event_tablaGastosMouseClicked

    private void btnEliminarGastoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarGastoMouseClicked
        if(gasto != null){
            gasto.eliminarGasto();
            errorTxt.setText("Gasto eliminado");
            errorTxt.setForeground(Color.green);
            colocarDatos();
        } else {
            errorTxt.setText("Escoja una celda para eliminar.");
            errorTxt.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnEliminarGastoMouseClicked

    private void btnEditarGastoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarGastoMouseClicked
        if(gasto != null){
            Form.mostrarFormulario("Editar gasto", "GASTO", gasto.monto, gasto.descripcion, gasto.dia, gasto.mes, gasto.anio);
            errorTxt.setText("Ingreso editado");
            errorTxt.setForeground(Color.green);
            colocarDatos();
        } else {
            errorTxt.setText("Escoja una celda para editar.");
            errorTxt.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnEditarGastoMouseClicked

    public void colocarDatos(){
        
       DefaultTableModel modelo = (DefaultTableModel) tablaGastos.getModel();
        modelo.setRowCount(0);
        Object[][] movimientos = Gasto.verGastos(obtenerMes(), obtenerAnio());
    
        for(Object[] mov:movimientos){  
            Double monto = (Double) mov[0];     
            String descripcion = (String) mov[1]; 
            String fecha = (String) mov[2];      
            Object[] nuevaFila = {monto, descripcion, fecha};
            modelo.addRow(nuevaFila);
        }
        tablaGastos.revalidate();
        tablaGastos.repaint();
    }
    
    private void llenaMeses(JComboBox box){
        Date fechaActual = new Date();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for (String mese : meses) {
            box.addItem(mese);
        }
        box.setSelectedIndex(fechaActual.getMonth());
    }
    
    private void llenarAnios(JComboBox box){
        Date fechaActual = new Date();
        int anioActual = fechaActual.getYear() + 1900;
        Integer[] years = new Integer[(anioActual - 2000) + 1];
        int currentYear = anioActual;
        for (int i = 0; i < years.length; i++) {
            years[i] = currentYear - i;
            box.addItem(Integer.toString(years[i]));
        }
    }
    
    public String obtenerMes(){
        String mes = (String) mesComboBox.getSelectedItem();
        
        return mes;
    }
    public String obtenerAnio(){
        String anio = (String) yearComboBox.getSelectedItem();
        
        return anio;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEditarGasto;
    private javax.swing.JPanel btnEliminarGasto;
    private javax.swing.JLabel errorTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mesComboBox;
    private javax.swing.JTable tablaGastos;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
