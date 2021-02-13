/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JOptionPane;

/**
 *
 * @author FRANZ
 */
public class TelaPc extends javax.swing.JFrame {

    /**
     * Creates new form Formpc
     */
    public TelaPc() {
        initComponents();
    }

    String tiporecebidonolichesspc;
    String pecasrecebidonolichesspc;
    String siglapecasrecebidonolichesspc;
    String pgnrecebidonolichesspc;
    String resultadorecebidonolichesspc;
    String siglaresultadorecebidonolichesspc;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCMA = new javax.swing.JButton();
        btnSTOCKFISH = new javax.swing.JButton();
        btnOUTRO = new javax.swing.JButton();
        btnAplicar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMestre = new javax.swing.JTextField();
        lblCM = new javax.swing.JLabel();
        lblSTOCKFISH = new javax.swing.JLabel();
        lblOUTRO = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSiglaMestre = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        lblSiglaResultado = new javax.swing.JLabel();
        lblPecas = new javax.swing.JLabel();
        lblSiglaPecas = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblSiglaTipo = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TELA ENGINE");
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);
        getContentPane().setLayout(null);

        btnCMA.setBackground(java.awt.Color.black);
        btnCMA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCMA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chessmaster 110x109.jpg"))); // NOI18N
        btnCMA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCMA.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCMA.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCMAActionPerformed(evt);
            }
        });
        getContentPane().add(btnCMA);
        btnCMA.setBounds(40, 40, 111, 125);

        btnSTOCKFISH.setBackground(java.awt.Color.black);
        btnSTOCKFISH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSTOCKFISH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stockfish 110x110.png"))); // NOI18N
        btnSTOCKFISH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSTOCKFISH.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSTOCKFISH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSTOCKFISH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSTOCKFISHActionPerformed(evt);
            }
        });
        getContentPane().add(btnSTOCKFISH);
        btnSTOCKFISH.setBounds(170, 40, 111, 125);

        btnOUTRO.setBackground(java.awt.Color.black);
        btnOUTRO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnOUTRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outro 111x83.png"))); // NOI18N
        btnOUTRO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOUTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOUTROActionPerformed(evt);
            }
        });
        getContentPane().add(btnOUTRO);
        btnOUTRO.setBounds(300, 40, 111, 125);

        btnAplicar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAplicar.setText("APLICAR");
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAplicar);
        btnAplicar.setBounds(460, 140, 101, 101);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ENGINE SELECIONADA:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 270, 143, 14);

        txtMestre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtMestre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMestre.setText("ENGINE ESCOLHIDA");
        getContentPane().add(txtMestre);
        txtMestre.setBounds(200, 270, 138, 18);

        lblCM.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCM.setText("CHESSMASTER");
        getContentPane().add(lblCM);
        lblCM.setBounds(50, 170, 93, 14);

        lblSTOCKFISH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSTOCKFISH.setText("STOCKFISH");
        getContentPane().add(lblSTOCKFISH);
        lblSTOCKFISH.setBounds(190, 170, 73, 14);

        lblOUTRO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOUTRO.setText("OUTRO");
        getContentPane().add(lblOUTRO);
        lblOUTRO.setBounds(330, 170, 45, 14);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("SIGLA DA ENGINE:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 310, 130, 20);

        txtSiglaMestre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSiglaMestre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSiglaMestre.setText("SIGLA");
        getContentPane().add(txtSiglaMestre);
        txtSiglaMestre.setBounds(200, 310, 65, 18);

        lblResultado.setText("VITÓRIA");
        getContentPane().add(lblResultado);
        lblResultado.setBounds(40, 210, 54, 15);

        lblSiglaResultado.setText("v");
        getContentPane().add(lblSiglaResultado);
        lblSiglaResultado.setBounds(110, 210, 10, 15);

        lblPecas.setText("BRANCAS");
        getContentPane().add(lblPecas);
        lblPecas.setBounds(170, 210, 64, 15);

        lblSiglaPecas.setText("b");
        getContentPane().add(lblSiglaPecas);
        lblSiglaPecas.setBounds(240, 210, 9, 15);

        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTipo.setText("PC");
        getContentPane().add(lblTipo);
        lblTipo.setBounds(280, 210, 30, 15);

        lblSiglaTipo.setText("c");
        getContentPane().add(lblSiglaTipo);
        lblSiglaTipo.setBounds(320, 210, 7, 15);

        btnVoltar.setBackground(new java.awt.Color(255, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(530, 340, 83, 24);

        setSize(new java.awt.Dimension(633, 405));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aplicar() {

        String verificaMESTRE;

        verificaMESTRE = txtMestre.getText();
        //System.out.println(verificaMESTRE);
        

        try {
            //System.out.println(verificaperfil);
            if (verificaMESTRE.equals("PERFIL")) {
                JOptionPane.showMessageDialog(null, "Defina um dos mestres OU clique em voltar!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            } else {
//
//                TelaCadastrar.lblResultado.setText(lblResultado.getText());
//                TelaCadastrar.lblPecas.setText(lblPecas.getText());
//                TelaCadastrar.lblSiglaPecas.setText(lblSiglaPecas.getText());
//                TelaCadastrar.lblTipo.setText(lblTipo.getText());
//                
//                TelaCadastrar.txtResultado.setText(lblResultado.getText());
//                TelaCadastrar.txtPecas.setText(lblPecas.getText());
//                TelaCadastrar.txtTipo.setText(lblTipo.getText());
//                
//                TelaCadastrar.lblSiglaTipo.setText(txtSiglaMestre.getText() + " c");
//                
//                TelaCadastrar.lblSiglaResultado.setText("");
//                
//                TelaCadastrar.lblPerfil.setText(verificaMESTRE);
//                TelaCadastrar.lblSiglaPerfil.setText(txtSiglaMestre.getText());
//                
//                TelaCadastrar.lblMestre.setText(verificaMESTRE);

            }
        } catch (Exception e) {
        }

    }

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed

//        TelaCadastrar telacadastrar = new TelaCadastrar();
//        telacadastrar.setVisible(true);
        
        aplicar();

//        this.dispose();


    }//GEN-LAST:event_btnAplicarActionPerformed

    private void btnSTOCKFISHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSTOCKFISHActionPerformed
        
        String nomedomestre = lblSTOCKFISH.getText();
        String siglamestre = "sto";

        txtMestre.setText(nomedomestre);
        txtSiglaMestre.setText(siglamestre);

        
    }//GEN-LAST:event_btnSTOCKFISHActionPerformed

    private void btnCMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCMAActionPerformed
        
        String nomedomestre = lblCM.getText();
        String siglamestre = "cma";

        txtMestre.setText(nomedomestre);
        txtSiglaMestre.setText(siglamestre);
        
    }//GEN-LAST:event_btnCMAActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnOUTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOUTROActionPerformed
       String nomedoperfil = JOptionPane.showInputDialog("Qual o nome da Engine?").toUpperCase();
        String siglaperfil = nomedoperfil.substring(0, 3).toLowerCase();
        txtMestre.setText(nomedoperfil);
        txtSiglaMestre.setText(siglaperfil);
    }//GEN-LAST:event_btnOUTROActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnCMA;
    private javax.swing.JButton btnOUTRO;
    private javax.swing.JButton btnSTOCKFISH;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel lblCM;
    private javax.swing.JLabel lblOUTRO;
    public static javax.swing.JLabel lblPecas;
    public static javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSTOCKFISH;
    public static javax.swing.JLabel lblSiglaPecas;
    public static javax.swing.JLabel lblSiglaResultado;
    public static javax.swing.JLabel lblSiglaTipo;
    public static javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtMestre;
    private javax.swing.JTextField txtSiglaMestre;
    // End of variables declaration//GEN-END:variables
}
