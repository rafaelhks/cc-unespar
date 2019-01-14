
import com.sun.glass.events.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Rafael
 */
public class Home extends javax.swing.JFrame {

    private Image image; //Classe que processa a imagem
    private String appName = "Processamento de Imagens (Ativ. 04/3)";
    
    public Home() {
        initComponents();
        image = new Image();
        this.setTitle(appName);
    }

    private boolean LoadImage(String imgPath){
        try {
            lblPicture.setText("");
            BufferedImage img = ImageIO.read(new File(imgPath));
            image.loadFile(imgPath);
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
        rotateSlider.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        imgDisplayScrollPane = new javax.swing.JScrollPane();
        lblPicture = new javax.swing.JLabel();
        dialogLabel = new javax.swing.JLabel();
        lblAngle = new javax.swing.JLabel();
        rotateSlider = new javax.swing.JSlider();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuOpen = new javax.swing.JMenuItem();
        fileMenuSave = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

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

        lblAngle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAngle.setForeground(new java.awt.Color(255, 255, 255));
        lblAngle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAngle.setText("Ângulo: 0.0º");

        rotateSlider.setForeground(new java.awt.Color(0, 204, 204));
        rotateSlider.setMaximum(180);
        rotateSlider.setMinimum(-180);
        rotateSlider.setValue(0);
        rotateSlider.setEnabled(false);
        rotateSlider.setOpaque(false);
        rotateSlider.setRequestFocusEnabled(false);
        rotateSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                rotateSliderMouseDragged(evt);
            }
        });
        rotateSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rotateSliderMouseReleased(evt);
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
                        .addGap(0, 193, Short.MAX_VALUE)
                        .addComponent(lblAngle, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rotateSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 215, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAngle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rotateSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgDisplayScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
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
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fileMenuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuOpenActionPerformed
        JFileChooser file = new JFileChooser();

        //0 = Abrir, 1 = Cancelar
        int i = file.showOpenDialog(this);

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
        image.saveFile();
        dialogLabel.setText("Imagem salva em: "+image.getSrcImgPath());
    }//GEN-LAST:event_fileMenuSaveActionPerformed
        
    
    private void rotateSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rotateSliderMouseReleased
        if(rotateSlider.isEnabled()){
            double angulo = rotateSlider.getValue();
            image.Rotate(angulo);
            setDisplayImage(image.getBuffImg());
            rotateSlider.setValue(0);
            lblAngle.setText("Ângulo: "+0+"º");
        }
    }//GEN-LAST:event_rotateSliderMouseReleased

    private void rotateSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rotateSliderMouseDragged
        double angulo = rotateSlider.getValue();
        lblAngle.setText("Ângulo: "+angulo+"º");
    }//GEN-LAST:event_rotateSliderMouseDragged

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_LEFT){
            setDisplayImage(image.MatToBuffImg(image.Translate(0, -10)));
        }
        else if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            setDisplayImage(image.MatToBuffImg(image.Translate(0, 10)));
        }
        else if(evt.getKeyCode() == KeyEvent.VK_UP){
            setDisplayImage(image.MatToBuffImg(image.Translate(-10, 0)));
        }
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            setDisplayImage(image.MatToBuffImg(image.Translate(10, 0)));
        }
    }//GEN-LAST:event_formKeyPressed
    
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
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuOpen;
    private javax.swing.JMenuItem fileMenuSave;
    private javax.swing.JScrollPane imgDisplayScrollPane;
    private javax.swing.JLabel lblAngle;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JSlider rotateSlider;
    // End of variables declaration//GEN-END:variables
}
