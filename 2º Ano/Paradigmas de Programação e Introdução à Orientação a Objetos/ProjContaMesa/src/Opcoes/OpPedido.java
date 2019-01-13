package Opcoes;

import Conta.ArquivoConta;
import Conta.CriaConta;

/**
 *
 * @author rafael
 */
public class OpPedido extends javax.swing.JFrame {

    public OpPedido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CpLanches = new javax.swing.JButton();
        CpBebidas = new javax.swing.JButton();
        CpPorcoes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CpRefeicoes = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));

        jPanel1.setBackground(new java.awt.Color(36, 0, 251));
        jPanel1.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 480));

        CpLanches.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        CpLanches.setForeground(new java.awt.Color(1, 1, 1));
        CpLanches.setText("Lanches");
        CpLanches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpLanchesActionPerformed(evt);
            }
        });

        CpBebidas.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        CpBebidas.setForeground(new java.awt.Color(1, 1, 1));
        CpBebidas.setText("Bebidas");
        CpBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpBebidasActionPerformed(evt);
            }
        });

        CpPorcoes.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        CpPorcoes.setForeground(new java.awt.Color(1, 1, 1));
        CpPorcoes.setText("Porções");
        CpPorcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpPorcoesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Selecione um de nossos cardapios");

        CpRefeicoes.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        CpRefeicoes.setForeground(new java.awt.Color(1, 1, 1));
        CpRefeicoes.setText("Refeições");
        CpRefeicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpRefeicoesActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CpPorcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CpRefeicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CpLanches, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CpBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CpLanches, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CpRefeicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CpPorcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CpBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CpLanchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpLanchesActionPerformed
        Cardapio.CardapioLanches cl = new Cardapio.CardapioLanches(); //Abre o cardapio de lanches
        cl.setVisible(true); 
        dispose();
    }//GEN-LAST:event_CpLanchesActionPerformed

    private void CpRefeicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpRefeicoesActionPerformed
        Cardapio.CardapioRefeicoes cr = new Cardapio.CardapioRefeicoes(); //Abre o cardapio de refeiçoes
        cr.setVisible(true);
        dispose();
    }//GEN-LAST:event_CpRefeicoesActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        //Chama o método para reescrever o arquivo da conta
        //toda vez que o cliente clicar em Voltar, para casos 
        //de queda ou travamentos do sistema.
        CriaConta.Formata();
        ArquivoConta.CriaArquivo();
        
        Principal.TelaPrincipal tp = new Principal.TelaPrincipal(); //Abre novamente a Tela Principal
        tp.setVisible(true);
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void CpBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpBebidasActionPerformed
        Cardapio.CardapioBebidas cb = new Cardapio.CardapioBebidas(); //Abre o cardapio de bebidas
        cb.setVisible(true);
        dispose();
    }//GEN-LAST:event_CpBebidasActionPerformed

    private void CpPorcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpPorcoesActionPerformed
        Cardapio.CardapioPorcoes cp = new Cardapio.CardapioPorcoes(); //Abre o cardapio de porçoes
        cp.setVisible(true);
        dispose();
    }//GEN-LAST:event_CpPorcoesActionPerformed

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
            java.util.logging.Logger.getLogger(OpPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CpBebidas;
    private javax.swing.JButton CpLanches;
    private javax.swing.JButton CpPorcoes;
    private javax.swing.JButton CpRefeicoes;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
