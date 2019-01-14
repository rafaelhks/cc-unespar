package GUI;
import Classes.Transicao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@author Rafael

public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        estados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        alfabeto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        eFinais = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        eInicial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        marcaInicio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        alfabetoAux = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        simboloBranco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        eAtual = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        eDestino = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTrans = new javax.swing.JTextArea();
        addTrans = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        palavra = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostraOp = new javax.swing.JTextArea();
        testar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        resetTrans = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Máquina de Turing - LFA");
        setMaximumSize(new java.awt.Dimension(640, 500));
        setMinimumSize(new java.awt.Dimension(640, 500));
        setName("Máquina de Turing - Rafael Francisco Ferreira"); // NOI18N
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(640, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 480));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Estados:");

        estados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        estados.setText("S0,S1,S2,S3");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Alfabeto:");

        alfabeto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        alfabeto.setText("a,b,c,d");
        alfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfabetoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Estados Finais: ");

        eFinais.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eFinais.setText("S3");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Estado Inicial:");

        eInicial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eInicial.setText("S0");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Marcador de Início:");

        marcaInicio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        marcaInicio.setText("<");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Alfabeto Auxiliar:");

        alfabetoAux.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        alfabetoAux.setText("A,B,<,&");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Símbolo Branco:");

        simboloBranco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        simboloBranco.setText("&");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Máquina de Turing");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Descrição Formal:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Função de Transição:");

        eAtual.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eAtual.setText("S0,a");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("->");

        eDestino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eDestino.setText("S1,A,D");

        listaTrans.setEditable(false);
        listaTrans.setColumns(20);
        listaTrans.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        listaTrans.setRows(5);
        jScrollPane1.setViewportView(listaTrans);

        addTrans.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        addTrans.setText("Add Transição");
        addTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTransActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Testes:");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Palavra:");

        palavra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        palavra.setText("aaaba");

        mostraOp.setEditable(false);
        mostraOp.setBackground(new java.awt.Color(0, 0, 0));
        mostraOp.setColumns(20);
        mostraOp.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        mostraOp.setForeground(new java.awt.Color(51, 255, 0));
        mostraOp.setRows(5);
        jScrollPane2.setViewportView(mostraOp);

        testar.setText("Testar");
        testar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testarActionPerformed(evt);
            }
        });

        jLabel14.setText("© Rafael Francisco Ferreira");

        resetTrans.setText("Reset Transições");
        resetTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetTransActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(resetTrans)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(marcaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(alfabetoAux, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(estados, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(simboloBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(alfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(eFinais, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(eInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(eAtual)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(eDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(addTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(120, 120, 120))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel10)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel12)
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(6, 6, 6)
                                    .addComponent(palavra, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(testar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(269, 269, 269))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(estados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(palavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(alfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(eInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(eFinais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(alfabetoAux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(marcaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(simboloBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(eDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addTrans))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(resetTrans))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void alfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfabetoActionPerformed
  
    }//GEN-LAST:event_alfabetoActionPerformed

    public List<Transicao> trans = new ArrayList<>(); //Armazena as transições adicionadas pelo usuário
    
    public boolean panic(List<String> ests, String[] a, String eInicial, String[] eFinais, String[] aAux, String m, String b, String[] p){
        //Apenas variáveis booleanas de controle
        boolean naoNulo = false, ei = false, ef = false; 
        boolean mi = false, mb = false, tamP = true, ma = true;

        //Checa campos em branco, incluindo transições
        if (estados!=null && alfabeto!=null && eInicial!=null && simboloBranco!=null)
            if (eFinais!=null && alfabetoAux!=null && marcaInicio!=null && !trans.isEmpty()) 
                naoNulo = true;

        if (ests.contains(eInicial)) ei = true; //Checa se o estado inicial pertence ao conjunto de estados
        for (String F: eFinais) //Percorre o vetor de estados finais
            if (ests.contains(F)) ef = true; //Checa se os estados finais pertencem ao conjunto de estados
        
        //Checa se marcador de inicio e simbolo branco estão no alfabeto auxiliar
        for (String s: aAux) 
            if (s.equals(m)) 
                mi = true;
        for (String s: aAux) 
            if (s.equals(b)) 
                mb = true;
        //Checa se o marcador de inicio ou branco 
        //não pertencem ao conjunto do alfabeto principal
        for (String s: a) {
            if(m.equals(s))
                ma = false;
            else if(b.equals(s))
                ma = false;
        }
        
        //Informa qual ou quais erros foram encontrados
        if (naoNulo == false)
            mostraOp.setText("\n\nERRO! \nUm ou mais campos da descrição\nnão foram preenchidos!\nCorrija e tente novamente.");
        if (ei == false) 
            mostraOp.setText("\n\nERRO!\nEstado inicial não \npertence ao conjunto \nde estados!\nCorrija e tente novamente.");
        if (ef == false) 
            mostraOp.setText("\n\nERRO!\nUm ou mais estados \nfinais não pertencem ao \nconjunto de estados!\nCorrija e tente novamente.");
        if (ma == false) 
            mostraOp.setText("\n\nERRO!\nMarcador de inicio ou \nSímbolo branco estão presentes\n no alfabeto!\nCorrija e tente novamente.");
        if (mi == false || mb == false)
            mostraOp.setText("\n\nERRO!\nMarcador de inicio ou simbolo \nBranco não foi encontrado \nno alfabeto auxiliar!\nCorrija e tente novamente.");
        if (p.length >= 2048) { //Se tamanho da palavra exceder o máximo de 2048 
            tamP = false;
            mostraOp.setText("\n\nERRO!\nPalavra excede o tamanho máximo \nsuportado!\nInforme uma palavra menor\n e tente novamente.");
        }
        for (String s: p)  
            if(s.equals(b) || s.equals(m)){
                mostraOp.setText("\n\nERRO!\nPalavra não pode conter\no símbolo Branco ou o\nMarcador de inicio!\nCorrija e tente novamente.");
                tamP = false;
            }
        
        return naoNulo == true && ei == true && ef == true && mi == true && mb == true && tamP == true;
    }
    
        
    
    private void addTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTransActionPerformed
        String[] a = eAtual.getText().split(","); //Divide o estado e letra pela virgula
        String[] b = eDestino.getText().split(","); //Divide o estado, a letra e a direção pela virgula
        //Apenas variáveis booleanas de controle
        boolean alfabts = true, tEstados = true, direcao = false; 
        boolean padrao = true, mInicio = true, mInicio2 = true, jaExiste = true;
        
        //--INICIO do Tratamento de erros antes de adicionar a transição à lista--//
        //--Listas exclusivas para tratamento de erro--//
        List<String> alfas = new ArrayList();
        List<String> sts = new ArrayList();
        //--Listas exclusivas para tratamento de erro--//
        
        alfas.addAll(Arrays.asList(alfabeto.getText().split(",")));
        alfas.addAll(Arrays.asList(alfabetoAux.getText().split(",")));
        sts.addAll(Arrays.asList(estados.getText().split(",")));
        
        //Checa se a transição informada segue o padrão
        if (a.length < 2 || b.length < 3 || a[1].length()>1 || b[1].length()>1 || b[2].length()>1)
            padrao = false;
        
        else if (a.length == 2 && b.length == 3 && a[1].length()==1 && b[1].length()==1 && b[2].length()==1){
            //Checa se os simbolos existem nos alfabetos 
            if (alfas.contains(a[1]) == false || alfas.contains(b[1]) == false)
                alfabts = false;
            //Checa se os estados existem no conjunto de estados
            if (sts.contains(a[0]) == false || sts.contains(b[0]) == false)     
                tEstados = false;
            //Impede a substituição do marcador de inicio
            if (a[1].equals(marcaInicio.getText())) {
                mInicio = false;
                if (b[1].equals(marcaInicio.getText()))
                    mInicio = true;
                mInicio2 = false;
                if (b[2].equals("D"))
                    mInicio2 = true;
            }
            if (b[1].equals(marcaInicio.getText())) {
                mInicio = false;
                if (a[1].equals(marcaInicio.getText()))
                    mInicio = true;
                mInicio2 = false;
                if (b[2].equals("D"))
                    mInicio2 = true;
            }
            //Checa o padrão para sentidos
            if ("D".equals(b[2]) || "E".equals(b[2])) {
                direcao = true;
            }

            //Mostra o erro, se houver
            if (alfabts == false)
                mostraOp.setText("\n\nERRO!\nA transição contem \num simbolo que não pertence\na nenhum dos alfabetos!\nCorrija e tente novamente.");
            if (tEstados == false)
                mostraOp.setText("\n\nERRO!\nA transição \ncontem um estado que\nnão pertence ao conjunto\nde estados!\nCorrija e tente novamente.");
            if (mInicio == false)
                mostraOp.setText("\n\nERRO! \nMarcador de incio não\npode ser alterado na fita!\nCorrija e tente novamente.");
            if (mInicio2 == false)
                mostraOp.setText("\n\nERRO! \nNão se pode ir para a\nesquerda (E) do marcador\nde inicio!\nCorrija e tente novamente.");
            if (direcao == false)
                mostraOp.setText("\n\nERRO! \nUtilize apenas D para direita\nou E para esquerda!\nCorrija e tente novamente.");
            for (Transicao t: trans){//Impede a criação de duas transições com a mesma letra saindo de um estado
                if (t.getAtual().equals(a[0]) && t.getLetra().equals(a[1])) {
                    jaExiste = false;
                    mostraOp.setText("\n\nERRO! \nJá existe uma transição\ndeste estado com este símbolo!\nEsta máquina não suporta\nduas transições partindo\ndo mesmo estado com o mesmo \nsímbolo!\nCorrija e tente novamente.");
                }
            }
        }
        
        if (padrao == false)
                mostraOp.setText("\n\nERRO! \nTransição fora do padrão!\nEx:(S0,a)->(S0,a,D)\nCorrija e tente novamente.");
        //--FIM do Tratamento de erros--//
        
        //--Se não houverem erros, adiciona a transição à lista--//
        if (alfabts && tEstados && direcao && padrao && mInicio && mInicio2 && jaExiste){
            mostraOp.setText("Transição adicionada!");
            listaTrans.setText(listaTrans.getText()+"("+eAtual.getText()+")->("+eDestino.getText()+")\n");
            Transicao t = new Transicao(a, b);
            trans.add(t);
        }   
    }//GEN-LAST:event_addTransActionPerformed

    private void testarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testarActionPerformed
        mostraOp.setText("");
        String[] e = estados.getText().split(","); //Conjunto de estados
        String[] a = alfabeto.getText().split(","); //Alfabeto
        String ini = eInicial.getText(); //Estado Inicial
        String[] eF = eFinais.getText().split(","); //Conjunto de estados finais
        String[] aAux = alfabetoAux.getText().split(","); //Alfabeto auxiliar
        String mI = marcaInicio.getText(); //Marcador de inicio
        String b = simboloBranco.getText(); //Simbolo Branco
        String pl[] = palavra.getText().split(""); //Palavra
        
        //--Exclusiva para tratamento de erro--//
        List<String> ests = new ArrayList();
        ests.addAll(Arrays.asList(e));
        //--Exclusiva para tratamento de erro--//
        
        //Caso não haja erros, cria a máquina
        if(panic(ests, a, ini, eF, aAux, mI, b, pl)){
            Classes.MT m = new Classes.MT(e, a, ini, eF, aAux, mI, b, pl, trans);
        }  
    }//GEN-LAST:event_testarActionPerformed

    private void resetTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetTransActionPerformed
        trans.removeAll(trans);
        listaTrans.setText("");
    }//GEN-LAST:event_resetTransActionPerformed
  
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTrans;
    public javax.swing.JTextField alfabeto;
    public javax.swing.JTextField alfabetoAux;
    private javax.swing.JTextField eAtual;
    private javax.swing.JTextField eDestino;
    private javax.swing.JTextField eFinais;
    private javax.swing.JTextField eInicial;
    public javax.swing.JTextField estados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea listaTrans;
    public javax.swing.JTextField marcaInicio;
    public static javax.swing.JTextArea mostraOp;
    private javax.swing.JTextField palavra;
    private javax.swing.JButton resetTrans;
    private javax.swing.JTextField simboloBranco;
    private javax.swing.JButton testar;
    // End of variables declaration//GEN-END:variables
}
