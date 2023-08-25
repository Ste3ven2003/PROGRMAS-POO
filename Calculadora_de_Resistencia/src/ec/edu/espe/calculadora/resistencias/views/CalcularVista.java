/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ec.edu.espe.calculadora.resistencias.views;

import com.mongodb.client.MongoClient;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;


public class CalcularVista extends javax.swing.JDialog {
   
   private final Tipo tipo;
   private int i;
   
   private final List<JTextField> resistencias;
   private final List<JComboBox<String>> unidades;
   
   private final MongoClient mongoClient = ConnectionDB.getMongoClient();
   
   private final String url64 = mongoClient.getDatabase("usuarios").getCollection("url").find().first().getString(
      "url64");
   private final String url32 = mongoClient.getDatabase("usuarios").getCollection("url").find().first().getString(
      "url32");
   
   public CalcularVista(java.awt.Frame parent, boolean modal, int i, Tipo tipo) {
      super(parent, modal);
      initComponents();
      this.tipo = tipo;
      this.i = i;
      this.resistencias = new ArrayList<>();
      this.unidades = new ArrayList<>();
      generarResistencias();
      for(JTextField textField : resistencias) {
         textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
               char caracter = evt.getKeyChar();
               if((Character.isLetter(caracter) || (caracter == KeyEvent.VK_SPACE))) {
                  evt.consume();
               }
            }
         });
      }
   }
   
   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {
      
      jLabel2 = new javax.swing.JLabel();
      botonCalcular = new javax.swing.JButton();
      jPanel1 = new javax.swing.JPanel() {
         @Override
         protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            generarLineas(g);
         }
      };
      
      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("Calculadora de resistencias");
      setIconImage(getIconImage());
      setResizable(false);
      
      jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
      jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel2.setIcon(new javax.swing.ImageIcon(
         getClass().getResource("/ec/edu/espe/calculadora/resistencias/images/numero-icono.png"))); // NOI18N
      jLabel2.setText("Ingrese la resistencia de cada una de las resistencias");
      
      botonCalcular.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
      botonCalcular.setIcon(new javax.swing.ImageIcon(
         getClass().getResource("/ec/edu/espe/calculadora/resistencias/images/calcular-icono.png"))); // NOI18N
      botonCalcular.setText("Cacular");
      botonCalcular.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            botonCalcularActionPerformed(evt);
         }
      });
      
      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 276, Short.MAX_VALUE));
      
      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout
                                   .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(layout
                                                .createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout
                                                             .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                             .addComponent(jLabel2,
                                                                           javax.swing.GroupLayout.PREFERRED_SIZE, 628,
                                                                           javax.swing.GroupLayout.PREFERRED_SIZE)
                                                             .addComponent(botonCalcular,
                                                                           javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                   .addGroup(layout
                                                .createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                              javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap()));
      layout.setVerticalGroup(layout
                                 .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(layout
                                              .createSequentialGroup()
                                              .addContainerGap()
                                              .addComponent(jLabel2)
                                              .addGap(18, 18, 18)
                                              .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                              .addGap(18, 18, 18)
                                              .addComponent(botonCalcular)
                                              .addGap(30, 30, 30)));
      
      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents
   
   private void botonCalcularActionPerformed(
      java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
      Resistencia resistencia = new Resistencia();
      
      List<Double> valores = new ArrayList<>();
      
      for(JTextField textField : resistencias) {
         if(textField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el valor de todas las resistencias", "Error",
                                          JOptionPane.ERROR_MESSAGE);
            return;
         }
      }
      
      for(int i = 0; i < resistencias.size(); i++) {
         switch(unidades.get(i).getSelectedItem().toString()) {
            case "Ω" -> valores.add(Double.parseDouble(resistencias.get(i).getText()));
            case "KΩ" -> valores.add(Double.parseDouble(resistencias.get(i).getText()) * 1000);
            case "MΩ" -> valores.add(Double.parseDouble(resistencias.get(i).getText()) * 1000000);
         }
         
      }
      
      if(Tipo.SERIE == tipo) {
         JOptionPane.showMessageDialog(this, "El valor de la resistencia total es: " +
                                             Resistencia.DECIMAL_FORMAT.format(
                                                resistencia.calcularResistenciasSerie(valores)) + " Ω", "Resultado",
                                       JOptionPane.INFORMATION_MESSAGE);
      }
      if(Tipo.PARALELO == tipo) {
         JOptionPane.showMessageDialog(this, "El valor de la resistencia total es: " +
                                             Resistencia.DECIMAL_FORMAT.format(
                                                resistencia.calcularResistenciasParalelo(valores)) + " Ω", "Resultado",
                                       JOptionPane.INFORMATION_MESSAGE);
      }
      limpiarCampos();
   }//GEN-LAST:event_botonCalcularActionPerformed
   
   public Image getIconImage() {
      return new ImageIcon(getClass().getResource(
         "/ec/edu/espe/calculadora/resistencias/images" + "/resistor" + "-icono.png")).getImage();
   }
   
   private void generarResistencias() {
      JLabel label;
      JLabel labelText;
      JTextField textField;
      JComboBox<String> comboBox;
      if(Tipo.SERIE == tipo) {
         int x = 40;
         for(int i = 0; i < this.i; i++) {
            label = new JLabel();
            labelText = new JLabel();
            
            label.setIcon(new ImageIcon(getClass().getResource(url64)));
            label.setLocation(x, 50);
            label.setSize(64, 64);
            
            jPanel1.add(label);
            drawHorizontalLine(this.getGraphics(), x + 64, 64, 64, 64);
            labelText.setText("R" + (i + 1));
            labelText.setLocation(x + 20, 120);
            labelText.setSize(50, 30);
            jPanel1.add(labelText);
            textField = new JTextField();
            textField.setLocation(x, 200);
            textField.setSize(50, 30);
            jPanel1.add(textField);
            
            comboBox = new JComboBox<>();
            comboBox.addItem("Ω");
            comboBox.addItem("KΩ");
            comboBox.addItem("MΩ");
            comboBox.setLocation(x, 230);
            comboBox.setSize(70, 30);
            jPanel1.add(comboBox);
            x += 125;
            resistencias.add(textField);
            unidades.add(comboBox);
            drawHorizontalLine(jPanel1.getGraphics(), x, 64, x, 64);
         }
         
      }
      if(Tipo.PARALELO == tipo) {
         int y = 0;
         int x = 300;
         for(int i = 0; i < this.i; i++) {
            label = new JLabel();
            labelText = new JLabel();
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(url32));
            label.setIcon(imageIcon);
            label.setLocation(x + 40, y);
            label.setSize(32, 32);
            
            jPanel1.add(label);
            
            labelText.setText("R" + (i + 1));
            labelText.setLocation(x - 20, y);
            labelText.setSize(50, 30);
            jPanel1.add(labelText);
            textField = new JTextField();
            textField.setLocation(x - 150, y);
            textField.setSize(50, 30);
            jPanel1.add(textField);
            
            comboBox = new JComboBox<>();
            comboBox.addItem("Ω");
            comboBox.addItem("KΩ");
            comboBox.addItem("MΩ");
            comboBox.setLocation(x - 100, y);
            comboBox.setSize(70, 30);
            jPanel1.add(comboBox);
            
            y += 50;
            resistencias.add(textField);
            unidades.add(comboBox);
         }
         
      }
      
   }
   
   private void limpiarCampos() {
      for(JTextField textField : resistencias) {
         textField.setText("");
      }
   }
   
   private void drawHorizontalLine(Graphics graphics, int x1, int y1, int x2, int y2) {
      Graphics2D g2 = (Graphics2D) graphics;
      g2.setColor(Color.BLACK);
      g2.setStroke(new BasicStroke(5));
      g2.draw(new Line2D.Float(x1, y1, x2, y2));
   }
   
   private void drawVerticalLine(Graphics graphics, int x1, int y1, int x2, int y2) {
      Graphics2D g2 = (Graphics2D) graphics;
      g2.setColor(Color.BLACK);
      g2.setStroke(new BasicStroke(3));
      g2.draw(new Line2D.Float(new Point(x1, y1), new Point(x2, y2)));
   }
   
   private void generarLineas(Graphics g) {
      
      if(Tipo.SERIE == tipo) {
         drawHorizontalLine(g, 15, 81, 40, 81);
         int x = 39;
         for(int i = 0; i < this.i; i++) {
            drawHorizontalLine(g, x + 64, 81, x + 125, 81);
            x += 125;
         }
         
      }
      if(Tipo.PARALELO == tipo) {
         int y = 15;
         drawVerticalLine(g, 340, 0, 340, y + 50);
         drawVerticalLine(g, 370, 0, 370, y + 50);
         for(int i = 0; i < this.i; i++) {
            drawVerticalLine(g, 340, y, 340, y + 50);
            drawVerticalLine(g, 370, y, 370, y + 50);
            y += 40;
         }
         
      }
      
   }
   
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton botonCalcular;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JPanel jPanel1;
   // End of variables declaration//GEN-END:variables
}