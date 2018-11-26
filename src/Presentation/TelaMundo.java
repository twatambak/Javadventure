
package Presentation;

import Business.BusinessFacade;
import EDA.Personagem;
import EDA.Usuario;
import java.awt.Component;
import java.awt.event.ActionEvent;
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
    
    public TelaMundo() {
        initComponents();
        

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        player = new javax.swing.JLabel();
        monstro = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        player.setFont(new java.awt.Font("Imaginary Forces", 0, 100)); // NOI18N
        player.setText("E");
        player.setFocusable(false);
        player.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                playerKeyPressed(evt);
            }
        });
        getContentPane().add(player);
        player.setBounds(150, 80, 60, 160);

        monstro.setFont(new java.awt.Font("Imaginary Forces", 0, 100)); // NOI18N
        monstro.setText("[");
        getContentPane().add(monstro);
        monstro.setBounds(310, 100, 109, 150);

        jButton1.setText("jButton1");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 380, 73, 23);

        background.setFont(new java.awt.Font("Imaginary Forces", 0, 100)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/capivara.jpg"))); // NOI18N
        background.setToolTipText("");
        background.setFocusable(false);
        background.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backgroundKeyPressed(evt);
            }
        });
        getContentPane().add(background);
        background.setBounds(-100, 0, 860, 570);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, personagem.getArma());
    }//GEN-LAST:event_jButton1ActionPerformed

    public void encontroBatalha(){
        
        if(player.getX() == monstro.getX() && player.getY() == monstro.getY()){
            JOptionPane.showMessageDialog(null, "Fala carai");
            TelaBatalha tela = new TelaBatalha();
            Main.abrir(tela);
            this.dispose();
        }    
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel monstro;
    private javax.swing.JLabel player;
    // End of variables declaration//GEN-END:variables
    
}



