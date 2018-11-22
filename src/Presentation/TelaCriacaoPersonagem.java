
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
        this.setSize(1000, 667);
        Viewo seila = new Viewo(skillpoints, labelSkill, spinnerForca);
        Thread processo = new Thread(seila);
        processo.start();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spinnerForca = new javax.swing.JSpinner();
        spinnerInteligencia = new javax.swing.JSpinner();
        spinnerDestreza = new javax.swing.JSpinner();
        spinnerVitalidade = new javax.swing.JSpinner();
        inputNome = new javax.swing.JTextField();
        labelSkill = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        labelSkill.setFont(new java.awt.Font("Regalia Free", 0, 36)); // NOI18N
        getContentPane().add(labelSkill);
        labelSkill.setBounds(300, 200, 70, 40);

        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(680, 570, 150, 70);

        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(120, 570, 150, 70);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaSelecaoPersonagem telasepe = new TelaSelecaoPersonagem();
        Main.abrir(telasepe);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField inputNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel labelSkill;
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