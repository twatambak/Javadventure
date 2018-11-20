
package Presentation;

import Business.BusinessFacade;
import EDA.Personagem;
import EDA.Usuario;
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
        Viewo seila = new Viewo(skillpoints, labelSkill, spinnerForca);
        Thread processo = new Thread(seila);
        processo.start();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        spinnerForca = new javax.swing.JSpinner();
        spinnerInteligencia = new javax.swing.JSpinner();
        spinnerDestreza = new javax.swing.JSpinner();
        spinnerVitalidade = new javax.swing.JSpinner();
        inputNome = new javax.swing.JTextField();
        labelInfoFOR = new javax.swing.JLabel();
        labelSkill = new javax.swing.JLabel();
        labelInfoFOR1 = new javax.swing.JLabel();
        labelInfoTitulo = new javax.swing.JLabel();
        labelInfoFOR2 = new javax.swing.JLabel();
        labelInfoFOR3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(576, 464));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Regalia Free", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 100, 60, 20);

        spinnerForca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spinnerForcaMouseClicked(evt);
            }
        });
        getContentPane().add(spinnerForca);
        spinnerForca.setBounds(80, 140, 50, 30);
        getContentPane().add(spinnerInteligencia);
        spinnerInteligencia.setBounds(140, 190, 50, 30);
        getContentPane().add(spinnerDestreza);
        spinnerDestreza.setBounds(110, 240, 50, 30);
        getContentPane().add(spinnerVitalidade);
        spinnerVitalidade.setBounds(140, 290, 60, 40);
        getContentPane().add(inputNome);
        inputNome.setBounds(90, 100, 160, 20);

        labelInfoFOR.setFont(new java.awt.Font("Regalia Free", 0, 18)); // NOI18N
        labelInfoFOR.setText("Vitas lidade:");
        getContentPane().add(labelInfoFOR);
        labelInfoFOR.setBounds(20, 300, 110, 20);

        labelSkill.setFont(new java.awt.Font("Regalia Free", 0, 36)); // NOI18N
        getContentPane().add(labelSkill);
        labelSkill.setBounds(300, 200, 70, 40);

        labelInfoFOR1.setFont(new java.awt.Font("Regalia Free", 0, 18)); // NOI18N
        labelInfoFOR1.setText("Forca:");
        getContentPane().add(labelInfoFOR1);
        labelInfoFOR1.setBounds(20, 150, 50, 20);

        labelInfoTitulo.setFont(new java.awt.Font("Enchanted Land", 0, 60)); // NOI18N
        labelInfoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInfoTitulo.setText("Criação de Personagem");
        getContentPane().add(labelInfoTitulo);
        labelInfoTitulo.setBounds(0, 10, 640, 60);

        labelInfoFOR2.setFont(new java.awt.Font("Regalia Free", 0, 18)); // NOI18N
        labelInfoFOR2.setText("Inteligencia:");
        getContentPane().add(labelInfoFOR2);
        labelInfoFOR2.setBounds(20, 200, 110, 20);

        labelInfoFOR3.setFont(new java.awt.Font("Regalia Free", 0, 18)); // NOI18N
        labelInfoFOR3.setText("Destreza:");
        getContentPane().add(labelInfoFOR3);
        labelInfoFOR3.setBounds(20, 250, 80, 20);

        jButton1.setText("é isso aí meu parceiro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(243, 370, 230, 23);

        jButton2.setText("voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 370, 61, 23);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backgroundCriacaoPersonagem.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background);
        background.setBounds(0, 0, 640, 490);

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
        
        Personagem persona = new Personagem(nome, vitalidade, inteligencia, destreza, forca);
        usuarioLogado.setPersonagem(persona);
        
        TelaSelecaoPersonagem telasepe = new TelaSelecaoPersonagem();
        Main.abrir(telasepe);
        this.dispose();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelInfoFOR;
    private javax.swing.JLabel labelInfoFOR1;
    private javax.swing.JLabel labelInfoFOR2;
    private javax.swing.JLabel labelInfoFOR3;
    private javax.swing.JLabel labelInfoTitulo;
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