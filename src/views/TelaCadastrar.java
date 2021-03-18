package views;

import models.ChangesPgn.*;
import models.DataPgn.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JOptionPane;
//import models.CapturaDadosPgn;

public class TelaCadastrar extends javax.swing.JFrame {

    public TelaCadastrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPecas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPgn = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        btnEraseMark = new javax.swing.JButton();
        btnNome = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnObservacao = new javax.swing.JButton();
        btnColar = new javax.swing.JButton();
        btnINICIO = new javax.swing.JButton();
        textTAMANHODOPGN = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSequenciaInicial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtWhite = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBlack = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAbertura = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSiglaDaAbertura = new javax.swing.JTextField();
        textTAMANHODASIGLA = new javax.swing.JTextField();
        lblImagem = new javax.swing.JLabel();
        lblMestre = new javax.swing.JLabel();
        lblDATA = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        lblPecas = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblSiglaResultado = new javax.swing.JLabel();
        lblSiglaPecas = new javax.swing.JLabel();
        lblSiglaTipo = new javax.swing.JLabel();
        lblSiglaPerfil = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnCutClock = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        btnLichess = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtResultado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado.setText("RESULTADO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("RESULTADO DA PARTIDA:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("COR DAS PEÇAS:");

        txtPecas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPecas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPecas.setText("PECAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("TIPO DA PARTIDA:");

        txtTipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTipo.setText("TIPO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        txtPgn.setBackground(java.awt.Color.yellow);
        txtPgn.setColumns(20);
        txtPgn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtPgn.setLineWrap(true);
        txtPgn.setRows(5);
        txtPgn.setWrapStyleWord(true);
        txtPgn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPgn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtPgnPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(txtPgn);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PGN DA PARTIDA:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEraseMark.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEraseMark.setText("MARCAS");
        btnEraseMark.setPreferredSize(new java.awt.Dimension(91, 24));
        btnEraseMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEraseMarkActionPerformed(evt);
            }
        });

        btnNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNome.setText("NOME");
        btnNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomeActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnObservacao.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnObservacao.setText("OBSERVAÇÃO");

