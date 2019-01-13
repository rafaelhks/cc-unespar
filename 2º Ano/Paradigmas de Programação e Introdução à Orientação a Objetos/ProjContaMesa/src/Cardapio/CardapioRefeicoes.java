package Cardapio;
import Conta.ArquivoConta;
import Conta.CriaConta;
/**
 *
 * @author rafael
 */
public class CardapioRefeicoes extends javax.swing.JFrame {
  
    public CardapioRefeicoes() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        R1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        R2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Comercial = new javax.swing.JToggleButton();
        Executivo = new javax.swing.JToggleButton();
        FazPedido = new javax.swing.JButton();
        Espaguete = new javax.swing.JToggleButton();
        R3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Macarrao = new javax.swing.JToggleButton();
        R4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        P1 = new javax.swing.JLabel();
        P2 = new javax.swing.JLabel();
        P3 = new javax.swing.JLabel();
        P4 = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));

        jPanel1.setBackground(new java.awt.Color(36, 0, 251));
        jPanel1.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 480));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Refeiçoes");

        R1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        R1.setForeground(new java.awt.Color(254, 254, 254));
        R1.setText("Prato Comercial");

        jLabel6.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Arroz, feijao, bife, salada.");

        R2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        R2.setForeground(new java.awt.Color(254, 254, 254));
        R2.setText("Prato Executivo");

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Arroz, feijao, salada, batata, alcatra. ");

        Comercial.setForeground(new java.awt.Color(1, 1, 1));
        Comercial.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N
        Comercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComercialActionPerformed(evt);
            }
        });

        Executivo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N

        FazPedido.setFont(new java.awt.Font("Open Sans", 0, 23)); // NOI18N
        FazPedido.setForeground(new java.awt.Color(1, 1, 1));
        FazPedido.setText("Fazer Pedido");
        FazPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FazPedidoActionPerformed(evt);
            }
        });

        Espaguete.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N
        Espaguete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspagueteActionPerformed(evt);
            }
        });

        R3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        R3.setForeground(new java.awt.Color(254, 254, 254));
        R3.setText("Espaguete a Carbonara");

        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("Macarrao espaguete, bacon, queijo parmesao.");

        Macarrao.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/Selecionado.PNG"))); // NOI18N

        R4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        R4.setForeground(new java.awt.Color(254, 254, 254));
        R4.setText("Macarrao ao molho");

        jLabel12.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setText("Macarrao espaguete, calabresa, queijo parmesao, molho de tomate.");

        P1.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P1.setForeground(new java.awt.Color(254, 254, 254));
        P1.setText("R$ 11,50");

        P2.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P2.setForeground(new java.awt.Color(254, 254, 254));
        P2.setText("R$ 15,50");

        P3.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P3.setForeground(new java.awt.Color(254, 254, 254));
        P3.setText("R$ 12,50");

        P4.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        P4.setForeground(new java.awt.Color(254, 254, 254));
        P4.setText("R$ 13,50");

        Voltar.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        Voltar.setForeground(new java.awt.Color(1, 1, 1));
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Espaguete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R3)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Macarrao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R4)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Comercial, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Executivo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R1)
                            .addComponent(jLabel6)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(R2)
                                .addComponent(jLabel8)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(P3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(P4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(P1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FazPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(R1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(Comercial, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(R2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8))
                        .addComponent(Executivo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(R3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10))
                        .addComponent(Espaguete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(R4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12))
                        .addComponent(Macarrao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P4))
                .addGap(159, 159, 159)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FazPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void ComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComercialActionPerformed

    }//GEN-LAST:event_ComercialActionPerformed

    private void FazPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FazPedidoActionPerformed
        //Cada IF envia a informação do pedido para a classe que cria a conta
        if (Comercial.isSelected()) {
            CriaConta.setTxtconta(R1.getText()+"  "+P1.getText());
            CriaConta.setTotalConta(11.50);
        }
        
        if (Executivo.isSelected()) {
            CriaConta.setTxtconta(R2.getText()+"  "+P2.getText());
            CriaConta.setTotalConta(15.50);
        }

        if (Espaguete.isSelected()) {
            CriaConta.setTxtconta(R3.getText()+"  "+P3.getText());
            CriaConta.setTotalConta(12.50);
        }
        
        if (Macarrao.isSelected()) {
            CriaConta.setTxtconta(R4.getText()+"  "+P4.getText());
            CriaConta.setTotalConta(13.50);
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

    private void EspagueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspagueteActionPerformed

    }//GEN-LAST:event_EspagueteActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CardapioRefeicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardapioRefeicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardapioRefeicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardapioRefeicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardapioRefeicoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Comercial;
    private javax.swing.JToggleButton Espaguete;
    private javax.swing.JToggleButton Executivo;
    private javax.swing.JButton FazPedido;
    private javax.swing.JToggleButton Macarrao;
    private javax.swing.JLabel P1;
    private javax.swing.JLabel P2;
    private javax.swing.JLabel P3;
    private javax.swing.JLabel P4;
    private javax.swing.JLabel R1;
    private javax.swing.JLabel R2;
    private javax.swing.JLabel R3;
    private javax.swing.JLabel R4;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
