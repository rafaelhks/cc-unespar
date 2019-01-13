package Cardapio;
import Conta.ArquivoConta;
import Conta.CriaConta;
/**
 *
 * @author rafael
 */
public class CardapioLanches extends javax.swing.JFrame {

    public CardapioLanches() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HD1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HD2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        X1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        X2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        X3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        X4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        XBurguer = new javax.swing.JToggleButton();
        XSalada = new javax.swing.JToggleButton();
        XFrango = new javax.swing.JToggleButton();
        XBacon = new javax.swing.JToggleButton();
        Simples = new javax.swing.JToggleButton();
        Duplo = new javax.swing.JToggleButton();
        FazPedido = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        P1 = new javax.swing.JLabel();
        P2 = new javax.swing.JLabel();
        P3 = new javax.swing.JLabel();
        P4 = new javax.swing.JLabel();
        P5 = new javax.swing.JLabel();
        P6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));

        jPanel1.setBackground(new java.awt.Color(36, 0, 251));
        jPanel1.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 480));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Hot-Dogs");

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Cheese Burguers");

        HD1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        HD1.setForeground(new java.awt.Color(254, 254, 254));
        HD1.setText("Hot Dog Simples");

        jLabel6.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Pão, salsicha, tomate, alface, milho, batata palha.");

        HD2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        HD2.setForeground(new java.awt.Color(254, 254, 254));
        HD2.setText("Hot Dog Duplo");

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Pão, duas salsichas, tomate, alface, milho, batata palha.");

        X1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        X1.setForeground(new java.awt.Color(254, 254, 254));
        X1.setText("X-Burguer");

        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("Pão, hambúrguer, presunto e queijo.");

        X2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        X2.setForeground(new java.awt.Color(254, 254, 254));
        X2.setText("X-Salada");

        jLabel12.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setText("Pão, hambúrguer, presunto, queijo, alface, tomate.");

        X3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        X3.setForeground(new java.awt.Color(254, 254, 254));
        X3.setText("X-Frango");

        jLabel14.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(254, 254, 254));
        jLabel14.setText("Pão, hambúrguer, presunto, queijo, alface, tomate, hambúrguer de frango.");

        jLabel15.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(254, 254, 254));
        jLabel15.setText("Pão, hambúrguer, queijo, alface, tomate, bacon.");

        X4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        X4.setForeground(new java.awt.Color(254, 254, 254));
        X4.setText("X-Bacon");

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(255, 0, 0));

        XBurguer.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N

        XSalada.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N
        XSalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XSaladaActionPerformed(evt);
            }
        });

        XFrango.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N

        XBacon.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N

        Simples.setForeground(new java.awt.Color(1, 1, 1));
        Simples.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N
        Simples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimplesActionPerformed(evt);
            }
        });

        Duplo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N

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

        P1.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P1.setForeground(new java.awt.Color(254, 254, 254));
        P1.setText("R$ 5,50");

        P2.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P2.setForeground(new java.awt.Color(254, 254, 254));
        P2.setText("R$ 7,00");

        P3.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P3.setForeground(new java.awt.Color(254, 254, 254));
        P3.setText("R$ 7,00");

        P4.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P4.setForeground(new java.awt.Color(254, 254, 254));
        P4.setText("R$ 8,50");

        P5.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P5.setForeground(new java.awt.Color(254, 254, 254));
        P5.setText("R$ 10,00");

        P6.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P6.setForeground(new java.awt.Color(254, 254, 254));
        P6.setText("R$ 12,00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(XFrango, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(X3)
                                    .addComponent(jLabel14)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(XBurguer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(XSalada, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(XBacon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(X4)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel10)
                                    .addComponent(X1)
                                    .addComponent(X2)
                                    .addComponent(jLabel12))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(P3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(P4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(P5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FazPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Simples, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Duplo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HD1)
                            .addComponent(jLabel6)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HD2)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(P2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(HD1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(Simples, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(HD2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8))
                        .addComponent(Duplo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(X1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addComponent(XBurguer, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(P3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(X2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12))
                        .addComponent(XSalada, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(X3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel14))
                        .addComponent(XFrango, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(X4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel15))
                        .addComponent(XBacon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P6))
                .addGap(18, 18, 18)
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

    private void SimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimplesActionPerformed

    }//GEN-LAST:event_SimplesActionPerformed

    private void XSaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XSaladaActionPerformed

    }//GEN-LAST:event_XSaladaActionPerformed

    private void FazPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FazPedidoActionPerformed
        //Cada IF envia a informação do pedido para a classe que cria a conta
        if (Simples.isSelected()) {
            CriaConta.setTotalConta(5.50);
            CriaConta.setTxtconta(HD1.getText()+"  "+P1.getText());
        }
        
        if (Duplo.isSelected()) {
            CriaConta.setTotalConta(7);
            CriaConta.setTxtconta(HD2.getText()+"  "+P2.getText());
        }
        
        if (XBurguer.isSelected()) {
            CriaConta.setTotalConta(7);
            CriaConta.setTxtconta(X1.getText()+"  "+P3.getText());
        }
        
        if (XSalada.isSelected()) {
            CriaConta.setTotalConta(8.50);
            CriaConta.setTxtconta(X2.getText()+"  "+P4.getText());
        }
        
        if (XFrango.isSelected()) {
            CriaConta.setTotalConta(10);
            CriaConta.setTxtconta(X3.getText()+"  "+P5.getText());
        }
        
        if (XBacon.isSelected()) {
            CriaConta.setTotalConta(12);
            CriaConta.setTxtconta(X4.getText()+"  "+P6.getText());
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
            java.util.logging.Logger.getLogger(CardapioLanches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardapioLanches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardapioLanches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardapioLanches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardapioLanches().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Duplo;
    private javax.swing.JButton FazPedido;
    private javax.swing.JLabel HD1;
    private javax.swing.JLabel HD2;
    private javax.swing.JLabel P1;
    private javax.swing.JLabel P2;
    private javax.swing.JLabel P3;
    private javax.swing.JLabel P4;
    private javax.swing.JLabel P5;
    private javax.swing.JLabel P6;
    private javax.swing.JToggleButton Simples;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel X1;
    private javax.swing.JLabel X2;
    private javax.swing.JLabel X3;
    private javax.swing.JLabel X4;
    private javax.swing.JToggleButton XBacon;
    private javax.swing.JToggleButton XBurguer;
    private javax.swing.JToggleButton XFrango;
    private javax.swing.JToggleButton XSalada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
