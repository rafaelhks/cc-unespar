package Cardapio;
import Conta.ArquivoConta;
import Conta.CriaConta;
/**
 *
 * @author rafael
 */
public class CardapioBebidas extends javax.swing.JFrame {

    public CardapioBebidas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FazPedido = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        S1 = new javax.swing.JLabel();
        Limonada = new javax.swing.JToggleButton();
        P1 = new javax.swing.JLabel();
        Laranja = new javax.swing.JToggleButton();
        P2 = new javax.swing.JLabel();
        S2 = new javax.swing.JLabel();
        Morango = new javax.swing.JToggleButton();
        P3 = new javax.swing.JLabel();
        S3 = new javax.swing.JLabel();
        P4 = new javax.swing.JLabel();
        S4 = new javax.swing.JLabel();
        Abacaxi = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        R1 = new javax.swing.JLabel();
        Coca350 = new javax.swing.JToggleButton();
        P5 = new javax.swing.JLabel();
        R2 = new javax.swing.JLabel();
        Guarana = new javax.swing.JToggleButton();
        P6 = new javax.swing.JLabel();
        R3 = new javax.swing.JLabel();
        Tubaina = new javax.swing.JToggleButton();
        P7 = new javax.swing.JLabel();
        R4 = new javax.swing.JLabel();
        Coca2 = new javax.swing.JToggleButton();
        P8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        Brahma = new javax.swing.JToggleButton();
        P9 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        Skol = new javax.swing.JToggleButton();
        P10 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        CanecaChopp = new javax.swing.JToggleButton();
        P11 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        TorreChopp = new javax.swing.JToggleButton();
        P12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        Preto = new javax.swing.JToggleButton();
        P13 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        Pingado = new javax.swing.JToggleButton();
        P14 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        Expresso = new javax.swing.JToggleButton();
        P15 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        Cappuccino = new javax.swing.JToggleButton();
        P16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));

        jPanel1.setBackground(new java.awt.Color(36, 0, 251));
        jPanel1.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 480));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Sucos (c/ água)");

        FazPedido.setFont(new java.awt.Font("Open Sans", 0, 23)); // NOI18N
        FazPedido.setForeground(new java.awt.Color(1, 1, 1));
        FazPedido.setText("Fazer Pedido");
        FazPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FazPedidoActionPerformed(evt);
            }
        });

        Voltar.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        Voltar.setForeground(new java.awt.Color(1, 1, 1));
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        S1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        S1.setForeground(new java.awt.Color(254, 254, 254));
        S1.setText("Limonada Suíça");

        Limonada.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N

        P1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P1.setForeground(new java.awt.Color(254, 254, 254));
        P1.setText("R$ 6,00");

        Laranja.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N

        P2.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P2.setForeground(new java.awt.Color(254, 254, 254));
        P2.setText("R$ 5,50");

        S2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        S2.setForeground(new java.awt.Color(254, 254, 254));
        S2.setText("Suco de Laranja");

        Morango.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N

        P3.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P3.setForeground(new java.awt.Color(254, 254, 254));
        P3.setText("R$ 5,50");

        S3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        S3.setForeground(new java.awt.Color(254, 254, 254));
        S3.setText("Suco de Morango");

        P4.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P4.setForeground(new java.awt.Color(254, 254, 254));
        P4.setText("R$ 5,50");

        S4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        S4.setForeground(new java.awt.Color(254, 254, 254));
        S4.setText("Suco de Abacaxi");

        Abacaxi.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Refrigerantes");

        R1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        R1.setForeground(new java.awt.Color(254, 254, 254));
        R1.setText("Coca Cola 350ml");

        Coca350.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N

        P5.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P5.setForeground(new java.awt.Color(254, 254, 254));
        P5.setText("R$ 3,50");

        R2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        R2.setForeground(new java.awt.Color(254, 254, 254));
        R2.setText("Guaraná 350ml");

        Guarana.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N

        P6.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P6.setForeground(new java.awt.Color(254, 254, 254));
        P6.setText("R$ 3,50");

        R3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        R3.setForeground(new java.awt.Color(254, 254, 254));
        R3.setText("Tubaína 600ml");

        Tubaina.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N

        P7.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P7.setForeground(new java.awt.Color(254, 254, 254));
        P7.setText("R$ 3,50");

        R4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        R4.setForeground(new java.awt.Color(254, 254, 254));
        R4.setText("Coca Cola 2L");

        Coca2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N

        P8.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P8.setForeground(new java.awt.Color(254, 254, 254));
        P8.setText("R$ 8,00");

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 23)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Bebidas Alcoólicas ");

        B1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        B1.setForeground(new java.awt.Color(254, 254, 254));
        B1.setText("Brahma 350ml");

        Brahma.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N

        P9.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P9.setForeground(new java.awt.Color(254, 254, 254));
        P9.setText("R$ 3,50");

        B2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        B2.setForeground(new java.awt.Color(254, 254, 254));
        B2.setText("Skol 350ml");

        Skol.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N

        P10.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P10.setForeground(new java.awt.Color(254, 254, 254));
        P10.setText("R$ 3,50");

        B3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        B3.setForeground(new java.awt.Color(254, 254, 254));
        B3.setText("Caneca Chopp");

        CanecaChopp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N

        P11.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P11.setForeground(new java.awt.Color(254, 254, 254));
        P11.setText("R$ 7,00");

        B4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        B4.setForeground(new java.awt.Color(254, 254, 254));
        B4.setText("Torre de Chopp");

        TorreChopp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N

        P12.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P12.setForeground(new java.awt.Color(254, 254, 254));
        P12.setText("R$ 40,00");

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 23)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Cafés");

        C1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        C1.setForeground(new java.awt.Color(254, 254, 254));
        C1.setText("Café Preto");

        Preto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N

        P13.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P13.setForeground(new java.awt.Color(254, 254, 254));
        P13.setText("R$ 2,00");

        C2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        C2.setForeground(new java.awt.Color(254, 254, 254));
        C2.setText("Café Pingado");

        Pingado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N

        P14.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P14.setForeground(new java.awt.Color(254, 254, 254));
        P14.setText("R$ 2,50");

        C3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        C3.setForeground(new java.awt.Color(254, 254, 254));
        C3.setText("Café Expresso");

        Expresso.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N
        Expresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpressoActionPerformed(evt);
            }
        });

        P15.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P15.setForeground(new java.awt.Color(254, 254, 254));
        P15.setText("R$ 3,00");

        C4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        C4.setForeground(new java.awt.Color(254, 254, 254));
        C4.setText("Cappuccino");

        Cappuccino.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cardapio/SelecionadoB.PNG"))); // NOI18N

        P16.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        P16.setForeground(new java.awt.Color(254, 254, 254));
        P16.setText("R$ 4,00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(FazPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Coca2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(R4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P8))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Tubaina, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(R3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P7))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Guarana, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(R2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P6))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Coca350, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(R1)
                            .addGap(26, 26, 26)
                            .addComponent(P5)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Abacaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(S4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P4))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Morango, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(S3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Laranja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(S2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Limonada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(S1)
                            .addGap(27, 27, 27)
                            .addComponent(P1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Skol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P10))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Brahma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B1)
                            .addGap(27, 27, 27)
                            .addComponent(P9)))
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Preto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C1)
                            .addGap(55, 55, 55)
                            .addComponent(P13))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(CanecaChopp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B3)
                            .addGap(29, 29, 29)
                            .addComponent(P11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TorreChopp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B4)
                        .addGap(18, 18, 18)
                        .addComponent(P12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Expresso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Pingado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Cappuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C4)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P16)
                            .addComponent(P14)
                            .addComponent(P15))))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Limonada, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Brahma, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(S1)
                                .addComponent(P1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(B1)
                                .addComponent(P9)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B2)
                                    .addComponent(P10)))
                            .addComponent(Skol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CanecaChopp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B3)
                                    .addComponent(P11))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TorreChopp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B4)
                                    .addComponent(P12))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Preto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(C1)
                                    .addComponent(P13))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pingado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(C2)
                                    .addComponent(P14))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Expresso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(C3)
                                    .addComponent(P15))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cappuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(C4)
                                    .addComponent(P16))))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Laranja, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(S2)
                                    .addComponent(P2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Morango, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(S3)
                                    .addComponent(P3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Abacaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(S4)
                                    .addComponent(P4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Coca350, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(R1)
                                    .addComponent(P5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Guarana, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(R2)
                                    .addComponent(P6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tubaina, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(R3)
                                    .addComponent(P7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Coca2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(R4)
                                    .addComponent(P8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FazPedido)
                    .addComponent(Voltar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        Opcoes.OpPedido op = new Opcoes.OpPedido(); //Instancia a tela de Opções
        op.setVisible(true); //torna visivel
        dispose(); //fecha a tela atual
    }//GEN-LAST:event_VoltarActionPerformed

    private void FazPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FazPedidoActionPerformed
        //Cada IF envia a informação do pedido para a classe que cria a conta
        if (Limonada.isSelected()) {
            CriaConta.setTotalConta(6);
            CriaConta.setTxtconta(S1.getText()+"  "+P1.getText());
        }

        if (Laranja.isSelected()) {
            CriaConta.setTotalConta(5.50);
            CriaConta.setTxtconta(S2.getText()+"  "+P2.getText());
        }

        if (Morango.isSelected()) {
            CriaConta.setTotalConta(5.50);
            CriaConta.setTxtconta(S3.getText()+"  "+P3.getText());
        }

        if (Abacaxi.isSelected()) {
            CriaConta.setTotalConta(5.50);
            CriaConta.setTxtconta(S4.getText()+"  "+P4.getText());
        }

        if (Coca350.isSelected()) {
            CriaConta.setTotalConta(3.50);
            CriaConta.setTxtconta(R1.getText()+"  "+P5.getText());
        }

        if (Guarana.isSelected()) {
            CriaConta.setTotalConta(3.50);
            CriaConta.setTxtconta(R2.getText()+"  "+P6.getText());
        }
        
        if (Tubaina.isSelected()) {
            CriaConta.setTotalConta(3.50);
            CriaConta.setTxtconta(R3.getText()+"  "+P7.getText());
        }
        
        if (Coca2.isSelected()) {
            CriaConta.setTotalConta(8);
            CriaConta.setTxtconta(R4.getText()+"  "+P8.getText());
        }
        
        if (Brahma.isSelected()) {
            CriaConta.setTotalConta(3.50);
            CriaConta.setTxtconta(B1.getText()+"  "+P9.getText());
        }
        
        if (Skol.isSelected()) {
            CriaConta.setTotalConta(3.50);
            CriaConta.setTxtconta(B2.getText()+"  "+P10.getText());
        }
        
        if (CanecaChopp.isSelected()) {
            CriaConta.setTotalConta(7);
            CriaConta.setTxtconta(B3.getText()+"  "+P11.getText());
        }
        
        if (TorreChopp.isSelected()) {
            CriaConta.setTotalConta(40);
            CriaConta.setTxtconta(B4.getText()+"  "+P12.getText());
        }
        
        if (Preto.isSelected()) {
            CriaConta.setTotalConta(2);
            CriaConta.setTxtconta(C1.getText()+"  "+P13.getText());
        }
        
        if (Pingado.isSelected()) {
            CriaConta.setTotalConta(2.50);
            CriaConta.setTxtconta(C2.getText()+"  "+P14.getText());
        }
        
        if (Expresso.isSelected()) {
            CriaConta.setTotalConta(3);
            CriaConta.setTxtconta(C3.getText()+"  "+P15.getText());
        }
        
        if (Cappuccino.isSelected()) {
            CriaConta.setTotalConta(4);
            CriaConta.setTxtconta(C4.getText()+"  "+P16.getText());
        }
        
        //Chama o método para reescrever o arquivo da conta
        //toda vez que o cliente clicar em Fializar Pedido, para casos 
        //de queda ou travamentos do sistema.
        CriaConta.Formata();
        ArquivoConta.CriaArquivo();
        
        Opcoes.OpPedido op = new Opcoes.OpPedido(); //Instancia a tela de Opções
        op.setVisible(true); //torna visivel
        dispose(); //fecha a tela atual
        
        //Abre o aviso de sucesso na operaçao
        MsgPedido mp = new MsgPedido();
        mp.setVisible(true);
    }//GEN-LAST:event_FazPedidoActionPerformed

    private void ExpressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExpressoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CardapioBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardapioBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardapioBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardapioBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardapioBebidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Abacaxi;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JToggleButton Brahma;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JToggleButton CanecaChopp;
    private javax.swing.JToggleButton Cappuccino;
    private javax.swing.JToggleButton Coca2;
    private javax.swing.JToggleButton Coca350;
    private javax.swing.JToggleButton Expresso;
    private javax.swing.JButton FazPedido;
    private javax.swing.JToggleButton Guarana;
    private javax.swing.JToggleButton Laranja;
    private javax.swing.JToggleButton Limonada;
    private javax.swing.JToggleButton Morango;
    private javax.swing.JLabel P1;
    private javax.swing.JLabel P10;
    private javax.swing.JLabel P11;
    private javax.swing.JLabel P12;
    private javax.swing.JLabel P13;
    private javax.swing.JLabel P14;
    private javax.swing.JLabel P15;
    private javax.swing.JLabel P16;
    private javax.swing.JLabel P2;
    private javax.swing.JLabel P3;
    private javax.swing.JLabel P4;
    private javax.swing.JLabel P5;
    private javax.swing.JLabel P6;
    private javax.swing.JLabel P7;
    private javax.swing.JLabel P8;
    private javax.swing.JLabel P9;
    private javax.swing.JToggleButton Pingado;
    private javax.swing.JToggleButton Preto;
    private javax.swing.JLabel R1;
    private javax.swing.JLabel R2;
    private javax.swing.JLabel R3;
    private javax.swing.JLabel R4;
    private javax.swing.JLabel S1;
    private javax.swing.JLabel S2;
    private javax.swing.JLabel S3;
    private javax.swing.JLabel S4;
    private javax.swing.JToggleButton Skol;
    private javax.swing.JToggleButton TorreChopp;
    private javax.swing.JToggleButton Tubaina;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
