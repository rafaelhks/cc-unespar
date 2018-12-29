

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author Rafael
 */
public class Tela extends javax.swing.JFrame {
    private myImgProc imgProc; //Classe que processa a imagem
    private String appName = "Processamento de Imagens (Ativ. 04/02)";
    
    public Tela() {
        initComponents();
        imgProc = new myImgProc();
        this.setTitle(appName);
        setDisplayImage(imgProc.MatToBuffImg(imgProc.getSrcImg()));
    }
    
    private void setDisplayImage(BufferedImage img){
        //Se img existir
        if(img!=null){
            lblPicture.setText("");
            //Mostra na tela
            lblPicture.setIcon(new ImageIcon(img));
        }else{
            lblPicture.setIcon(null);
            lblPicture.setText("Erro: Imagem não encontrada.");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        imgDisplayScrollPane2 = new javax.swing.JScrollPane();
        lblPicture = new javax.swing.JLabel();
        complementoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Principal.setBackground(new java.awt.Color(51, 51, 51));
        Principal.setForeground(new java.awt.Color(255, 255, 255));

        imgDisplayScrollPane2.setBackground(new java.awt.Color(51, 51, 51));

        lblPicture.setBackground(new java.awt.Color(153, 153, 153));
        lblPicture.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPicture.setText("Image Display");
        lblPicture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPicture.setOpaque(true);
        imgDisplayScrollPane2.setViewportView(lblPicture);

        complementoButton.setBackground(new java.awt.Color(102, 102, 102));
        complementoButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        complementoButton.setForeground(new java.awt.Color(255, 255, 255));
        complementoButton.setText("Complemento");
        complementoButton.setFocusPainted(false);
        complementoButton.setFocusable(false);
        complementoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgDisplayScrollPane2)
                .addContainerGap())
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(complementoButton)
                .addContainerGap(269, Short.MAX_VALUE))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgDisplayScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(complementoButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void complementoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoButtonActionPerformed
        setDisplayImage(imgProc.MatToBuffImg(imgProc.Complemento()));
    }//GEN-LAST:event_complementoButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JButton complementoButton;
    private javax.swing.JScrollPane imgDisplayScrollPane2;
    private javax.swing.JLabel lblPicture;
    // End of variables declaration//GEN-END:variables
}
