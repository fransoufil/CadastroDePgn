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
public class TelaTipo extends javax.swing.JFrame {

    /**
     * Creates new form TelaTipo
     */
    public TelaTipo() {
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
        btnPc = new javax.swing.JButton();
        btnPesxPc = new javax.swing.JButton();
        btnPcxPc = new javax.swing.JButton();
        btnPessoal = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblResulado = new javax.swing.JLabel();
        lblPecas = new javax.swing.JLabel();
        lblSiglaResultado = new javax.swing.JLabel();
        lblSiglaPecas = new javax.swing.JLabel();
        btnGme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TIPO");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        btnPc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PC 96.png"))); // NOI18N
        btnPc.setText("ENGINE (PC)");
        btnPc.setToolTipText("");
        btnPc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPcActionPerformed(evt);
            }
        });

        btnPesxPc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PES VS PC 96X58.png"))); // NOI18N
        btnPesxPc.setText("PES x PC");
        btnPesxPc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesxPc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPesxPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesxPcActionPerformed(evt);
            }
        });

        btnPcxPc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PC X PC 96X62.png"))); // NOI18N
        btnPcxPc.setText("PC x PC");
        btnPcxPc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPcxPc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPcxPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPcxPcActionPerformed(evt);
            }
        });

        btnPessoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pessoal 96x96.png"))); // NOI18N
        btnPessoal.setText("PESSOAL");
        btnPessoal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPessoal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPessoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoalActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(255, 0, 0));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblResulado.setText("VITÓRIA");

        lblPecas.setText("BRANCAS");

        lblSiglaResultado.setText("v");

        lblSiglaPecas.setText("b");

        btnGme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/king.png"))); // NOI18N
        btnGme.setText("GRANDE MESTRE");
        btnGme.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGme.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVoltar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblResulado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSiglaResultado)
                        .addGap(24, 24, 24)
                        .addComponent(lblPecas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSiglaPecas)
                        .addGap(376, 376, 376))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPessoal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesxPc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPcxPc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addComponent(btnGme, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPcxPc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPesxPc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPessoal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnGme, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResulado)
                    .addComponent(lblPecas)
                    .addComponent(lblSiglaResultado)
                    .addComponent(lblSiglaPecas))
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(12, 12, 620, 460);

        setSize(new java.awt.Dimension(658, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPessoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoalActionPerformed
        this.dispose();
        TelaCadastrar telacadastrar = new TelaCadastrar();
        telacadastrar.setVisible(true);

        TelaCadastrar.txtResultado.setText(lblResulado.getText());
        TelaCadastrar.txtPecas.setText(lblPecas.getText());
        TelaCadastrar.txtTipo.setText("PESSOAL");
        TelaCadastrar.lblTipo.setText("PESSOAL");
        TelaCadastrar.lblSiglaTipo.setText("a");
        TelaCadastrar.lblTipo.setVisible(false);
        TelaCadastrar.lblSiglaTipo.setVisible(false);
        TelaCadastrar.lblPecas.setText(lblPecas.getText());
        TelaCadastrar.lblSiglaPecas.setText(lblSiglaPecas.getText());
        TelaCadastrar.lblResultado.setText(lblResulado.getText());
        TelaCadastrar.lblSiglaResultado.setText(lblSiglaResultado.getText());
        TelaCadastrar.lblPerfil.setText("PESSOAL");
        TelaCadastrar.lblSiglaPerfil.setText("a");
        TelaCadastrar.lblMestre.setText("PESSOAL");


    }//GEN-LAST:event_btnPessoalActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaPecas telapecas = new TelaPecas();
        telapecas.setVisible(true);
        
        TelaPecas.lblResultado.setText(TelaTipo.lblResulado.getText());
        TelaPecas.lblSiglaResultado.setText(TelaTipo.lblSiglaResultado.getText());
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPcActionPerformed
        
        this.dispose();
        TelaPc telapc = new TelaPc();
        telapc.setVisible(true);
        
        TelaPc.lblResultado.setText(lblResulado.getText());
        TelaPc.lblPecas.setText(lblPecas.getText());
        TelaPc.lblSiglaResultado.setText(lblSiglaResultado.getText());
        TelaPc.lblSiglaPecas.setText(lblSiglaPecas.getText());
        TelaPc.lblTipo.setText("PC");
        TelaPc.lblSiglaTipo.setText("c");

        
    }//GEN-LAST:event_btnPcActionPerformed

    private void btnPesxPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesxPcActionPerformed
        
    }//GEN-LAST:event_btnPesxPcActionPerformed

    private void btnPcxPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPcxPcActionPerformed
//        this.dispose();
//        TelaPcxPc telapcxpc = new TelaPcxPc();
//        telapcxpc.setVisible(true);
//        
//        TelaPcxPc.lblResultado.setText(lblResulado.getText());
//        TelaPcxPc.lblPecas.setText(lblPecas.getText());
//        TelaPcxPc.lblSiglaResultado.setText(lblSiglaResultado.getText());
//        TelaPcxPc.lblSiglaPecas.setText(lblSiglaPecas.getText());
//        TelaPcxPc.lblTipo.setText("PCXPC");
//        TelaPcxPc.lblSiglaTipo.setText("sc");
    }//GEN-LAST:event_btnPcxPcActionPerformed

    private void btnGmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGmeActionPerformed
//        this.dispose();
//        TelaCadastrar telacadastrar = new TelaCadastrar();
//        telacadastrar.setVisible(true);
//
//        TelaCadastrar.txtResultado.setText(lblResulado.getText());
//        TelaCadastrar.txtPecas.setText(lblPecas.getText());
//        TelaCadastrar.txtTipo.setText("GME");
//        TelaCadastrar.lblTipo.setText("GME");
//        TelaCadastrar.lblSiglaTipo.setText("gme");
//        TelaCadastrar.lblTipo.setVisible(false);
//        TelaCadastrar.lblSiglaTipo.setVisible(false);
//        TelaCadastrar.lblPecas.setText(lblPecas.getText());
//        TelaCadastrar.lblSiglaPecas.setText(lblSiglaPecas.getText());
//        TelaCadastrar.lblResultado.setText(lblResulado.getText());
//        TelaCadastrar.lblSiglaResultado.setText(lblSiglaResultado.getText());
//        TelaCadastrar.lblPerfil.setText("GME");
//        TelaCadastrar.lblSiglaPerfil.setText("gme");
//        TelaCadastrar.lblMestre.setText("GME");
    }//GEN-LAST:event_btnGmeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGme;
    private javax.swing.JButton btnPc;
    private javax.swing.JButton btnPcxPc;
    private javax.swing.JButton btnPessoal;
    private javax.swing.JButton btnPesxPc;
    private javax.swing.JButton btnVoltar;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblPecas;
    public static javax.swing.JLabel lblResulado;
    public static javax.swing.JLabel lblSiglaPecas;
    public static javax.swing.JLabel lblSiglaResultado;
    // End of variables declaration//GEN-END:variables
}
