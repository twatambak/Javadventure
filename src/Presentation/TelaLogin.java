
package Presentation;

import Business.BusinessFacade;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin(){
        initComponents();
        try {
            BusinessFacade.carregarUsuarios();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonRegistrar = new javax.swing.JButton();
        buttonLogin = new javax.swing.JButton();
        inputSenha = new javax.swing.JPasswordField();
        inputUsuario = new javax.swing.JTextField();
        labelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVADVENTURE");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1000, 685));
        setPreferredSize(new java.awt.Dimension(1000, 685));
        setResizable(false);
        getContentPane().setLayout(null);

        buttonRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        buttonRegistrar.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        buttonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegistrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonRegistrar.setContentAreaFilled(false);
        buttonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRegistrar);
        buttonRegistrar.setBounds(660, 560, 290, 70);

        buttonLogin.setBackground(new java.awt.Color(0, 0, 0));
        buttonLogin.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonLogin.setContentAreaFilled(false);
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                buttonLoginFocusGained(evt);
            }
        });
        buttonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLoginMouseClicked(evt);
            }
        });
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLogin);
        buttonLogin.setBounds(90, 560, 200, 70);

        inputSenha.setBackground(new java.awt.Color(0, 0, 0));
        inputSenha.setFont(new java.awt.Font("Imaginary Forces", 0, 24)); // NOI18N
        inputSenha.setForeground(new java.awt.Color(255, 255, 255));
        inputSenha.setMinimumSize(new java.awt.Dimension(6, 36));
        inputSenha.setPreferredSize(new java.awt.Dimension(6, 36));
        getContentPane().add(inputSenha);
        inputSenha.setBounds(360, 490, 280, 40);

        inputUsuario.setBackground(new java.awt.Color(0, 0, 0));
        inputUsuario.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        inputUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(inputUsuario);
        inputUsuario.setBounds(360, 320, 280, 40);

        labelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/les1.jpg"))); // NOI18N
        labelBackground.setText("jLabel2");
        getContentPane().add(labelBackground);
        labelBackground.setBounds(0, 0, 1000, 667);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Gerencia o login do usuário.
     * @param evt 
     */
    private void buttonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseClicked
        String usuario = inputUsuario.getText();
        String senha = inputSenha.getText();
         
        if(BusinessFacade.login(usuario, senha)){
            if(BusinessFacade.getUsuarioLogado().getPersonagem() == null){
                TelaCriacaoPersonagem tela = new TelaCriacaoPersonagem();
                Main.abrir(tela);
                this.dispose();
            } else {
                TelaSelecaoPersonagem telaselpe = new TelaSelecaoPersonagem();
                telaselpe.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_buttonLoginMouseClicked
    
    /**
     * Evento criado por engano.
     * @param evt 
     */
    private void buttonLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buttonLoginFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLoginFocusGained

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        TelaRegistro telaregistro = new TelaRegistro();
        Main.abrir(telaregistro);
        this.dispose();
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed

    }//GEN-LAST:event_buttonLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JTextField inputUsuario;
    private javax.swing.JLabel labelBackground;
    // End of variables declaration//GEN-END:variables
}
