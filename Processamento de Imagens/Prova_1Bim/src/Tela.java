import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Core;

/**
 *
 * @author Rafael
 */
public class Tela extends javax.swing.JFrame {
    
    private Image original;
    List<Image> quads = new ArrayList();
    private final javax.swing.JColorChooser colorChooser = new javax.swing.JColorChooser();
    private final String appName = "Processamento de Imagens - Ativ. 04/4, 05/2";
    private final String[][][] extensions = { {{"Images Only"},{"png", "jpg", "jpeg", "bmp"}},
                                            {{"PNG Images"},{"png", "PNG"}},
                                            {{"JPEG Images"},{"jpg", "jpeg"}},
                                            {{"BMP Images"},{"bmp", "BMP"}}};
    
    public Tela() {
        initComponents();
    }
    
    private void setDisplayImage(java.awt.image.BufferedImage img, javax.swing.JLabel lbl){
        if(img!=null){
            lbl.setText("");
            lbl.setIcon(new javax.swing.ImageIcon(img));
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
        for (String[][] ext: extensions) {
            file.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(ext[0][0], ext[1]));
        }
        file.setAcceptAllFileFilterUsed(false);
        
        //0 = Abrir, 1 = Cancelar
        if(DIALOG_TYPE==javax.swing.JFileChooser.OPEN_DIALOG){ //Se o usuário clicou em Abrir
            int i = file.showOpenDialog(this);
            if(i==0){
                lblPicture.setIcon(null); //Reseta Imagem
                String filePath = file.getSelectedFile().getPath();
                //Se abertura ocorrer normalmente
                original = new Image(filePath);
                quads = imgProc.sepImage(original);
                setDisplayImage(original.getBuffImg(), lblPicture);
                lblPicture.setSize(original.height(), original.width());
            }
        }
        
        if(DIALOG_TYPE == javax.swing.JFileChooser.SAVE_DIALOG){ //Se o usuário clicou em Salvar
            int i = file.showSaveDialog(this);
            if(i==0){
                imgProc.saveImage(imgProc.uneImagens(quads), file.getSelectedFile().getPath());
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
        sepChannelBt = new javax.swing.JMenuItem();
        histogramGrayBt = new javax.swing.JMenuItem();

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

        sepChannelBt.setBackground(new java.awt.Color(51, 51, 51));
        sepChannelBt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sepChannelBt.setForeground(new java.awt.Color(255, 255, 255));
        sepChannelBt.setText("Separar Canais");
        sepChannelBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepChannelBtActionPerformed(evt);
            }
        });
        editMenu.add(sepChannelBt);

        histogramGrayBt.setBackground(new java.awt.Color(51, 51, 51));
        histogramGrayBt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        histogramGrayBt.setForeground(new java.awt.Color(255, 255, 255));
        histogramGrayBt.setText("Equalizar por Quadrante");
        histogramGrayBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histogramGrayBtActionPerformed(evt);
            }
        });
        editMenu.add(histogramGrayBt);

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

    private void sepChannelBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepChannelBtActionPerformed
        int ch = 1;
        for (int i = 1; i<quads.size(); i++) {
            imgProc.sepChannel(quads.get(i), ch-1, imgProc.COLOR_GRAY_RGB);
            ch++;
        }
        setDisplayImage(imgProc.uneImagens(quads).getBuffImg(), lblPicture);
    }//GEN-LAST:event_sepChannelBtActionPerformed

    private void histogramGrayBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histogramGrayBtActionPerformed
        for (int i = 1; i<quads.size(); i++) {
            imgProc.HistogramGray(quads.get(i));
        }
        setDisplayImage(imgProc.uneImagens(quads).getBuffImg(), lblPicture);
    }//GEN-LAST:event_histogramGrayBtActionPerformed

    public static void main(String args[]) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuOpen;
    private javax.swing.JMenuItem fileMenuSave;
    private javax.swing.JMenuItem histogramGrayBt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem sepChannelBt;
    // End of variables declaration//GEN-END:variables
}
