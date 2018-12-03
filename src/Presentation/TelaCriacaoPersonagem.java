
package Presentation;

import Business.BusinessFacade;
import EDA.Personagem;
import EDA.Usuario;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
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
        personagem = new javax.swing.JLabel();
        listaPersonagens = new javax.swing.JComboBox<>();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Javadventure: Criação de Personagens");
        setMaximumSize(new java.awt.Dimension(1000, 685));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        spinnerForca.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        spinnerForca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spinnerForcaMouseClicked(evt);
            }
        });
        getContentPane().add(spinnerForca);
        spinnerForca.setBounds(390, 300, 70, 40);

        spinnerInteligencia.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        getContentPane().add(spinnerInteligencia);
        spinnerInteligencia.setBounds(540, 500, 70, 40);

        spinnerDestreza.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        getContentPane().add(spinnerDestreza);
        spinnerDestreza.setBounds(460, 400, 70, 40);

        spinnerVitalidade.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        getContentPane().add(spinnerVitalidade);
        spinnerVitalidade.setBounds(500, 600, 70, 40);

        inputNome.setBackground(new java.awt.Color(0, 0, 0));
        inputNome.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        inputNome.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(inputNome);
        inputNome.setBounds(110, 150, 520, 70);

        buttonCriar.setFont(new java.awt.Font("Coolvetica Rg", 0, 48)); // NOI18N
        buttonCriar.setText("Criar");
        buttonCriar.setToolTipText("");
        buttonCriar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonCriar.setContentAreaFilled(false);
        buttonCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCriarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCriar);
        buttonCriar.setBounds(1090, 650, 150, 70);

        buttonVoltar.setFont(new java.awt.Font("Coolvetica Rg", 0, 48)); // NOI18N
        buttonVoltar.setText("Voltar");
        buttonVoltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonVoltar.setContentAreaFilled(false);
        buttonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonVoltar);
        buttonVoltar.setBounds(750, 650, 150, 70);

        personagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Personagem1.png"))); // NOI18N
        getContentPane().add(personagem);
        personagem.setBounds(720, 180, 260, 460);

        listaPersonagens.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        listaPersonagens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personagem 1", "Personagem 2", "Personagem 3", "Personagem 4", "Personagem 5", "Personagem 6", "Personagem 7", "Personagem 8" }));
        listaPersonagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPersonagensActionPerformed(evt);
            }
        });
        getContentPane().add(listaPersonagens);
        listaPersonagens.setBounds(1050, 310, 200, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backCriacaoPersonagem.jpg"))); // NOI18N
        background.setText("jLabel1");
        background.setMinimumSize(new java.awt.Dimension(1366, 768));
        background.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(background);
        background.setBounds(0, 0, 1366, 768);

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
            persona = new Personagem(nome, vitalidade, inteligencia, destreza, forca, verificaAparencia());
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

    private void listaPersonagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPersonagensActionPerformed
       personagem.setIcon(verificaAparencia());
        
    }//GEN-LAST:event_listaPersonagensActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonCriar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextField inputNome;
    private javax.swing.JComboBox<String> listaPersonagens;
    private javax.swing.JLabel personagem;
    private javax.swing.JSpinner spinnerDestreza;
    private javax.swing.JSpinner spinnerForca;
    private javax.swing.JSpinner spinnerInteligencia;
    private javax.swing.JSpinner spinnerVitalidade;
    // End of variables declaration//GEN-END:variables

    public Icon verificaAparencia(){
        int id = listaPersonagens.getSelectedIndex();
        switch(id){
            case 0:
                return (new javax.swing.ImageIcon(getClass().getResource("/Images/Personagem1.png")));
            case 1:
                return (new javax.swing.ImageIcon(getClass().getResource("/Images/Personagem2.png")));
            case 2:
                return (new javax.swing.ImageIcon(getClass().getResource("/Images/Personagem3.png")));
            case 3:
                return (new javax.swing.ImageIcon(getClass().getResource("/Images/Personagem4.png")));
            case 4:
                return (new javax.swing.ImageIcon(getClass().getResource("/Images/Personagem5.png")));
            case 5:
                return (new javax.swing.ImageIcon(getClass().getResource("/Images/Personagem6.png")));
            case 6:
                return (new javax.swing.ImageIcon(getClass().getResource("/Images/Personagem7.png")));
            case 7:
                return (new javax.swing.ImageIcon(getClass().getResource("/Images/Personagem1.png")));
            default:
                return (new javax.swing.ImageIcon(getClass().getResource("/Images/Personagem1.png")));
        } 
    }

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