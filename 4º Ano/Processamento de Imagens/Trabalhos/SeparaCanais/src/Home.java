
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Rafael
 */
public class Home extends javax.swing.JFrame {
    private Image image, chColor, chGray;
    private final String appName = "Processamento de Imagens - Ativ. 04/4, 05/2";
    
    private final String[][][] extensions = { {{"Images Only"},{"png", "jpg", "jpeg", "bmp"}},
                                        {{"PNG Images"},{"png", "PNG"}},
                                        {{"JPEG Images"},{"jpg", "jpeg"}},
                                        {{"BMP Images"},{"bmp", "BMP"}}};
    
    public Home() {
        initComponents();
        image = new Image();
        this.setTitle(appName);
    }
    
    private boolean LoadImage(String imgLocation){
        try {
            BufferedImage img = ImageIO.read(new File(imgLocation));
            image.loadImage(imgLocation);
            lblPicture.setText("");
            lblPicture.setIcon(new ImageIcon(img));
            return true;
        } catch (IOException | java.lang.NullPointerException e) {
            lblPicture.setIcon(null);
            lblPicture.setText("Falha ao abrir o arquivo  "+imgLocation);
            return false;
        }
    }
    
    private void setDisplayImage(BufferedImage img, JLabel lbl){
        if(img!=null){
            lbl.setText("");
            lbl.setIcon(new ImageIcon(img));
        }else{
            lbl.setIcon(null);
            lbl.setText("Error: Image not found!");
        }
    }
    
    private void UnlockEditFeatures(){
        saveColor.setEnabled(true);
        saveGray.setEnabled(true);
        editMenu.setEnabled(true);
    }
    
    private void MyFileChooser(int DIALOG_TYPE){
        JFileChooser file = new JFileChooser();
        for (String[][] ext: extensions) {
            file.addChoosableFileFilter(new FileNameExtensionFilter(ext[0][0], ext[1]));
        }
        file.setAcceptAllFileFilterUsed(false);
        
        //0 = Abrir, 1 = Cancelar
        if(DIALOG_TYPE==JFileChooser.OPEN_DIALOG){ //Se o usuário clicou em Abrir
            int i = file.showOpenDialog(this);
            if(i==0){
                lblPicture.setIcon(null); //Reseta Imagem
                String fileName = file.getSelectedFile().getName();
                //Se abertura ocorrer normalmente
                if(LoadImage(file.getSelectedFile().getPath())){
                    this.setTitle(appName+" - "+file.getSelectedFile().getPath());
                    UnlockEditFeatures();
                }
            }
        }
        
        if(DIALOG_TYPE == JFileChooser.SAVE_DIALOG){ //Se o usuário clicou em Salvar
            int i = file.showSaveDialog(this);
            if(i==0){
                file.setDialogTitle("Salvar Arquivo");
                file.setApproveButtonText("Salvar");
                String savePath, fileName;
                fileName= file.getSelectedFile().getName();
                savePath = file.getCurrentDirectory().getPath()+"\\"+fileName;

                if(image.saveImage(savePath)){
                    dialogLabel.setText("Imagem salva em: "+savePath);
                }else{
                    dialogLabel.setText("Falha ao salvar imagem em: "+savePath);
                }
            }  
        }
    }
    
