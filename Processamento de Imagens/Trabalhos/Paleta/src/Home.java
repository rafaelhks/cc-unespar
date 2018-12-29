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

    private Image imgProc, imgPaleta; //Classe que processa a imagem
    private String appName = "Processamento de Imagens (Ativ. 04/3)";
    private final String[][][] extensions = { {{"Images Only"},{"png", "jpg", "jpeg", "bmp"}},
                                        {{"PNG Images"},{"png", "PNG"}},
                                        {{"JPEG Images"},{"jpg", "jpeg"}},
                                        {{"BMP Images"},{"bmp", "BMP"}}};
    
    public Home() {
        initComponents();
        imgProc = new Image();
        this.setTitle(appName);
    }

    private boolean LoadImage(String imgPath){
        try {
            lblPicture.setText("");
            BufferedImage img = ImageIO.read(new File(imgPath));
            imgProc.loadImage(imgPath);
            setDisplayImage(img, lblPicture);
            return true;
        } catch (IOException | java.lang.NullPointerException e) {
            lblPicture.setIcon(null);
            lblPicture.setText("Falha ao abrir o arquivo  "+imgPath);
            return false;
        }
    }
    
    private void setDisplayImage(BufferedImage img, JLabel label){
        //Se img existir
        if(img!=null){
            label.setText("");
            //Mostra na tela
            label.setIcon(new ImageIcon(img));
        }else{
            label.setIcon(null);
            label.setText("Erro: Imagem não encontrada.");
        }
    }
    
    private void UnlockEditFeatures(boolean op){
        fileMenuSave.setEnabled(op);
        editMenu.setEnabled(op);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        imgDisplayScrollPane = new javax.swing.JScrollPane();
        lblPicture = new javax.swing.JLabel();
        imgDisplayScrollPane1 = new javax.swing.JScrollPane();
        lblPalette = new javax.swing.JLabel();
        dialogLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuOpen = new javax.swing.JMenuItem();
        fileMenuSave = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        paleta = new javax.swing.JMenuItem();

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

        imgDisplayScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        lblPalette.setBackground(new java.awt.Color(102, 102, 102));
        lblPalette.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPalette.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalette.setText("Palette");
        lblPalette.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPalette.setOpaque(true);
        imgDisplayScrollPane1.setViewportView(lblPalette);

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
                    .addComponent(imgDisplayScrollPane1)
                    .addComponent(imgDisplayScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                    .addComponent(dialogLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgDisplayScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imgDisplayScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dialogLabel)
                .addContainerGap())
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

        paleta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        paleta.setBackground(new java.awt.Color(51, 51, 51));
        paleta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        paleta.setForeground(new java.awt.Color(255, 255, 255));
        paleta.setText("Paleta");
        paleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paletaActionPerformed(evt);
            }
        });
        editMenu.add(paleta);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fileMenuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuOpenActionPerformed
        JFileChooser file = new JFileChooser();
        for (String[][] ext: extensions) {
            file.addChoosableFileFilter(new FileNameExtensionFilter(ext[0][0], ext[1]));
        }
        file.setAcceptAllFileFilterUsed(false);

        //0 = Abrir, 1 = Cancelar
        int i = file.showOpenDialog(this);

        if(i==0){ //Se o usuário clicou em Abrir
            lblPicture.setIcon(null); //Reseta Imagem
            String fileName = file.getSelectedFile().getName();
            //Se abertura ocorrer normalmente
            if(LoadImage(file.getSelectedFile().getPath())){
                this.setTitle(appName+" - "+file.getSelectedFile().getPath());
                UnlockEditFeatures(true);
            }else{
                UnlockEditFeatures(false);
            }
        }
    }//GEN-LAST:event_fileMenuOpenActionPerformed

    private void fileMenuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuSaveActionPerformed
        imgProc.saveImage(imgProc.getSrcImgPath()+"_Edit.png");
        dialogLabel.setText("Imagem salva em: "+imgProc.getSrcImgPath());
    }//GEN-LAST:event_fileMenuSaveActionPerformed

    private void paletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paletaActionPerformed
        
        setDisplayImage(imgProc.MatToBuffImg(imgProc.paleta2(7)), lblPalette);
    }//GEN-LAST:event_paletaActionPerformed
        
        
    public static void main(String args[]) {
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
    private javax.swing.JScrollPane imgDisplayScrollPane;
    private javax.swing.JScrollPane imgDisplayScrollPane1;
    private javax.swing.JLabel lblPalette;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem paleta;
    // End of variables declaration//GEN-END:variables
}
