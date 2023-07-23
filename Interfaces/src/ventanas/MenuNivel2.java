/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

/**
 *
 * @author User
 */
public class MenuNivel2 extends javax.swing.JFrame {
    
    private String nombreUsuario;

    /**
     * Creates new form Menu
     */
    public MenuNivel2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    public void metodoEjemplo() {
        // Aquí puedes utilizar la variable nombreUsuario
        System.out.println("Nombre de usuario: " + nombreUsuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMenuPrincipal = new javax.swing.JLabel();
        jButtonCalificar = new javax.swing.JButton();
        jLabelCalificar = new javax.swing.JLabel();
        jLabelSalir = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jLabelImformacion = new javax.swing.JLabel();
        jButtonInformacion = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMenuPrincipal.setBackground(new java.awt.Color(0, 0, 204));
        jLabelMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabelMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMenuPrincipal.setText("Menu Nivel 2");
        getContentPane().add(jLabelMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jButtonCalificar.setBackground(new java.awt.Color(102, 102, 0));
        jButtonCalificar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonCalificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCalificar.setText("Select");
        jButtonCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCalificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 130, 30));

        jLabelCalificar.setBackground(new java.awt.Color(0, 0, 153));
        jLabelCalificar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelCalificar.setForeground(new java.awt.Color(255, 255, 102));
        jLabelCalificar.setText("Calificar");
        getContentPane().add(jLabelCalificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabelSalir.setBackground(new java.awt.Color(0, 0, 204));
        jLabelSalir.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelSalir.setForeground(new java.awt.Color(255, 255, 0));
        jLabelSalir.setText("Salir ");
        getContentPane().add(jLabelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, -1, -1));

        jButtonSalir.setBackground(new java.awt.Color(102, 102, 0));
        jButtonSalir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Select");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 130, 30));

        jLabelImformacion.setBackground(new java.awt.Color(0, 0, 153));
        jLabelImformacion.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelImformacion.setForeground(new java.awt.Color(255, 255, 0));
        jLabelImformacion.setText("Informacion");
        getContentPane().add(jLabelImformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jButtonInformacion.setBackground(new java.awt.Color(102, 102, 0));
        jButtonInformacion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonInformacion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInformacion.setText("Select");
        jButtonInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformacionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 120, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/R11.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, -10, 750, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificarActionPerformed
     // Cerrar la ventana actual
    dispose();
    
    // Crear una instancia de la nueva ventana
    CalificarReinaForm calificarReinaForm = new CalificarReinaForm();
    
    // Hacer visible el JFrame
    calificarReinaForm.setVisible(true);
    
    }//GEN-LAST:event_jButtonCalificarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
    System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformacionActionPerformed
     // Cerrar la ventana actual
    dispose();
    
    // Crear una instancia de la nueva ventana
    InformacionReinasForm informacionReinaForm = new InformacionReinasForm();
    
    // Hacer visible el JFrame
    informacionReinaForm.setVisible(true);
    }//GEN-LAST:event_jButtonInformacionActionPerformed

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
            java.util.logging.Logger.getLogger(MenuNivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuNivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuNivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuNivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuNivel2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalificar;
    private javax.swing.JButton jButtonInformacion;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelCalificar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelImformacion;
    private javax.swing.JLabel jLabelMenuPrincipal;
    private javax.swing.JLabel jLabelSalir;
    // End of variables declaration//GEN-END:variables
}