
package mysql_reinas;

public class CALIFICAR extends javax.swing.JInternalFrame {

    /**
     * Creates new form CALIFICAR
     */
    public CALIFICAR() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        belleza_r1 = new javax.swing.JTextField();
        belleza_r2 = new javax.swing.JTextField();
        belleza_r3 = new javax.swing.JTextField();
        inteligencia_r1 = new javax.swing.JTextField();
        inteligencia_r2 = new javax.swing.JTextField();
        inteligencia_r3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("REINA 1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("REINA 2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 100, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("REINA 3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        belleza_r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                belleza_r1ActionPerformed(evt);
            }
        });
        jPanel1.add(belleza_r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 80, -1));
        jPanel1.add(belleza_r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 80, -1));
        jPanel1.add(belleza_r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 80, -1));
        jPanel1.add(inteligencia_r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 80, -1));

        inteligencia_r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inteligencia_r2ActionPerformed(evt);
            }
        });
        jPanel1.add(inteligencia_r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 80, -1));
        jPanel1.add(inteligencia_r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 80, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("BELLEZA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("INTELIGENCIA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setForeground(new java.awt.Color(153, 255, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 300, 40));

        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 170, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/63c3623c89d36.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-510, -20, 1060, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inteligencia_r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inteligencia_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inteligencia_r2ActionPerformed
    
    private void belleza_r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_belleza_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_belleza_r1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField belleza_r1;
    private javax.swing.JTextField belleza_r2;
    private javax.swing.JTextField belleza_r3;
    private javax.swing.JTextField inteligencia_r1;
    private javax.swing.JTextField inteligencia_r2;
    private javax.swing.JTextField inteligencia_r3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
