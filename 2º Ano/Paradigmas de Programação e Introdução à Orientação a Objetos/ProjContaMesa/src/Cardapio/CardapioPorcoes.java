package Cardapio;
import Conta.ArquivoConta;
import Conta.CriaConta;
/**
 *
 * @author rafael
 */
public class CardapioPorcoes extends javax.swing.JFrame {

    public CardapioPorcoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        FazPedido = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        Frita = new javax.swing.JToggleButton();
        PR1 = new javax.swing.JLabel();
        P1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FritasQB = new javax.swing.JToggleButton();
        PR2 = new javax.swing.JLabel();
        P2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FileFrango = new javax.swing.JToggleButton();
        PR3 = new javax.swing.JLabel();
        P3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Cebola = new javax.swing.JToggleButton();
        PR4 = new javax.swing.JLabel();
        P4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Costela = new javax.swing.JToggleButton();
        PR5 = new javax.swing.JLabel();
        P5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Kibe = new javax.swing.JToggleButton();
        PR6 = new javax.swing.JLabel();
        P6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 0, 251));
        jPanel1.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 480));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Porções");

        jSeparator2.setBackground(new java.awt.Color(255, 0, 0));

        FazPedido.setFont(new java.awt.Font("Open Sans", 0, 23)); // NOI18N
        FazPedido.setForeground(new java.awt.Color(1, 1, 1));
        FazPedido.setText("Fazer Pedido");
        FazPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FazPedidoActionPerformed(evt);
            }
        });

        Voltar.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        Voltar.setForeground(new java.awt.Color(1, 1, 1));
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        Frita.setForeground(new java.awt.Color(1, 1, 1));
        Frita.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N
        Frita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FritaActionPerformed(evt);
            }
        });

        PR1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        PR1.setForeground(new java.awt.Color(254, 254, 254));
        PR1.setText("Batata Frita");

        P1.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P1.setForeground(new java.awt.Color(254, 254, 254));
        P1.setText("R$ 16,50");

        jLabel6.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Porçao de batata frita (400g).");

        FritasQB.setForeground(new java.awt.Color(1, 1, 1));
        FritasQB.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N
        FritasQB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FritasQBActionPerformed(evt);
            }
        });

        PR2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        PR2.setForeground(new java.awt.Color(254, 254, 254));
        PR2.setText("Fritas com Queijo e Bacon");

        P2.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P2.setForeground(new java.awt.Color(254, 254, 254));
        P2.setText("R$ 20,00");

        jLabel7.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Porçao de batata frita com queijo e bacon (400g).");

        FileFrango.setForeground(new java.awt.Color(1, 1, 1));
        FileFrango.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N
        FileFrango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileFrangoActionPerformed(evt);
            }
        });

        PR3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        PR3.setForeground(new java.awt.Color(254, 254, 254));
        PR3.setText("File de Frango");

        P3.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P3.setForeground(new java.awt.Color(254, 254, 254));
        P3.setText("R$ 22,00");

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Porçao de Peito de frango grelhado (400g).");

        Cebola.setForeground(new java.awt.Color(1, 1, 1));
        Cebola.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N
        Cebola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CebolaActionPerformed(evt);
            }
        });

        PR4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        PR4.setForeground(new java.awt.Color(254, 254, 254));
        PR4.setText("Onion Rings");

        P4.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P4.setForeground(new java.awt.Color(254, 254, 254));
        P4.setText("R$ 14,00");

        jLabel9.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Porçao de Aneis de Cebola (300g)");

        Costela.setForeground(new java.awt.Color(1, 1, 1));
        Costela.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N
        Costela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostelaActionPerformed(evt);
            }
        });

        PR5.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        PR5.setForeground(new java.awt.Color(254, 254, 254));
        PR5.setText("Costelinha de Porco");

        P5.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P5.setForeground(new java.awt.Color(254, 254, 254));
        P5.setText("R$ 20,00");

        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("Porçao de costela de porco grelhada (600g)");

        Kibe.setForeground(new java.awt.Color(1, 1, 1));
        Kibe.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N
        Kibe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KibeActionPerformed(evt);
            }
        });

        PR6.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        PR6.setForeground(new java.awt.Color(254, 254, 254));
        PR6.setText("Kibe");

        P6.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P6.setForeground(new java.awt.Color(254, 254, 254));
        P6.setText("R$ 15,00");

        jLabel11.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(254, 254, 254));
        jLabel11.setText("Porçao de kibe (400g)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(FazPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Kibe, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PR6)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(P6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Costela, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PR5)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(P5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Cebola, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PR4)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(P4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FileFrango, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PR3)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(P3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FritasQB, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PR2)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(P2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Frita, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PR1)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(P1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2)))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PR1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(Frita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PR2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(FritasQB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PR3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(FileFrango, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PR4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addComponent(Cebola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PR5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addComponent(Costela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PR6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addComponent(Kibe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FazPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FazPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FazPedidoActionPerformed
        //Cada IF envia a informação do pedido para a classe que cria a conta
        if (Frita.isSelected()) {
            CriaConta.setTotalConta(16.50);
            CriaConta.setTxtconta(PR1.getText()+"  "+P1.getText());
        }

        if (FritasQB.isSelected()) {
            CriaConta.setTotalConta(20);
            CriaConta.setTxtconta(PR2.getText()+"  "+P2.getText());
        }
        
        if (FileFrango.isSelected()) {
            CriaConta.setTotalConta(22);
            CriaConta.setTxtconta(PR3.getText()+"  "+P3.getText());
        }
        
        if (Cebola.isSelected()) {
            CriaConta.setTotalConta(14);
            CriaConta.setTxtconta(PR4.getText()+"  "+P4.getText());
        }
        
        if (Costela.isSelected()) {
            CriaConta.setTotalConta(20);
            CriaConta.setTxtconta(PR5.getText()+"  "+P5.getText());
        }
        
        if (Kibe.isSelected()) {
            CriaConta.setTotalConta(15);
            CriaConta.setTxtconta(PR6.getText()+"  "+P6.getText());
        }
        
        //Chama o método para reescrever o arquivo da conta
        //toda vez que o cliente clicar em Fializar Pedido, para casos 
        //de queda ou travamentos do sistema.
        CriaConta.Formata();
        ArquivoConta.CriaArquivo();
        
        Opcoes.OpPedido op = new Opcoes.OpPedido(); //Instancia a tela de Opções
        op.setVisible(true); //torna visivel
        dispose(); //fecha a tela atual
        
        //Abre o aviso de sucesso na operaçao
        MsgPedido mp = new MsgPedido();
        mp.setVisible(true);
    }//GEN-LAST:event_FazPedidoActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        Opcoes.OpPedido op = new Opcoes.OpPedido(); //Instancia a tela de Opções
        op.setVisible(true); //torna visivel
        dispose(); //fecha a tela atual
    }//GEN-LAST:event_VoltarActionPerformed

    private void FritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FritaActionPerformed

    }//GEN-LAST:event_FritaActionPerformed

    private void FritasQBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FritasQBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FritasQBActionPerformed

    private void FileFrangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileFrangoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileFrangoActionPerformed

    private void CebolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CebolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CebolaActionPerformed

    private void CostelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostelaActionPerformed

    private void KibeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KibeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KibeActionPerformed

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
            java.util.logging.Logger.getLogger(CardapioPorcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardapioPorcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardapioPorcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardapioPorcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardapioPorcoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Cebola;
    private javax.swing.JToggleButton Costela;
    private javax.swing.JButton FazPedido;
    private javax.swing.JToggleButton FileFrango;
    private javax.swing.JToggleButton Frita;
    private javax.swing.JToggleButton FritasQB;
    private javax.swing.JToggleButton Kibe;
    private javax.swing.JLabel P1;
    private javax.swing.JLabel P2;
    private javax.swing.JLabel P3;
    private javax.swing.JLabel P4;
    private javax.swing.JLabel P5;
    private javax.swing.JLabel P6;
    private javax.swing.JLabel PR1;
    private javax.swing.JLabel PR2;
    private javax.swing.JLabel PR3;
    private javax.swing.JLabel PR4;
    private javax.swing.JLabel PR5;
    private javax.swing.JLabel PR6;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
