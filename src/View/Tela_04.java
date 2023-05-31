/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Scrollbar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;



public class Tela_04 extends javax.swing.JFrame {
    
    
    int Caso_recebe=0; 
    int Rodadas = 0; // Zerar Variavel dps
    
    int Conv_Limpa_Dados;
    
    int result_Jog_01 =0;
    int result_Jog_02 =0;
    
    String Variavel_B1; // Armazenamento do Decimal
    String Binario;     // Conversao Binaria
    
    String Variavel_O1; // Armazenamento do Octal
   
    String Variavel_H1; // Armazenamento do Hexadecimal
    
    String R1_JOG_01, R2_JOG_01, R3_JOG_01, R4_JOG_01, R5_JOG_01;
    String R1_JOG_02, R2_JOG_02, R3_JOG_02, R4_JOG_02, R5_JOG_02;
    
    String A_R1_JOG_01,A_R2_JOG_01,A_R3_JOG_01,A_R4_JOG_01,A_R5_JOG_01;
    String A_R1_JOG_02,A_R2_JOG_02,A_R3_JOG_02,A_R4_JOG_02,A_R5_JOG_02;
    
    String D_R1_JOG_01,D_R2_JOG_01,D_R3_JOG_01,D_R4_JOG_01,D_R5_JOG_01;
    String D_R1_JOG_02,D_R2_JOG_02,D_R3_JOG_02,D_R4_JOG_02,D_R5_JOG_02;
    
    String E_R1_JOG_01,E_R2_JOG_01,E_R3_JOG_01,E_R4_JOG_01,E_R5_JOG_01;
    String E_R1_JOG_02,E_R2_JOG_02,E_R3_JOG_02,E_R4_JOG_02,E_R5_JOG_02;
    
    String F_R1_JOG_01,F_R2_JOG_01;
    String F_R1_JOG_02,F_R2_JOG_02;
    
    int n1 = 5;             // tamanho do vetor
    int v1[] = new int[n1]; // declaração do vetor Jogador 01
    int i1=0;                 // índice ou posição
    
    int n2 = 5;             // tamanho do vetor
    int v2[] = new int[n2]; // declaração do vetor Jogador 02
    int i2=0;                 // índice ou posição

    
    int sum = 0; // Soma para a Conversao binario    
    int x = 0;
    int i = 0;
    int j = 0;
    
    int M_transp_01=0;
    int M_transp_02=0;
    int M_transp_03=0;
    int M_transp_04=0;
    int M_transp_05=0;
    
    int M_transp_06=0;
    int M_transp_07=0;
    int M_transp_08=0;
    int M_transp_09=0;
    int M_transp_010=0;
    
    int Res_01=0;
    int Res_02=0;
    int Res_03=0;
    int Res_04=0;

    public Tela_04() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Painel_Geral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Matriz_A = new javax.swing.JPanel();
        Txt_Jogadores1 = new javax.swing.JLabel();
        Txt_Jogador2 = new javax.swing.JLabel();
        Txt_Jogador3 = new javax.swing.JLabel();
        Txt_Rod_2 = new javax.swing.JLabel();
        A_Rod_01_Jog_1 = new javax.swing.JLabel();
        A_Rod_01_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_3 = new javax.swing.JLabel();
        A_Rod_02_Jog_1 = new javax.swing.JLabel();
        A_Rod_02_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_4 = new javax.swing.JLabel();
        A_Rod_03_Jog_1 = new javax.swing.JLabel();
        A_Rod_03_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_5 = new javax.swing.JLabel();
        A_Rod_04_Jog_1 = new javax.swing.JLabel();
        A_Rod_04_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_6 = new javax.swing.JLabel();
        A_Rod_05_Jog_1 = new javax.swing.JLabel();
        A_Rod_05_Jog_2 = new javax.swing.JLabel();
        Matriz_C = new javax.swing.JPanel();
        Txt_Jogadores4 = new javax.swing.JLabel();
        Txt_Jogador9 = new javax.swing.JLabel();
        Txt_Rod_17 = new javax.swing.JLabel();
        C_Rod_01_Jog_1 = new javax.swing.JLabel();
        Txt_Rod_18 = new javax.swing.JLabel();
        Txt_Rod_19 = new javax.swing.JLabel();
        Txt_Rod_20 = new javax.swing.JLabel();
        Txt_Rod_21 = new javax.swing.JLabel();
        Txt_Jogador18 = new javax.swing.JLabel();
        C_Rod_02_Jog_1 = new javax.swing.JLabel();
        C_Rod_03_Jog_1 = new javax.swing.JLabel();
        C_Rod_04_Jog_1 = new javax.swing.JLabel();
        C_Rod_05_Jog_1 = new javax.swing.JLabel();
        C_Rod_01_Jog_2 = new javax.swing.JLabel();
        C_Rod_02_Jog_2 = new javax.swing.JLabel();
        C_Rod_03_Jog_2 = new javax.swing.JLabel();
        C_Rod_05_Jog_2 = new javax.swing.JLabel();
        C_Rod_04_Jog_2 = new javax.swing.JLabel();
        Matriz_B = new javax.swing.JPanel();
        Txt_Jogadores5 = new javax.swing.JLabel();
        Txt_Jogador10 = new javax.swing.JLabel();
        Txt_Jogador11 = new javax.swing.JLabel();
        Txt_Rod_22 = new javax.swing.JLabel();
        B_Rod_01_Jog_1 = new javax.swing.JLabel();
        B_Rod_01_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_23 = new javax.swing.JLabel();
        B_Rod_02_Jog_1 = new javax.swing.JLabel();
        B_Rod_02_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_24 = new javax.swing.JLabel();
        B_Rod_03_Jog_1 = new javax.swing.JLabel();
        B_Rod_03_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_25 = new javax.swing.JLabel();
        B_Rod_04_Jog_1 = new javax.swing.JLabel();
        B_Rod_04_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_26 = new javax.swing.JLabel();
        B_Rod_05_Jog_1 = new javax.swing.JLabel();
        B_Rod_05_Jog_2 = new javax.swing.JLabel();
        Matriz_D = new javax.swing.JPanel();
        Txt_Jogadores6 = new javax.swing.JLabel();
        Txt_Jogador12 = new javax.swing.JLabel();
        Txt_Jogador13 = new javax.swing.JLabel();
        Txt_Rod_27 = new javax.swing.JLabel();
        D_Rod_01_Jog_1 = new javax.swing.JLabel();
        D_Rod_01_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_28 = new javax.swing.JLabel();
        D_Rod_02_Jog_1 = new javax.swing.JLabel();
        D_Rod_02_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_29 = new javax.swing.JLabel();
        D_Rod_03_Jog_1 = new javax.swing.JLabel();
        D_Rod_03_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_30 = new javax.swing.JLabel();
        D_Rod_04_Jog_1 = new javax.swing.JLabel();
        D_Rod_04_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_31 = new javax.swing.JLabel();
        D_Rod_05_Jog_1 = new javax.swing.JLabel();
        D_Rod_05_Jog_2 = new javax.swing.JLabel();
        Matriz_E = new javax.swing.JPanel();
        Txt_Jogadores7 = new javax.swing.JLabel();
        Txt_Jogador14 = new javax.swing.JLabel();
        Txt_Jogador15 = new javax.swing.JLabel();
        Txt_Rod_32 = new javax.swing.JLabel();
        E_Rod_01_Jog_1 = new javax.swing.JLabel();
        E_Rod_01_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_33 = new javax.swing.JLabel();
        E_Rod_02_Jog_1 = new javax.swing.JLabel();
        E_Rod_02_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_34 = new javax.swing.JLabel();
        E_Rod_03_Jog_1 = new javax.swing.JLabel();
        E_Rod_03_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_35 = new javax.swing.JLabel();
        E_Rod_04_Jog_1 = new javax.swing.JLabel();
        E_Rod_04_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_36 = new javax.swing.JLabel();
        E_Rod_05_Jog_1 = new javax.swing.JLabel();
        E_Rod_05_Jog_2 = new javax.swing.JLabel();
        Matriz_F = new javax.swing.JPanel();
        Txt_Jogadores8 = new javax.swing.JLabel();
        Txt_Jogador16 = new javax.swing.JLabel();
        Txt_Jogador17 = new javax.swing.JLabel();
        Txt_Rod_37 = new javax.swing.JLabel();
        F_Rod_01_Jog_1 = new javax.swing.JLabel();
        F_Rod_01_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_38 = new javax.swing.JLabel();
        F_Rod_02_Jog_1 = new javax.swing.JLabel();
        F_Rod_02_Jog_2 = new javax.swing.JLabel();
        Matriz_Resultado = new javax.swing.JPanel();
        Txt_Jogadores2 = new javax.swing.JLabel();
        Txt_Jogador4 = new javax.swing.JLabel();
        Txt_Jogador5 = new javax.swing.JLabel();
        Txt_Rod_7 = new javax.swing.JLabel();
        MR_Rod_01_Jog_1 = new javax.swing.JLabel();
        MR_Rod_01_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_8 = new javax.swing.JLabel();
        MR_Rod_02_Jog_1 = new javax.swing.JLabel();
        MR_Rod_02_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_9 = new javax.swing.JLabel();
        MR_Rod_03_Jog_1 = new javax.swing.JLabel();
        MR_Rod_03_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_10 = new javax.swing.JLabel();
        MR_Rod_04_Jog_1 = new javax.swing.JLabel();
        MR_Rod_04_Jog_2 = new javax.swing.JLabel();
        Txt_Rod_11 = new javax.swing.JLabel();
        MR_Rod_05_Jog_1 = new javax.swing.JLabel();
        MR_Rod_05_Jog_2 = new javax.swing.JLabel();
        Txt_Variavel_B1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_Conv_Binario = new javax.swing.JLabel();
        Txt_Conv_Octal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Txt_Conv_Hexadecimal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Matrizes");
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jScrollPane2.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel1.setText("Tela das Matrizes.");

