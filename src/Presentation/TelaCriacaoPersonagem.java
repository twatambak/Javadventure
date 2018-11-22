
package Presentation;

import Business.BusinessFacade;
import EDA.Personagem;
import EDA.Usuario;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JSpinner;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class TelaCriacaoPersonagem extends javax.swing.JFrame {
    int skillpoints = 20;
    Usuario usuarioLogado = BusinessFacade.getUsuarioLogado();       

    public TelaCriacaoPersonagem() {
        initComponents();
        if(BusinessFacade.getUsuarioLogado().getPersonagem() == null){
            buttonVoltar.setEnabled(false);
        } else {
            buttonVoltar.setEnabled(true);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spinnerForca = new javax.swing.JSpinner();
        spinnerInteligencia = new javax.swing.JSpinner();
        spinnerDestreza = new javax.swing.JSpinner();
        spinnerVitalidade = new javax.swing.JSpinner();
        inputNome = new javax.swing.JTextField();
        buttonCriar = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Javadventure: Criação de Personagens");
        setMaximumSize(new java.awt.Dimension(1000, 685));
        setMinimumSize(new java.awt.Dimension(1000, 685));
        setPreferredSize(new java.awt.Dimension(1000, 685));
        setResizable(false);
        getContentPane().setLayout(null);

        spinnerForca.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        spinnerForca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spinnerForcaMouseClicked(evt);
            }
        });
        getContentPane().add(spinnerForca);
        spinnerForca.setBounds(330, 190, 70, 40);

        spinnerInteligencia.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        getContentPane().add(spinnerInteligencia);
        spinnerInteligencia.setBounds(330, 390, 70, 40);

        spinnerDestreza.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        getContentPane().add(spinnerDestreza);
        spinnerDestreza.setBounds(330, 290, 70, 40);

        spinnerVitalidade.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        getContentPane().add(spinnerVitalidade);
        spinnerVitalidade.setBounds(330, 490, 70, 40);

        inputNome.setBackground(new java.awt.Color(0, 0, 0));
        inputNome.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        inputNome.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(inputNome);
        inputNome.setBounds(170, 90, 360, 40);

        buttonCriar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonCriar.setContentAreaFilled(false);
        buttonCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCriarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCriar);
        buttonCriar.setBounds(680, 570, 150, 70);

        buttonVoltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonVoltar.setContentAreaFilled(false);
        buttonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonVoltar);
        buttonVoltar.setBounds(120, 570, 150, 70);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/les3.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background);
        background.setBounds(0, 0, 1000, 667);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Evento criado por engano.
     * @param evt 
     */
    private void spinnerForcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spinnerForcaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_spinnerForcaMouseClicked

    private void buttonCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCriarActionPerformed
        String nome = inputNome.getText();
        int forca = (Integer) spinnerForca.getValue();
        int inteligencia = (Integer) spinnerInteligencia.getValue();
        int destreza = (Integer) spinnerDestreza.getValue();
        int vitalidade = (Integer) spinnerVitalidade.getValue();
        
        Personagem persona;
        try {
            persona = new Personagem(nome, vitalidade, inteligencia, destreza, forca);
            usuarioLogado.setPersonagem(persona);
        
            TelaSelecaoPersonagem telasepe = new TelaSelecaoPersonagem();
            Main.abrir(telasepe);
            this.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaCriacaoPersonagem.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buttonCriarActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        TelaSelecaoPersonagem telasepe = new TelaSelecaoPersonagem();
        Main.abrir(telasepe);
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonCriar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextField inputNome;
    private javax.swing.JSpinner spinnerDestreza;
    private javax.swing.JSpinner spinnerForca;
    private javax.swing.JSpinner spinnerInteligencia;
    private javax.swing.JSpinner spinnerVitalidade;
    // End of variables declaration//GEN-END:variables
}

//==============================================================================

class Viewo implements Runnable{
    int skillpontos;
    JLabel labelzinho;
    JSpinner spineer;
    
    public Viewo(int skillpontos, JLabel labelzinho, JSpinner spineer){
        this.skillpontos = skillpontos;
        this.labelzinho = labelzinho;
        this.spineer = spineer;
    }
    
    @Override
    public void run(){
        int aux = (Integer) spineer.getValue();
        skillpontos -= aux;
        labelzinho.setText("" + aux);
    }
}