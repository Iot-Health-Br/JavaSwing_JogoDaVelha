/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

    


    public class Tela_02 extends javax.swing.JFrame {
        
        Tela_04 enviatexto; // Variavel de Envio para outra Tela
        
        int Jog_01_Pontos =0 ;
        int Jog_02_Pontos =0 ;
        int N_Partidas = 0;
        int Cont_caso=0 ;
               
        int Env_Jog_01_Pontos = 0;
        int Env_Jog_02_Pontos = 0;
        
        boolean Desabilita = false;
        
        boolean Jogador_01 = true;
        boolean Jogador_02 = false;
        
        boolean Jog_01_Venc = false;
        boolean Jog_02_Venc = false;
        boolean Jog_Empatado = false;
        
        
        int N_de_Vitoria_Jog01 = 0;
        int N_de_Vitoria_Jog02 = 0;
        int N_de_Empate = 0 ;

        public Tela_02() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        Desativa_Botoes();
    }
    
    public void JogadorAtivo(){

	if (Jogador_01 == true){
	    Jogador_01 = false;
	    Jogador_02 = true;} 
        
        else {
	    Jogador_01 = true;
	    Jogador_02 = false;}    
        
        JogadorVencedor("X");
        JogadorVencedor("O"); 
    }

    
    public void JogadorVencedor(String Jogador){
	
        // Verifica a Linhas 
        
	if(Bt_01.getText().equals(Jogador) && Bt_02.getText().equals(Jogador) && Bt_03.getText().equals(Jogador)){
		if(Bt_01.getText().equals("X"))
		   Vencedor("Jogador 1");              
		else
		   Vencedor("Jogador 2");	
	}
        
        if(Bt_04.getText().equals(Jogador) && Bt_05.getText().equals(Jogador) && Bt_06.getText().equals(Jogador)){
		if(Bt_04.getText().equals("X"))
		   Vencedor("Jogador 1");               
		else
		   Vencedor("Jogador 2");	
	}
        
        if(Bt_07.getText().equals(Jogador) && Bt_08.getText().equals(Jogador) && Bt_09.getText().equals(Jogador)){
		if(Bt_07.getText().equals("X"))
		   Vencedor("Jogador 1");                
		else
		   Vencedor("Jogador 2");	
	}
        
        // Verifica as Colunas //
        
        if(Bt_01.getText().equals(Jogador) && Bt_04.getText().equals(Jogador) && Bt_07.getText().equals(Jogador)){
		if(Bt_01.getText().equals("X"))
		   Vencedor("Jogador 1");                
		else
		   Vencedor("Jogador 2");	
	}
        
        if(Bt_02.getText().equals(Jogador) && Bt_05.getText().equals(Jogador) && Bt_08.getText().equals(Jogador)){
		if(Bt_02.getText().equals("X"))
		   Vencedor("Jogador 1");                
		else
		   Vencedor("Jogador 2");	
	}
        
        if(Bt_03.getText().equals(Jogador) && Bt_06.getText().equals(Jogador) && Bt_09.getText().equals(Jogador)){
		if(Bt_03.getText().equals("X"))
		   Vencedor("Jogador 1");                
		else
		   Vencedor("Jogador 2");	
	}
        
        // Verifica a Diagonal //
        
        if(Bt_01.getText().equals(Jogador) && Bt_05.getText().equals(Jogador) && Bt_09.getText().equals(Jogador)){
		if(Bt_01.getText().equals("X"))
		   Vencedor("Jogador 1");                
		else
		   Vencedor("Jogador 2");
        }
        
        if(Bt_03.getText().equals(Jogador) && Bt_05.getText().equals(Jogador) && Bt_07.getText().equals(Jogador)){
		if(Bt_03.getText().equals("X"))
		   Vencedor("Jogador 1");                
		else
		   Vencedor("Jogador 2");
        }
        
        // Verifica se deu empate //
        
        if (!Bt_01.getText().equals("") && !Bt_02.getText().equals("") && !Bt_03.getText().equals("") && 
        !Bt_04.getText().equals("") && !Bt_05.getText().equals("") && !Bt_06.getText().equals("") &&
	!Bt_07.getText().equals("") && !Bt_08.getText().equals("") && !Bt_09.getText().equals("")){
	
	Vencedor("Empate");}
        
    }
     
    
    public void Vencedor(String JogadorVencedor){

	if (JogadorVencedor.equals("Jogador 1")){
                JOptionPane.showMessageDialog(Tela_02.this,"Parabéns, Jogador 1 voce venceu !!");
                N_de_Vitoria_Jog01++;
                Txt_N_de_Vitorias_Jog01.setText(""+N_de_Vitoria_Jog01);
            
                Jog_01_Pontos += 5;            
                Txt_Jog_01_Pont.setText(""+Jog_01_Pontos);
                
                N_Partidas ++;
                Txt_N_Partidas.setText("Numeros de partidas: "+N_Partidas);
                
                Jog_01_Venc = true;
                EnviaInfo();
                FimDaPartida();}
	
	if (JogadorVencedor.equals("Jogador 2")){
                JOptionPane.showMessageDialog(Tela_02.this,"Parabéns, Jogador 2 voce venceu !!");
                N_de_Vitoria_Jog02++;            
                Txt_N_de_Vitorias_Jog02.setText(""+N_de_Vitoria_Jog02);
            
                Jog_02_Pontos += 5;            
                Txt_Jog_02_Pont.setText(""+Jog_02_Pontos);
                
                N_Partidas ++;
                Txt_N_Partidas.setText("Numeros de partidas: "+N_Partidas);
                
                Jog_02_Venc = true;
                EnviaInfo();
                FimDaPartida();}
        
        if(JogadorVencedor.equals("Empate")){
                JOptionPane.showMessageDialog(Tela_02.this,"Jogo empatado, jogue novamente !!");
                N_de_Empate ++ ;
                Txt_N_de_Empates.setText("Numeros de Empates: "+N_de_Empate);
                                
                Jog_01_Pontos += 2;
                Jog_02_Pontos += 2;
            
                Txt_Jog_01_Pont.setText(""+Jog_01_Pontos);
                Txt_Jog_02_Pont.setText(""+Jog_02_Pontos);
                
                N_Partidas ++;
                Txt_N_Partidas.setText("Numeros de partidas: "+N_Partidas);
                
                Jog_Empatado = true;
                EnviaInfo();
                FimDaPartida();}
    }
     
    
    
        public void EnviaInfo(){

                       if (Jog_01_Venc == true){
                            if (enviatexto == null){
                                enviatexto = new Tela_04();
                                enviatexto.setVisible(false);
                                enviatexto.recebendo("1");
                            }
    
                            else{
                                enviatexto.setVisible(false);
                                enviatexto.setState(Tela_04.NORMAL);
                                enviatexto.recebendo("1");
                            }
                        LimparCampos();
                       }
                       
                       if (Jog_02_Venc == true){
                            if (enviatexto == null){
                                enviatexto = new Tela_04();
                                enviatexto.setVisible(false);
                                enviatexto.recebendo("2");
                            }
    
                            else{
                                enviatexto.setVisible(false);
                                enviatexto.setState(Tela_04.NORMAL);
                                enviatexto.recebendo("2");
                            }
                        LimparCampos();
                       }
                       
                       if (Jog_Empatado == true){
                            if (enviatexto == null){
                                enviatexto = new Tela_04();
                                enviatexto.setVisible(false);
                                enviatexto.recebendo("3");
                            }
    
                            else{
                                enviatexto.setVisible(false);
                                enviatexto.setState(Tela_04.NORMAL);
                                enviatexto.recebendo("3");
                            }
                        LimparCampos();
                       }         
    }
        
    public void LimparCampos(){
        
            Bt_01.setText("");
            Bt_02.setText("");
            Bt_03.setText("");
            Bt_04.setText("");
            Bt_05.setText("");
            Bt_06.setText("");
            Bt_07.setText("");
            Bt_08.setText("");
            Bt_09.setText("");
            
            Jogador_01 = true;
            Jogador_02 = false;	
            
            Jog_01_Venc = false;
            Jog_02_Venc = false;
            Jog_Empatado = false;
            Desabilita = false;
    }
    
    
    public void FimDaPartida(){
        
        if (N_Partidas==5){              
                JOptionPane.showMessageDialog(Tela_02.this,"Jogo Finalizado !!"); 
                                
                if(N_de_Vitoria_Jog01 > N_de_Vitoria_Jog02){
                    JOptionPane.showMessageDialog(Tela_02.this,"Jogador 01 Venceu !!");
                }
                else if(N_de_Vitoria_Jog01 == N_de_Vitoria_Jog02){
                    JOptionPane.showMessageDialog(Tela_02.this,"Jogo terminou empatado !!");
                }
                else{
                    JOptionPane.showMessageDialog(Tela_02.this,"Jogador 02 Venceu !!");
                }
                
                JOptionPane.showMessageDialog(Tela_02.this,"Aperte o botão 'novo jogo' para uma nova partida !"); 
                
                Txt_Reg_Jog01.setText("");
                Txt_Reg_Jog02.setText("");
                Desativa_Botoes();                           
        }
    }
    
    public void Novo_Jogo(){
                
                Jog_01_Pontos =0 ;
                Jog_02_Pontos =0 ;
                N_Partidas = 0;
                Cont_caso=0 ;
               
                Env_Jog_01_Pontos = 0;
                Env_Jog_02_Pontos = 0;
        
                Desabilita = false;
        
                Jogador_01 = true;
                Jogador_02 = false;
        
                Jog_01_Venc = false;
                Jog_02_Venc = false;
                Jog_Empatado = false;
                
                N_de_Vitoria_Jog01 = 0;
                N_de_Vitoria_Jog02 = 0;
                N_de_Empate = 0 ;
        
                JOptionPane.showMessageDialog(Tela_02.this,"Jogo Finalizado !!"); 
           
                N_de_Vitoria_Jog01 = 0;
                Txt_N_de_Vitorias_Jog01.setText(""+N_de_Vitoria_Jog01);
           
                Jog_01_Pontos = 0;
                Txt_Jog_01_Pont.setText(""+Jog_01_Pontos); 
           
                N_de_Vitoria_Jog02 = 0;
                Txt_N_de_Vitorias_Jog02.setText(""+N_de_Vitoria_Jog02);
           
                Jog_02_Pontos = 0;
                Txt_Jog_02_Pont.setText(""+Jog_02_Pontos);
           
                N_Partidas = 0 ;
                Txt_N_Partidas.setText("Numeros de partidas: "+N_Partidas);
           
                N_de_Empate = 0 ;
                Txt_N_de_Empates.setText("Numeros de Empates: "+N_de_Empate);          
                         
                Txt_Reg_Jog01.setText("");
                Txt_Reg_Jog02.setText("");
                
                Inf_Jog01.setFont(new java.awt.Font("Cantarell", 0, 17)); // NOI18N
                Inf_Jog01.setText("Jogador 01   ");
                
                Inf_Jog02.setFont(new java.awt.Font("Cantarell", 0, 17)); // NOI18N
                Inf_Jog02.setText("Jogador 02   "); 
                
                LimparCampos();
                Desativa_Botoes();
    }
   
      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Bt_01 = new javax.swing.JButton();
        Bt_02 = new javax.swing.JButton();
        Bt_04 = new javax.swing.JButton();
        Bt_03 = new javax.swing.JButton();
        Bt_07 = new javax.swing.JButton();
        Bt_05 = new javax.swing.JButton();
        Bt_06 = new javax.swing.JButton();
        Bt_08 = new javax.swing.JButton();
        Bt_09 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Inf_Jog01 = new javax.swing.JLabel();
        Txt_N_de_Vitorias_Jog01 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Inf_Jog02 = new javax.swing.JLabel();
        Txt_N_de_Vitorias_Jog02 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Txt_N_de_Empates = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Jog_02_Pont = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Txt_Jog_01_Pont = new javax.swing.JLabel();
        Txt_N_Partidas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Sobre_o_Jogo = new javax.swing.JButton();
        Sair_do_Jogo = new javax.swing.JButton();
        Tela_Matrizes = new javax.swing.JButton();
        Novo_Jogo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Txt_Reg_Jog01 = new javax.swing.JTextField();
        Txt_Reg_Jog02 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        Registrar_Jog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setMaximizedBounds(getMaximizedBounds());

        Bt_01.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        Bt_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_01ActionPerformed(evt);
            }
        });

        Bt_02.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        Bt_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_02ActionPerformed(evt);
            }
        });

        Bt_04.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        Bt_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_04ActionPerformed(evt);
            }
        });

        Bt_03.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        Bt_03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_03ActionPerformed(evt);
            }
        });

        Bt_07.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        Bt_07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_07ActionPerformed(evt);
            }
        });

        Bt_05.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        Bt_05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_05ActionPerformed(evt);
            }
        });

        Bt_06.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        Bt_06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_06ActionPerformed(evt);
            }
        });

        Bt_08.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        Bt_08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_08ActionPerformed(evt);
            }
        });

        Bt_09.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        Bt_09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_09ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bt_01, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_02)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_03))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Bt_04)
                            .addComponent(Bt_07))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Bt_05)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bt_06))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Bt_08)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bt_09)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Bt_01, Bt_02, Bt_03, Bt_04, Bt_05, Bt_06, Bt_07, Bt_08, Bt_09});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bt_02, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_03, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bt_04, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_05, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_06, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bt_08, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_07, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_09, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Bt_01, Bt_02, Bt_03, Bt_04, Bt_05, Bt_06, Bt_07, Bt_08, Bt_09});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informaçoes do Jogo"));

        Inf_Jog01.setFont(new java.awt.Font("Cantarell", 0, 17)); // NOI18N
        Inf_Jog01.setText("Jogador 01   ");

        Txt_N_de_Vitorias_Jog01.setFont(new java.awt.Font("Cantarell", 0, 17)); // NOI18N
        Txt_N_de_Vitorias_Jog01.setText("0");

        Inf_Jog02.setFont(new java.awt.Font("Cantarell", 0, 17)); // NOI18N
        Inf_Jog02.setText("Jogador 02   ");

        Txt_N_de_Vitorias_Jog02.setFont(new java.awt.Font("Cantarell", 0, 17)); // NOI18N
        Txt_N_de_Vitorias_Jog02.setText("0");

        Txt_N_de_Empates.setFont(new java.awt.Font("Cantarell", 0, 17)); // NOI18N
        Txt_N_de_Empates.setText("Numeros de Empates: 0");

        jLabel2.setText("Numeros de vitorias: ");

        jLabel4.setText("Numeros de vitorias: ");

        jLabel5.setText("Pontuaçao: ");

        Txt_Jog_02_Pont.setText("0");

        jLabel7.setText("Pontuaçao: ");

        Txt_Jog_01_Pont.setText("0");

        Txt_N_Partidas.setFont(new java.awt.Font("Cantarell", 0, 17)); // NOI18N
        Txt_N_Partidas.setText("Numeros de partidas: 0");

        jLabel1.setText("Simbolo:  X ");

        jLabel3.setText("Simbolo:  O");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Inf_Jog01, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Txt_N_de_Vitorias_Jog01))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Inf_Jog02, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)))
                                .addGap(0, 24, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Jog_02_Pont))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_N_de_Vitorias_Jog02)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Jog_01_Pont))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_N_Partidas)
                            .addComponent(Txt_N_de_Empates))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Inf_Jog01)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txt_N_de_Vitorias_Jog01))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Txt_Jog_01_Pont))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Inf_Jog02)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Txt_N_de_Vitorias_Jog02))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Txt_Jog_02_Pont))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Txt_N_Partidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_N_de_Empates)
                .addGap(12, 12, 12))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle do Jogo"));

        Sobre_o_Jogo.setText("Sobre o Jogo");
        Sobre_o_Jogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobre_o_JogoActionPerformed(evt);
            }
        });

        Sair_do_Jogo.setText("Sair do Jogo");
        Sair_do_Jogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair_do_JogoActionPerformed(evt);
            }
        });

        Tela_Matrizes.setText("Tela das Matrizes");
        Tela_Matrizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tela_MatrizesActionPerformed(evt);
            }
        });

        Novo_Jogo.setText("Novo Jogo");
        Novo_Jogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Novo_JogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Tela_Matrizes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sobre_o_Jogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sair_do_Jogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Novo_Jogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(Novo_Jogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sobre_o_Jogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tela_Matrizes)
                .addGap(14, 14, 14)
                .addComponent(Sair_do_Jogo)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Registre-se"));

        jLabel6.setText("Jogador 01:");

        jLabel8.setText("Jogador 02:");

        Registrar_Jog.setText("Registrar");
        Registrar_Jog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrar_JogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(Txt_Reg_Jog01, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(19, 19, 19)
                                .addComponent(Txt_Reg_Jog02, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Registrar_Jog)))
                        .addGap(0, 16, Short.MAX_VALUE))))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Txt_Reg_Jog01, Txt_Reg_Jog02});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Txt_Reg_Jog01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registrar_Jog))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Reg_Jog02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Txt_Reg_Jog01, Txt_Reg_Jog02});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Desativa_Botoes(){
        Bt_01.setEnabled(false);
        Bt_02.setEnabled(false);
        Bt_03.setEnabled(false);
        Bt_04.setEnabled(false);
        Bt_05.setEnabled(false);
        Bt_06.setEnabled(false);
        Bt_07.setEnabled(false);
        Bt_08.setEnabled(false);
        Bt_09.setEnabled(false);     
    }
    
    
    private void Bt_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_01ActionPerformed
       
        if(Jogador_01 == true){
            if(Bt_01.getText().equals("")){
               Bt_01.setText("X");
               JogadorAtivo();}
        }      
        
        else{
            if(Bt_01.getText().equals("")){
               Bt_01.setText("O");
               JogadorAtivo();}
            }
      
    }//GEN-LAST:event_Bt_01ActionPerformed

    private void Bt_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_02ActionPerformed
       if(Jogador_01 == true){
            if(Bt_02.getText().equals("")){
               Bt_02.setText("X");
               JogadorAtivo();}
        }
       
        else{
            if(Bt_02.getText().equals("")){
               Bt_02.setText("O");
               JogadorAtivo();}
             }
    }//GEN-LAST:event_Bt_02ActionPerformed

    private void Bt_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_04ActionPerformed
        if(Jogador_01 == true){
            if(Bt_04.getText().equals("")){
               Bt_04.setText("X");
               JogadorAtivo();}
        }
        
        else{
            if(Bt_04.getText().equals("")){
               Bt_04.setText("O");
               JogadorAtivo();}
             }
    }//GEN-LAST:event_Bt_04ActionPerformed

    private void Bt_03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_03ActionPerformed
        if(Jogador_01 == true){
            if(Bt_03.getText().equals("")){
               Bt_03.setText("X");
               JogadorAtivo();}
        }
        
        else{
            if(Bt_03.getText().equals("")){
               Bt_03.setText("O");
               JogadorAtivo();}
             }
    }//GEN-LAST:event_Bt_03ActionPerformed

    private void Bt_07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_07ActionPerformed
        if(Jogador_01 == true){
            if(Bt_07.getText().equals("")){
               Bt_07.setText("X");
               JogadorAtivo();}
        }
        
        else{
            if(Bt_07.getText().equals("")){
               Bt_07.setText("O");
               JogadorAtivo();}
             }
    }//GEN-LAST:event_Bt_07ActionPerformed

    private void Bt_05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_05ActionPerformed
        if(Jogador_01 == true){
            if(Bt_05.getText().equals("")){
               Bt_05.setText("X");
               JogadorAtivo();}
        }
        
        else{
            if(Bt_05.getText().equals("")){
               Bt_05.setText("O");
               JogadorAtivo();}
             }
    }//GEN-LAST:event_Bt_05ActionPerformed

    private void Bt_06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_06ActionPerformed
        if(Jogador_01 == true){
            if(Bt_06.getText().equals("")){
               Bt_06.setText("X");
               JogadorAtivo();}
        }
        
        else{
            if(Bt_06.getText().equals("")){
               Bt_06.setText("O");
               JogadorAtivo();}
             }
    }//GEN-LAST:event_Bt_06ActionPerformed

    private void Bt_08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_08ActionPerformed
        if(Jogador_01 == true){
            if(Bt_08.getText().equals("")){
               Bt_08.setText("X");
               JogadorAtivo();}
        }
        
        else{
            if(Bt_08.getText().equals("")){
               Bt_08.setText("O");
               JogadorAtivo();}
             }
    }//GEN-LAST:event_Bt_08ActionPerformed

    private void Bt_09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_09ActionPerformed
        if(Jogador_01 == true){
            if(Bt_09.getText().equals("")){
               Bt_09.setText("X");
               JogadorAtivo();}
        }else{
            if(Bt_09.getText().equals("")){
               Bt_09.setText("O");
               JogadorAtivo();}
             }
    }//GEN-LAST:event_Bt_09ActionPerformed

    private void Sobre_o_JogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobre_o_JogoActionPerformed
        new Tela_03(Tela_02.this, true).setVisible(true);
    }//GEN-LAST:event_Sobre_o_JogoActionPerformed

    private void Sair_do_JogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair_do_JogoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Sair_do_JogoActionPerformed

    private void Tela_MatrizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tela_MatrizesActionPerformed
                            if (enviatexto == null){
                                enviatexto = new Tela_04();
                                enviatexto.setVisible(true);                               
                            }
    
                            else{
                                enviatexto.setVisible(true);
                                enviatexto.setState(Tela_04.NORMAL);
                            }
    }//GEN-LAST:event_Tela_MatrizesActionPerformed

    private void Registrar_JogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrar_JogActionPerformed
        
        if((Txt_Reg_Jog01.getText().equals(""))||(Txt_Reg_Jog02.getText().equals(""))){
           JOptionPane.showMessageDialog(Tela_02.this,"Registre-se para jogar !!"); 
        }
        else{
            Inf_Jog01.setText(Txt_Reg_Jog01.getText());
            Inf_Jog02.setText(Txt_Reg_Jog02.getText());    
            Bt_01.setEnabled(true);
            Bt_02.setEnabled(true);
            Bt_03.setEnabled(true);
            Bt_04.setEnabled(true);
            Bt_05.setEnabled(true);
            Bt_06.setEnabled(true);
            Bt_07.setEnabled(true);
            Bt_08.setEnabled(true);
            Bt_09.setEnabled(true);           
        }       
    }//GEN-LAST:event_Registrar_JogActionPerformed

    private void Novo_JogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Novo_JogoActionPerformed
       
        if (enviatexto == null){
             enviatexto = new Tela_04();
             enviatexto.setVisible(false);
             enviatexto.recebendo("4");
            }
    
         else{
            enviatexto.setVisible(false);
            enviatexto.setState(Tela_04.NORMAL);
            enviatexto.recebendo("4");
            }
        Novo_Jogo();
    }//GEN-LAST:event_Novo_JogoActionPerformed

    

    
    
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
            java.util.logging.Logger.getLogger(Tela_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_01;
    private javax.swing.JButton Bt_02;
    private javax.swing.JButton Bt_03;
    private javax.swing.JButton Bt_04;
    private javax.swing.JButton Bt_05;
    private javax.swing.JButton Bt_06;
    private javax.swing.JButton Bt_07;
    private javax.swing.JButton Bt_08;
    private javax.swing.JButton Bt_09;
    private javax.swing.JLabel Inf_Jog01;
    private javax.swing.JLabel Inf_Jog02;
    private javax.swing.JButton Novo_Jogo;
    private javax.swing.JButton Registrar_Jog;
    private javax.swing.JButton Sair_do_Jogo;
    private javax.swing.JButton Sobre_o_Jogo;
    private javax.swing.JButton Tela_Matrizes;
    private javax.swing.JLabel Txt_Jog_01_Pont;
    private javax.swing.JLabel Txt_Jog_02_Pont;
    private javax.swing.JLabel Txt_N_Partidas;
    private javax.swing.JLabel Txt_N_de_Empates;
    private javax.swing.JLabel Txt_N_de_Vitorias_Jog01;
    private javax.swing.JLabel Txt_N_de_Vitorias_Jog02;
    private javax.swing.JTextField Txt_Reg_Jog01;
    private javax.swing.JTextField Txt_Reg_Jog02;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