    public void sepChannel(int ch, int COLOR_MODE, int COLOR_MODE_GRAY){
        chColor = image.sepChannel(ch, COLOR_MODE);
        setDisplayImage(chColor.MatToBuffImg(chColor.getMat()), lblChannel);
        chGray = chColor.sepChannel(ch, COLOR_MODE_GRAY);
        setDisplayImage(chGray.MatToBuffImg(chGray.getMat()), lblChannelGray);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        imgDisplayScrollPane = new javax.swing.JScrollPane();
        lblPicture = new javax.swing.JLabel();
        dialogLabel = new javax.swing.JLabel();
        imgDisplayScrollPane1 = new javax.swing.JScrollPane();
        lblChannel = new javax.swing.JLabel();
        imgDisplayScrollPane2 = new javax.swing.JScrollPane();
        lblChannelGray = new javax.swing.JLabel();
        saveColor = new javax.swing.JButton();
        dialogLabel1 = new javax.swing.JLabel();
        dialogLabel2 = new javax.swing.JLabel();
        saveGray = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuOpen = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        sepChMenu = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        sepRed = new javax.swing.JMenuItem();
        sepGreen = new javax.swing.JMenuItem();
        sepBlue = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        sepHue = new javax.swing.JMenuItem();
        sepSat = new javax.swing.JMenuItem();
        sepValue = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        sepY = new javax.swing.JMenuItem();
        sepI = new javax.swing.JMenuItem();
        sepQ = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Principal.setBackground(new java.awt.Color(51, 51, 51));
        Principal.setForeground(new java.awt.Color(255, 255, 255));

        imgDisplayScrollPane.setBackground(new java.awt.Color(51, 51, 51));

        lblPicture.setBackground(new java.awt.Color(153, 153, 153));
        lblPicture.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPicture.setText("Image Display");
        lblPicture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPicture.setOpaque(true);
        imgDisplayScrollPane.setViewportView(lblPicture);

        dialogLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dialogLabel.setForeground(new java.awt.Color(255, 255, 255));
        dialogLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dialogLabel.setText(" ");

        imgDisplayScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        lblChannel.setBackground(new java.awt.Color(153, 153, 153));
        lblChannel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblChannel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChannel.setText("Image Display");
        lblChannel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblChannel.setOpaque(true);
        imgDisplayScrollPane1.setViewportView(lblChannel);

        imgDisplayScrollPane2.setBackground(new java.awt.Color(51, 51, 51));

        lblChannelGray.setBackground(new java.awt.Color(153, 153, 153));
        lblChannelGray.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblChannelGray.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChannelGray.setText("Image Display");
        lblChannelGray.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblChannelGray.setOpaque(true);
        imgDisplayScrollPane2.setViewportView(lblChannelGray);

        saveColor.setText("Salvar");
        saveColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveColorActionPerformed(evt);
            }
        });

        dialogLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dialogLabel1.setForeground(new java.awt.Color(255, 255, 255));
        dialogLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dialogLabel1.setText("Color");

        dialogLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dialogLabel2.setForeground(new java.awt.Color(255, 255, 255));
        dialogLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dialogLabel2.setText("Grayscale");

        saveGray.setText("Salvar");
        saveGray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveGrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgDisplayScrollPane)
                    .addComponent(dialogLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dialogLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgDisplayScrollPane1))
                        .addGap(15, 15, 15)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgDisplayScrollPane2)
                            .addComponent(dialogLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(saveColor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
                .addComponent(saveGray)
                .addGap(155, 155, 155))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgDisplayScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dialogLabel1)
                    .addComponent(dialogLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgDisplayScrollPane1)
                    .addComponent(imgDisplayScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveColor)
                    .addComponent(saveGray))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dialogLabel))
        );

        menuBar.setBackground(new java.awt.Color(102, 102, 102));
        menuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuBar.setForeground(new java.awt.Color(255, 255, 255));

        fileMenu.setBackground(new java.awt.Color(51, 51, 51));
        fileMenu.setForeground(new java.awt.Color(255, 255, 255));
        fileMenu.setText("Arquivo");
        fileMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        fileMenuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        fileMenuOpen.setBackground(new java.awt.Color(51, 51, 51));
        fileMenuOpen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fileMenuOpen.setForeground(new java.awt.Color(255, 255, 255));
        fileMenuOpen.setText("Abrir");
        fileMenuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuOpenActionPerformed(evt);
            }
        });
        fileMenu.add(fileMenuOpen);

        menuBar.add(fileMenu);

        editMenu.setBackground(new java.awt.Color(51, 51, 51));
        editMenu.setForeground(new java.awt.Color(255, 255, 255));
        editMenu.setText("Editar");
        editMenu.setEnabled(false);
        editMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        sepChMenu.setBackground(new java.awt.Color(102, 102, 102));
        sepChMenu.setText("Separar Canal");

        jMenu1.setText("RGB");

        sepRed.setBackground(new java.awt.Color(102, 102, 102));
        sepRed.setForeground(new java.awt.Color(255, 255, 255));
        sepRed.setText("Red");
        sepRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepRedActionPerformed(evt);
            }
        });
        jMenu1.add(sepRed);

        sepGreen.setBackground(new java.awt.Color(102, 102, 102));
        sepGreen.setForeground(new java.awt.Color(255, 255, 255));
        sepGreen.setText("Green");
        sepGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepGreenActionPerformed(evt);
            }
        });
        jMenu1.add(sepGreen);

        sepBlue.setBackground(new java.awt.Color(102, 102, 102));
        sepBlue.setForeground(new java.awt.Color(255, 255, 255));
        sepBlue.setText("Blue");
        sepBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepBlueActionPerformed(evt);
            }
        });
        jMenu1.add(sepBlue);

        sepChMenu.add(jMenu1);

        jMenu2.setText("HSV");

        sepHue.setBackground(new java.awt.Color(102, 102, 102));
        sepHue.setForeground(new java.awt.Color(255, 255, 255));
        sepHue.setText("Hue");
        sepHue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepHueActionPerformed(evt);
            }
        });
        jMenu2.add(sepHue);

        sepSat.setBackground(new java.awt.Color(102, 102, 102));
        sepSat.setForeground(new java.awt.Color(255, 255, 255));
        sepSat.setText("Saturation");
        sepSat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepSatActionPerformed(evt);
            }
        });
        jMenu2.add(sepSat);

        sepValue.setBackground(new java.awt.Color(102, 102, 102));
        sepValue.setForeground(new java.awt.Color(255, 255, 255));
        sepValue.setText("Value");
        sepValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepValueActionPerformed(evt);
            }
        });
        jMenu2.add(sepValue);

        sepChMenu.add(jMenu2);

        jMenu3.setText("YIQ");

        sepY.setBackground(new java.awt.Color(102, 102, 102));
        sepY.setForeground(new java.awt.Color(255, 255, 255));
        sepY.setText("Y");
        sepY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepYActionPerformed(evt);
            }
        });
        jMenu3.add(sepY);

        sepI.setBackground(new java.awt.Color(102, 102, 102));
        sepI.setForeground(new java.awt.Color(255, 255, 255));
        sepI.setText("I");
        sepI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepIActionPerformed(evt);
            }
        });
        jMenu3.add(sepI);

        sepQ.setBackground(new java.awt.Color(102, 102, 102));
        sepQ.setForeground(new java.awt.Color(255, 255, 255));
        sepQ.setText("Q");
        sepQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepQActionPerformed(evt);
            }
        });
        jMenu3.add(sepQ);

        sepChMenu.add(jMenu3);

        editMenu.add(sepChMenu);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fileMenuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuOpenActionPerformed
        MyFileChooser(JFileChooser.OPEN_DIALOG);
    }//GEN-LAST:event_fileMenuOpenActionPerformed

    private void sepBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepBlueActionPerformed
        sepChannel(0,Image.COLOR_RGB, Image.COLOR_GRAY_RGB);
    }//GEN-LAST:event_sepBlueActionPerformed

    private void sepRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepRedActionPerformed
        sepChannel(2,Image.COLOR_RGB, Image.COLOR_GRAY_RGB);
    }//GEN-LAST:event_sepRedActionPerformed

    private void sepGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepGreenActionPerformed
        sepChannel(1,Image.COLOR_RGB, Image.COLOR_GRAY_RGB);
    }//GEN-LAST:event_sepGreenActionPerformed

    private void sepHueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepHueActionPerformed
        sepChannel(0,Image.COLOR_HSV, Image.COLOR_GRAY_HSV);
    }//GEN-LAST:event_sepHueActionPerformed

    private void sepSatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepSatActionPerformed
        sepChannel(1,Image.COLOR_HSV, Image.COLOR_GRAY_HSV);
    }//GEN-LAST:event_sepSatActionPerformed

    private void sepValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepValueActionPerformed
        sepChannel(2,Image.COLOR_HSV, Image.COLOR_GRAY_HSV);
    }//GEN-LAST:event_sepValueActionPerformed

    private void sepYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepYActionPerformed
        sepChannel(0,Image.COLOR_YIQ, Image.COLOR_GRAY_YIQ);
    }//GEN-LAST:event_sepYActionPerformed

    private void sepIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepIActionPerformed
        sepChannel(1,Image.COLOR_YIQ, Image.COLOR_GRAY_YIQ);
    }//GEN-LAST:event_sepIActionPerformed

    private void sepQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepQActionPerformed
        sepChannel(2,Image.COLOR_YIQ, Image.COLOR_GRAY_YIQ);
    }//GEN-LAST:event_sepQActionPerformed

    private void saveColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveColorActionPerformed
        chColor.saveImage(image.getSrcImgPath()+"_sepChannelColor.png");
    }//GEN-LAST:event_saveColorActionPerformed

    private void saveGrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveGrayActionPerformed
        chGray.saveImage(image.getSrcImgPath()+"_sepChannelGray.png");
    }//GEN-LAST:event_saveGrayActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JLabel dialogLabel;
    private javax.swing.JLabel dialogLabel1;
    private javax.swing.JLabel dialogLabel2;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuOpen;
    private javax.swing.JScrollPane imgDisplayScrollPane;
    private javax.swing.JScrollPane imgDisplayScrollPane1;
    private javax.swing.JScrollPane imgDisplayScrollPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JLabel lblChannel;
    private javax.swing.JLabel lblChannelGray;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton saveColor;
    private javax.swing.JButton saveGray;
    private javax.swing.JMenuItem sepBlue;
    private javax.swing.JMenu sepChMenu;
    private javax.swing.JMenuItem sepGreen;
    private javax.swing.JMenuItem sepHue;
    private javax.swing.JMenuItem sepI;
    private javax.swing.JMenuItem sepQ;
    private javax.swing.JMenuItem sepRed;
    private javax.swing.JMenuItem sepSat;
    private javax.swing.JMenuItem sepValue;
    private javax.swing.JMenuItem sepY;
    // End of variables declaration//GEN-END:variables
}
