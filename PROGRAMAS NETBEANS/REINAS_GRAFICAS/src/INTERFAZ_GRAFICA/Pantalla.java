
package INTERFAZ_GRAFICA;
import java.awt.Font;
import reinas_graficas.*;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Pantalla extends javax.swing.JFrame {
    private JTextArea outputTextArea;
    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Campo_usuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        Campo_pasword = new javax.swing.JPasswordField();
        Ingresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel1.setText("USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        Campo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(Campo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 150, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 690, 680));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));
        jPanel1.add(Campo_pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 150, 30));

        Ingresar.setText("INGRESAR");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 150, 39));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 150, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDO/FONDO1.jpeg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed

        String password = Campo_pasword.getText();
        String usuario = Campo_usuario.getText();
        Usuario Usuario1 = new Usuario();
        boolean autenticado = Usuario1.miFuncion(usuario, password);
        if (autenticado) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            calificarReinas();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_IngresarActionPerformed

    private void Campo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_usuarioActionPerformed
private void calificarReinas() {
        Reinas reina1 = new Reinas();
        Reinas reina2 = new Reinas();
        Reinas reina3 = new Reinas();
        ArrayList<String> reinas = new ArrayList<String>();
        do {
            String[] opcionesReina = {"Reina 1", "Reina 2", "Reina 3", "Salir"};
            int opcionReina = JOptionPane.showOptionDialog(this, "Seleccione una reina", "Calificar",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesReina, opcionesReina[0]);
            int BellezaReina,InteligenciaReina;
            switch (opcionReina) {
                case 0:
                    do {
                        BellezaReina = obtenerCalificacion("Ingrese la calificación de belleza (1-10):");
                        InteligenciaReina = obtenerCalificacion("Ingrese la calificación de inteligencia (1-10):");
                    } while (!(BellezaReina >= 1 && BellezaReina <= 10 && InteligenciaReina >= 1 && InteligenciaReina <= 10));
                    String Dato_reina1= reina1.datos_reinas(BellezaReina , InteligenciaReina);
                    reinas.add(Dato_reina1);
                    break;
                case 1:
                    do {
                        BellezaReina = obtenerCalificacion("Ingrese la calificación de belleza (1-10):");
                        InteligenciaReina = obtenerCalificacion("Ingrese la calificación de inteligencia (1-10):");
                    } while (!(BellezaReina >= 1 && BellezaReina <= 10 && InteligenciaReina >= 1 && InteligenciaReina <= 10));
                    String Dato_reina2=reina1.datos_reinas(BellezaReina , InteligenciaReina);
                    reinas.add(Dato_reina2);
                    break;
                case 2:
                    do {
                        BellezaReina = obtenerCalificacion("Ingrese la calificación de belleza (1-10):");
                        InteligenciaReina = obtenerCalificacion("Ingrese la calificación de inteligencia (1-10):");
                    } while (!(BellezaReina >= 1 && BellezaReina <= 10 && InteligenciaReina >= 1 && InteligenciaReina <= 10));
                    String Dato_reina3=reina1.datos_reinas(BellezaReina , InteligenciaReina);
                    reinas.add(Dato_reina3);
                    break;
                case 3:
                    jTextArea1.setText("CALIFICACIONES DE LAS REINAS\n");
                    Font font = new Font(jTextArea1.getFont().getName(), Font.BOLD, 64);
                    jTextArea1.setFont(font);
                    for (int i = 0;i < reinas.size();i++){
                            int contador=i+1;
                        jTextArea1.append("REINA #"+contador+": \n"+reinas.get(i)+"\n");
                        }
                    return;
            }
        } while (true);
    }
private int obtenerCalificacion(String mensaje) {
        int calificacion;
        while (true) {
            try {
                calificacion = Integer.parseInt(JOptionPane.showInputDialog(this, mensaje));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error: Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return calificacion;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Campo_pasword;
    private javax.swing.JTextField Campo_usuario;
    private javax.swing.JButton Ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
