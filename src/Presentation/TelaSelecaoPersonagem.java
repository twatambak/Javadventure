
package Presentation;

import Business.BusinessFacade;
import EDA.Usuario;

/**
 * @author pixel
 */

public class TelaSelecaoPersonagem extends javax.swing.JFrame {
    Usuario usuarioLogado = BusinessFacade.getUsuarioLogado();
    
    public TelaSelecaoPersonagem() {
        initComponents();
        labelAtaque.setText(Integer.toString(usuarioLogado.getPersonagem().getAtk()));
        labelHP.setText(Integer.toString(usuarioLogado.getPersonagem().getHp()));
        labelDES.setText(Integer.toString(usuarioLogado.getPersonagem().getDestreza()));
        labelFOR.setText(Integer.toString(usuarioLogado.getPersonagem().getForca()));
        labelINT.setText(Integer.toString(usuarioLogado.getPersonagem().getInteligencia()));
        labelVIT.setText(Integer.toString(usuarioLogado.getPersonagem().getVitalidade()));
        labelLevel.setText(Integer.toString(usuarioLogado.getPersonagem().getLvl()));
        labelMoedas.setText(Integer.toString(usuarioLogado.getPersonagem().getDinheiro()));
        labelNome.setText(usuarioLogado.getPersonagem().getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        labelInfoTitulo = new javax.swing.JLabel();
        buttonComecar = new javax.swing.JButton();
        labelInfoNome = new javax.swing.JLabel();
        labelInfoAtaque = new javax.swing.JLabel();
        buttonCriar = new javax.swing.JButton();
        labelInfoHP = new javax.swing.JLabel();
        labelHP = new javax.swing.JLabel();
        labelInfoMoedas = new javax.swing.JLabel();
        labelInfoDES = new javax.swing.JLabel();
        labelInfoVIT = new javax.swing.JLabel();
        labelInfoINT = new javax.swing.JLabel();
        labelMoedas = new javax.swing.JLabel();
        labelINT = new javax.swing.JLabel();
        labelInfoFOR = new javax.swing.JLabel();
        labelFOR = new javax.swing.JLabel();
        labelVIT = new javax.swing.JLabel();
        labelAtaque = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelDES = new javax.swing.JLabel();
        labelInfoLevel = new javax.swing.JLabel();
        labelLevel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Regalia Free", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ops");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(590, 430));
        setResizable(false);
        getContentPane().setLayout(null);

        labelInfoTitulo.setFont(new java.awt.Font("Regalia Free", 0, 60)); // NOI18N
        labelInfoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInfoTitulo.setText("Personagem");
        getContentPane().add(labelInfoTitulo);
        labelInfoTitulo.setBounds(0, 10, 590, 56);

