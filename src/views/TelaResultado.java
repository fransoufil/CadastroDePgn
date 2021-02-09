/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author franz
 */
public class TelaResultado extends javax.swing.JFrame {

    public TelaResultado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnEmpate = new javax.swing.JButton();
        btnDerrota = new javax.swing.JButton();
        btnVitoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FINAL");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEmpate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/empate.png"))); // NOI18N
        btnEmpate.setText("EMPATE");
        btnEmpate.setToolTipText("");
        btnEmpate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmpate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpateActionPerformed(evt);
            }
        });

        btnDerrota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/derrota.png"))); // NOI18N
        btnDerrota.setText("DERROTA");
        btnDerrota.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDerrota.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDerrota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerrotaActionPerformed(evt);
            }
        });

        btnVitoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vitoria.png"))); // NOI18N
        btnVitoria.setText("VITÓRIA");
        btnVitoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVitoria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVitoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVitoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnVitoria, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btnEmpate, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnDerrota, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEmpate, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDerrota, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVitoria, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(919, 385));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVitoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVitoriaActionPerformed

        this.dispose();
        TelaPecas telapecas = new TelaPecas();

        telapecas.setVisible(true);

        TelaPecas.lblResultado.setText("VITÓRIA");
        TelaPecas.lblSiglaResultado.setText("v");
    }//GEN-LAST:event_btnVitoriaActionPerformed

    private void btnEmpateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpateActionPerformed
        this.dispose();
        TelaPecas telapecas = new TelaPecas();

        telapecas.setVisible(true);

        TelaPecas.lblResultado.setText("EMPATE");
        TelaPecas.lblSiglaResultado.setText("e");        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpateActionPerformed

    private void btnDerrotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerrotaActionPerformed
        this.dispose();
        TelaPecas telapecas = new TelaPecas();

        telapecas.setVisible(true);

        TelaPecas.lblResultado.setText("DERROTA");
        TelaPecas.lblSiglaResultado.setText("d");        // TODO add your handling code here:
    }//GEN-LAST:event_btnDerrotaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDerrota;
    private javax.swing.JButton btnEmpate;
    private javax.swing.JButton btnVitoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
