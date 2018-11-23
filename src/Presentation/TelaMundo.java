
package Presentation;

import Business.BusinessFacade;
import EDA.Usuario;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class TelaMundo extends javax.swing.JFrame {
    Usuario usuarioLogado = BusinessFacade.getUsuarioLogado();
    static int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
    String cima = "cima";
    String baixo = "baixo";
    String esquerda = "esquerda";
    String direita = "direita";
    
    public TelaMundo() {
        initComponents();
        
        if(player.getLocation() == monstro.getLocation()){
            TelaBatalha tela = new TelaBatalha();
            Main.abrir(tela);
            this.dispose();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        player = new javax.swing.JLabel();
        monstro = new javax.swing.JLabel();

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
        monstro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/capivara.jpg"))); // NOI18N
        monstro.setToolTipText("");
        monstro.setFocusable(false);
        monstro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                monstroKeyPressed(evt);
            }
        });
        getContentPane().add(monstro);
        monstro.setBounds(-100, 0, 860, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monstroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monstroKeyPressed

    }//GEN-LAST:event_monstroKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        switch (evt.getKeyChar()) {
            case 'w':
                {
                    int x = player.getX();
                    int y = player.getY();
                    for(int i = 0; i < 10; i++){
                        player.setLocation(x, y - i);
                    }       break;
                }
            case 's':
                {
                    int x = player.getX();
                    int y = player.getY();
                    for(int i = 0; i < 10; i++){
                        player.setLocation(x, y + i);
                    }       break;
                }
            case 'a':
                {
                    int x = player.getX();
                    int y = player.getY();
                    for(int i = 0; i < 10; i++){
                        player.setLocation(x - i, y);
                    }       break;
                }
            case 'd':
                {
                    int x = player.getX();
                    int y = player.getY();
                    for(int i = 0; i < 10; i++){
                        player.setLocation(x + i, y);
                    }       break;
                }
            default:
                break;
        }
        

    }//GEN-LAST:event_formKeyPressed

    private void playerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_playerKeyPressed
        
    }//GEN-LAST:event_playerKeyPressed

    public void encontroBatalha(){
        if(player.getX() == monstro.getX() && player.getY() == monstro.getY()){
            TelaBatalha tela = new TelaBatalha();
            Main.abrir(tela);
            this.dispose();
        }    
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel monstro;
    private javax.swing.JLabel player;
    // End of variables declaration//GEN-END:variables
    
}



