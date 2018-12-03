
package Presentation;

import Business.BusinessFacade;
import EDA.Personagem;
import EDA.Usuario;

/**
 * @author Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class TelaStatus extends javax.swing.JFrame {
    Usuario usuarioLogado = BusinessFacade.getUsuarioLogado();
    Personagem personagem = usuarioLogado.getPersonagem();
    int xPlayer;
    int yPlayer;

    public TelaStatus(int xPlayer, int yPlayer) {
        initComponents();
        this.xPlayer = xPlayer;
        this.yPlayer = yPlayer;
        atualizaLabel();
        if(personagem.getXp() > (personagem.getLvl() * 100)){
            personagem.setLvl(personagem.getLvl() + 1);
            personagem.setSkillpoints(personagem.getSkillpoints() + 1);
        }
        botoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        labelLvl = new javax.swing.JLabel();
        labelHp = new javax.swing.JLabel();
        labelAtk = new javax.swing.JLabel();
        labelXP = new javax.swing.JLabel();
        labelMoedas = new javax.swing.JLabel();
        labelDES = new javax.swing.JLabel();
        labelINT = new javax.swing.JLabel();
        labelVIT = new javax.swing.JLabel();
        labelFOR = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        buttonUparFOR = new javax.swing.JButton();
        buttonUparDES = new javax.swing.JButton();
        buttonUparINT = new javax.swing.JButton();
        buttonUparVIT = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 530));
        setPreferredSize(new java.awt.Dimension(600, 530));
        getContentPane().setLayout(null);

        labelNome.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelNome.setText("Gilberto");
        getContentPane().add(labelNome);
        labelNome.setBounds(150, 60, 140, 50);

        labelLvl.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        labelLvl.setText("0");
        getContentPane().add(labelLvl);
        labelLvl.setBounds(150, 130, 50, 50);

        labelHp.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        labelHp.setText("0");
        getContentPane().add(labelHp);
        labelHp.setBounds(100, 200, 50, 50);

        labelAtk.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        labelAtk.setText("0");
        getContentPane().add(labelAtk);
        labelAtk.setBounds(180, 270, 50, 50);

        labelXP.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        labelXP.setText("0");
        getContentPane().add(labelXP);
        labelXP.setBounds(110, 350, 50, 50);

        labelMoedas.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        labelMoedas.setText("0");
        getContentPane().add(labelMoedas);
        labelMoedas.setBounds(190, 410, 50, 50);

        labelDES.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        labelDES.setText("0");
        getContentPane().add(labelDES);
        labelDES.setBounds(440, 160, 50, 50);

        labelINT.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        labelINT.setText("0");
        getContentPane().add(labelINT);
        labelINT.setBounds(440, 250, 50, 50);

        labelVIT.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        labelVIT.setText("0");
        labelVIT.setToolTipText("");
        getContentPane().add(labelVIT);
        labelVIT.setBounds(440, 340, 50, 50);

        labelFOR.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        labelFOR.setText("0");
        getContentPane().add(labelFOR);
        labelFOR.setBounds(440, 70, 50, 50);

        voltar.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        voltar.setText("Voltar");
        voltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        voltar.setContentAreaFilled(false);
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(330, 420, 240, 50);

        buttonUparFOR.setFont(new java.awt.Font("Coolvetica Rg", 0, 14)); // NOI18N
        buttonUparFOR.setText("Upar");
        buttonUparFOR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonUparFOR.setContentAreaFilled(false);
        buttonUparFOR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonUparFOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUparFORActionPerformed(evt);
            }
        });
        getContentPane().add(buttonUparFOR);
        buttonUparFOR.setBounds(490, 80, 80, 30);

        buttonUparDES.setFont(new java.awt.Font("Coolvetica Rg", 0, 14)); // NOI18N
        buttonUparDES.setText("Upar");
        buttonUparDES.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonUparDES.setContentAreaFilled(false);
        buttonUparDES.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonUparDES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUparDESActionPerformed(evt);
            }
        });
        getContentPane().add(buttonUparDES);
        buttonUparDES.setBounds(490, 170, 80, 30);

        buttonUparINT.setFont(new java.awt.Font("Coolvetica Rg", 0, 14)); // NOI18N
        buttonUparINT.setText("Upar");
        buttonUparINT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonUparINT.setContentAreaFilled(false);
        buttonUparINT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonUparINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUparINTActionPerformed(evt);
            }
        });
        getContentPane().add(buttonUparINT);
        buttonUparINT.setBounds(490, 260, 80, 30);

        buttonUparVIT.setFont(new java.awt.Font("Coolvetica Rg", 0, 14)); // NOI18N
        buttonUparVIT.setText("Upar");
        buttonUparVIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonUparVIT.setContentAreaFilled(false);
        buttonUparVIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUparVITActionPerformed(evt);
            }
        });
        getContentPane().add(buttonUparVIT);
        buttonUparVIT.setBounds(490, 350, 80, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backStatus.jpg"))); // NOI18N
        background.setToolTipText("");
        getContentPane().add(background);
        background.setBounds(0, 0, 600, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        TelaMundo tela = new TelaMundo(xPlayer, yPlayer);
        Main.abrir(tela);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void buttonUparFORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUparFORActionPerformed
        personagem.upar(1);
        atualizaLabel();
        botoes();
    }//GEN-LAST:event_buttonUparFORActionPerformed

    private void buttonUparDESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUparDESActionPerformed
        personagem.upar(2);
        atualizaLabel();
        botoes();
    }//GEN-LAST:event_buttonUparDESActionPerformed

    private void buttonUparINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUparINTActionPerformed
        personagem.upar(3);
        atualizaLabel();
        botoes();
    }//GEN-LAST:event_buttonUparINTActionPerformed

    private void buttonUparVITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUparVITActionPerformed
        personagem.upar(4);
        atualizaLabel();
        botoes();
    }//GEN-LAST:event_buttonUparVITActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonUparDES;
    private javax.swing.JButton buttonUparFOR;
    private javax.swing.JButton buttonUparINT;
    private javax.swing.JButton buttonUparVIT;
    private javax.swing.JLabel labelAtk;
    private javax.swing.JLabel labelDES;
    private javax.swing.JLabel labelFOR;
    private javax.swing.JLabel labelHp;
    private javax.swing.JLabel labelINT;
    private javax.swing.JLabel labelLvl;
    private javax.swing.JLabel labelMoedas;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelVIT;
    private javax.swing.JLabel labelXP;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

//========== MÉTODOS ===========================================================
    
    /**
     * Gerencia os botões de evolução de habilidades.
     */
    public void botoes(){
        if(personagem.getSkillpoints() > 0){
            buttonUparDES.setEnabled(true);
            buttonUparFOR.setEnabled(true);
            buttonUparINT.setEnabled(true);
            buttonUparVIT.setEnabled(true);
        } else {
            buttonUparDES.setEnabled(false);
            buttonUparFOR.setEnabled(false);
            buttonUparINT.setEnabled(false);
            buttonUparVIT.setEnabled(false);
        }        
    }
    
    /**
     * Atualiza as informações dos labels relacionados às informações do
     * personagem.
     */
    public void atualizaLabel(){
        labelHp.setText(Integer.toString(personagem.getHp()));
        labelDES.setText(Integer.toString(personagem.getDestreza()));
        labelFOR.setText(Integer.toString(personagem.getForca()));
        labelINT.setText(Integer.toString(personagem.getInteligencia()));
        labelVIT.setText(Integer.toString(personagem.getVitalidade()));
        labelLvl.setText(Integer.toString(personagem.getLvl()));
        labelMoedas.setText(Integer.toString(personagem.getDinheiro()));
        labelNome.setText(personagem.getNome());
        labelXP.setText("" + personagem.getXp());
        labelAtk.setText("" + personagem.getAtk());
    }
    
}
