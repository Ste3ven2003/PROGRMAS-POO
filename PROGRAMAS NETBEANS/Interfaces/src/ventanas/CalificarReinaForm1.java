/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class CalificarReinaForm1 extends javax.swing.JFrame {
    
    private int inteligencia1;
    private int belleza1;
    private static String nombreUsuario;
 
    

    /**
     * Creates new form CalificarReinaForm1
     */
    public CalificarReinaForm1() {
        initComponents();
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        CalificarReinaForm1.nombreUsuario = nombreUsuario; // Establecer el valor en la variable estática
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelInteligencia = new javax.swing.JLabel();
        jLabelBelleza = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jTextFieldInteligencia = new javax.swing.JTextField();
        jTextFieldBelleza = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(51, 51, 0));
        jLabelTitulo.setText("Calificar Reina 1");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jLabelInteligencia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelInteligencia.setForeground(new java.awt.Color(51, 51, 0));
        jLabelInteligencia.setText("Ingrese la puntuación de Inteligencia (entre 0 y 10):");
        getContentPane().add(jLabelInteligencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 40));

        jLabelBelleza.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelBelleza.setForeground(new java.awt.Color(51, 51, 0));
        jLabelBelleza.setText("Ingrese la puntuación de Belleza (entre 0 y 10):");
        getContentPane().add(jLabelBelleza, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 30));

        jButtonGuardar.setBackground(new java.awt.Color(153, 153, 0));
        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar Datos");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 210, 40));

        jButtonRegresar.setBackground(new java.awt.Color(153, 153, 0));
        jButtonRegresar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 570, 170, 40));

        jTextFieldInteligencia.setBackground(new java.awt.Color(102, 102, 0));
        jTextFieldInteligencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInteligenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldInteligencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 180, 30));

        jTextFieldBelleza.setBackground(new java.awt.Color(102, 102, 0));
        jTextFieldBelleza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBellezaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBelleza, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 170, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/R.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-810, 50, 1510, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
     try {
            // Obtener los datos de inteligencia y belleza ingresados en los campos de texto
            inteligencia1 = Integer.parseInt(jTextFieldInteligencia.getText());
            belleza1 = Integer.parseInt(jTextFieldBelleza.getText());

            // Obtener el nombre de usuario
           

            // Guardar los datos en la base de datos
            try {
                // Establecer la conexión con la base de datos
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/reinas", "root", "");

                // Preparar la sentencia SQL para insertar los datos
                String sql = "INSERT INTO reinas (nombre, calificacion_inteligencia, calificacion_belleza, nombre_usuario) VALUES (?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);

                // Establecer los valores de los parámetros
                statement.setString(1, "Reina 1");
                statement.setInt(2, inteligencia1);
                statement.setInt(3, belleza1);
                statement.setString(4, CalificarReinaForm1.nombreUsuario);

                // Ejecutar la sentencia SQL
                statement.executeUpdate();

                // Cerrar la conexión y liberar recursos
                statement.close();
                connection.close();

                // Mostrar un mensaje de éxito al usuario
                JOptionPane.showMessageDialog(this, "Los datos se guardaron correctamente en la base de datos.");
            } catch (SQLException e) {
                // Mostrar un mensaje de error si ocurre algún problema con la base de datos
                JOptionPane.showMessageDialog(this, "Error al guardar los datos en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Mostrar mensaje de confirmación
            JOptionPane.showMessageDialog(this, "Los datos se han guardado exitosamente.", "Guardado exitoso", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            // Mostrar mensaje de error si los datos ingresados no son válidos
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para la inteligencia y la belleza.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
    // Cerrar la ventana actual
    dispose();

    // Crear una instancia de la ventana anterior (Menu)
    CalificarReinaForm menu = new CalificarReinaForm();

    // Pasar los datos guardados a la ventana de información
    menu.setDato(Integer.toString(inteligencia1));
    menu.setDato1(Integer.toString(belleza1));

    // Hacer visible el JFrame
    menu.setVisible(true);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jTextFieldInteligenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInteligenciaActionPerformed
        // TODO add your handling code here:
    // TODO add your handling code here:
    String inteligenciaText = jTextFieldInteligencia.getText();

    // Validar que el texto sea un número entre 0 y 10
    try {
        int inteligencia1 = Integer.parseInt(inteligenciaText);
        if (inteligencia1 < 0 || inteligencia1 > 10) {
            // Mostrar mensaje de error si el número está fuera del rango
            JOptionPane.showMessageDialog(this, "Ingrese un número entre 0 y 10 para la inteligencia.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            
        }
    } catch (NumberFormatException e) {
        // Mostrar mensaje de error si el texto no es un número válido
        JOptionPane.showMessageDialog(this, "Ingrese un número válido para la inteligencia.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jTextFieldInteligenciaActionPerformed

    private void jTextFieldBellezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBellezaActionPerformed
        // TODO add your handling code here:
    // TODO add your handling code here:
    // Obtener el texto ingresado en el campo de belleza
    String bellezaText = jTextFieldBelleza.getText();

    // Validar que el texto sea un número entre 0 y 10
    try {
        int belleza1 = Integer.parseInt(bellezaText);
        if (belleza1 < 0 || belleza1 > 10) {
            // Mostrar mensaje de error si el número está fuera del rango
            JOptionPane.showMessageDialog(this, "Ingrese un número entre 0 y 10 para la belleza.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
           
        }
    } catch (NumberFormatException e) {
        // Mostrar mensaje de error si el texto no es un número válido
        JOptionPane.showMessageDialog(this, "Ingrese un número válido para la belleza.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jTextFieldBellezaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CalificarReinaForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalificarReinaForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalificarReinaForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalificarReinaForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalificarReinaForm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelBelleza;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelInteligencia;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldBelleza;
    private javax.swing.JTextField jTextFieldInteligencia;
    // End of variables declaration//GEN-END:variables


}