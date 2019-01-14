import java.util.Arrays;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;
/**
 *
 * @author Rafael
 */
public class Tela extends javax.swing.JFrame {
    
    private Image image;
    private final String appName = "Processamento de Imagens - (Ativ. 06/1, 06/2)";
    private final String[] extensions = {"PNG", "JPG", "JPEG", "BMP"};
    
    public Tela() {
        initComponents();
        this.setTitle(appName);
    }
    
    private void setDisplayImage(Image img, javax.swing.JLabel lbl){
        if(img!=null){
            lbl.setText("");
            lbl.setIcon(new javax.swing.ImageIcon(img.getBuffImg()));
            UnlockEditFeatures(true);
        }else{
            lbl.setIcon(null);
            lbl.setText("Error: Image not found!");
            UnlockEditFeatures(false);
        }
    }
    
    private void UnlockEditFeatures(boolean is){
        fileMenuSave.setEnabled(is);
        editMenu.setEnabled(is);
    }
    
    private void MyFileChooser(int DIALOG_TYPE){
        javax.swing.JFileChooser file = new javax.swing.JFileChooser();
        file.setAcceptAllFileFilterUsed(false);
        
        if(DIALOG_TYPE==javax.swing.JFileChooser.OPEN_DIALOG){ //Se o usuário clicou em Abrir
            file.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files "+Arrays.toString(extensions), extensions));
            //0 = Abrir, 1 = Cancelar
            int i = file.showOpenDialog(this);
            if(i==0){
                lblPicture.setIcon(null); //Reseta Imagem
                String filePath = file.getSelectedFile().getPath();
                image = new Image(filePath);
                setDisplayImage(image, lblPicture);
                lblPicture.setSize(image.height(), image.width());
                this.setTitle(appName+" - "+filePath);
                System.out.println(file.getSelectedFile().getPath());
            }
        }
        
        else if(DIALOG_TYPE == javax.swing.JFileChooser.SAVE_DIALOG){ //Se o usuário clicou em Salvar
            for(String ext: extensions){
                file.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(ext+" Image", ext));
            }
            
            int i = file.showSaveDialog(this);
            if(i==0){
                String ext = ((FileNameExtensionFilter) file.getFileFilter()).getExtensions()[0];
                String path = file.getSelectedFile().getPath()+"."+ext;
                if(imgProc.saveImage(image, path)){
                    javax.swing.JOptionPane.showMessageDialog(null, 
                            "Imagem salva em: "+path, "OK", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }else{
                    javax.swing.JOptionPane.showMessageDialog(null, 
                            "Falha ao salvar em: "+path, "OK", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            }  
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblPicture = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuOpen = new javax.swing.JMenuItem();
        fileMenuSave = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        sobelBt = new javax.swing.JMenuItem();
        mediaBt = new javax.swing.JMenuItem();
        mediaBt1 = new javax.swing.JMenuItem();
        medianaBt = new javax.swing.JMenuItem();
        medianaBt1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Principal.setBackground(new java.awt.Color(51, 51, 51));
        Principal.setForeground(new java.awt.Color(255, 255, 255));

        lblPicture.setBackground(new java.awt.Color(102, 102, 102));
        lblPicture.setForeground(new java.awt.Color(255, 255, 255));
        lblPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPicture.setText("Image Display");
        lblPicture.setOpaque(true);
        jScrollPane1.setViewportView(lblPicture);

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                .addContainerGap())
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuBar.setBackground(new java.awt.Color(102, 102, 102));
        menuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuBar.setForeground(new java.awt.Color(255, 255, 255));

        fileMenu.setBackground(new java.awt.Color(51, 51, 51));
        fileMenu.setForeground(new java.awt.Color(255, 255, 255));
        fileMenu.setText("Arquivo");
        fileMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        fileMenuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
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

        sobelBt.setBackground(new java.awt.Color(51, 51, 51));
        sobelBt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sobelBt.setForeground(new java.awt.Color(255, 255, 255));
        sobelBt.setText("Sobel");
        sobelBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobelBtActionPerformed(evt);
            }
        });
        editMenu.add(sobelBt);

        mediaBt.setBackground(new java.awt.Color(51, 51, 51));
        mediaBt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mediaBt.setForeground(new java.awt.Color(255, 255, 255));
        mediaBt.setText("Média (Cor)");
        mediaBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaBtActionPerformed(evt);
            }
        });
        editMenu.add(mediaBt);

        mediaBt1.setBackground(new java.awt.Color(51, 51, 51));
        mediaBt1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mediaBt1.setForeground(new java.awt.Color(255, 255, 255));
        mediaBt1.setText("Média (Cinza)");
        mediaBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaBt1ActionPerformed(evt);
            }
        });
        editMenu.add(mediaBt1);

        medianaBt.setBackground(new java.awt.Color(51, 51, 51));
        medianaBt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        medianaBt.setForeground(new java.awt.Color(255, 255, 255));
        medianaBt.setText("Mediana (Cor)");
        medianaBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medianaBtActionPerformed(evt);
            }
        });
        editMenu.add(medianaBt);

        medianaBt1.setBackground(new java.awt.Color(51, 51, 51));
        medianaBt1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        medianaBt1.setForeground(new java.awt.Color(255, 255, 255));
        medianaBt1.setText("Mediana (Cinza)");
        medianaBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medianaBt1ActionPerformed(evt);
            }
        });
        editMenu.add(medianaBt1);

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
        MyFileChooser(javax.swing.JFileChooser.OPEN_DIALOG);
    }//GEN-LAST:event_fileMenuOpenActionPerformed

    private void fileMenuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuSaveActionPerformed
        MyFileChooser(javax.swing.JFileChooser.SAVE_DIALOG);
    }//GEN-LAST:event_fileMenuSaveActionPerformed

    private void sobelBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobelBtActionPerformed
        image = imgProc.Sobel(image, 50);
        setDisplayImage(image, lblPicture);
    }//GEN-LAST:event_sobelBtActionPerformed

    private void mediaBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaBtActionPerformed
        image = imgProc.Media(image, 1, imgProc.COLOR_RGB);
        setDisplayImage(image, lblPicture);
    }//GEN-LAST:event_mediaBtActionPerformed

    private void medianaBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medianaBtActionPerformed
        image = imgProc.Mediana(image, 1, imgProc.COLOR_RGB);
        setDisplayImage(image, lblPicture);
    }//GEN-LAST:event_medianaBtActionPerformed

    private void mediaBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaBt1ActionPerformed
        image = imgProc.Media(image, 1, imgProc.COLOR_GRAY_RGB);
        setDisplayImage(image, lblPicture);
    }//GEN-LAST:event_mediaBt1ActionPerformed

    private void medianaBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medianaBt1ActionPerformed
        image = imgProc.Mediana(image, 1, imgProc.COLOR_GRAY_RGB);
        setDisplayImage(image, lblPicture);
    }//GEN-LAST:event_medianaBt1ActionPerformed

    public static void main(String args[]) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        java.awt.EventQueue.invokeLater(() -> {
            new Tela().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuOpen;
    private javax.swing.JMenuItem fileMenuSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JMenuItem mediaBt;
    private javax.swing.JMenuItem mediaBt1;
    private javax.swing.JMenuItem medianaBt;
    private javax.swing.JMenuItem medianaBt1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem sobelBt;
    // End of variables declaration//GEN-END:variables
}
