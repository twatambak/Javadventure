
package Presentation;

import Business.BusinessFacade;
import EDA.Monstro;
import EDA.Personagem;
import EDA.Usuario;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class TelaMundo extends javax.swing.JFrame {
    Usuario usuarioLogado = BusinessFacade.getUsuarioLogado();
    Personagem personagem = usuarioLogado.getPersonagem();
    static int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
    String cima = "cima";
    String baixo = "baixo";
    String esquerda = "esquerda";
    String direita = "direita";
    
    public TelaMundo(int x, int y) {
        initComponents();
        this.setFocusable(true);
        player.setLocation(x, y);
        player.setIcon(personagem.getAparencia());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonStatus = new javax.swing.JButton();
        buttonInvent = new javax.swing.JButton();
        buttonLoja = new javax.swing.JButton();
        player = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        buttonStatus.setText("Checar status");
        buttonStatus.setFocusable(false);
        buttonStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStatusActionPerformed(evt);
            }
        });
        getContentPane().add(buttonStatus);
        buttonStatus.setBounds(1130, 660, 120, 23);

        buttonInvent.setText("Inventário");
        buttonInvent.setFocusable(false);
        buttonInvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInventActionPerformed(evt);
            }
        });
        getContentPane().add(buttonInvent);
        buttonInvent.setBounds(1130, 620, 120, 23);

        buttonLoja.setText("Loja");
        buttonLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLojaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLoja);
        buttonLoja.setBounds(1130, 580, 120, 23);

        player.setFont(new java.awt.Font("Imaginary Forces", 0, 100)); // NOI18N
        player.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Personagem1.png"))); // NOI18N
        player.setFocusable(false);
        player.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                playerKeyPressed(evt);
            }
        });
        getContentPane().add(player);
        player.setBounds(600, 270, 210, 430);

        background.setFont(new java.awt.Font("Imaginary Forces", 0, 100)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chao.png"))); // NOI18N
        background.setToolTipText("");
        background.setFocusable(false);
        background.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backgroundKeyPressed(evt);
            }
        });
        getContentPane().add(background);
        background.setBounds(0, -10, 1380, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backgroundKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backgroundKeyPressed

    }//GEN-LAST:event_backgroundKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       int x = player.getX();
       int y = player.getY();
       int tal = 10;
       
       switch (evt.getKeyChar()) {
            case 'w':
                player.setLocation(x, y - tal);
                encontroBatalha();
                break;
            case 's':
                player.setLocation(x, y + tal);
                encontroBatalha();
                break;
            case 'a':
                player.setLocation(x - tal, y);
                encontroBatalha();
                break;
            case 'd':
                player.setLocation(x + tal, y);
                encontroBatalha();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_formKeyPressed

    private void playerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_playerKeyPressed
        
    }//GEN-LAST:event_playerKeyPressed

    private void buttonStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStatusActionPerformed
       TelaStatus tela = new TelaStatus(player.getX(), player.getY());
       Main.abrir(tela);
       this.dispose();
    }//GEN-LAST:event_buttonStatusActionPerformed

    private void buttonInventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInventActionPerformed
       TelaInventario tela = new TelaInventario(player.getX(), player.getY());
       Main.abrir(tela);
       this.dispose();
    }//GEN-LAST:event_buttonInventActionPerformed

    private void buttonLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLojaActionPerformed
        TelaLoja tela = new TelaLoja(player.getX(), player.getY());
        Main.abrir(tela);
        this.dispose();
    }//GEN-LAST:event_buttonLojaActionPerformed

    public void encontroBatalha(){
        Random x = new Random();
        switch(x.nextInt(10)){
            case 1:
                TelaBatalha tela = new TelaBatalha(new Monstro(personagem.getLvl()), player.getX(), player.getY());
                Main.abrir(tela);
                this.dispose();
            default:
                break;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonInvent;
    private javax.swing.JButton buttonLoja;
    private javax.swing.JButton buttonStatus;
    private javax.swing.JLabel player;
    // End of variables declaration//GEN-END:variables
    
}



