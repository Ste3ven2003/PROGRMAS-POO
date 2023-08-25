
package ec.edu.espe.calculadora.resistencias.views;



import javax.swing.*;
import java.awt.*;


public class ElegirResistenciasVista extends javax.swing.JDialog {

    private String nombre;
    
    public ElegirResistenciasVista(java.awt.Frame parent, boolean modal, String nombre) {
        super(parent, modal);
        initComponents();
        this.nombre = nombre;
        labelInformacion.setText("Hola " + nombre + ", elige una opción para calcular resistencias");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botonParalelo = new javax.swing.JButton();
        botonSerie = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        labelInformacion = new javax.swing.JLabel();
        botonDeltaEstrella = new javax.swing.JButton();
        botonEstrellaDelta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora de resistencias");
        setIconImage(getIconImage());
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images/resistor-icono.png"))); // NOI18N
        jLabel1.setText("Calculadora de resistencias equivalentes");

        botonParalelo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        botonParalelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images/paralelo-icono.png"))); // NOI18N
        botonParalelo.setText("Calcular Resistencia en Paralelo");
        botonParalelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonParaleloActionPerformed(evt);
            }
        });

        botonSerie.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        botonSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images/serie-icono.png"))); // NOI18N
        botonSerie.setText("Calcular resistencia en Serie");
        botonSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSerieActionPerformed(evt);
            }
        });

        labelInformacion.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        labelInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botonDeltaEstrella.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        botonDeltaEstrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images/serie-icono.png"))); // NOI18N
        botonDeltaEstrella.setText("Calcular resistencia delta-estrella");
        botonDeltaEstrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeltaEstrellaActionPerformed(evt);
            }
        });

        botonEstrellaDelta.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        botonEstrellaDelta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images/serie-icono.png"))); // NOI18N
        botonEstrellaDelta.setText("Calcular resistencia estrella-delta");
        botonEstrellaDelta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstrellaDeltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addComponent(labelInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonDeltaEstrella, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonParalelo, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonSerie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEstrellaDelta))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonParalelo)
                    .addComponent(botonSerie))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonDeltaEstrella)
                    .addComponent(botonEstrellaDelta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInformacion)
                .addGap(11, 11, 11))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonParaleloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonParaleloActionPerformed
        OpcionCalcularVista opcionCalcularVista = new OpcionCalcularVista(Tipo.PARALELO, nombre);
        opcionCalcularVista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonParaleloActionPerformed
    
    private void botonSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSerieActionPerformed
        OpcionCalcularVista opcionCalcularVista = new OpcionCalcularVista(Tipo.SERIE, nombre);
        opcionCalcularVista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonSerieActionPerformed

    private void botonDeltaEstrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeltaEstrellaActionPerformed
        CalcularVistaDeltaEstrella calcularVistaDeltaEstrella = new CalcularVistaDeltaEstrella(null, true,
                                                                                               Tipo.DELTA_ESTRELLA);
        calcularVistaDeltaEstrella.setVisible(true);
        
    }//GEN-LAST:event_botonDeltaEstrellaActionPerformed

    private void botonEstrellaDeltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstrellaDeltaActionPerformed
        CalcularVistaDeltaEstrella calcularVistaDeltaEstrella = new CalcularVistaDeltaEstrella(null, true,
                                                                                               Tipo.ESTRELLA_DELTA);
        calcularVistaDeltaEstrella.setVisible(true);
    }//GEN-LAST:event_botonEstrellaDeltaActionPerformed
    
    public Image getIconImage() {
        return new ImageIcon(getClass().getResource("/ec/edu/espe/calculadora/resistencias/images" +
                                                    "/resistor" +
                                                    "-icono.png")).getImage();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDeltaEstrella;
    private javax.swing.JButton botonEstrellaDelta;
    private javax.swing.JButton botonParalelo;
    private javax.swing.JButton botonSerie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelInformacion;
    // End of variables declaration//GEN-END:variables
}
