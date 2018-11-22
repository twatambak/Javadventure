
package Presentation;

import Business.BusinessFacade;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */
public class TelaRegistro extends javax.swing.JFrame {

    /**
     * Creates new form TelaRegistro
     */
    public TelaRegistro() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputLogin = new javax.swing.JTextField();
        inputSenha = new javax.swing.JPasswordField();
        buttonVoltar = new javax.swing.JButton();
        buttonRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Projeto: Cadastro de usuário");
        setMinimumSize(new java.awt.Dimension(1000, 667));
        setPreferredSize(new java.awt.Dimension(1000, 667));
        setResizable(false);
        getContentPane().setLayout(null);

        inputLogin.setBackground(new java.awt.Color(0, 0, 0));
        inputLogin.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        inputLogin.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(inputLogin);
        inputLogin.setBounds(40, 250, 280, 40);

        inputSenha.setBackground(new java.awt.Color(0, 0, 0));
        inputSenha.setFont(new java.awt.Font("Imaginary Forces", 0, 24)); // NOI18N
        inputSenha.setForeground(new java.awt.Color(255, 255, 255));
        inputSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(inputSenha);
        inputSenha.setBounds(40, 440, 280, 40);

        buttonVoltar.setBackground(new java.awt.Color(0, 0, 0));
        buttonVoltar.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        buttonVoltar.setForeground(new java.awt.Color(255, 255, 255));
        buttonVoltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonVoltar.setContentAreaFilled(false);
        buttonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonVoltar);
        buttonVoltar.setBounds(50, 530, 150, 65);

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
        buttonRegistrar.setBounds(630, 530, 210, 65);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/les2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 667);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        TelaLogin telalogin = new TelaLogin();
        telalogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        String login = inputLogin.getText();
        String senha = inputSenha.getText();
        
        if(BusinessFacade.cadastroUsuario(login, senha)){
            TelaLogin telalogin = new TelaLogin();
            telalogin.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void inputSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextField inputLogin;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
