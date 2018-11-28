
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
        buttonComecar = new javax.swing.JButton();
        buttonCriar = new javax.swing.JButton();
        labelHP = new javax.swing.JLabel();
        labelMoedas = new javax.swing.JLabel();
        labelINT = new javax.swing.JLabel();
        labelFOR = new javax.swing.JLabel();
        labelVIT = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelDES = new javax.swing.JLabel();
        labelLevel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Regalia Free", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ops");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 667));
        setPreferredSize(new java.awt.Dimension(1000, 667));
        setResizable(false);
        getContentPane().setLayout(null);

        buttonComecar.setBackground(new java.awt.Color(0, 0, 0));
        buttonComecar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        buttonComecar.setForeground(new java.awt.Color(255, 255, 255));
        buttonComecar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonComecar.setContentAreaFilled(false);
        buttonComecar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonComecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonComecarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonComecar);
        buttonComecar.setBounds(570, 490, 240, 70);

        buttonCriar.setBackground(new java.awt.Color(0, 0, 0));
        buttonCriar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        buttonCriar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCriar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonCriar.setContentAreaFilled(false);
        buttonCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCriarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCriar);
        buttonCriar.setBounds(70, 490, 410, 70);

        labelHP.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelHP.setText("ops");
        getContentPane().add(labelHP);
        labelHP.setBounds(370, 260, 120, 40);

        labelMoedas.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelMoedas.setText("ops");
        getContentPane().add(labelMoedas);
        labelMoedas.setBounds(370, 360, 120, 40);

        labelINT.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelINT.setText("ops");
        getContentPane().add(labelINT);
        labelINT.setBounds(900, 260, 60, 40);

        labelFOR.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelFOR.setText("ops");
        getContentPane().add(labelFOR);
        labelFOR.setBounds(900, 60, 60, 40);

        labelVIT.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelVIT.setText("ops");
        getContentPane().add(labelVIT);
        labelVIT.setBounds(900, 360, 60, 40);

        labelNome.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelNome.setText("ops");
        getContentPane().add(labelNome);
        labelNome.setBounds(370, 60, 160, 40);

        labelDES.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelDES.setText("ops");
        getContentPane().add(labelDES);
        labelDES.setBounds(900, 160, 60, 40);

        labelLevel.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelLevel.setText("ops");
        getContentPane().add(labelLevel);
        labelLevel.setBounds(370, 160, 120, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/les4.jpg"))); // NOI18N
        background.setText("jLabel19");
        getContentPane().add(background);
        background.setBounds(0, 0, 1000, 667);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCriarActionPerformed
        TelaCriacaoPersonagem telacripe = new TelaCriacaoPersonagem();
        Main.abrir(telacripe);
        this.dispose();
    }//GEN-LAST:event_buttonCriarActionPerformed

    private void buttonComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonComecarActionPerformed
        TelaMundo tela = new TelaMundo(0,0);
        Main.abrir(tela);
        this.dispose();
    }//GEN-LAST:event_buttonComecarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonComecar;
    private javax.swing.JButton buttonCriar;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel labelDES;
    private javax.swing.JLabel labelFOR;
    private javax.swing.JLabel labelHP;
    private javax.swing.JLabel labelINT;
    private javax.swing.JLabel labelLevel;
    private javax.swing.JLabel labelMoedas;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelVIT;
    // End of variables declaration//GEN-END:variables
}