package GUI;

import Classes.Arvore;
import Classes.RegraD;
import Classes.RegraE;
import Classes.Variavel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Rafael
 */
public class Tela extends javax.swing.JFrame {

    private final List<RegraD> listaR = new ArrayList<>();
    private final List<String> listaT = new ArrayList<>();
    private final List<Variavel> listaV = new ArrayList<>();
    private final List<String> listaVAux = new ArrayList<>();
    private int contador = 1;
    
    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        P2 = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostraP = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        palavra = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        Testar = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        P1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        S = new javax.swing.JTextField();
        confirma = new javax.swing.JButton();
        V = new javax.swing.JTextField();
        T = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gramáticas Regulares - LFA");
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setForeground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("winclassic_tab_sel_gradient"));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Tipo de GR: ");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("V = {");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("T = {");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("P = {");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("-->");

        P2.setEditable(false);
        P2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        mostraP.setEditable(false);
        mostraP.setColumns(1);
        mostraP.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mostraP.setRows(5);
        jScrollPane1.setViewportView(mostraP);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("S = ");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("}");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("}");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("}");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Testes");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Palavra:");

        palavra.setEditable(false);
        palavra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Resultado:");

        resultado.setEditable(false);
        resultado.setColumns(1);
        resultado.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        resultado.setRows(5);
        jScrollPane2.setViewportView(resultado);

        Testar.setText("Testar");
        Testar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestarActionPerformed(evt);
            }
        });

        RESET.setBackground(new java.awt.Color(255, 51, 51));
        RESET.setForeground(new java.awt.Color(255, 255, 255));
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel13.setText("© Rafael Francisco Ferreira, Luís Fernando S. Gaspar");

        tipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GLUD", "GLUE" }));

        P1.setEditable(false);
        P1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        P1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                P1FocusGained(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(javax.swing.UIManager.getDefaults().getColor("winclassic_tab_sel_gradient"));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("Leia com atenção!\n-Selecione o tipo, preencha\nos campos V e T, e clique \nem \"Confirmar\" para liberar\nos demais campos.\n\n-Utilize \"&\" para \nrepresentar o vazio.\n\n-Utilize apenas a vírgula\n\",\" para separar os elementos\ndos conjuntos.\n\n-Utilize apenas o pipeline (|) para\nseparar as regras, caso haja mais\nde uma.\n\n-Evite adicionar regras repetidas\nna mesma variável. Isso pode confundir\na aplicação ou gerar resultado\nconfuso!\n\n-Escreva os conjuntos V e T\ncom atenção, pois após \nescreve-los o campo será\nbloqueado.\n\n-Caso haja erro por parte\ndo usuário, o mesmo será\ninformado no campo\n\"Resultado\".\n\n-Para informar uma nova GR\nclique em \"RESET\"");
        jScrollPane3.setViewportView(jTextArea1);

        S.setEditable(false);
        S.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        S.setText("S");

        confirma.setText("Confirmar");
        confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaActionPerformed(evt);
            }
        });

        V.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        T.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Informações");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(RESET, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(Add))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(confirma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(palavra, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Testar)
                            .addComponent(jLabel12))
                        .addGap(57, 57, 57))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(palavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(Testar)
                            .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(confirma))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addComponent(jScrollPane2)))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RESET)
                    .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private boolean testPanic(String pl, Variavel ini){ //Trata erros de digitação do usuário antes de testar
        boolean plExist = true, NullExist = true, SExist = true, rgExist = true;
        String aux[] = pl.split("");
        
        //Checa se palavra foi digitada
        if(pl.isEmpty()){
            resultado.setText("Nenhuma palavra \ninformada!");
            return false;
        }
        //Checa se palavra existe em T
        for(String s: aux){
            if(!listaT.contains(s) && !s.equals("&")){
                resultado.setText("A palavra contem caracteres\nque não estão presentes\nno conjunto T!");
                return false;
            }
        }
        //Checa se existem campos vazios
        if(S.getText().isEmpty() || V.getText().isEmpty() || T.getText().isEmpty()){
            resultado.setText("Um ou mais campos não\nforam preenchidos!");
            return false;
        }
        //Checa se a variável inicial existe
        if(!listaV.contains(ini)){
            resultado.setText("A Variavel Inicial informada\nnão existe no conjunto V!");
            return false;
        } 
        //Checa se existe ao menos uma Regra
        if(contador==1){
            resultado.setText("Nenhuma regra foi adicionada\nAdicione ao menos uma\npara continuar!");
            return false;
        }
        //Caso nao haja erros
        return true;
    }
    
    private boolean addPanic(String var, String reg[]){   
        if(P1.getText().isEmpty()){ //Checa se o campo da variavel está vazio
            resultado.setText("O campo da variável\nestá vazio! Corrija e\ntente novamente.");
            return false;
        }
        if(P2.getText().isEmpty()){ //Checa se o campo da regra está vazio
            resultado.setText("O campo da regra está vazio!\nCorrija e tente\nnovmente!.");
            return false;
        }
        if(reg.length>2){ //Checa se a regra informada está nos padrões unitários
            resultado.setText("A regra informada está\nfora dos padrões\nunitários!\nEx:\nwB para GLUD\nBw para GLUE\n"+
                              "w ∈ T\nB ∈ V\nw<1\nCorrija e tente\nnovamente!.");
            return false;
        }
        
        //Checa se a variável informada existe em V
        if(!listaVAux.contains(var)){
            resultado.setText("A variavel informada\nnão se encontra no\nconjunto V!");
            return false;
        }
        
        if(tipo.getSelectedIndex()==0){//Se for GLUD
            if(reg.length==1){//Checa formato se for somente w ou somente B
                if(!listaVAux.contains(reg[0]) && !listaT.contains(reg[0]) && !reg[0].equals("&")){
                    resultado.setText("A regra: "+reg[0]+" não está\nem V ou T! Está\nfora dos padrões GLUD!\n"+
                                      "Exemplo:\nRegra = wB\nCom w ∈ T\nB ∈ V\nw<1\n");
                    return false;
                }
            }
            if(reg.length>1) //Checa formato se for wB
                if(!listaVAux.contains(reg[1]) || !listaT.contains(reg[0]) || reg[0].length()>1){
                    resultado.setText("A regra "+reg[0]+reg[1]+" está\nfora dos padrões GLUD!\n"+
                                      "Exemplo:\nRegra = wB\nCom w ∈ T\nB ∈ V\nw<1\n");
                    return false;
                }
        }
        if(tipo.getSelectedIndex()==1){//Se for GLUE
            if(reg.length==1){ //Checa formato se for somente w ou somente B
                if(!listaVAux.contains(reg[0]) && !listaT.contains(reg[0])&&!reg[0].equals("&")){
                    resultado.setText("A regra: "+reg[0]+" não está\nem V ou T! Está\nfora dos padrões GLUE!\n"+
                                      "Exemplo:\nRegra = wB\nCom w ∈ T\nB ∈ V\nw<1\n");
                    return false;
                }
            }
            if(reg.length>1) //Checa formato se for Bw
                if(!listaVAux.contains(reg[0]) || !listaT.contains(reg[1]) || reg[1].length()>1){
                    resultado.setText("A regra "+reg[0]+reg[1]+" está\nfora dos padrões GLUD!\n"+
                                      "Exemplo:\nRegra = wB\nCom w ∈ T\nB ∈ V\nw<1\n");
                    return false;
                }
        }
        resultado.setText("Regra adicionada!"); //Se não encontrar erro, libera para adicionar
        return true;
    }
    
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        String variavel = P1.getText().replace(" ", ""); //recebe a variável "noh pai"
        String[] regras = P2.getText().replace(" ", "").split("\\|"); //recebe as regras de produção da variável
        boolean semErros = false;

        for(String s: regras){ //Percorre o vetor que armazena as regras
            String aux[] = s.split("");
            semErros = addPanic(variavel, aux);
            if(semErros)//Se não houver erros, entra no for abaixo
            for(Variavel v: listaV){
                if(v.getNome().equals(variavel)){ 
                    if(aux.length==2){ //Se existir letra e Variavel
                        for(Variavel vA: listaV){
                            if(tipo.getSelectedIndex()==0){
                                if(vA.getNome().equals(aux[1]))//Se o nome da variavel for igual ao informado
                                    v.addRegraD(new RegraD(aux[0], vA, contador)); //Cria a produção
                            }
                            else if(tipo.getSelectedIndex()==1){ //Se for GLUE
                                if(vA.getNome().equals(aux[0])) //Se o nome da variavel for igual ao informado
                                    v.addRegraE(new RegraE(vA, aux[1], contador)); //Cria a produção
                            }
                        }
                    }
                    if(aux.length==1){ //Se existir apenas 1
                        if(listaT.contains(aux[0]) || aux[0].equals("&")){
                            if(tipo.getSelectedIndex()==0) //Se for GLUD
                                v.addRegraD(new RegraD(aux[0], null, contador)); //Cria a produção
                            if(tipo.getSelectedIndex()==1) //Se for GLUE
                                v.addRegraE(new RegraE(null, aux[0], contador)); //Cria a produção
                        }
                        if(listaVAux.contains(aux[0])){
                            for(Variavel vA: listaV){
                                if(vA.getNome().equals(aux[0])){
                                    if(tipo.getSelectedIndex()==0) //Se for GLUD
                                        v.addRegraD(new RegraD("VAZIO", vA, contador)); //Cria a produção
                                    if(tipo.getSelectedIndex()==1)
                                        v.addRegraE(new RegraE(vA, "VAZIO", contador)); //Cria a produção
                                }
                            }
                        } 
                    }
                }
            }
            if(semErros){ //Se não houver erros, mostra na tela e incrementa o contador de regras
                mostraP.setText(mostraP.getText()+contador+") "+variavel+" --> "+s+"\n");//Mostra na tela
                contador++; //Incrementa o contador de regras
            }
        }
    }//GEN-LAST:event_AddActionPerformed

    private void TestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestarActionPerformed
        String p = palavra.getText(); //Recebe a palavra
        String t = tipo.getSelectedItem().toString();   //Recebe o tipo de GR
        Variavel inicial = null;    //Recebe variavel incial
        for(Variavel v: listaV){    //Percorre a lista de variáveis em busca da inicial
            if(v.getNome().equals(S.getText().replace(" ", "")))
                inicial = v;
        }

        if(testPanic(p, inicial)){
            Arvore a = new Arvore(inicial, p, t); //Instancia uma nova arvore
        }
    }//GEN-LAST:event_TestarActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        //Limpa os campos
        V.setText("");
        T.setText("");
        P1.setText("");
        P2.setText("");
        mostraP.setText("");
        S.setText("");
        palavra.setText("");
        resultado.setText("");
        V.setEditable(true);
        T.setEditable(true);
        tipo.setEnabled(true);
        confirma.setEnabled(true);
        //Limpa os campos
        
        //Reseta as variaveis
        listaR.removeAll(listaR);
        listaV.removeAll(listaV);
        listaVAux.removeAll(listaVAux);
        listaT.removeAll(listaT);
        contador = 1; 
        //Reseta as variáveis
    }//GEN-LAST:event_RESETActionPerformed

    private void P1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_P1FocusGained
        
    }//GEN-LAST:event_P1FocusGained
    //Procura erros do usuário nos campos V e T antes de prosseguir
    private boolean confirmPanic(){
        String Vs[] = V.getText().replace(" ","").split(",");
        String Ts[] = T.getText().replace(" ","").split(",");
        for(String s: Ts) //Preenche as listas para checar
            listaT.add(s);
        for(String s: Vs)
            listaVAux.add(s);
        
        if(V.getText().isEmpty()){ //Checa se o campo V está vazio
            resultado.setText("O campo V está vazio!\nCorrija e tente\nnovamente.");
            return false;
        }
        if(T.getText().isEmpty()){ //Checa se o campo T está vazio
            resultado.setText("O campo T está vazio!\nCorrija e tente\nnovamente.");
            return false;
        }
        
        for(String s: listaVAux){ //Checa se algo do campo V está contido em T
            if(listaT.contains(s)){
                resultado.setText("Um mesmo símbolo foi\nencontrado nos campos\nV e T! Corrija\ne tente novamente.");
                return false;
            }
        }
        for(String s: Ts){ //Checa se algo do campo T está contido em V
            if(listaVAux.contains(s)){
                resultado.setText("Um mesmo símbolo foi\nencontrado nos campos\nV e T! Corrija\ne tente novamente.");
                return false;
            }
        }
        resultado.setText("Confirmado!"); //Se não houver erros, continua
        return true;
    }
    
    private void confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaActionPerformed
        listaVAux.removeAll(listaVAux); //Limpa listas
        listaT.removeAll(listaT); //Limpa listas
        if(confirmPanic()){ //Se não houver erros, cria as listas V e T, e bloqueia os campos e botão
            //Bloqueia os campos tipo,V e T
            V.setEditable(false);
            tipo.setEnabled(false);
            T.setEditable(false);
            //Preenche as listas
            String Ts[] = T.getText().replace(" ", "").split(",");
            for(String s: Ts){
                listaT.add(s);
            }
            String Vs[] = V.getText().replace(" ", "").split(",");
            for(String s: Vs){
                listaVAux.add(s);
                listaV.add(new Variavel(s));
            }
            //Libera os campos abaixo
            P1.setEditable(true);
            P2.setEditable(true);
            S.setEditable(true);
            palavra.setEditable(true);
            confirma.setEnabled(false); //Bloqueia o botão para impedir reset nas listas por cliques futuros
        }
    }//GEN-LAST:event_confirmaActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField P1;
    private javax.swing.JTextField P2;
    private javax.swing.JButton RESET;
    private javax.swing.JTextField S;
    private javax.swing.JTextField T;
    private javax.swing.JButton Testar;
    private javax.swing.JTextField V;
    private javax.swing.JButton confirma;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea mostraP;
    private javax.swing.JTextField palavra;
    public static javax.swing.JTextArea resultado;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