        buttonComecar.setBackground(new java.awt.Color(0, 0, 0));
        buttonComecar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        buttonComecar.setForeground(new java.awt.Color(255, 255, 255));
        buttonComecar.setText("Começar");
        buttonComecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonComecarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonComecar);
        buttonComecar.setBounds(400, 270, 120, 27);

        labelInfoNome.setFont(new java.awt.Font("Regalia Free", 0, 30)); // NOI18N
        labelInfoNome.setText("Nome:");
        getContentPane().add(labelInfoNome);
        labelInfoNome.setBounds(20, 100, 110, 30);

        labelInfoAtaque.setFont(new java.awt.Font("Regalia Free", 0, 30)); // NOI18N
        labelInfoAtaque.setText("Ataque:");
        getContentPane().add(labelInfoAtaque);
        labelInfoAtaque.setBounds(180, 180, 110, 31);

        buttonCriar.setBackground(new java.awt.Color(0, 0, 0));
        buttonCriar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        buttonCriar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCriar.setText("Criar novo personagem");
        buttonCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCriarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCriar);
        buttonCriar.setBounds(150, 270, 200, 30);

        labelInfoHP.setFont(new java.awt.Font("Regalia Free", 0, 30)); // NOI18N
        labelInfoHP.setText("HP:");
        getContentPane().add(labelInfoHP);
        labelInfoHP.setBounds(20, 250, 60, 50);

        labelHP.setFont(new java.awt.Font("Regalia Free", 0, 20)); // NOI18N
        labelHP.setText("ops");
        getContentPane().add(labelHP);
        labelHP.setBounds(20, 290, 119, 25);

        labelInfoMoedas.setFont(new java.awt.Font("Regalia Free", 0, 30)); // NOI18N
        labelInfoMoedas.setText("Moedas:");
        getContentPane().add(labelInfoMoedas);
        labelInfoMoedas.setBounds(180, 100, 140, 31);

        labelInfoDES.setFont(new java.awt.Font("Regalia Free", 0, 30)); // NOI18N
        labelInfoDES.setText("DES:");
        getContentPane().add(labelInfoDES);
        labelInfoDES.setBounds(460, 100, 60, 30);

        labelInfoVIT.setFont(new java.awt.Font("Regalia Free", 0, 30)); // NOI18N
        labelInfoVIT.setText("VIT:");
        getContentPane().add(labelInfoVIT);
        labelInfoVIT.setBounds(460, 180, 60, 30);

        labelInfoINT.setFont(new java.awt.Font("Regalia Free", 0, 30)); // NOI18N
        labelInfoINT.setText("INT:");
        getContentPane().add(labelInfoINT);
        labelInfoINT.setBounds(350, 180, 60, 30);

        labelMoedas.setFont(new java.awt.Font("Regalia Free", 0, 20)); // NOI18N
        labelMoedas.setText("ops");
        getContentPane().add(labelMoedas);
        labelMoedas.setBounds(180, 130, 119, 25);

        labelINT.setFont(new java.awt.Font("Regalia Free", 0, 20)); // NOI18N
        labelINT.setText("ops");
        getContentPane().add(labelINT);
        labelINT.setBounds(350, 210, 70, 25);

        labelInfoFOR.setFont(new java.awt.Font("Regalia Free", 0, 30)); // NOI18N
        labelInfoFOR.setText("FOR:");
        getContentPane().add(labelInfoFOR);
        labelInfoFOR.setBounds(350, 100, 61, 30);

        labelFOR.setFont(new java.awt.Font("Regalia Free", 0, 20)); // NOI18N
        labelFOR.setText("ops");
        getContentPane().add(labelFOR);
        labelFOR.setBounds(350, 130, 72, 25);

        labelVIT.setFont(new java.awt.Font("Regalia Free", 0, 20)); // NOI18N
        labelVIT.setText("ops");
        getContentPane().add(labelVIT);
        labelVIT.setBounds(460, 210, 80, 25);

        labelAtaque.setFont(new java.awt.Font("Regalia Free", 0, 20)); // NOI18N
        labelAtaque.setText("ops");
        getContentPane().add(labelAtaque);
        labelAtaque.setBounds(180, 210, 72, 25);

        labelNome.setFont(new java.awt.Font("Regalia Free", 0, 20)); // NOI18N
        labelNome.setText("ops");
        getContentPane().add(labelNome);
        labelNome.setBounds(20, 130, 72, 25);

        labelDES.setFont(new java.awt.Font("Regalia Free", 0, 20)); // NOI18N
        labelDES.setText("ops");
        getContentPane().add(labelDES);
        labelDES.setBounds(460, 130, 80, 20);

        labelInfoLevel.setFont(new java.awt.Font("Regalia Free", 0, 30)); // NOI18N
        labelInfoLevel.setText("Level:");
        getContentPane().add(labelInfoLevel);
        labelInfoLevel.setBounds(20, 180, 100, 31);

        labelLevel.setFont(new java.awt.Font("Regalia Free", 0, 20)); // NOI18N
        labelLevel.setText("ops");
        getContentPane().add(labelLevel);
        labelLevel.setBounds(20, 210, 72, 25);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backgroundSelecaoPersonagem.jpg"))); // NOI18N
        background.setText("jLabel19");
        getContentPane().add(background);
        background.setBounds(0, 0, 590, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCriarActionPerformed
        TelaCriacaoPersonagem telacripe = new TelaCriacaoPersonagem();
        Main.abrir(telacripe);
        this.dispose();
    }//GEN-LAST:event_buttonCriarActionPerformed

    private void buttonComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonComecarActionPerformed
        TelaMundo tela = new TelaMundo();
        Main.abrir(tela);
        this.dispose();
    }//GEN-LAST:event_buttonComecarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonComecar;
    private javax.swing.JButton buttonCriar;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel labelAtaque;
    private javax.swing.JLabel labelDES;
    private javax.swing.JLabel labelFOR;
    private javax.swing.JLabel labelHP;
    private javax.swing.JLabel labelINT;
    private javax.swing.JLabel labelInfoAtaque;
    private javax.swing.JLabel labelInfoDES;
    private javax.swing.JLabel labelInfoFOR;
    private javax.swing.JLabel labelInfoHP;
    private javax.swing.JLabel labelInfoINT;
    private javax.swing.JLabel labelInfoLevel;
    private javax.swing.JLabel labelInfoMoedas;
    private javax.swing.JLabel labelInfoNome;
    private javax.swing.JLabel labelInfoTitulo;
    private javax.swing.JLabel labelInfoVIT;
    private javax.swing.JLabel labelLevel;
    private javax.swing.JLabel labelMoedas;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelVIT;
    // End of variables declaration//GEN-END:variables
}