
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
        
        player.getInputMap(IFW).put(KeyStroke.getKeyStroke("W"), cima);
        player.getActionMap().put(cima, new Movimento(player, 10, "w"));
        
        player.getInputMap(IFW).put(KeyStroke.getKeyStroke("S"), baixo);
        player.getActionMap().put(baixo, new Movimento(player, 10, "s"));
        
        player.getInputMap(IFW).put(KeyStroke.getKeyStroke("A"), esquerda);
        player.getActionMap().put(cima, new Movimento(player, 10, "a"));
        
        player.getInputMap(IFW).put(KeyStroke.getKeyStroke("D"), direita);
        player.getActionMap().put(cima, new Movimento(player,  10, "d"));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        player = new javax.swing.JLabel();
        buttonCima = new javax.swing.JButton();
        buttonEsquerda = new javax.swing.JButton();
        buttonBaixo = new javax.swing.JButton();
        buttonDireita = new javax.swing.JButton();
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
        player.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                playerKeyPressed(evt);
            }
        });
        getContentPane().add(player);
        player.setBounds(150, 80, 60, 160);

        buttonCima.setText("Cima");
        buttonCima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCimaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCima);
        buttonCima.setBounds(540, 330, 80, 23);

        buttonEsquerda.setText("Esquerda");
        buttonEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEsquerdaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEsquerda);
        buttonEsquerda.setBounds(470, 360, 80, 23);

        buttonBaixo.setText("Baixo");
        buttonBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBaixoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonBaixo);
        buttonBaixo.setBounds(550, 390, 59, 23);

        buttonDireita.setText("Direito");
        buttonDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDireitaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonDireita);
        buttonDireita.setBounds(610, 360, 63, 23);

        monstro.setFont(new java.awt.Font("Imaginary Forces", 0, 100)); // NOI18N
        monstro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/capivara.jpg"))); // NOI18N
        monstro.setToolTipText("");
        monstro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                monstroKeyPressed(evt);
            }
        });
        getContentPane().add(monstro);
        monstro.setBounds(-100, 0, 860, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCimaActionPerformed

    }//GEN-LAST:event_buttonCimaActionPerformed

    private void buttonEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEsquerdaActionPerformed
        int x = player.getX();
        int y = player.getY();
        for(int i = 0; i < 10; i++){
            player.setLocation(x - i, y);
            encontroBatalha();
        }
    }//GEN-LAST:event_buttonEsquerdaActionPerformed

    private void buttonBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBaixoActionPerformed
        int x = player.getX();
        int y = player.getY();
        for(int i = 0; i < 10; i++){
            player.setLocation(x, y + i);
            encontroBatalha();
        }
    }//GEN-LAST:event_buttonBaixoActionPerformed

    private void buttonDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDireitaActionPerformed
        int x = player.getX();
        int y = player.getY();
        for(int i = 0; i < 10; i++){
            player.setLocation(x + i, y);
            encontroBatalha();
        }
    }//GEN-LAST:event_buttonDireitaActionPerformed

    private void monstroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monstroKeyPressed

    }//GEN-LAST:event_monstroKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
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
    private javax.swing.JButton buttonBaixo;
    private javax.swing.JButton buttonCima;
    private javax.swing.JButton buttonDireita;
    private javax.swing.JButton buttonEsquerda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel monstro;
    private javax.swing.JLabel player;
    // End of variables declaration//GEN-END:variables

    private class Movimento extends AbstractAction{
        JLabel player;
        int dist;
        String direcao;
        int x;
        int y;

        Movimento(JLabel player, int dist, String direcao){
            this.player = player;
            this.dist = dist;
            this.direcao = direcao;
            x = player.getX();
            y = player.getY();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(direcao.equalsIgnoreCase("w")){
                player.setLocation(x, y - 1);
            } else if(direcao.equalsIgnoreCase("s")){
                player.setLocation(x, y + 1);
            } else if(direcao.equalsIgnoreCase("d")){
                player.setLocation(x + 1, y);
            } else if(direcao.equalsIgnoreCase("a")){
                player.setLocation(x - 1, y);
            }
        }

    }
    
}



