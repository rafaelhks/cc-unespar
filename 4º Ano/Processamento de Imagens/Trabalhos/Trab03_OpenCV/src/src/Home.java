package src;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author Rafael
 */
public class Home extends javax.swing.JFrame {

    private myImgProc imgProc; //Classe que processa a imagem
    private String appName = "Processamento de Imagens (Ativ. 03/1 - 03/2 - 03/3)";

    public Home() {
        initComponents();
        this.setTitle(appName);
        imgProc = new myImgProc();
    }
    
    private boolean LoadImage(String imgPath){
        try {
            lblPicture.setText("");
            BufferedImage img = ImageIO.read(new File(imgPath));
            imgProc.openFile(imgPath);
            lblPicture.setIcon(new ImageIcon(img));
            return true;
        } catch (IOException | java.lang.NullPointerException e) {
            lblPicture.setIcon(null);
            lblPicture.setText("Falha ao abrir o arquivo  "+imgPath);
            return false;
        }
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

    private void UnlockEditFeatures(){
        fileMenuSave.setEnabled(true);
        editMenu.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        imgDisplayScrollPane = new javax.swing.JScrollPane();
        lblPicture = new javax.swing.JLabel();
        dialogLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuOpen = new javax.swing.JMenuItem();
        fileMenuSave = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        invertButton = new javax.swing.JMenuItem();
        histogramGraytButton = new javax.swing.JMenuItem();
        histogramColortButton = new javax.swing.JMenuItem();

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

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgDisplayScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                    .addComponent(dialogLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgDisplayScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dialogLabel)
                .addGap(8, 8, 8))
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

        fileMenuSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        fileMenuSave.setBackground(new java.awt.Color(51, 51, 51));
        fileMenuSave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fileMenuSave.setForeground(new java.awt.Color(255, 255, 255));
        fileMenuSave.setText("Salvar");
        fileMenuSave.setEnabled(false);
        fileMenuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuSaveActionPerformed(evt);
            }
        });
        fileMenu.add(fileMenuSave);

        menuBar.add(fileMenu);

        editMenu.setBackground(new java.awt.Color(51, 51, 51));
        editMenu.setForeground(new java.awt.Color(255, 255, 255));
        editMenu.setText("Editar");
        editMenu.setEnabled(false);
        editMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        invertButton.setBackground(new java.awt.Color(51, 51, 51));
        invertButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        invertButton.setForeground(new java.awt.Color(255, 255, 255));
        invertButton.setText("Inverter");
        invertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invertButtonActionPerformed(evt);
            }
        });
        editMenu.add(invertButton);

        histogramGraytButton.setBackground(new java.awt.Color(51, 51, 51));
        histogramGraytButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        histogramGraytButton.setForeground(new java.awt.Color(255, 255, 255));
        histogramGraytButton.setText("Histograma (Cinza)");
        histogramGraytButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histogramGraytButtonActionPerformed(evt);
            }
        });
        editMenu.add(histogramGraytButton);

        histogramColortButton.setBackground(new java.awt.Color(51, 51, 51));
        histogramColortButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        histogramColortButton.setForeground(new java.awt.Color(255, 255, 255));
        histogramColortButton.setText("Histograma (Cores)");
        histogramColortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histogramColortButtonActionPerformed(evt);
            }
        });
        editMenu.add(histogramColortButton);

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
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.OPEN_DIALOG);

        //0 = Abrir, 1 = Cancelar
        int i = file.showDialog(this, null);

        if(i==0){ //Se o usuário clicou em Abrir
            lblPicture.setIcon(null); //Reseta Imagem
            String fileName = file.getSelectedFile().getName();
            //Se abertura ocorrer normalmente
            if(LoadImage(file.getSelectedFile().getPath())){
                this.setTitle(appName+" - "+file.getSelectedFile().getPath());
                UnlockEditFeatures();
            }
        }
    }//GEN-LAST:event_fileMenuOpenActionPerformed

    private void fileMenuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuSaveActionPerformed
        //Gambiarra para editar o nome da imagem 
        //e salvar no mesmo local da original 
        String savePath = imgProc.getSrcImgPath();
        String ext = savePath.substring(savePath.lastIndexOf("."));
        savePath = savePath.replace(ext, "")+"_Edit"+ext;
        
        imgProc.saveFile(savePath);
        dialogLabel.setText("Imagem salva em: "+savePath);
    }//GEN-LAST:event_fileMenuSaveActionPerformed

    private void invertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invertButtonActionPerformed
        setDisplayImage(imgProc.MatToBuffImg(imgProc.Invert()));
    }//GEN-LAST:event_invertButtonActionPerformed

    private void histogramGraytButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histogramGraytButtonActionPerformed
        setDisplayImage(imgProc.MatToBuffImg(imgProc.HistogramGray()));
    }//GEN-LAST:event_histogramGraytButtonActionPerformed

    private void histogramColortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histogramColortButtonActionPerformed
        setDisplayImage(imgProc.MatToBuffImg(imgProc.HistogramColor()));
    }//GEN-LAST:event_histogramColortButtonActionPerformed

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
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuOpen;
    private javax.swing.JMenuItem fileMenuSave;
    private javax.swing.JMenuItem histogramColortButton;
    private javax.swing.JMenuItem histogramGraytButton;
    private javax.swing.JScrollPane imgDisplayScrollPane;
    private javax.swing.JMenuItem invertButton;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
