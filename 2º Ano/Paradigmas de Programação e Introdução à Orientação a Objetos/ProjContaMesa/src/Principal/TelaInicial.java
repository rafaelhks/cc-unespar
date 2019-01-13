
package Principal;

/**
 *
 * @author rafael
 */
public class TelaInicial extends javax.swing.JFrame {
    
    public static String numero; //numero da mesa
    
    public TelaInicial() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Num = new javax.swing.JTextField();
        sete = new javax.swing.JButton();
        oito = new javax.swing.JButton();
        nove = new javax.swing.JButton();
        quatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        dois = new javax.swing.JButton();
        um = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        Prosseguir = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        Apagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(36, 0, 251));
        jPanel1.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 480));

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Seja Bem Vindo!");

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Informe o número de sua mesa:");

        Num.setEditable(false);
        Num.setBackground(new java.awt.Color(254, 254, 254));
        Num.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Num.setForeground(new java.awt.Color(1, 1, 1));
        Num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Num.setBorder(null);
        Num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumActionPerformed(evt);
            }
        });

        sete.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        sete.setForeground(new java.awt.Color(1, 1, 1));
        sete.setText("7");
        sete.setMaximumSize(new java.awt.Dimension(70, 70));
        sete.setMinimumSize(new java.awt.Dimension(70, 70));
        sete.setPreferredSize(new java.awt.Dimension(70, 70));
        sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteActionPerformed(evt);
            }
        });

        oito.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        oito.setForeground(new java.awt.Color(1, 1, 1));
        oito.setText("8");
        oito.setMaximumSize(new java.awt.Dimension(70, 70));
        oito.setMinimumSize(new java.awt.Dimension(70, 70));
        oito.setPreferredSize(new java.awt.Dimension(70, 70));
        oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoActionPerformed(evt);
            }
        });

        nove.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        nove.setForeground(new java.awt.Color(1, 1, 1));
        nove.setText("9");
        nove.setMaximumSize(new java.awt.Dimension(70, 70));
        nove.setMinimumSize(new java.awt.Dimension(70, 70));
        nove.setPreferredSize(new java.awt.Dimension(70, 70));
        nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveActionPerformed(evt);
            }
        });

        quatro.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        quatro.setForeground(new java.awt.Color(1, 1, 1));
        quatro.setText("4");
        quatro.setMaximumSize(new java.awt.Dimension(70, 70));
        quatro.setMinimumSize(new java.awt.Dimension(70, 70));
        quatro.setPreferredSize(new java.awt.Dimension(70, 70));
        quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroActionPerformed(evt);
            }
        });

        cinco.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        cinco.setForeground(new java.awt.Color(1, 1, 1));
        cinco.setText("5");
        cinco.setMaximumSize(new java.awt.Dimension(70, 70));
        cinco.setMinimumSize(new java.awt.Dimension(70, 70));
        cinco.setPreferredSize(new java.awt.Dimension(70, 70));
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        seis.setForeground(new java.awt.Color(1, 1, 1));
        seis.setText("6");
        seis.setMaximumSize(new java.awt.Dimension(70, 70));
        seis.setMinimumSize(new java.awt.Dimension(70, 70));
        seis.setPreferredSize(new java.awt.Dimension(70, 70));
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        dois.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        dois.setForeground(new java.awt.Color(1, 1, 1));
        dois.setText("2");
        dois.setMaximumSize(new java.awt.Dimension(70, 70));
        dois.setMinimumSize(new java.awt.Dimension(70, 70));
        dois.setPreferredSize(new java.awt.Dimension(70, 70));
        dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisActionPerformed(evt);
            }
        });

        um.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        um.setForeground(new java.awt.Color(1, 1, 1));
        um.setText("1");
        um.setMaximumSize(new java.awt.Dimension(70, 70));
        um.setMinimumSize(new java.awt.Dimension(70, 70));
        um.setPreferredSize(new java.awt.Dimension(70, 70));
        um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umActionPerformed(evt);
            }
        });

        tres.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        tres.setForeground(new java.awt.Color(1, 1, 1));
        tres.setText("3");
        tres.setMaximumSize(new java.awt.Dimension(70, 70));
        tres.setMinimumSize(new java.awt.Dimension(70, 70));
        tres.setPreferredSize(new java.awt.Dimension(70, 70));
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        Prosseguir.setBackground(new java.awt.Color(102, 254, 99));
        Prosseguir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Prosseguir.setForeground(new java.awt.Color(1, 1, 1));
        Prosseguir.setText("Prosseguir");
        Prosseguir.setBorder(null);
        Prosseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsseguirActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        zero.setForeground(new java.awt.Color(1, 1, 1));
        zero.setText("0");
        zero.setMaximumSize(new java.awt.Dimension(70, 70));
        zero.setMinimumSize(new java.awt.Dimension(70, 70));
        zero.setPreferredSize(new java.awt.Dimension(70, 70));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        Apagar.setBackground(new java.awt.Color(255, 61, 61));
        Apagar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Apagar.setForeground(new java.awt.Color(1, 1, 1));
        Apagar.setText("Apagar");
        Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Num)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Prosseguir, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(187, 187, 187))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(269, 269, 269))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Num, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 314, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Prosseguir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumActionPerformed

    }//GEN-LAST:event_NumActionPerformed

    private void seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteActionPerformed
        numero = Num.getText()+"7"; //soma os valores ja digitados ao novo valor
        Num.setText(numero); //mostra o valor no campo de texto Num
    }//GEN-LAST:event_seteActionPerformed

    private void ProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsseguirActionPerformed
        if (numero == null) { //Se o numero nao for digitado abre a tela de aviso
            Aviso a = new Aviso();
            a.setVisible(true);
        }else{
            TelaPrincipal tp = new TelaPrincipal();
            Conta.CriaConta cc = new Conta.CriaConta();
            Conta.ArquivoConta ac = new Conta.ArquivoConta();
            
            cc.iniciaConta(); //Cria a String principal da conta para mostrar na tela
            ac.CriaArquivo(); //Acessa o metodo para criar o arquivo da canto
            tp.setVisible(true); //Abre a Tela Principal
            dispose(); //Fecha a tela atual
        }
    }//GEN-LAST:event_ProsseguirActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        numero = Num.getText()+"0";
        Num.setText(numero);
    }//GEN-LAST:event_zeroActionPerformed

    private void oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoActionPerformed
        numero = Num.getText()+"8";
        Num.setText(numero);
    }//GEN-LAST:event_oitoActionPerformed

    private void noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveActionPerformed
        numero = Num.getText()+"9";
        Num.setText(numero);
    }//GEN-LAST:event_noveActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        numero = Num.getText()+"6";
        Num.setText(numero);
    }//GEN-LAST:event_seisActionPerformed

    private void quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroActionPerformed
        numero = Num.getText()+"4";
        Num.setText(numero);
    }//GEN-LAST:event_quatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        numero = Num.getText()+"5";
        Num.setText(numero);
    }//GEN-LAST:event_cincoActionPerformed

    private void umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umActionPerformed
        numero = Num.getText()+"1";
        Num.setText(numero);
    }//GEN-LAST:event_umActionPerformed

    private void doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisActionPerformed
        numero = Num.getText()+"2";
        Num.setText(numero);
    }//GEN-LAST:event_doisActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        numero = Num.getText()+"3";
        Num.setText(numero);
    }//GEN-LAST:event_tresActionPerformed

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarActionPerformed
        numero = null; //Apaga a string do numero
        Num.setText(numero);
    }//GEN-LAST:event_ApagarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Apagar;
    public static javax.swing.JTextField Num;
    private javax.swing.JButton Prosseguir;
    private javax.swing.JButton cinco;
    private javax.swing.JButton dois;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nove;
    private javax.swing.JButton oito;
    private javax.swing.JButton quatro;
    private javax.swing.JButton seis;
    private javax.swing.JButton sete;
    private javax.swing.JButton tres;
    private javax.swing.JButton um;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
