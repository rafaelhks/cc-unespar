
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
/**
 *
 * @author Rafael
 */
public class Tela extends javax.swing.JFrame {
    private myImgProc imgProc; //Classe que processa a imagem
    private String appName = "Processamento de Imagens (Ativ. 04/1)";
    
    public Tela() {
        initComponents();
        imgProc = new myImgProc();
        this.setTitle(appName);
        imgProc.loadFile();
        setOriginalImages(imgProc.MatToBuffImg(imgProc.getSrcImg1()), imgProc.MatToBuffImg(imgProc.getSrcImg2()));
    }
    
    private void setOriginalImages(BufferedImage img1, BufferedImage img2){
        //Se img existir
        if(img1!=null && img2!=null){
            lblSrc1.setText("");
            lblSrc2.setText("");
            //Mostra na tela
            lblSrc1.setIcon(new ImageIcon(img1));
            lblSrc2.setIcon(new ImageIcon(img2));
        }else{
            lblSrc1.setIcon(null);
            lblSrc1.setText("Erro: Imagem não encontrada.");
            lblSrc2.setIcon(null);
            lblSrc2.setText("Erro: Imagem não encontrada.");
        }
    }
    
    private void setFinalImage(BufferedImage img){
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
        imgDisplayScrollPane = new javax.swing.JScrollPane();
        lblSrc1 = new javax.swing.JLabel();
        imgDisplayScrollPane1 = new javax.swing.JScrollPane();
        lblSrc2 = new javax.swing.JLabel();
        imgDisplayScrollPane2 = new javax.swing.JScrollPane();
        lblPicture = new javax.swing.JLabel();
        operaE = new javax.swing.JButton();
        operaOU = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Principal.setBackground(new java.awt.Color(51, 51, 51));
        Principal.setForeground(new java.awt.Color(255, 255, 255));

        imgDisplayScrollPane.setBackground(new java.awt.Color(51, 51, 51));

        lblSrc1.setBackground(new java.awt.Color(153, 153, 153));
        lblSrc1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblSrc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSrc1.setText("Imagem 1");
        lblSrc1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblSrc1.setOpaque(true);
        imgDisplayScrollPane.setViewportView(lblSrc1);

        imgDisplayScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        lblSrc2.setBackground(new java.awt.Color(153, 153, 153));
        lblSrc2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblSrc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSrc2.setText("Imagem 2");
        lblSrc2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblSrc2.setOpaque(true);
        imgDisplayScrollPane1.setViewportView(lblSrc2);

        imgDisplayScrollPane2.setBackground(new java.awt.Color(51, 51, 51));

        lblPicture.setBackground(new java.awt.Color(153, 153, 153));
        lblPicture.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPicture.setText("Image Display");
        lblPicture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPicture.setOpaque(true);
        imgDisplayScrollPane2.setViewportView(lblPicture);

        operaE.setText("Operação E");
        operaE.setFocusPainted(false);
        operaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operaEActionPerformed(evt);
            }
        });

        operaOU.setText("Operação OU");
        operaOU.setFocusPainted(false);
        operaOU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operaOUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgDisplayScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addComponent(imgDisplayScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(operaE, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(operaOU)
                        .addContainerGap(131, Short.MAX_VALUE))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(imgDisplayScrollPane2)
                        .addContainerGap())))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(imgDisplayScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imgDisplayScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addComponent(imgDisplayScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(operaE)
                            .addComponent(operaOU))))
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
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void operaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operaEActionPerformed
        setFinalImage(imgProc.MatToBuffImg(imgProc.AND()));
    }//GEN-LAST:event_operaEActionPerformed

    private void operaOUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operaOUActionPerformed
        setFinalImage(imgProc.MatToBuffImg(imgProc.OR()));
    }//GEN-LAST:event_operaOUActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JScrollPane imgDisplayScrollPane;
    private javax.swing.JScrollPane imgDisplayScrollPane1;
    private javax.swing.JScrollPane imgDisplayScrollPane2;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lblSrc1;
    private javax.swing.JLabel lblSrc2;
    private javax.swing.JButton operaE;
    private javax.swing.JButton operaOU;
    // End of variables declaration//GEN-END:variables
}
