
package ec.edu.espe.calculadora.resistencias.views;


import javax.swing.*;
import java.awt.*;


public class OpcionCalcularVista extends javax.swing.JFrame {

    private Tipo tipo;
    private String nombre;
    
    public OpcionCalcularVista(Tipo tipo, String nombre) {
        initComponents();
        this.tipo = tipo;
        this.nombre = nombre;
        jLabel1.setText("Ingrese el número de resistencias a calcular en " + tipo.getTipo() + ":");
        jSpinner1.setModel(new SpinnerNumberModel(2, 2, 5, 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonComenzar = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de resistencias");
        setIconImage(getIconImage());
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images/numero-icono.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        botonComenzar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        botonComenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images/comenzar-icono.png"))); // NOI18N
        botonComenzar.setText("Comenzar");
        botonComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione: ");

        botonRegresar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images/regresar-icono.png"))); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addGap(70, 70, 70)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(botonRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonComenzar)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonComenzar)
                    .addComponent(botonRegresar))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarActionPerformed
        // TODO add your handling code here:
        int numeroResistencias = (int) jSpinner1.getValue();
        
        if(numeroResistencias > 5 || numeroResistencias < 2){
            JOptionPane.showMessageDialog(null, "El número de resistencias debe estar entre 2 y 5", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        CalcularVista calcularVista = new CalcularVista(this,true, numeroResistencias , tipo);
        calcularVista.setVisible(true);
        
        
    }//GEN-LAST:event_botonComenzarActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:

        ElegirResistenciasVista elegirResistenciasVista = new ElegirResistenciasVista(null, false, nombre);
        elegirResistenciasVista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed
    
    public Image getIconImage() {
        return new ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images" +
                                                    "/resistor" +
                                                    "-icono.png")).getImage();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComenzar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
