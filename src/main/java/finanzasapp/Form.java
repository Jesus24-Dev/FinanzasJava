/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finanzasapp;

import finanzasapp.modelos.Ingreso;
import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Form extends JDialog {

    static JTextField campoMonto;
    static JTextField campoDescripcion;
    static JComboBox<String> dia;
    static JComboBox<String> mes;
    static JComboBox<String> anio;
    
    static double montoActual;
    static String descActual;
    static String diaActual;
    static String mesActual;
    static String anioActual;
    
    
    public Form(String titulo, String tipo, Double monto, String descripcion, String diaMov, String mesMov, String anioMov) {
        super((Frame) null, titulo, true);
        setSize(350, 400);
        setLayout(null); 
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(102, 204, 255)); 

        Font fuente = new Font("Lucida Sans", Font.BOLD, 14);
        Color colorTexto = Color.WHITE;

        JLabel labelMonto = new JLabel("Monto:");
        labelMonto.setBounds(30, 30, 100, 25);
        labelMonto.setFont(fuente);
        labelMonto.setForeground(colorTexto);
        add(labelMonto);

        campoMonto = new JTextField();
        campoMonto.setBounds(150, 30, 150, 25);
        campoMonto.setFont(fuente);
        campoMonto.setForeground(Color.BLACK);
        campoMonto.setBackground(new Color(255, 255, 255));
        add(campoMonto);

        JLabel labelDescripcion = new JLabel("Descripción:");
        labelDescripcion.setBounds(30, 80, 100, 25);
        labelDescripcion.setFont(fuente);
        labelDescripcion.setForeground(colorTexto);
        add(labelDescripcion);

        campoDescripcion = new JTextField();
        campoDescripcion.setBounds(150, 80, 150, 25);
        campoDescripcion.setFont(fuente);
        campoDescripcion.setForeground(Color.BLACK);
        campoDescripcion.setBackground(new Color(255, 255, 255));
        add(campoDescripcion);

        JLabel comboLabel1 = new JLabel("Opción 1:");
        comboLabel1.setBounds(30, 130, 100, 25);
        comboLabel1.setFont(fuente);
        comboLabel1.setForeground(colorTexto);
        add(comboLabel1);

        dia = new JComboBox<>();
        dia.setBounds(150, 130, 150, 25);
        dia.setFont(fuente);
        dia.setForeground(Color.BLACK);
        llenaDias(dia);
        add(dia);    
        JLabel comboLabel2 = new JLabel("Opción 2:");
        comboLabel2.setBounds(30, 170, 100, 25);
        comboLabel2.setFont(fuente);
        comboLabel2.setForeground(colorTexto);
        add(comboLabel2);

        mes = new JComboBox<>();
        mes.setBounds(150, 170, 150, 25);
        mes.setFont(fuente);
        mes.setForeground(Color.BLACK);
        llenaMeses(mes);
        add(mes);

        JLabel comboLabel3 = new JLabel("Opción 3:");
        comboLabel3.setBounds(30, 210, 100, 25);
        comboLabel3.setFont(fuente);
        comboLabel3.setForeground(colorTexto);
        add(comboLabel3);

        anio = new JComboBox<>();
        anio.setBounds(150, 210, 150, 25);
        anio.setFont(fuente);
        anio.setForeground(Color.BLACK);
        llenarAnios(anio);
        add(anio);

        // Botón de "Enviar"
        JButton botonEnviar = new JButton("Enviar");
        botonEnviar.setBounds(100, 270, 150, 30);
        botonEnviar.setFont(fuente);
        botonEnviar.setForeground(Color.BLACK);
        botonEnviar.setBackground(Color.WHITE);
        add(botonEnviar);

        
        campoMonto.setText(monto+"");
        campoDescripcion.setText(descripcion);
        dia.setSelectedItem(diaMov);
        mes.setSelectedItem(mesMov);
        anio.setSelectedItem(anioMov);
        
        botonEnviar.addActionListener(e -> {
            if (tipo.equals("INGRESO")){
                System.out.println("se registra ingreso");
            } else if (tipo.equals("GASTO")){
                System.out.println("se registra gasto");
            }
            dispose(); 
        });
    }

    public static void mostrarFormulario(String titulo, String tipo, Double monto, String descripcion, String diaMov, String mesMov, String anioMov) {
        Form dialogo = new Form(titulo, tipo, monto, descripcion, diaMov, mesMov, anioMov);
        dialogo.setVisible(true);
    }
    
    private void llenaDias(JComboBox box){
        Date fechaActual = new Date();
        for (int i = 1; i <= 31; i++){
            box.addItem(Integer.toString(i));
        }
    }
    
    private void llenaMeses(JComboBox box){
        Date fechaActual = new Date();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for (String mese : meses) {
            box.addItem(mese);
        }
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
    
   
}
