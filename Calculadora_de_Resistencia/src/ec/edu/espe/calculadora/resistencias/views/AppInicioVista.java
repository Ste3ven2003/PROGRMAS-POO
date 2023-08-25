/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package ec.edu.espe.calculadora.resistencias.views;

import org.bson.Document;

import javax.swing.*;
import java.awt.*;
import java.sql.Time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class AppInicioVista extends javax.swing.JFrame {
    
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final LocalDate DATE = LocalDate.now();
    private static final Time TIME = new Time(System.currentTimeMillis());
    public AppInicioVista() {
        initComponents();
        TextPrompt placeholderNombre = new TextPrompt("Ingrese su nombre", textFieldNombre);
        TextPrompt placeholderApellido = new TextPrompt("Ingrese su apellido", textFieldApellido);
        placeholderNombre.changeAlpha(0.75f);
        placeholderNombre.changeStyle(Font.ITALIC);
        placeholderApellido.changeAlpha(0.75f);
        placeholderApellido.changeStyle(Font.ITALIC);
        //ConnectionDB.guardarURL();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonIngresar = new javax.swing.JButton();
        textFieldNombre = new javax.swing.JTextField();
        textFieldApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de resistencias");
        setIconImage(getIconImage());
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images/persona-icono.png"))); // NOI18N
        jLabel1.setText("Ingrese sus datos");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images/nombre-apellido-icono.png"))); // NOI18N
        jLabel2.setText("Nombre");

        botonIngresar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        botonIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images/ingresar-icono.png"))); // NOI18N
        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        textFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldNombreKeyTyped(evt);
            }
        });

        textFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldApellidoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images/nombre-apellido-icono.png"))); // NOI18N
        jLabel3.setText("Apellido");

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ayuda");

        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images/acercade-icono.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Acerca de");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(64, 64, 64)
                        .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(64, 64, 64)
                            .addComponent(textFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(botonIngresar)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        String txtnombreText = textFieldNombre.getText();
        String txtapellidoText = textFieldApellido.getText();
        if(txtnombreText.isBlank() || txtapellidoText.isBlank()) {
            JOptionPane.showMessageDialog(null, "Algún campo está vacío");
        } else {
            Document document = new Document();
            DATE.format(DATE_TIME_FORMATTER);
            document.put("nombre", txtnombreText);
            document.put("apellido", txtapellidoText);
            document.put("fecha", DATE.toString());
            document.put("hora", TIME.toString());
            ConnectionDB.getCollection().insertOne(document);
            
            ElegirResistenciasVista opciones = new ElegirResistenciasVista(this, true, txtnombreText +
                                                                                       " " +txtapellidoText);
            opciones.setVisible(true);
            this.dispose();
        }//GEN-LAST:event_botonIngresarActionPerformed
    }

    private void textFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
        if(!TextFieldValidation.onlyLetters(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textFieldNombreKeyTyped

    private void textFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldApellidoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
        if(!TextFieldValidation.onlyLetters(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_textFieldApellidoKeyTyped
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppInicioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppInicioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppInicioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppInicioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppInicioVista().setVisible(true);
            }
        });
    }

    public Image getIconImage() {
       return new ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images" +
                                                   "/resistor" +
                                                   "-icono.png")).getImage();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField textFieldApellido;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables

}
