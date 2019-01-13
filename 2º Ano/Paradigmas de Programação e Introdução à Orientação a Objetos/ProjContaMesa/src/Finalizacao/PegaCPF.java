package Finalizacao;

import Conta.ArquivoConta;
import Conta.CriaConta;

/**
 *
 * @author rafael
 */
public class PegaCPF extends javax.swing.JFrame {

    public static String cpf; 
   
    public PegaCPF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CPF = new javax.swing.JTextField();
        seis = new javax.swing.JButton();
        dois = new javax.swing.JButton();
        um = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        sete = new javax.swing.JButton();
        oito = new javax.swing.JButton();
        nove = new javax.swing.JButton();
        quatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        Continuar = new javax.swing.JButton();
        Apagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));

        jPanel1.setBackground(new java.awt.Color(16, 0, 251));
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 480));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Informe seu CPF (Somente os numeros!):");

        CPF.setEditable(false);
        CPF.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        CPF.setDisabledTextColor(new java.awt.Color(1, 1, 1));

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

        Continuar.setFont(new java.awt.Font("Open Sans", 1, 27)); // NOI18N
        Continuar.setForeground(new java.awt.Color(1, 1, 1));
        Continuar.setText("Finalizar");
        Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarActionPerformed(evt);
            }
        });

        Apagar.setBackground(new java.awt.Color(254, 254, 254));
        Apagar.setFont(new java.awt.Font("Open Sans", 1, 27)); // NOI18N
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
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CPF)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        cpf = CPF.getText()+"6"; //Soma o novo numero digitado a string do cpf
        CPF.setText(cpf); //mostra a nova string no campo de texto
    }//GEN-LAST:event_seisActionPerformed

    private void doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisActionPerformed
        cpf = CPF.getText()+"2";
        CPF.setText(cpf);
    }//GEN-LAST:event_doisActionPerformed

    private void umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umActionPerformed
        cpf = CPF.getText()+"1";
        CPF.setText(cpf);
    }//GEN-LAST:event_umActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        cpf = CPF.getText()+"3";
        CPF.setText(cpf);
    }//GEN-LAST:event_tresActionPerformed

    private void seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteActionPerformed
        cpf = CPF.getText()+"7";
        CPF.setText(cpf);
    }//GEN-LAST:event_seteActionPerformed

    private void oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoActionPerformed
        cpf = CPF.getText()+"8";
        CPF.setText(cpf);
    }//GEN-LAST:event_oitoActionPerformed

    private void noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveActionPerformed
        cpf = CPF.getText()+"9";
        CPF.setText(cpf);
    }//GEN-LAST:event_noveActionPerformed

    private void quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroActionPerformed
        cpf = CPF.getText()+"4";
        CPF.setText(cpf);
    }//GEN-LAST:event_quatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        cpf = CPF.getText()+"5";
        CPF.setText(cpf);
    }//GEN-LAST:event_cincoActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        cpf = CPF.getText()+"0";
        CPF.setText(cpf);
    }//GEN-LAST:event_zeroActionPerformed

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarActionPerformed
        cpf = null;
        CPF.setText(cpf);
    }//GEN-LAST:event_ApagarActionPerformed

    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
        if (cpf.length() != 11) { //Se o cpf tiver mais ou menos que 11 caracteres, e considerado invalido
            AvisoCPFInvalido av = new AvisoCPFInvalido();
            av.setVisible(true);
            dispose();
        }else{ //Se tiver 11, 
            Conta.FormataConta.cpf = cpf; //Atribui o valor ao atributo cpf da classe FormataConta
            CriaConta.Formata(); //Formata a conta
            ArquivoConta.CriaArquivo(); //Recria o arquivo     
            MensagemFinal mf = new MensagemFinal(); //Abre a mensagem final
            mf.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(PegaCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PegaCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PegaCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PegaCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PegaCPF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Apagar;
    private javax.swing.JTextField CPF;
    private javax.swing.JButton Continuar;
    private javax.swing.JButton cinco;
    private javax.swing.JButton dois;
    private javax.swing.JLabel jLabel1;
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
