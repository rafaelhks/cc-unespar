import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;
/**
 *
 * @author Rafael
 */
public class Tela extends javax.swing.JFrame {
    
    private Image original, deform;
    private final String appName = "Processamento de Imagens - (Ativ. 07/3)";
    private final String[] extensions = {"PNG", "JPG", "JPEG", "BMP"};
    private final List<Pixel> clickPointsPic1 = new ArrayList<>();
    private final List<Pixel> clickPointsPic2 = new ArrayList<>();
    
    public Tela() {
        initComponents();
        this.setTitle(appName);
        lblPic2.setEnabled(false);
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
    }

    private void MyFileChooser(int DIALOG_TYPE){
        javax.swing.JFileChooser file = new javax.swing.JFileChooser();
        file.setAcceptAllFileFilterUsed(false);
        
        if(DIALOG_TYPE==javax.swing.JFileChooser.OPEN_DIALOG){ //Se o usuário clicou em Abrir
            file.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files "+Arrays.toString(extensions), extensions));
            //0 = Abrir, 1 = Cancelar
            int i = file.showOpenDialog(this);
            if(i==0){
                lblPic1.setIcon(null); //Reseta Imagem
                String filePath = file.getSelectedFile().getPath();
                original = new Image(filePath);
                setDisplayImage(original, lblPic1);
                
                deform = new Image(original.height(), original.width(),original.type());
                deform.Fill(new double[]{255,255,255});
                setDisplayImage(deform, lblPic2);
                
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
                if(imgProc.saveImage(deform, path)){
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
        lblPic1 = new javax.swing.JLabel();
        lblPictureScrollPane1 = new javax.swing.JScrollPane();
        lblPic2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuOpen = new javax.swing.JMenuItem();
        fileMenuSave = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Principal.setBackground(new java.awt.Color(51, 51, 51));
        Principal.setForeground(new java.awt.Color(255, 255, 255));

        lblPic1.setBackground(new java.awt.Color(102, 102, 102));
        lblPic1.setForeground(new java.awt.Color(255, 255, 255));
        lblPic1.setText("Original Image Display");
        lblPic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblPic1.setOpaque(true);
        lblPic1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPic1MouseClicked(evt);
            }
        });
        lblPictureScrollPane.setViewportView(lblPic1);

        lblPic2.setBackground(new java.awt.Color(102, 102, 102));
        lblPic2.setForeground(new java.awt.Color(255, 255, 255));
        lblPic2.setText("New Image Display");
        lblPic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblPic2.setOpaque(true);
        lblPic2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPic2MouseClicked(evt);
            }
        });
        lblPictureScrollPane1.setViewportView(lblPic2);

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPictureScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPictureScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPictureScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addComponent(lblPictureScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                .addGap(14, 14, 14))
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
    
    private void lblPic1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPic1MouseClicked
        if(original!=null && evt.getY()<original.height() && evt.getX()<original.width()){
            int H = evt.getY(), W = evt.getX();
            clickPointsPic1.add(new Pixel(H, W, original.get(H, W).getRGB()));
            System.out.println("H: "+H+" X W:"+W);
            System.out.println(clickPointsPic1.size());
            if(clickPointsPic1.size()==3){
                lblPic2.setEnabled(true);
            }
        }
    }//GEN-LAST:event_lblPic1MouseClicked

    private void lblPic2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPic2MouseClicked
        if(deform!=null && evt.getY()<deform.height() && evt.getX()<deform.width()){
            int H = evt.getY(), W = evt.getX();
            System.out.println("Novo p");
            clickPointsPic2.add(new Pixel(H, W, original.get(H, W).getRGB()));
            System.out.println("H: "+H+" X W:"+W);
            System.out.println(clickPointsPic2.size());
            if(clickPointsPic2.size()>=3){
                System.out.println(" FOI ");
                imgProc.Deform(original, deform, clickPointsPic1, clickPointsPic2);
                //imgProc.DeformRec(original, deform, clickPointsPic1, clickPointsPic2, new double[]{1,0,0});
                setDisplayImage(deform, lblPic2);
                clickPointsPic1.clear();
                clickPointsPic2.clear();
            }
        }
    }//GEN-LAST:event_lblPic2MouseClicked

    public static void main(String args[]) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        java.awt.EventQueue.invokeLater(() -> {
            new Tela().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuOpen;
    private javax.swing.JMenuItem fileMenuSave;
    private javax.swing.JLabel lblPic1;
    private javax.swing.JLabel lblPic2;
    private javax.swing.JScrollPane lblPictureScrollPane;
    private javax.swing.JScrollPane lblPictureScrollPane1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
