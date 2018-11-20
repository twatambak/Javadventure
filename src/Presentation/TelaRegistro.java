
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

        labelTituloInfo = new javax.swing.JLabel();
        labelLoginInfo = new javax.swing.JLabel();
        inputLogin = new javax.swing.JTextField();
        labelSenhaInfo = new javax.swing.JLabel();
        inputSenha = new javax.swing.JPasswordField();
        buttonVoltar = new javax.swing.JButton();
        buttonRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Projeto: Cadastro de usuário");
        setMinimumSize(new java.awt.Dimension(670, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        labelTituloInfo.setFont(new java.awt.Font("Regalia Free", 0, 60)); // NOI18N
        labelTituloInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloInfo.setText("Cadastro de Usuario");
        getContentPane().add(labelTituloInfo);
        labelTituloInfo.setBounds(0, 20, 660, 80);

        labelLoginInfo.setFont(new java.awt.Font("Regalia Free", 0, 36)); // NOI18N
        labelLoginInfo.setText("Login:");
        getContentPane().add(labelLoginInfo);
        labelLoginInfo.setBounds(30, 170, 100, 37);

        inputLogin.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        getContentPane().add(inputLogin);
        inputLogin.setBounds(150, 170, 250, 30);

        labelSenhaInfo.setFont(new java.awt.Font("Regalia Free", 0, 36)); // NOI18N
        labelSenhaInfo.setText("Senha:");
        getContentPane().add(labelSenhaInfo);
        labelSenhaInfo.setBounds(30, 270, 110, 37);

        inputSenha.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        inputSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(inputSenha);
        inputSenha.setBounds(150, 270, 250, 30);

        buttonVoltar.setBackground(new java.awt.Color(0, 0, 0));
        buttonVoltar.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        buttonVoltar.setForeground(new java.awt.Color(255, 255, 255));
        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonVoltar);
        buttonVoltar.setBounds(30, 380, 150, 31);

        buttonRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        buttonRegistrar.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        buttonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegistrar.setText("Registrar");
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRegistrar);
        buttonRegistrar.setBounds(460, 220, 160, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backgroundRegistro.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 500);

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
    private javax.swing.JLabel labelLoginInfo;
    private javax.swing.JLabel labelSenhaInfo;
    private javax.swing.JLabel labelTituloInfo;
    // End of variables declaration//GEN-END:variables
}