        btnColar.setFont(new java.awt.Font("Abyssinica SIL", 1, 14)); // NOI18N
        btnColar.setText("COLAR");
        btnColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColarActionPerformed(evt);
            }
        });

        btnINICIO.setBackground(new java.awt.Color(255, 0, 0));
        btnINICIO.setText("INICIO");
        btnINICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINICIOActionPerformed(evt);
            }
        });

        textTAMANHODOPGN.setFont(new java.awt.Font("Abyssinica SIL", 0, 10)); // NOI18N
        textTAMANHODOPGN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textTAMANHODOPGN.setText("TAM");

        jLabel8.setText("SEQUENCIA INICIAL:");

        txtSequenciaInicial.setBackground(java.awt.Color.yellow);
        txtSequenciaInicial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSequenciaInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSequenciaInicial.setText("SEQUENCIA INICIAL");
        txtSequenciaInicial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel9.setText("BRANCAS:");

        txtWhite.setEditable(false);
        txtWhite.setBackground(java.awt.Color.yellow);
        txtWhite.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtWhite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWhite.setText("BRANCAS");
        txtWhite.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel10.setText("PRETAS:");

        txtBlack.setEditable(false);
        txtBlack.setBackground(java.awt.Color.yellow);
        txtBlack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBlack.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBlack.setText("PRETAS");
        txtBlack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel11.setText("ABERTURA:");

        txtAbertura.setEditable(false);
        txtAbertura.setBackground(java.awt.Color.yellow);
        txtAbertura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAbertura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAbertura.setText("ABERTURA");
        txtAbertura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel12.setText("SIGLA DA ABERTURA:");

        txtSiglaDaAbertura.setEditable(false);
        txtSiglaDaAbertura.setBackground(java.awt.Color.yellow);
        txtSiglaDaAbertura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSiglaDaAbertura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSiglaDaAbertura.setText("SIGLA DA ABERTURA");
        txtSiglaDaAbertura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        textTAMANHODASIGLA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textTAMANHODASIGLA.setText("TAM SIGLA");

        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brancas---inicial 130x130.png"))); // NOI18N
        lblImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lblImagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblMestre.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblMestre.setText("NOME");

        lblDATA.setText("10/11/2019");

        lblResultado.setText("RESULTADO");

        lblPecas.setText("PECAS");

        lblTipo.setText("TIPO");

        lblPerfil.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblPerfil.setText("PERFIL");

        lblSiglaResultado.setText("d");

        lblSiglaPecas.setText("b");

        lblSiglaTipo.setText("c");

        lblSiglaPerfil.setText("ccms");

        btnLimpar.setFont(new java.awt.Font("Abyssinica SIL", 1, 14)); // NOI18N
        btnLimpar.setText("LIMPAR");

        btnCutClock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCutClock.setText("CLOCK");
        btnCutClock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCutClockActionPerformed(evt);
            }
        });

        btnCopiar.setFont(new java.awt.Font("Abyssinica SIL", 1, 14)); // NOI18N
        btnCopiar.setText("COPIAR");
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        btnOk.setBackground(new java.awt.Color(255, 102, 0));
        btnOk.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnOk.setText("ok");
        btnOk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnLichess.setText("ABRIR NO LICHESS");
        btnLichess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichessActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(255, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(txtSequenciaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(txtWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(txtBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(txtAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(txtSiglaDaAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(lblDATA)
                                .addGap(200, 200, 200)
                                .addComponent(textTAMANHODASIGLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(lblMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblResultado)
                                    .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSiglaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSiglaPecas)
                                    .addComponent(lblSiglaResultado)
                                    .addComponent(lblSiglaPerfil)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnCutClock, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btnEraseMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(btnLichess, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnColar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(textTAMANHODOPGN, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnNome, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(btnVoltar)
                                .addGap(7, 7, 7)
                                .addComponent(btnINICIO, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(btnOk)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(txtSequenciaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(txtWhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(txtBlack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(txtAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addComponent(txtSiglaDaAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblDATA))
                            .addComponent(textTAMANHODASIGLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lblMestre))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lblTipo)
                                .addGap(15, 15, 15)
                                .addComponent(lblPecas)
                                .addGap(20, 20, 20)
                                .addComponent(lblResultado)
                                .addGap(18, 18, 18)
                                .addComponent(lblPerfil))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblSiglaTipo)
                                .addGap(15, 15, 15)
                                .addComponent(lblSiglaPecas)
                                .addGap(15, 15, 15)
                                .addComponent(lblSiglaResultado)
                                .addGap(15, 15, 15)
                                .addComponent(lblSiglaPerfil)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCutClock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEraseMark, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnLichess)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnColar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(textTAMANHODOPGN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnNome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnINICIO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPgnPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtPgnPropertyChange

        String sequenciainicial, abertura, nomedaabertura;

        if (!txtPgn.getText().equals("")) {

            sequenciainicial = new SequenciaInicial().getSequenciainicial(TelaCadastrar.txtPgn.getText());
            abertura = new Abertura().getAbertura(sequenciainicial);
            nomedaabertura = new NomeDaAbertura().getNomeDaAbertura(abertura, txtPecas.getText());

            txtSequenciaInicial.setText(new ReplaceOpening().replaceOpening(sequenciainicial));
            txtAbertura.setText(abertura);
            txtSiglaDaAbertura.setText(nomedaabertura);

        }
    }//GEN-LAST:event_txtPgnPropertyChange

    private void btnEraseMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEraseMarkActionPerformed

        String strSequenciainicial;
        
        if (!txtPgn.getText().equals("")) {
            strSequenciainicial = new ReplaceOpening().replaceOpening(txtSequenciaInicial.getText());
            
            txtSequenciaInicial.setText(strSequenciainicial);
        }

    }//GEN-LAST:event_btnEraseMarkActionPerformed

    private void btnNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomeActionPerformed


    }//GEN-LAST:event_btnNomeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        String pgn, finalNome, pecas, tipo, siglaPecas, siglaTipo, siglaAbertura, abertura, siglaResultado;
        
        pgn = txtPgn.getText();
        
        if (pgn.equals("")) {

            JOptionPane.showMessageDialog(null, "Não há PGN caregado!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);

        } else {
            
            finalNome = JOptionPane.showInputDialog(null, "Qual foi o final?", "Final da partida", 3);
            pecas = lblPecas.getText();
            tipo = lblTipo.getText();
            
            System.out.println("pgn--------->" + pgn + "\n" 
                    + "finalNome--------->" + finalNome
                    + "\n" 
                    + "pecas--------->" + pecas
                    + "\n" 
                    + "tipo--------->" + tipo
                    + "\n");
            
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColarActionPerformed

        String pgn = txtPgn.getText();

        String sequenciainicial, abertura, nomedaabertura;

        if (pgn.equals("")) {
            txtPgn.paste();

            if (!txtPgn.getText().equals("")) {

                sequenciainicial = new SequenciaInicial().getSequenciainicial(TelaCadastrar.txtPgn.getText());
                abertura = new Abertura().getAbertura(sequenciainicial);
                nomedaabertura = new NomeDaAbertura().getNomeDaAbertura(abertura, txtPecas.getText());

                txtSequenciaInicial.setText(new ReplaceOpening().replaceOpening(sequenciainicial));
                txtAbertura.setText(abertura);
                txtSiglaDaAbertura.setText(nomedaabertura);
                
                String event = new Event().getEvent(TelaCadastrar.txtPgn.getText());
                System.out.println("Event------> " + event);
                String site = new Site().getSite(TelaCadastrar.txtPgn.getText());
                System.out.println("Site------> " + site);
                String date = new Date().getDate(TelaCadastrar.txtPgn.getText());
                System.out.println("Date------> " + date);
                String white = new White().getWhite(TelaCadastrar.txtPgn.getText());
                System.out.println("White------> " + white);
                String black = new Black().getBlack(TelaCadastrar.txtPgn.getText());
                System.out.println("Black------> " + black);
                String result = new Result().getResult(TelaCadastrar.txtPgn.getText());
                System.out.println("Result------> " + result);
                String utcdate = new UTCDate().getUTCDate(TelaCadastrar.txtPgn.getText());
                System.out.println("UTCDate------> " + utcdate);
                String utctime = new UTCTime().getUTCTime(TelaCadastrar.txtPgn.getText());
                System.out.println("UTCTime------> " + utctime);
                String whiteelo = new WhiteElo().getWhiteElo(TelaCadastrar.txtPgn.getText());
                System.out.println("WhiteElo------> " + whiteelo);
                String blackelo = new BlackElo().getBlackElo(TelaCadastrar.txtPgn.getText());
                System.out.println("BlackElo------> " + blackelo);
                String variant = new Variant().getVariant(TelaCadastrar.txtPgn.getText());
                System.out.println("Variant------> " + variant);
                String timecontrol = new TimeControl().getTimeControl(TelaCadastrar.txtPgn.getText());
                System.out.println("Timecontrol------> " + timecontrol);
                String eco = new ECO().getECO(TelaCadastrar.txtPgn.getText());
                System.out.println("ECO------> " + eco);
                String opening = new Opening().getOpening(TelaCadastrar.txtPgn.getText());
                System.out.println("Opening------> " + opening);
                String termination = new Termination().getTermination(TelaCadastrar.txtPgn.getText());
                System.out.println("Termination------> " + termination);
                String annotator = new Annotator().getAnnotator(TelaCadastrar.txtPgn.getText());
                System.out.println("Annotator------> " + annotator);
                String round = new Round().getRound(TelaCadastrar.txtPgn.getText());
                System.out.println("Round------> " + round);
                String notacao = new Notacao().getNotacao(TelaCadastrar.txtPgn.getText());
                System.out.println("Notacao------> " + notacao);

            }

        } else {
            
            txtPgn.setText("");
            txtPgn.paste();

            if (!txtPgn.getText().equals("")) {

                sequenciainicial = new SequenciaInicial().getSequenciainicial(TelaCadastrar.txtPgn.getText());
                abertura = new Abertura().getAbertura(sequenciainicial);
                nomedaabertura = new NomeDaAbertura().getNomeDaAbertura(abertura, txtPecas.getText());

                txtSequenciaInicial.setText(new ReplaceOpening().replaceOpening(sequenciainicial));
                txtAbertura.setText(abertura);
                txtSiglaDaAbertura.setText(nomedaabertura);

            }
        }

    }//GEN-LAST:event_btnColarActionPerformed

    private void btnINICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINICIOActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnINICIOActionPerformed

    private void btnCutClockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCutClockActionPerformed
        
        String cutpgn = "";
        
        if (!txtPgn.getText().equals("")) {
            cutpgn = new EraseClock().eraseClock(TelaCadastrar.txtPgn.getText());
        }
        txtPgn.setText(cutpgn);
    }//GEN-LAST:event_btnCutClockActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed

        String texto = txtPgn.getText();

        if (texto.equals("")) {
            JOptionPane.showMessageDialog(null, "Não há PGN caregado!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        } else {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();;
            clipboard.setContents(new StringSelection(texto), null);
        }

    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed


    }//GEN-LAST:event_btnOkActionPerformed

    private void btnLichessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichessActionPerformed


    }//GEN-LAST:event_btnLichessActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaTipo telatipo = new TelaTipo();
        telatipo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColar;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnCutClock;
    private javax.swing.JButton btnEraseMark;
    private javax.swing.JButton btnINICIO;
    private javax.swing.JButton btnLichess;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNome;
    private javax.swing.JButton btnObservacao;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDATA;
    public static javax.swing.JLabel lblImagem;
    public static javax.swing.JLabel lblMestre;
    public static javax.swing.JLabel lblPecas;
    public static javax.swing.JLabel lblPerfil;
    public static javax.swing.JLabel lblResultado;
    public static javax.swing.JLabel lblSiglaPecas;
    public static javax.swing.JLabel lblSiglaPerfil;
    public static javax.swing.JLabel lblSiglaResultado;
    public static javax.swing.JLabel lblSiglaTipo;
    public static javax.swing.JLabel lblTipo;
    private javax.swing.JTextField textTAMANHODASIGLA;
    private javax.swing.JTextField textTAMANHODOPGN;
    private javax.swing.JTextField txtAbertura;
    public static javax.swing.JTextField txtBlack;
    public static javax.swing.JTextField txtPecas;
    public static javax.swing.JTextArea txtPgn;
    public static javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtSequenciaInicial;
    private javax.swing.JTextField txtSiglaDaAbertura;
    public static javax.swing.JTextField txtTipo;
    public static javax.swing.JTextField txtWhite;
    // End of variables declaration//GEN-END:variables
}
