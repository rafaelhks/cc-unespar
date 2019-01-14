import java.util.Arrays;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;
/**
 *
 * @author Rafael
 */
public class Tela extends javax.swing.JFrame {
    
    private Image image;
    private final String appName = "Processamento de Imagens - (Ativ. 07/1, 07/2)";
    private final String[] extensions = {"PNG", "JPG", "JPEG", "BMP"};
    
    public Tela() {
        initComponents();
        this.setTitle(appName);
    }
    
    private void setDisplayImage(Image img, javax.swing.JLabel lbl){
        if(img!=null){
            lbl.setText("");
            lbl.setIcon(new javax.swing.ImageIcon(img.getBuffImg()));
            lbl.setSize(img.height(), img.width());
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
                //imgProc.Binarize(image, 100);
                setDisplayImage(image, lblPicture);
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
        lblPictureScrollPane = new javax.swing.JScrollPane();
        lblPicture = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuOpen = new javax.swing.JMenuItem();
        fileMenuSave = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        preencherCentro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Principal.setBackground(new java.awt.Color(51, 51, 51));
        Principal.setForeground(new java.awt.Color(255, 255, 255));

        lblPicture.setBackground(new java.awt.Color(102, 102, 102));
        lblPicture.setForeground(new java.awt.Color(255, 255, 255));
        lblPicture.setText("Image Display");
        lblPicture.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblPicture.setOpaque(true);
        lblPictureScrollPane.setViewportView(lblPicture);

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPictureScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                .addContainerGap())
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPictureScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
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

        preencherCentro.setBackground(new java.awt.Color(51, 51, 51));
        preencherCentro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        preencherCentro.setForeground(new java.awt.Color(255, 255, 255));
        preencherCentro.setText("Regra da Cadeia");
        preencherCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preencherCentroActionPerformed(evt);
            }
        });
        editMenu.add(preencherCentro);

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

    private void preencherCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preencherCentroActionPerformed
        if(image!=null){
            String n = imgProc.BugFollowerSimples(image, 0, 0, new double[]{255,0,0});
            setDisplayImage(image, lblPicture);
            javax.swing.JOptionPane.showMessageDialog(this, 
                            n, "OK", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_preencherCentroActionPerformed
    
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
    private javax.swing.JLabel lblPicture;
    private javax.swing.JScrollPane lblPictureScrollPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem preencherCentro;
    // End of variables declaration//GEN-END:variables
}