        Matriz_A.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz A = ( Matriz Resultados )"));
        Matriz_A.setAutoscrolls(true);

        Txt_Jogadores1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogadores1.setText("Jogadores");
        Txt_Jogadores1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Jogador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogador2.setText("Jogador 01 - X");
        Txt_Jogador2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt_Jogador2.setMaximumSize(new java.awt.Dimension(2, 2));
        Txt_Jogador2.setMinimumSize(new java.awt.Dimension(2, 2));

        Txt_Jogador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogador3.setText("Jogador 02 - O");
        Txt_Jogador3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt_Jogador3.setMaximumSize(new java.awt.Dimension(2, 2));
        Txt_Jogador3.setMinimumSize(new java.awt.Dimension(2, 2));

        Txt_Rod_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_2.setText("Rodada 01");
        Txt_Rod_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        A_Rod_01_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_Rod_01_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        A_Rod_01_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_Rod_01_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_3.setText("Rodada 02");
        Txt_Rod_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        A_Rod_02_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_Rod_02_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        A_Rod_02_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_Rod_02_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_4.setText("Rodada 03");
        Txt_Rod_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        A_Rod_03_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_Rod_03_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        A_Rod_03_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_Rod_03_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_5.setText("Rodada 04");
        Txt_Rod_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        A_Rod_04_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_Rod_04_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        A_Rod_04_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_Rod_04_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_6.setText("Rodada 05");
        Txt_Rod_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        A_Rod_05_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_Rod_05_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        A_Rod_05_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_Rod_05_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Matriz_ALayout = new javax.swing.GroupLayout(Matriz_A);
        Matriz_A.setLayout(Matriz_ALayout);
        Matriz_ALayout.setHorizontalGroup(
            Matriz_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matriz_ALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Matriz_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Txt_Jogador2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Jogadores1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Jogador3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(A_Rod_01_Jog_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(A_Rod_01_Jog_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A_Rod_02_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_3, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(A_Rod_02_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A_Rod_03_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_4, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(A_Rod_03_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(Matriz_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A_Rod_04_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_5, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(A_Rod_04_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A_Rod_05_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_6, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(A_Rod_05_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Matriz_ALayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Txt_Jogador2, Txt_Jogador3});

        Matriz_ALayout.setVerticalGroup(
            Matriz_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matriz_ALayout.createSequentialGroup()
                .addGroup(Matriz_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Jogadores1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Jogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Rod_01_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Rod_02_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Rod_04_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Rod_05_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Rod_03_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(Matriz_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Jogador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Rod_01_Jog_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Rod_02_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Rod_03_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Rod_04_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Rod_05_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        Matriz_ALayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {A_Rod_01_Jog_1, A_Rod_01_Jog_2, A_Rod_02_Jog_1, A_Rod_02_Jog_2, A_Rod_03_Jog_1, A_Rod_03_Jog_2, A_Rod_04_Jog_1, A_Rod_04_Jog_2, A_Rod_05_Jog_1, A_Rod_05_Jog_2});

        Matriz_ALayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Txt_Jogador2, Txt_Jogador3});

        Matriz_C.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz C = ( Transposta a Matriz A )"));
        Matriz_C.setAutoscrolls(true);

        Txt_Jogadores4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogadores4.setText("Jogadores");
        Txt_Jogadores4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Jogador9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogador9.setText("02 - O");
        Txt_Jogador9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_17.setText("Rodada 01");
        Txt_Rod_17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C_Rod_01_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C_Rod_01_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_18.setText("Rodada 02");
        Txt_Rod_18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_19.setText("Rodada 03");
        Txt_Rod_19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_20.setText("Rodada 04");
        Txt_Rod_20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_21.setText("Rodada 05");
        Txt_Rod_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Jogador18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogador18.setText("01 - X");
        Txt_Jogador18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C_Rod_02_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C_Rod_02_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C_Rod_03_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C_Rod_03_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C_Rod_04_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C_Rod_04_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C_Rod_05_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C_Rod_05_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C_Rod_01_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C_Rod_01_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C_Rod_02_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C_Rod_02_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C_Rod_03_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C_Rod_03_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C_Rod_05_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C_Rod_05_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        C_Rod_04_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C_Rod_04_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Matriz_CLayout = new javax.swing.GroupLayout(Matriz_C);
        Matriz_C.setLayout(Matriz_CLayout);
        Matriz_CLayout.setHorizontalGroup(
            Matriz_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matriz_CLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Matriz_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Rod_21, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Rod_20, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Rod_18, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Rod_19, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Rod_17, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Matriz_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Matriz_CLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(Matriz_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Jogadores4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Matriz_CLayout.createSequentialGroup()
                                .addGroup(Matriz_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Txt_Jogador18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(C_Rod_01_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Matriz_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(C_Rod_01_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Txt_Jogador9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(Matriz_CLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Matriz_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Matriz_CLayout.createSequentialGroup()
                                .addComponent(C_Rod_03_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C_Rod_03_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                            .addGroup(Matriz_CLayout.createSequentialGroup()
                                .addComponent(C_Rod_04_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C_Rod_04_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Matriz_CLayout.createSequentialGroup()
                                .addComponent(C_Rod_05_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C_Rod_05_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Matriz_CLayout.createSequentialGroup()
                                .addComponent(C_Rod_02_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C_Rod_02_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Matriz_CLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Txt_Rod_17, Txt_Rod_18, Txt_Rod_19, Txt_Rod_20, Txt_Rod_21});

        Matriz_CLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {C_Rod_01_Jog_1, C_Rod_01_Jog_2, C_Rod_02_Jog_1, C_Rod_02_Jog_2, C_Rod_03_Jog_1, C_Rod_03_Jog_2, C_Rod_04_Jog_1, C_Rod_04_Jog_2, C_Rod_05_Jog_1, C_Rod_05_Jog_2});

        Matriz_CLayout.setVerticalGroup(
            Matriz_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matriz_CLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Txt_Jogadores4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Jogador9)
                    .addComponent(Txt_Jogador18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C_Rod_01_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_Rod_01_Jog_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Rod_17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(C_Rod_02_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(C_Rod_02_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(Matriz_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Matriz_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Matriz_CLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Txt_Rod_19))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Matriz_CLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(C_Rod_03_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Matriz_CLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C_Rod_03_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(C_Rod_04_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(C_Rod_04_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(C_Rod_05_Jog_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(C_Rod_05_Jog_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Matriz_CLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {C_Rod_01_Jog_1, C_Rod_01_Jog_2, C_Rod_02_Jog_1, C_Rod_02_Jog_2, C_Rod_03_Jog_1, C_Rod_03_Jog_2, C_Rod_04_Jog_1, C_Rod_04_Jog_2, C_Rod_05_Jog_1, C_Rod_05_Jog_2});

        Matriz_CLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Txt_Rod_17, Txt_Rod_18, Txt_Rod_19, Txt_Rod_20, Txt_Rod_21});

        Matriz_B.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz B = ( Valores Inveros da Matriz A )"));
        Matriz_B.setAutoscrolls(true);

        Txt_Jogadores5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogadores5.setText("Jogadores");
        Txt_Jogadores5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Jogador10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogador10.setText("Jogador 01 - X");
        Txt_Jogador10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Jogador11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogador11.setText("Jogador 02 - O");
        Txt_Jogador11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_22.setText("Rodada 01");
        Txt_Rod_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        B_Rod_01_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B_Rod_01_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        B_Rod_01_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B_Rod_01_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_23.setText("Rodada 02");
        Txt_Rod_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        B_Rod_02_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B_Rod_02_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        B_Rod_02_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B_Rod_02_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_24.setText("Rodada 03");
        Txt_Rod_24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        B_Rod_03_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B_Rod_03_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        B_Rod_03_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B_Rod_03_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_25.setText("Rodada 04");
        Txt_Rod_25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        B_Rod_04_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B_Rod_04_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        B_Rod_04_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B_Rod_04_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_26.setText("Rodada 05");
        Txt_Rod_26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        B_Rod_05_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B_Rod_05_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        B_Rod_05_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B_Rod_05_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Matriz_BLayout = new javax.swing.GroupLayout(Matriz_B);
        Matriz_B.setLayout(Matriz_BLayout);
        Matriz_BLayout.setHorizontalGroup(
            Matriz_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matriz_BLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Matriz_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Txt_Jogador11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(Txt_Jogadores5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Jogador10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B_Rod_01_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_22, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(B_Rod_01_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Txt_Rod_23, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(B_Rod_02_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Rod_02_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B_Rod_03_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_24, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(B_Rod_03_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Txt_Rod_25, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(B_Rod_04_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Rod_04_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B_Rod_05_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_26, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(B_Rod_05_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Matriz_BLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Txt_Rod_22, Txt_Rod_23});

        Matriz_BLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Txt_Jogador10, Txt_Jogador11});

        Matriz_BLayout.setVerticalGroup(
            Matriz_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matriz_BLayout.createSequentialGroup()
                .addGroup(Matriz_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Jogadores5)
                    .addComponent(Txt_Rod_22)
                    .addComponent(Txt_Rod_23)
                    .addComponent(Txt_Rod_24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Jogador10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Rod_01_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Rod_02_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Rod_03_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Rod_04_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Rod_05_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(Matriz_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Jogador11)
                    .addComponent(B_Rod_01_Jog_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Rod_02_Jog_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Rod_03_Jog_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Rod_04_Jog_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Rod_05_Jog_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        Matriz_BLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {B_Rod_01_Jog_1, B_Rod_01_Jog_2, B_Rod_02_Jog_1, B_Rod_02_Jog_2, B_Rod_03_Jog_1, B_Rod_03_Jog_2, B_Rod_04_Jog_1, B_Rod_04_Jog_2, B_Rod_05_Jog_1, B_Rod_05_Jog_2});

        Matriz_BLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Txt_Rod_22, Txt_Rod_23});

        Matriz_BLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Txt_Jogador10, Txt_Jogador11});

        Matriz_D.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz D = ( A + B )"));
        Matriz_D.setAutoscrolls(true);

        Txt_Jogadores6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogadores6.setText("Jogadores");
        Txt_Jogadores6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Jogador12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogador12.setText("Jogador 01 - X");
        Txt_Jogador12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Jogador13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogador13.setText("Jogador 02 - O");
        Txt_Jogador13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_27.setText("Rodada 01");
        Txt_Rod_27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        D_Rod_01_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D_Rod_01_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        D_Rod_01_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D_Rod_01_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_28.setText("Rodada 02");
        Txt_Rod_28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        D_Rod_02_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D_Rod_02_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        D_Rod_02_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D_Rod_02_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_29.setText("Rodada 03");
        Txt_Rod_29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        D_Rod_03_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D_Rod_03_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        D_Rod_03_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D_Rod_03_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_30.setText("Rodada 04");
        Txt_Rod_30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        D_Rod_04_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D_Rod_04_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        D_Rod_04_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D_Rod_04_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_31.setText("Rodada 05");
        Txt_Rod_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        D_Rod_05_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D_Rod_05_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        D_Rod_05_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D_Rod_05_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Matriz_DLayout = new javax.swing.GroupLayout(Matriz_D);
        Matriz_D.setLayout(Matriz_DLayout);
        Matriz_DLayout.setHorizontalGroup(
            Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matriz_DLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Txt_Jogador12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Jogadores6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Jogador13, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(D_Rod_01_Jog_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(D_Rod_01_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(D_Rod_02_Jog_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(D_Rod_02_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Txt_Rod_28, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(D_Rod_03_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(D_Rod_03_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(D_Rod_04_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(D_Rod_04_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(D_Rod_05_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(D_Rod_05_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Matriz_DLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {D_Rod_01_Jog_1, D_Rod_01_Jog_2, D_Rod_02_Jog_1, D_Rod_02_Jog_2, D_Rod_03_Jog_1, D_Rod_03_Jog_2, D_Rod_04_Jog_1, D_Rod_04_Jog_2, D_Rod_05_Jog_1, D_Rod_05_Jog_2});

        Matriz_DLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Txt_Jogador12, Txt_Jogador13});

        Matriz_DLayout.setVerticalGroup(
            Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matriz_DLayout.createSequentialGroup()
                .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Jogadores6)
                    .addComponent(Txt_Rod_27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Matriz_DLayout.createSequentialGroup()
                        .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Matriz_DLayout.createSequentialGroup()
                                .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(D_Rod_04_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                    .addComponent(D_Rod_05_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(D_Rod_04_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(D_Rod_05_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Matriz_DLayout.createSequentialGroup()
                                .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(D_Rod_02_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(D_Rod_03_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(D_Rod_02_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                                    .addComponent(D_Rod_03_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(51, 51, 51))
                    .addGroup(Matriz_DLayout.createSequentialGroup()
                        .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D_Rod_01_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Txt_Jogador12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Matriz_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(D_Rod_01_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Txt_Jogador13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Matriz_DLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {D_Rod_01_Jog_1, D_Rod_01_Jog_2, D_Rod_02_Jog_1, D_Rod_02_Jog_2, D_Rod_03_Jog_1, D_Rod_03_Jog_2, D_Rod_04_Jog_1, D_Rod_04_Jog_2, D_Rod_05_Jog_1, D_Rod_05_Jog_2});

        Matriz_E.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz  E = ( A - B )"));
        Matriz_E.setAutoscrolls(true);

        Txt_Jogadores7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogadores7.setText("Jogadores");
        Txt_Jogadores7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Jogador14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogador14.setText("Jogador 01 - X");
        Txt_Jogador14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt_Jogador14.setMaximumSize(new java.awt.Dimension(96, 2));
        Txt_Jogador14.setMinimumSize(new java.awt.Dimension(96, 2));

        Txt_Jogador15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogador15.setText("Jogador 02 - O");
        Txt_Jogador15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_32.setText("Rodada 01");
        Txt_Rod_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        E_Rod_01_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E_Rod_01_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        E_Rod_01_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E_Rod_01_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_33.setText("Rodada 02");
        Txt_Rod_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        E_Rod_02_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E_Rod_02_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        E_Rod_02_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E_Rod_02_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_34.setText("Rodada 03");
        Txt_Rod_34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        E_Rod_03_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E_Rod_03_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        E_Rod_03_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E_Rod_03_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_35.setText("Rodada 04");
        Txt_Rod_35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        E_Rod_04_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E_Rod_04_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        E_Rod_04_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E_Rod_04_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_36.setText("Rodada 05");
        Txt_Rod_36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        E_Rod_05_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E_Rod_05_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        E_Rod_05_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E_Rod_05_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Matriz_ELayout = new javax.swing.GroupLayout(Matriz_E);
        Matriz_E.setLayout(Matriz_ELayout);
        Matriz_ELayout.setHorizontalGroup(
            Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matriz_ELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Txt_Jogador14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Jogador15, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(Txt_Jogadores7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(E_Rod_01_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Rod_32, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E_Rod_01_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Rod_33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E_Rod_02_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E_Rod_02_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(E_Rod_03_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(E_Rod_03_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Txt_Rod_35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(E_Rod_04_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(E_Rod_04_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Txt_Rod_36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(E_Rod_05_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(E_Rod_05_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Matriz_ELayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {E_Rod_01_Jog_1, E_Rod_01_Jog_2, E_Rod_02_Jog_1, E_Rod_02_Jog_2, E_Rod_03_Jog_1, E_Rod_03_Jog_2, E_Rod_04_Jog_1, E_Rod_04_Jog_2, E_Rod_05_Jog_1, E_Rod_05_Jog_2});

        Matriz_ELayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Txt_Jogador14, Txt_Jogador15});

        Matriz_ELayout.setVerticalGroup(
            Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matriz_ELayout.createSequentialGroup()
                .addGroup(Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Jogadores7)
                    .addComponent(Txt_Rod_32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Matriz_ELayout.createSequentialGroup()
                        .addGroup(Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Matriz_ELayout.createSequentialGroup()
                                .addGroup(Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(E_Rod_04_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                    .addComponent(E_Rod_05_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(E_Rod_05_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E_Rod_04_Jog_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Matriz_ELayout.createSequentialGroup()
                                .addGroup(Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Matriz_ELayout.createSequentialGroup()
                                        .addComponent(E_Rod_03_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(Matriz_ELayout.createSequentialGroup()
                                        .addComponent(E_Rod_02_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(E_Rod_03_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E_Rod_02_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56))
                    .addGroup(Matriz_ELayout.createSequentialGroup()
                        .addGroup(Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_Jogador14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(E_Rod_01_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(Matriz_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Matriz_ELayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E_Rod_01_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Matriz_ELayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(Txt_Jogador15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Matriz_ELayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {E_Rod_01_Jog_1, E_Rod_01_Jog_2, E_Rod_02_Jog_1, E_Rod_02_Jog_2, E_Rod_03_Jog_1, E_Rod_03_Jog_2, E_Rod_04_Jog_1, E_Rod_04_Jog_2, E_Rod_05_Jog_1, E_Rod_05_Jog_2});

        Matriz_F.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz F =  ( A * C )"));
        Matriz_F.setAutoscrolls(true);

        Txt_Jogadores8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogadores8.setText("Jogadores");
        Txt_Jogadores8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Jogador16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogador16.setText("Jogador 01 - X");
        Txt_Jogador16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Jogador17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogador17.setText("Jogador 02 - O");
        Txt_Jogador17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_37.setText("Jogador  01");
        Txt_Rod_37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        F_Rod_01_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F_Rod_01_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        F_Rod_01_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F_Rod_01_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_38.setText("Jogador 02");
        Txt_Rod_38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        F_Rod_02_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F_Rod_02_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        F_Rod_02_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F_Rod_02_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Matriz_FLayout = new javax.swing.GroupLayout(Matriz_F);
        Matriz_F.setLayout(Matriz_FLayout);
        Matriz_FLayout.setHorizontalGroup(
            Matriz_FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matriz_FLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Matriz_FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Txt_Jogador16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Jogadores8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Jogador17, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(F_Rod_01_Jog_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(F_Rod_01_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Matriz_FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Matriz_FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(F_Rod_02_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(F_Rod_02_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Txt_Rod_38, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(360, 360, 360))
        );

        Matriz_FLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {F_Rod_01_Jog_1, F_Rod_01_Jog_2, F_Rod_02_Jog_1, F_Rod_02_Jog_2});

        Matriz_FLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Txt_Rod_37, Txt_Rod_38});

        Matriz_FLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Txt_Jogador16, Txt_Jogador17});

        Matriz_FLayout.setVerticalGroup(
            Matriz_FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matriz_FLayout.createSequentialGroup()
                .addGroup(Matriz_FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Jogadores8)
                    .addComponent(Txt_Rod_37)
                    .addComponent(Txt_Rod_38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Matriz_FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(F_Rod_01_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Txt_Jogador16, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                    .addComponent(F_Rod_02_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(F_Rod_02_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(Txt_Jogador17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(F_Rod_01_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Matriz_FLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {F_Rod_01_Jog_1, F_Rod_01_Jog_2, F_Rod_02_Jog_1, F_Rod_02_Jog_2});

        Matriz_FLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Txt_Rod_37, Txt_Rod_38});

        Matriz_FLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Txt_Jogador16, Txt_Jogador17});

        Matriz_Resultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz Resultado"));
        Matriz_Resultado.setAutoscrolls(true);

        Txt_Jogadores2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogadores2.setText("Jogadores");
        Txt_Jogadores2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Jogador4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogador4.setText("Jogador 01 - X");
        Txt_Jogador4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt_Jogador4.setMaximumSize(new java.awt.Dimension(2, 2));
        Txt_Jogador4.setMinimumSize(new java.awt.Dimension(2, 2));

        Txt_Jogador5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Jogador5.setText("Jogador 02 - O");
        Txt_Jogador5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt_Jogador5.setMaximumSize(new java.awt.Dimension(2, 2));
        Txt_Jogador5.setMinimumSize(new java.awt.Dimension(2, 2));

        Txt_Rod_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_7.setText("Rodada 01");
        Txt_Rod_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MR_Rod_01_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MR_Rod_01_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MR_Rod_01_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MR_Rod_01_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_8.setText("Rodada 02");
        Txt_Rod_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MR_Rod_02_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MR_Rod_02_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MR_Rod_02_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MR_Rod_02_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_9.setText("Rodada 03");
        Txt_Rod_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MR_Rod_03_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MR_Rod_03_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MR_Rod_03_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MR_Rod_03_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_10.setText("Rodada 04");
        Txt_Rod_10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MR_Rod_04_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MR_Rod_04_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MR_Rod_04_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MR_Rod_04_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Txt_Rod_11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Rod_11.setText("Rodada 05");
        Txt_Rod_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MR_Rod_05_Jog_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MR_Rod_05_Jog_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MR_Rod_05_Jog_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MR_Rod_05_Jog_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Matriz_ResultadoLayout = new javax.swing.GroupLayout(Matriz_Resultado);
        Matriz_Resultado.setLayout(Matriz_ResultadoLayout);
        Matriz_ResultadoLayout.setHorizontalGroup(
            Matriz_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matriz_ResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Matriz_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Txt_Jogador4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Jogadores2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Jogador5, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MR_Rod_01_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_7, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(MR_Rod_01_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MR_Rod_02_Jog_1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Rod_8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MR_Rod_02_Jog_2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(MR_Rod_03_Jog_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(MR_Rod_03_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MR_Rod_04_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_10, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(MR_Rod_04_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MR_Rod_05_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_11, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(MR_Rod_05_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Matriz_ResultadoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Txt_Jogador4, Txt_Jogador5});

        Matriz_ResultadoLayout.setVerticalGroup(
            Matriz_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matriz_ResultadoLayout.createSequentialGroup()
                .addGroup(Matriz_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Jogadores2)
                    .addComponent(Txt_Rod_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txt_Rod_11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Matriz_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Jogador4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MR_Rod_01_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MR_Rod_02_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MR_Rod_03_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MR_Rod_04_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MR_Rod_05_Jog_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(Matriz_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Matriz_ResultadoLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(Matriz_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Jogador5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MR_Rod_01_Jog_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MR_Rod_02_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Matriz_ResultadoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MR_Rod_05_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Matriz_ResultadoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MR_Rod_03_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Matriz_ResultadoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MR_Rod_04_Jog_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );

        Matriz_ResultadoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Txt_Jogador4, Txt_Jogador5});

        Txt_Variavel_B1.setText("0");

        jLabel2.setText("Somatório Matriz Resultado:");

        jLabel3.setText("Valor da Variavel  B1:");

        Txt_Conv_Binario.setText("0");

        Txt_Conv_Octal.setText("0");

        jLabel4.setText("Valor da Variavel  O1:");

        Txt_Conv_Hexadecimal.setText("0");

        jLabel5.setText("Valor da Variavel  H1:");

        javax.swing.GroupLayout Painel_GeralLayout = new javax.swing.GroupLayout(Painel_Geral);
        Painel_Geral.setLayout(Painel_GeralLayout);
        Painel_GeralLayout.setHorizontalGroup(
            Painel_GeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_GeralLayout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addGroup(Painel_GeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Matriz_E, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Matriz_D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Matriz_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Matriz_A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Matriz_Resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_GeralLayout.createSequentialGroup()
                        .addComponent(Matriz_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(Painel_GeralLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(Matriz_F, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(Painel_GeralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_Variavel_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_Conv_Binario, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_Conv_Octal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_Conv_Hexadecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Painel_GeralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel_GeralLayout.setVerticalGroup(
            Painel_GeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_GeralLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(Painel_GeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txt_Variavel_B1)
                    .addComponent(jLabel3)
                    .addComponent(Txt_Conv_Binario)
                    .addComponent(Txt_Conv_Octal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Txt_Conv_Hexadecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(Matriz_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Matriz_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Matriz_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Matriz_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(Matriz_D, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(Matriz_E, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Matriz_F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(Painel_Geral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void recebendo (String recebe){        
        Caso_recebe = Integer.valueOf(recebe);
        
     switch(Caso_recebe){   
                
                case 1: 
                        result_Jog_01 = 5;
                        result_Jog_02 = 0;
                        Matriz_Conv();
                        break;
                case 2: 
                        result_Jog_01 = 0;
                        result_Jog_02 = 5;                    
                        Matriz_Conv();
                        break;                       
                case 3:                        
                        result_Jog_01 = 2;
                        result_Jog_02 = 2;                         
                        Matriz_Conv();
                        break;                        
                case 4:
                        Limpar_Dados();
                        break;     
      }
    }
    
    public void Matriz_Conv(){
                
                v1[i1] = result_Jog_01;
                i1++;
                
                v2[i2] = result_Jog_02;
                i2++;
                
                Rodadas ++;
                                                     
              Resultado();                              
    }
    
    public void Resultado(){
        
        if(Rodadas == 1){
        sum += M_transp_01 = v1[0];    
        R1_JOG_01 = String.valueOf(v1[0]);
        MR_Rod_01_Jog_1.setText(R1_JOG_01);
        
        sum += M_transp_06 = v2[0];
        R1_JOG_02 = String.valueOf(v2[0]);
        MR_Rod_01_Jog_2.setText(R1_JOG_02);}
        
        if(Rodadas == 2){
        sum += M_transp_02 = v1[1]+v1[0];
        R2_JOG_01 = String.valueOf(v1[1]+v1[0]);
        MR_Rod_02_Jog_1.setText(R2_JOG_01);
        
        sum += M_transp_07 = v2[1]+v2[0];
        R2_JOG_02 = String.valueOf(v2[1]+v2[0]);
        MR_Rod_02_Jog_2.setText(R2_JOG_02);}
        
        if(Rodadas == 3){
        sum += M_transp_03 = v1[2]+v1[1]+v1[0];   
        R3_JOG_01 = String.valueOf(v1[2]+v1[1]+v1[0]);
        MR_Rod_03_Jog_1.setText(R3_JOG_01);
        
        sum += M_transp_08 = v2[2]+v2[1]+v2[0];
        R3_JOG_02 = String.valueOf(v2[2]+v2[1]+v2[0]);
        MR_Rod_03_Jog_2.setText(R3_JOG_02);}
        
        if(Rodadas == 4){
        sum += M_transp_04 = v1[3]+v1[2]+v1[1]+v1[0];   
        R4_JOG_01 = String.valueOf(v1[3]+v1[2]+v1[1]+v1[0]);
        MR_Rod_04_Jog_1.setText(R4_JOG_01);
        
        sum += M_transp_09 = v2[3]+v2[2]+v2[1]+v2[0];
        R4_JOG_02 = String.valueOf(v2[3]+v2[2]+v2[1]+v2[0]);
        MR_Rod_04_Jog_2.setText(R4_JOG_02);}
        
        if(Rodadas == 5){
        sum += M_transp_05 = v1[4]+v1[3]+v1[2]+v1[1]+v1[0];    
        R5_JOG_01 = String.valueOf(v1[4]+v1[3]+v1[2]+v1[1]+v1[0]);
        MR_Rod_05_Jog_1.setText(R5_JOG_01);
        
        sum += M_transp_010 = v2[4]+v2[3]+v2[2]+v2[1]+v2[0];
        R5_JOG_02 = String.valueOf(v2[4]+v2[3]+v2[2]+v2[1]+v2[0]);
        MR_Rod_05_Jog_2.setText(R5_JOG_02);}
        
        Matriz_A ();
        Variavel_B1();
    }
    
    public void Variavel_B1(){
                                                                       
                    Variavel_B1 = String.valueOf(sum);
                    Txt_Variavel_B1.setText(Variavel_B1);
                    
                    Variavel_O1 = Integer.toOctalString(sum);
                    Txt_Conv_Octal.setText(Variavel_O1);
                    
                    Variavel_H1 = Integer.toHexString(sum);
                    Txt_Conv_Hexadecimal.setText(Variavel_H1);
                    
                    Binario = Integer.toBinaryString(sum);
                    Txt_Conv_Binario.setText(Binario);                                                                         
    }
       
   
    public void Matriz_A (){
        
        if(Rodadas == 1){
        A_R1_JOG_01 = String.valueOf(v1[0]);
        A_Rod_01_Jog_1.setText(A_R1_JOG_01);
        
        A_R1_JOG_02 = String.valueOf(v2[0]);
        A_Rod_01_Jog_2.setText(A_R1_JOG_02);}
        
        if(Rodadas == 2){
        A_R2_JOG_01 = String.valueOf(v1[1]+v1[0]);
        A_Rod_02_Jog_1.setText(A_R2_JOG_01);
        
        A_R2_JOG_02 = String.valueOf(v2[1]+v2[0]);
        A_Rod_02_Jog_2.setText(A_R2_JOG_02);}
        
        if(Rodadas == 3){
        A_R3_JOG_01 = String.valueOf(v1[2]+v1[1]+v1[0]);
        A_Rod_03_Jog_1.setText(A_R3_JOG_01);
        
        A_R3_JOG_02 = String.valueOf(v2[2]+v2[1]+v2[0]);
        A_Rod_03_Jog_2.setText(A_R3_JOG_02);}
        
        if(Rodadas == 4){
        A_R4_JOG_01 = String.valueOf(v1[3]+v1[2]+v1[1]+v1[0]);
        A_Rod_04_Jog_1.setText(A_R4_JOG_01);
        
        A_R4_JOG_02 = String.valueOf(v2[3]+v2[2]+v2[1]+v2[0]);
        A_Rod_04_Jog_2.setText(A_R4_JOG_02);}
        
        if(Rodadas == 5){
        A_R5_JOG_01 = String.valueOf(v1[4]+v1[3]+v1[2]+v1[1]+v1[0]);
        A_Rod_05_Jog_1.setText(A_R5_JOG_01);
        
        A_R5_JOG_02 = String.valueOf(v2[4]+v2[3]+v2[2]+v2[1]+v2[0]);
        A_Rod_05_Jog_2.setText(A_R5_JOG_02);}
        
        Matriz_B ();
        
    }
    
        public void Matriz_B (){
            
            B_Rod_01_Jog_1.setText(A_R5_JOG_01);
            B_Rod_02_Jog_1.setText(A_R4_JOG_01);
            B_Rod_03_Jog_1.setText(A_R3_JOG_01);
            B_Rod_04_Jog_1.setText(A_R2_JOG_01);
            B_Rod_05_Jog_1.setText(A_R1_JOG_01);
            
            B_Rod_01_Jog_2.setText(A_R5_JOG_02);
            B_Rod_02_Jog_2.setText(A_R4_JOG_02);
            B_Rod_03_Jog_2.setText(A_R3_JOG_02);
            B_Rod_04_Jog_2.setText(A_R2_JOG_02);
            B_Rod_05_Jog_2.setText(A_R1_JOG_02);
      
            if(Rodadas == 5){
                Matriz_D ();
                
            }
            Matriz_C ();
        }
        
        public void Matriz_C (){
            
            C_Rod_01_Jog_1.setText(A_R1_JOG_01);
            C_Rod_02_Jog_1.setText(A_R2_JOG_01);
            C_Rod_03_Jog_1.setText(A_R3_JOG_01);
            C_Rod_04_Jog_1.setText(A_R4_JOG_01);
            C_Rod_05_Jog_1.setText(A_R5_JOG_01);
            
            C_Rod_01_Jog_2.setText(A_R1_JOG_02);
            C_Rod_02_Jog_2.setText(A_R2_JOG_02);
            C_Rod_03_Jog_2.setText(A_R3_JOG_02);
            C_Rod_04_Jog_2.setText(A_R4_JOG_02);
            C_Rod_05_Jog_2.setText(A_R5_JOG_02);           
            Matriz_F ();
            
        }
        
        public void Matriz_D (){            
                                      
                D_R1_JOG_01 = String.valueOf((v1[0]) + (v1[4]+v1[3]+v1[2]+v1[1]+v1[0]));
                D_Rod_01_Jog_1.setText(D_R1_JOG_01);
                
                D_R1_JOG_02 = String.valueOf((v2[0]) + (v2[4]+v2[3]+v2[2]+v2[1]+v2[0]));
                D_Rod_01_Jog_2.setText(D_R1_JOG_02);               
         
                ////////////
                D_R2_JOG_01 = String.valueOf((v1[1]+v1[0]) + (v1[3]+v1[2]+v1[1]+v1[0]));
                D_Rod_02_Jog_1.setText(D_R2_JOG_01);
                
                D_R2_JOG_02 = String.valueOf((v2[1]+v2[0]) + (v2[3]+v2[2]+v2[1]+v2[0]));
                D_Rod_02_Jog_2.setText(D_R2_JOG_02);               

                ////////////
                D_R3_JOG_01 = String.valueOf((v1[2]+v1[1]+v1[0]) + (v1[2]+v1[1]+v1[0]));
                D_Rod_03_Jog_1.setText(D_R3_JOG_01);
                
                D_R3_JOG_02 = String.valueOf((v2[2]+v2[1]+v2[0]) + (v2[2]+v2[1]+v2[0]));
                D_Rod_03_Jog_2.setText(D_R3_JOG_02);               

                ////////////
                D_R4_JOG_01 = String.valueOf((v1[3]+v1[2]+v1[1]+v1[0]) + (v1[1]+v1[0]));
                D_Rod_04_Jog_1.setText(D_R4_JOG_01);
                
                D_R4_JOG_02 = String.valueOf((v2[3]+v2[2]+v2[1]+v2[0]) + (v2[1]+v2[0]));
                D_Rod_04_Jog_2.setText(D_R4_JOG_02);               
            
                ////////////
                D_R5_JOG_01 = String.valueOf((v1[4]+v1[3]+v1[2]+v1[1]+v1[0]) + (v1[0]));
                D_Rod_05_Jog_1.setText(D_R5_JOG_01);
                
                D_R5_JOG_02 = String.valueOf((v2[4]+v2[3]+v2[2]+v2[1]+v2[0]) + (v2[0]));
                D_Rod_05_Jog_2.setText(D_R5_JOG_02); 
                
                Matriz_E ();
                   
        }
        
        public void Matriz_E (){

                ////////////
                E_R1_JOG_01 = String.valueOf((v1[0]) - (v1[4]+v1[3]+v1[2]+v1[1]+v1[0]));
                E_Rod_01_Jog_1.setText(E_R1_JOG_01);
                
                E_R1_JOG_02 = String.valueOf((v2[0]) - (v2[4]+v2[3]+v2[2]+v2[1]+v2[0]));
                E_Rod_01_Jog_2.setText(E_R1_JOG_02);               

                ////////////
                E_R2_JOG_01 = String.valueOf((v1[1]+v1[0]) - (v1[3]+v1[2]+v1[1]+v1[0]));
                E_Rod_02_Jog_1.setText(E_R2_JOG_01);
                
                E_R2_JOG_02 = String.valueOf((v2[1]+v2[0]) - (v2[3]+v2[2]+v2[1]+v2[0]));
                E_Rod_02_Jog_2.setText(E_R2_JOG_02);               

                ////////////
                E_R3_JOG_01 = String.valueOf((v1[2]+v1[1]+v1[0]) - (v1[2]+v1[1]+v1[0]));
                E_Rod_03_Jog_1.setText(E_R3_JOG_01);
                
                E_R3_JOG_02 = String.valueOf((v2[2]+v2[1]+v2[0]) - (v2[2]+v2[1]+v2[0]));
                E_Rod_03_Jog_2.setText(E_R3_JOG_02);               
            
                ////////////
                E_R4_JOG_01 = String.valueOf((v1[3]+v1[2]+v1[1]+v1[0]) - (v1[1]+v1[0]));
                E_Rod_04_Jog_1.setText(E_R4_JOG_01);
                
                E_R4_JOG_02 = String.valueOf((v2[3]+v2[2]+v2[1]+v2[0]) - (v2[1]+v2[0]));
                E_Rod_04_Jog_2.setText(E_R4_JOG_02);               
            
                ////////////
                E_R5_JOG_01 = String.valueOf((v1[4]+v1[3]+v1[2]+v1[1]+v1[0]) - (v1[0]));
                E_Rod_05_Jog_1.setText(E_R5_JOG_01);
                
                E_R5_JOG_02 = String.valueOf((v2[4]+v2[3]+v2[2]+v2[1]+v2[0]) - (v2[0]));
                E_Rod_05_Jog_2.setText(E_R5_JOG_02);                 
                        
        }
        
        public void Matriz_F (){
            
               if(Rodadas == 1){
                    
                Res_01 = ((M_transp_01*M_transp_01)+(M_transp_02*M_transp_02)+(M_transp_03*M_transp_03)+(M_transp_04*M_transp_04)+(M_transp_05*M_transp_05));                   
                F_R1_JOG_01 = String.valueOf(Res_01);
                F_Rod_01_Jog_1.setText(F_R1_JOG_01);
                               
                Res_02 = ((M_transp_01*M_transp_06)+(M_transp_02*M_transp_07)+(M_transp_03*M_transp_08)+(M_transp_04*M_transp_09)+(M_transp_05*M_transp_010));                
                F_R2_JOG_01 = String.valueOf(Res_02);
                F_Rod_02_Jog_1.setText(F_R2_JOG_01);
                               
                Res_03 = ((M_transp_06*M_transp_01)+(M_transp_07*M_transp_02)+(M_transp_08*M_transp_03)+(M_transp_09*M_transp_04)+(M_transp_010*M_transp_05));                     
                F_R1_JOG_02 = String.valueOf(Res_03);
                F_Rod_01_Jog_2.setText(F_R1_JOG_02);
                
                Res_04 = ((M_transp_06*M_transp_06)+(M_transp_07*M_transp_07)+(M_transp_08*M_transp_08)+(M_transp_09*M_transp_09)+(M_transp_010*M_transp_010));                
                F_R2_JOG_02 = String.valueOf(Res_04);
                F_Rod_02_Jog_2.setText(F_R2_JOG_02);} 
            
               if(Rodadas == 2){
                    
                Res_01 = ((M_transp_01*M_transp_01)+(M_transp_02*M_transp_02)+(M_transp_03*M_transp_03)+(M_transp_04*M_transp_04)+(M_transp_05*M_transp_05));                   
                F_R1_JOG_01 = String.valueOf(Res_01);
                F_Rod_01_Jog_1.setText(F_R1_JOG_01);
                               
                Res_02 = ((M_transp_01*M_transp_06)+(M_transp_02*M_transp_07)+(M_transp_03*M_transp_08)+(M_transp_04*M_transp_09)+(M_transp_05*M_transp_010));                
                F_R2_JOG_01 = String.valueOf(Res_02);
                F_Rod_02_Jog_1.setText(F_R2_JOG_01);
                               
                Res_03 = ((M_transp_06*M_transp_01)+(M_transp_07*M_transp_02)+(M_transp_08*M_transp_03)+(M_transp_09*M_transp_04)+(M_transp_010*M_transp_05));                     
                F_R1_JOG_02 = String.valueOf(Res_03);
                F_Rod_01_Jog_2.setText(F_R1_JOG_02);
                
                Res_04 = ((M_transp_06*M_transp_06)+(M_transp_07*M_transp_07)+(M_transp_08*M_transp_08)+(M_transp_09*M_transp_09)+(M_transp_010*M_transp_010));                
                F_R2_JOG_02 = String.valueOf(Res_04);
                F_Rod_02_Jog_2.setText(F_R2_JOG_02);} 
            
               if(Rodadas == 3){
                    
                Res_01 = ((M_transp_01*M_transp_01)+(M_transp_02*M_transp_02)+(M_transp_03*M_transp_03)+(M_transp_04*M_transp_04)+(M_transp_05*M_transp_05));                   
                F_R1_JOG_01 = String.valueOf(Res_01);
                F_Rod_01_Jog_1.setText(F_R1_JOG_01);
                               
                Res_02 = ((M_transp_01*M_transp_06)+(M_transp_02*M_transp_07)+(M_transp_03*M_transp_08)+(M_transp_04*M_transp_09)+(M_transp_05*M_transp_010));                
                F_R2_JOG_01 = String.valueOf(Res_02);
                F_Rod_02_Jog_1.setText(F_R2_JOG_01);
                               
                Res_03 = ((M_transp_06*M_transp_01)+(M_transp_07*M_transp_02)+(M_transp_08*M_transp_03)+(M_transp_09*M_transp_04)+(M_transp_010*M_transp_05));                     
                F_R1_JOG_02 = String.valueOf(Res_03);
                F_Rod_01_Jog_2.setText(F_R1_JOG_02);
                
                Res_04 = ((M_transp_06*M_transp_06)+(M_transp_07*M_transp_07)+(M_transp_08*M_transp_08)+(M_transp_09*M_transp_09)+(M_transp_010*M_transp_010));                
                F_R2_JOG_02 = String.valueOf(Res_04);
                F_Rod_02_Jog_2.setText(F_R2_JOG_02);}             
            
               if(Rodadas == 4){
                    
                Res_01 = ((M_transp_01*M_transp_01)+(M_transp_02*M_transp_02)+(M_transp_03*M_transp_03)+(M_transp_04*M_transp_04)+(M_transp_05*M_transp_05));                   
                F_R1_JOG_01 = String.valueOf(Res_01);
                F_Rod_01_Jog_1.setText(F_R1_JOG_01);
                               
                Res_02 = ((M_transp_01*M_transp_06)+(M_transp_02*M_transp_07)+(M_transp_03*M_transp_08)+(M_transp_04*M_transp_09)+(M_transp_05*M_transp_010));                
                F_R2_JOG_01 = String.valueOf(Res_02);
                F_Rod_02_Jog_1.setText(F_R2_JOG_01);
                               
                Res_03 = ((M_transp_06*M_transp_01)+(M_transp_07*M_transp_02)+(M_transp_08*M_transp_03)+(M_transp_09*M_transp_04)+(M_transp_010*M_transp_05));                     
                F_R1_JOG_02 = String.valueOf(Res_03);
                F_Rod_01_Jog_2.setText(F_R1_JOG_02);
                
                Res_04 = ((M_transp_06*M_transp_06)+(M_transp_07*M_transp_07)+(M_transp_08*M_transp_08)+(M_transp_09*M_transp_09)+(M_transp_010*M_transp_010));                
                F_R2_JOG_02 = String.valueOf(Res_04);
                F_Rod_02_Jog_2.setText(F_R2_JOG_02);}             
            
                
               if(Rodadas == 5){
                    
                Res_01 = ((M_transp_01*M_transp_01)+(M_transp_02*M_transp_02)+(M_transp_03*M_transp_03)+(M_transp_04*M_transp_04)+(M_transp_05*M_transp_05));                   
                F_R1_JOG_01 = String.valueOf(Res_01);
                F_Rod_01_Jog_1.setText(F_R1_JOG_01);
                               
                Res_02 = ((M_transp_01*M_transp_06)+(M_transp_02*M_transp_07)+(M_transp_03*M_transp_08)+(M_transp_04*M_transp_09)+(M_transp_05*M_transp_010));                
                F_R2_JOG_01 = String.valueOf(Res_02);
                F_Rod_02_Jog_1.setText(F_R2_JOG_01);
                               
                Res_03 = ((M_transp_06*M_transp_01)+(M_transp_07*M_transp_02)+(M_transp_08*M_transp_03)+(M_transp_09*M_transp_04)+(M_transp_010*M_transp_05));                     
                F_R1_JOG_02 = String.valueOf(Res_03);
                F_Rod_01_Jog_2.setText(F_R1_JOG_02);
                
                Res_04 = ((M_transp_06*M_transp_06)+(M_transp_07*M_transp_07)+(M_transp_08*M_transp_08)+(M_transp_09*M_transp_09)+(M_transp_010*M_transp_010));                
                F_R2_JOG_02 = String.valueOf(Res_04);
                F_Rod_02_Jog_2.setText(F_R2_JOG_02);}                        
        }
        
        public void Limpar_Dados(){
                           
                sum = 0;
                x = 0;
                i = 0;
                j=0;
                i1 = 0;
                i2 = 0;
                n1 =0;
                n2 =0;
            
                for(int z=0;z==n2;z++){
                    v1[z] = 0;
                    v2[z] = 0;
                }
                                
                 M_transp_01=0;
                 M_transp_02=0;
                 M_transp_03=0;
                 M_transp_04=0;
                 M_transp_05=0;
    
                 M_transp_06=0;
                 M_transp_07=0;
                 M_transp_08=0;
                 M_transp_09=0;
                 M_transp_010=0;
    
                 Res_01=0;
                 Res_02=0;
                 Res_03=0;
                 Res_04=0;
     
                Caso_recebe=0;
                Rodadas =0;
                
                result_Jog_01 =0;
                result_Jog_02 =0;
                
                Txt_Variavel_B1.setText("");
                Txt_Conv_Binario.setText("");               
                Txt_Conv_Octal.setText("");
                Txt_Conv_Hexadecimal.setText("");
                
                A_R1_JOG_01 = String.valueOf("");
                A_R1_JOG_02 = String.valueOf("");      
                A_R2_JOG_01 = String.valueOf("");  
                A_R2_JOG_02 = String.valueOf("");       
                A_R3_JOG_01 = String.valueOf("");        
                A_R3_JOG_02 = String.valueOf("");       
                A_R4_JOG_01 = String.valueOf("");       
                A_R4_JOG_02 = String.valueOf("");       
                A_R5_JOG_01 = String.valueOf("");       
                A_R5_JOG_02 = String.valueOf("");
                                               
                MR_Rod_01_Jog_1.setText("");
                MR_Rod_02_Jog_1.setText("");
                MR_Rod_03_Jog_1.setText("");
                MR_Rod_04_Jog_1.setText("");
                MR_Rod_05_Jog_1.setText("");
                
                MR_Rod_01_Jog_2.setText("");
                MR_Rod_02_Jog_2.setText("");
                MR_Rod_03_Jog_2.setText("");
                MR_Rod_04_Jog_2.setText("");
                MR_Rod_05_Jog_2.setText("");                       
                                       
                A_Rod_01_Jog_1.setText("");
                A_Rod_02_Jog_1.setText("");
                A_Rod_03_Jog_1.setText("");
                A_Rod_04_Jog_1.setText("");
                A_Rod_05_Jog_1.setText("");
                
                A_Rod_01_Jog_2.setText("");
                A_Rod_02_Jog_2.setText("");
                A_Rod_03_Jog_2.setText("");
                A_Rod_04_Jog_2.setText("");
                A_Rod_05_Jog_2.setText("");
                
                B_Rod_01_Jog_1.setText("");
                B_Rod_02_Jog_1.setText("");
                B_Rod_03_Jog_1.setText("");
                B_Rod_04_Jog_1.setText("");
                B_Rod_05_Jog_1.setText("");
                
                B_Rod_01_Jog_2.setText("");
                B_Rod_02_Jog_2.setText("");
                B_Rod_03_Jog_2.setText("");
                B_Rod_04_Jog_2.setText("");
                B_Rod_05_Jog_2.setText("");
                
                C_Rod_01_Jog_1.setText("");
                C_Rod_02_Jog_1.setText("");
                C_Rod_03_Jog_1.setText("");
                C_Rod_04_Jog_1.setText("");
                C_Rod_05_Jog_1.setText("");
                
                C_Rod_01_Jog_2.setText("");
                C_Rod_02_Jog_2.setText("");
                C_Rod_03_Jog_2.setText("");
                C_Rod_04_Jog_2.setText("");
                C_Rod_05_Jog_2.setText("");
                
                D_Rod_01_Jog_1.setText("");
                D_Rod_02_Jog_1.setText("");
                D_Rod_03_Jog_1.setText("");
                D_Rod_04_Jog_1.setText("");
                D_Rod_05_Jog_1.setText("");
                
                D_Rod_01_Jog_2.setText("");
                D_Rod_02_Jog_2.setText("");
                D_Rod_03_Jog_2.setText("");
                D_Rod_04_Jog_2.setText("");
                D_Rod_05_Jog_2.setText("");
                
                E_Rod_01_Jog_1.setText("");
                E_Rod_02_Jog_1.setText("");
                E_Rod_03_Jog_1.setText("");
                E_Rod_04_Jog_1.setText("");
                E_Rod_05_Jog_1.setText("");
                
                E_Rod_01_Jog_2.setText("");
                E_Rod_02_Jog_2.setText("");
                E_Rod_03_Jog_2.setText("");
                E_Rod_04_Jog_2.setText("");
                E_Rod_05_Jog_2.setText("");
                
                F_Rod_01_Jog_1.setText("");
                F_Rod_02_Jog_1.setText("");               
                F_Rod_01_Jog_2.setText("");
                F_Rod_02_Jog_2.setText("");
               
                Variavel_B1();
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A_Rod_01_Jog_1;
    private javax.swing.JLabel A_Rod_01_Jog_2;
    private javax.swing.JLabel A_Rod_02_Jog_1;
    private javax.swing.JLabel A_Rod_02_Jog_2;
    private javax.swing.JLabel A_Rod_03_Jog_1;
    private javax.swing.JLabel A_Rod_03_Jog_2;
    private javax.swing.JLabel A_Rod_04_Jog_1;
    private javax.swing.JLabel A_Rod_04_Jog_2;
    private javax.swing.JLabel A_Rod_05_Jog_1;
    private javax.swing.JLabel A_Rod_05_Jog_2;
    private javax.swing.JLabel B_Rod_01_Jog_1;
    private javax.swing.JLabel B_Rod_01_Jog_2;
    private javax.swing.JLabel B_Rod_02_Jog_1;
    private javax.swing.JLabel B_Rod_02_Jog_2;
    private javax.swing.JLabel B_Rod_03_Jog_1;
    private javax.swing.JLabel B_Rod_03_Jog_2;
    private javax.swing.JLabel B_Rod_04_Jog_1;
    private javax.swing.JLabel B_Rod_04_Jog_2;
    private javax.swing.JLabel B_Rod_05_Jog_1;
    private javax.swing.JLabel B_Rod_05_Jog_2;
    private javax.swing.JLabel C_Rod_01_Jog_1;
    private javax.swing.JLabel C_Rod_01_Jog_2;
    private javax.swing.JLabel C_Rod_02_Jog_1;
    private javax.swing.JLabel C_Rod_02_Jog_2;
    private javax.swing.JLabel C_Rod_03_Jog_1;
    private javax.swing.JLabel C_Rod_03_Jog_2;
    private javax.swing.JLabel C_Rod_04_Jog_1;
    private javax.swing.JLabel C_Rod_04_Jog_2;
    private javax.swing.JLabel C_Rod_05_Jog_1;
    private javax.swing.JLabel C_Rod_05_Jog_2;
    private javax.swing.JLabel D_Rod_01_Jog_1;
    private javax.swing.JLabel D_Rod_01_Jog_2;
    private javax.swing.JLabel D_Rod_02_Jog_1;
    private javax.swing.JLabel D_Rod_02_Jog_2;
    private javax.swing.JLabel D_Rod_03_Jog_1;
    private javax.swing.JLabel D_Rod_03_Jog_2;
    private javax.swing.JLabel D_Rod_04_Jog_1;
    private javax.swing.JLabel D_Rod_04_Jog_2;
    private javax.swing.JLabel D_Rod_05_Jog_1;
    private javax.swing.JLabel D_Rod_05_Jog_2;
    private javax.swing.JLabel E_Rod_01_Jog_1;
    private javax.swing.JLabel E_Rod_01_Jog_2;
    private javax.swing.JLabel E_Rod_02_Jog_1;
    private javax.swing.JLabel E_Rod_02_Jog_2;
    private javax.swing.JLabel E_Rod_03_Jog_1;
    private javax.swing.JLabel E_Rod_03_Jog_2;
    private javax.swing.JLabel E_Rod_04_Jog_1;
    private javax.swing.JLabel E_Rod_04_Jog_2;
    private javax.swing.JLabel E_Rod_05_Jog_1;
    private javax.swing.JLabel E_Rod_05_Jog_2;
    private javax.swing.JLabel F_Rod_01_Jog_1;
    private javax.swing.JLabel F_Rod_01_Jog_2;
    private javax.swing.JLabel F_Rod_02_Jog_1;
    private javax.swing.JLabel F_Rod_02_Jog_2;
    private javax.swing.JLabel MR_Rod_01_Jog_1;
    private javax.swing.JLabel MR_Rod_01_Jog_2;
    private javax.swing.JLabel MR_Rod_02_Jog_1;
    private javax.swing.JLabel MR_Rod_02_Jog_2;
    private javax.swing.JLabel MR_Rod_03_Jog_1;
    private javax.swing.JLabel MR_Rod_03_Jog_2;
    private javax.swing.JLabel MR_Rod_04_Jog_1;
    private javax.swing.JLabel MR_Rod_04_Jog_2;
    private javax.swing.JLabel MR_Rod_05_Jog_1;
    private javax.swing.JLabel MR_Rod_05_Jog_2;
    private javax.swing.JPanel Matriz_A;
    private javax.swing.JPanel Matriz_B;
    private javax.swing.JPanel Matriz_C;
    private javax.swing.JPanel Matriz_D;
    private javax.swing.JPanel Matriz_E;
    private javax.swing.JPanel Matriz_F;
    private javax.swing.JPanel Matriz_Resultado;
    private javax.swing.JPanel Painel_Geral;
    private javax.swing.JLabel Txt_Conv_Binario;
    private javax.swing.JLabel Txt_Conv_Hexadecimal;
    private javax.swing.JLabel Txt_Conv_Octal;
    private javax.swing.JLabel Txt_Jogador10;
    private javax.swing.JLabel Txt_Jogador11;
    private javax.swing.JLabel Txt_Jogador12;
    private javax.swing.JLabel Txt_Jogador13;
    private javax.swing.JLabel Txt_Jogador14;
    private javax.swing.JLabel Txt_Jogador15;
    private javax.swing.JLabel Txt_Jogador16;
    private javax.swing.JLabel Txt_Jogador17;
    private javax.swing.JLabel Txt_Jogador18;
    private javax.swing.JLabel Txt_Jogador2;
    private javax.swing.JLabel Txt_Jogador3;
    private javax.swing.JLabel Txt_Jogador4;
    private javax.swing.JLabel Txt_Jogador5;
    private javax.swing.JLabel Txt_Jogador9;
    private javax.swing.JLabel Txt_Jogadores1;
    private javax.swing.JLabel Txt_Jogadores2;
    private javax.swing.JLabel Txt_Jogadores4;
    private javax.swing.JLabel Txt_Jogadores5;
    private javax.swing.JLabel Txt_Jogadores6;
    private javax.swing.JLabel Txt_Jogadores7;
    private javax.swing.JLabel Txt_Jogadores8;
    private javax.swing.JLabel Txt_Rod_10;
    private javax.swing.JLabel Txt_Rod_11;
    private javax.swing.JLabel Txt_Rod_17;
    private javax.swing.JLabel Txt_Rod_18;
    private javax.swing.JLabel Txt_Rod_19;
    private javax.swing.JLabel Txt_Rod_2;
    private javax.swing.JLabel Txt_Rod_20;
    private javax.swing.JLabel Txt_Rod_21;
    private javax.swing.JLabel Txt_Rod_22;
    private javax.swing.JLabel Txt_Rod_23;
    private javax.swing.JLabel Txt_Rod_24;
    private javax.swing.JLabel Txt_Rod_25;
    private javax.swing.JLabel Txt_Rod_26;
    private javax.swing.JLabel Txt_Rod_27;
    private javax.swing.JLabel Txt_Rod_28;
    private javax.swing.JLabel Txt_Rod_29;
    private javax.swing.JLabel Txt_Rod_3;
    private javax.swing.JLabel Txt_Rod_30;
    private javax.swing.JLabel Txt_Rod_31;
    private javax.swing.JLabel Txt_Rod_32;
    private javax.swing.JLabel Txt_Rod_33;
    private javax.swing.JLabel Txt_Rod_34;
    private javax.swing.JLabel Txt_Rod_35;
    private javax.swing.JLabel Txt_Rod_36;
    private javax.swing.JLabel Txt_Rod_37;
    private javax.swing.JLabel Txt_Rod_38;
    private javax.swing.JLabel Txt_Rod_4;
    private javax.swing.JLabel Txt_Rod_5;
    private javax.swing.JLabel Txt_Rod_6;
    private javax.swing.JLabel Txt_Rod_7;
    private javax.swing.JLabel Txt_Rod_8;
    private javax.swing.JLabel Txt_Rod_9;
    private javax.swing.JLabel Txt_Variavel_B1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
