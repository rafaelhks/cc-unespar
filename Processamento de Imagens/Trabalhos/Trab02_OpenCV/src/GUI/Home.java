package GUI;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Rafael
 */
public class Home extends javax.swing.JFrame {

    private Classes.Main imgProc;
    private double old_zoom, crt_zoom; 
    private int zoomValue = 0, fator = 2;
    
    public Home() {
        initComponents();
        zoomTypeGroup.add(bt_quad);
        zoomTypeGroup.add(bt_linear);
        zoomTypeGroup.setSelected(bt_quad.getModel(), true);
    }
    
    private void LoadToProcessor(String imgLocation){
        zoomValue = 0; //reseta valor do multiplicador de zoom
        imgProc = new Classes.Main(imgLocation);
        try {
            lblPicture.setText("");
            BufferedImage img = ImageIO.read(new File(imgLocation));
            lblPicture.setIcon(new ImageIcon(img));
        } catch (IOException e) {
            lblPicture.setIcon(null);
            lblPicture.setText("Erro: Imagem não encontrada em: "+filePatchText.getText());
        }
    }
    
    private void setDisplayImage(BufferedImage img){
        if(img!=null){
            lblPicture.setText("");
            lblPicture.setIcon(new ImageIcon(img));
        }else{
            lblPicture.setIcon(null);
            lblPicture.setText("Erro: Imagem não encontrada.");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zoomTypeGroup = new javax.swing.ButtonGroup();
        Principal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblPicture = new javax.swing.JLabel();
        filePatchText = new javax.swing.JTextField();
        open_Button = new javax.swing.JButton();
        bt_linear = new javax.swing.JRadioButton();
        bt_quad = new javax.swing.JRadioButton();
        zoomInButton = new javax.swing.JButton();
        zoomOutButton = new javax.swing.JButton();
        saveImgButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atividades 02/1 e 02/2 - Processamento de Imagens - Rafael F. Ferreira");
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Principal.setBackground(new java.awt.Color(51, 51, 51));
        Principal.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        lblPicture.setBackground(new java.awt.Color(153, 153, 153));
        lblPicture.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPicture.setText("Image Display");
        lblPicture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(lblPicture);

        filePatchText.setText("C:/Users/Rafael/Desktop/srcImg.png");

        open_Button.setBackground(new java.awt.Color(102, 102, 102));
        open_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        open_Button.setForeground(new java.awt.Color(255, 255, 255));
        open_Button.setText("Abrir arquivo");
        open_Button.setSelected(true);
        open_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_ButtonActionPerformed(evt);
            }
        });

        bt_linear.setBackground(new java.awt.Color(51, 51, 51));
        bt_linear.setForeground(new java.awt.Color(255, 255, 255));
        bt_linear.setText("Linear");

        bt_quad.setBackground(new java.awt.Color(51, 51, 51));
        bt_quad.setForeground(new java.awt.Color(255, 255, 255));
        bt_quad.setText("Quad");

        zoomInButton.setBackground(new java.awt.Color(102, 102, 102));
        zoomInButton.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        zoomInButton.setForeground(new java.awt.Color(255, 255, 255));
        zoomInButton.setText("+");
        zoomInButton.setEnabled(false);
        zoomInButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        zoomInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomInButtonActionPerformed(evt);
            }
        });

        zoomOutButton.setBackground(new java.awt.Color(102, 102, 102));
        zoomOutButton.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        zoomOutButton.setForeground(new java.awt.Color(255, 255, 255));
        zoomOutButton.setText("-");
        zoomOutButton.setEnabled(false);
        zoomOutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        zoomOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomOutButtonActionPerformed(evt);
            }
        });

        saveImgButton.setBackground(new java.awt.Color(102, 102, 102));
        saveImgButton.setForeground(new java.awt.Color(255, 255, 255));
        saveImgButton.setText("Salvar");
        saveImgButton.setEnabled(false);
        saveImgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveImgButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_quad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_linear))
                        .addGap(18, 18, 18)
                        .addComponent(zoomInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zoomOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 333, Short.MAX_VALUE)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(filePatchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addComponent(saveImgButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(open_Button))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(filePatchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(open_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveImgButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PrincipalLayout.createSequentialGroup()
                            .addComponent(bt_linear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_quad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(zoomOutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zoomInButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void open_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_ButtonActionPerformed
        LoadToProcessor(filePatchText.getText());
        zoomInButton.setEnabled(true);
        zoomOutButton.setEnabled(true);
        saveImgButton.setEnabled(true);
    }//GEN-LAST:event_open_ButtonActionPerformed
    
    private void zoomInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomInButtonActionPerformed
        BufferedImage icon = null;

        zoomValue++;
        
        if(zoomTypeGroup.getSelection().equals(bt_quad.getModel())){
            icon = imgProc.MatToBuffImg(imgProc.zoomInQuad(fator));
        }
        if(zoomTypeGroup.getSelection().equals(bt_linear.getModel())){
            icon = imgProc.MatToBuffImg(imgProc.zoomInLinear(fator));
        }
        setDisplayImage(icon);
    }//GEN-LAST:event_zoomInButtonActionPerformed

    private void zoomOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomOutButtonActionPerformed

        zoomValue--;
            BufferedImage icon = null;
            //zoom out na mesma proporção do zoom in
            if(zoomTypeGroup.getSelection().equals(bt_quad.getModel())){
                icon = imgProc.MatToBuffImg(imgProc.zoomOutQuad(fator));
            }
            if(zoomTypeGroup.getSelection().equals(bt_linear.getModel())){
                icon = imgProc.MatToBuffImg(imgProc.zoomOutLinear(fator));
            }
            setDisplayImage(icon);
        
    }//GEN-LAST:event_zoomOutButtonActionPerformed

    private void saveImgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveImgButtonActionPerformed
        if(imgProc.saveImage(filePatchText.getText())){
            System.out.println("Imagem salva em: "+filePatchText.getText());
        }else{
            System.out.println("Erro ao salvar imagem.");
        }
    }//GEN-LAST:event_saveImgButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JRadioButton bt_linear;
    private javax.swing.JRadioButton bt_quad;
    private javax.swing.JTextField filePatchText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JButton open_Button;
    private javax.swing.JButton saveImgButton;
    private javax.swing.JButton zoomInButton;
    private javax.swing.JButton zoomOutButton;
    private javax.swing.ButtonGroup zoomTypeGroup;
    // End of variables declaration//GEN-END:variables
}
