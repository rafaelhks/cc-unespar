import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JColorChooser;
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
    private double[] currentColorRGB = new double[]{0,0,0};
    private final ButtonGroup grupo = new ButtonGroup();
    
    public Tela() {
        initComponents();
        this.setTitle(appName);
        colorLabel.setBackground(new Color((int)currentColorRGB[2], 
                                           (int)currentColorRGB[1], 
                                           (int)currentColorRGB[0]));
        grupo.add(toggleQuad);
        grupo.add(toggleTriangle);
        grupo.add(toggleCircle);
    }
    
    private void setDisplayImage(Image img, javax.swing.JLabel lbl){
        if(img!=null){
            lbl.setText("");
            lbl.setIcon(new javax.swing.ImageIcon(img.getBuffImg()));
            lbl.setSize(img.height(), img.width());
            lblPictureScrollPane.getViewport().setBorder(null);
            lblPictureScrollPane.setViewportView(lbl);
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
        lblPictureScrollPane = new javax.swing.JScrollPane();
        lblPicture = new javax.swing.JLabel();
        toolBarColor = new javax.swing.JToolBar();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        colorLabel = new javax.swing.JLabel();
        toolBarColor1 = new javax.swing.JToolBar();
        toggleQuad = new javax.swing.JToggleButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        toggleTriangle = new javax.swing.JToggleButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        toggleCircle = new javax.swing.JToggleButton();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        lblFunc = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuOpen1 = new javax.swing.JMenuItem();
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
        lblPicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPictureMouseClicked(evt);
            }
        });
        lblPictureScrollPane.setViewportView(lblPicture);

        toolBarColor.setBackground(new java.awt.Color(102, 102, 102));
        toolBarColor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        toolBarColor.setFloatable(false);
        toolBarColor.setRollover(true);
        toolBarColor.add(filler2);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Cor:");
        toolBarColor.add(jLabel1);
        toolBarColor.add(filler1);

        colorLabel.setBackground(new java.awt.Color(255, 255, 255));
        colorLabel.setText("     ");
        colorLabel.setToolTipText("Clique aqui para selecionar uma cor.");
        colorLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        colorLabel.setOpaque(true);
        colorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorLabelMouseClicked(evt);
            }
        });
        toolBarColor.add(colorLabel);

        toolBarColor1.setBackground(new java.awt.Color(102, 102, 102));
        toolBarColor1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        toolBarColor1.setFloatable(false);
        toolBarColor1.setRollover(true);

        toggleQuad.setBackground(new java.awt.Color(51, 51, 51));
        toggleQuad.setForeground(new java.awt.Color(255, 255, 255));
        toggleQuad.setText("☐");
        toggleQuad.setFocusable(false);
        toggleQuad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleQuad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleQuad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleQuadActionPerformed(evt);
            }
        });
        toolBarColor1.add(toggleQuad);
        toolBarColor1.add(filler4);

        toggleTriangle.setBackground(new java.awt.Color(51, 51, 51));
        toggleTriangle.setForeground(new java.awt.Color(255, 255, 255));
        toggleTriangle.setText("Δ");
        toggleTriangle.setFocusable(false);
        toggleTriangle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleTriangle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleTriangleActionPerformed(evt);
            }
        });
        toolBarColor1.add(toggleTriangle);
        toolBarColor1.add(filler5);

        toggleCircle.setBackground(new java.awt.Color(51, 51, 51));
        toggleCircle.setForeground(new java.awt.Color(255, 255, 255));
        toggleCircle.setText("O");
        toggleCircle.setFocusable(false);
        toggleCircle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleCircle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleCircleActionPerformed(evt);
            }
        });
        toolBarColor1.add(toggleCircle);

        jToolBar1.setBackground(new java.awt.Color(102, 102, 102));
        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setFloatable(false);
        jToolBar1.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Função: ");
        jToolBar1.add(jLabel2);

        lblFunc.setToolTipText("Separe os numeros por vírgula. Ex: 1,0,2");
        jToolBar1.add(lblFunc);

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPictureScrollPane)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(toolBarColor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toolBarColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 430, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toolBarColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toolBarColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPictureScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuBar.setBackground(new java.awt.Color(102, 102, 102));
        menuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuBar.setForeground(new java.awt.Color(255, 255, 255));

        fileMenu.setBackground(new java.awt.Color(51, 51, 51));
        fileMenu.setForeground(new java.awt.Color(255, 255, 255));
        fileMenu.setText("Arquivo");
        fileMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        fileMenuOpen1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        fileMenuOpen1.setBackground(new java.awt.Color(51, 51, 51));
        fileMenuOpen1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fileMenuOpen1.setForeground(new java.awt.Color(255, 255, 255));
        fileMenuOpen1.setText("Novo");
        fileMenuOpen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuOpen1ActionPerformed(evt);
            }
        });
        fileMenu.add(fileMenuOpen1);

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
        preencherCentro.setText("Desenhar Função");
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

    private List<Integer> getFuncNumbers(){
        String[] txt = lblFunc.getText().replaceAll(" ", "").split(",");
        List<Integer> ns = new ArrayList<>();
        
        for (String txt1 : txt) {
            if (txt1.matches("-?\\d+(\\.\\d+)?")) {
                ns.add(Integer.parseInt(txt1));
            }
        }
        return ns;
    }
    
    private void preencherCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preencherCentroActionPerformed
        if(image!=null){
            if(getFuncNumbers()!=null && getFuncNumbers().size()>0){
                System.out.println(getFuncNumbers().toString());
                imgProc.DrawFunction(image, getFuncNumbers(),currentColorRGB);
                setDisplayImage(image, lblPicture);
            }
        }
    }//GEN-LAST:event_preencherCentroActionPerformed
    
    private void colorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorLabelMouseClicked
        Color color = JColorChooser.showDialog(this, "Escolha uma cor", colorLabel.getBackground());
        if(color!=null){
            colorLabel.setBackground(color);
            currentColorRGB = new double[]{color.getBlue(), color.getGreen(), color.getRed()};
        }
    }//GEN-LAST:event_colorLabelMouseClicked
    
    private void lblPictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPictureMouseClicked
        if(image!=null && evt.getY()<image.height() && evt.getX()<image.width()){
            if(toggleQuad.isSelected()){
                imgProc.DrawQuad(image, evt.getY(),evt.getX(), 100, currentColorRGB);
            }else if(toggleTriangle.isSelected()){
                imgProc.DrawTriangle(image, evt.getY(),evt.getX(), 100, currentColorRGB);
            }else if(toggleCircle.isSelected()){
                imgProc.DrawCircle(image, evt.getX(),evt.getY(), 50, 60, 180, currentColorRGB);
            }
            setDisplayImage(image, lblPicture);
        }
    }//GEN-LAST:event_lblPictureMouseClicked

    private void fileMenuOpen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuOpen1ActionPerformed
        image = new Image(500, 500, org.opencv.core.CvType.CV_8UC2);
        setDisplayImage(image, lblPicture);
    }//GEN-LAST:event_fileMenuOpen1ActionPerformed

    private void toggleQuadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleQuadActionPerformed
        changeToggle(toggleQuad);
    }//GEN-LAST:event_toggleQuadActionPerformed

    private void toggleTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTriangleActionPerformed
        changeToggle(toggleTriangle);
    }//GEN-LAST:event_toggleTriangleActionPerformed

    private void toggleCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleCircleActionPerformed
        changeToggle(toggleCircle);
    }//GEN-LAST:event_toggleCircleActionPerformed

    private void changeToggle(javax.swing.JToggleButton bt){  
        grupo.clearSelection();
        bt.setSelected(true);
    }
    
    public static void main(String args[]) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        java.awt.EventQueue.invokeLater(() -> {
            new Tela().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuOpen;
    private javax.swing.JMenuItem fileMenuOpen1;
    private javax.swing.JMenuItem fileMenuSave;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField lblFunc;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JScrollPane lblPictureScrollPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem preencherCentro;
    private javax.swing.JToggleButton toggleCircle;
    private javax.swing.JToggleButton toggleQuad;
    private javax.swing.JToggleButton toggleTriangle;
    private javax.swing.JToolBar toolBarColor;
    private javax.swing.JToolBar toolBarColor1;
    // End of variables declaration//GEN-END:variables
}
