
package Presentation;

import Business.BusinessFacade;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        textCreditos.setText("É meu querido, não adianta compilar o código e fazer as merdas que tu faz na sintaxe.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelInfoTitulo = new javax.swing.JLabel();
        buttonRegistrar = new javax.swing.JButton();
        buttonLogin = new javax.swing.JButton();
        inputSenha = new javax.swing.JPasswordField();
        labelInfoSenha = new javax.swing.JLabel();
        inputUsuario = new javax.swing.JTextField();
        lavelInfoUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textCreditos = new javax.swing.JTextPane();
        labelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto: Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(720, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        labelInfoTitulo.setBackground(new java.awt.Color(0, 0, 0));
        labelInfoTitulo.setFont(new java.awt.Font("Kingthings Spikeless", 0, 100)); // NOI18N
        labelInfoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInfoTitulo.setText("Javaventura");
        labelInfoTitulo.setToolTipText("");
        getContentPane().add(labelInfoTitulo);
        labelInfoTitulo.setBounds(0, 0, 710, 116);

        buttonRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        buttonRegistrar.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        buttonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegistrar.setText("Criar conta");
        buttonRegistrar.setBorderPainted(false);
        buttonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRegistrar);
        buttonRegistrar.setBounds(380, 370, 260, 30);

        buttonLogin.setBackground(new java.awt.Color(0, 0, 0));
        buttonLogin.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("Login");
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
        buttonLogin.setBounds(20, 370, 250, 30);

        inputSenha.setBackground(new java.awt.Color(0, 0, 0));
        inputSenha.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        inputSenha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(inputSenha);
        inputSenha.setBounds(10, 280, 270, 29);

        labelInfoSenha.setFont(new java.awt.Font("Regalia Free", 0, 36)); // NOI18N
        labelInfoSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInfoSenha.setText("Senha:");
        getContentPane().add(labelInfoSenha);
        labelInfoSenha.setBounds(10, 240, 270, 40);

        inputUsuario.setBackground(new java.awt.Color(0, 0, 0));
        inputUsuario.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        inputUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(inputUsuario);
        inputUsuario.setBounds(10, 180, 270, 29);

        lavelInfoUsuario.setFont(new java.awt.Font("Regalia Free", 0, 36)); // NOI18N
        lavelInfoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lavelInfoUsuario.setText("Usuario:");
        getContentPane().add(lavelInfoUsuario);
        lavelInfoUsuario.setBounds(10, 138, 270, 40);

        textCreditos.setBackground(new java.awt.Color(0, 0, 0));
        textCreditos.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(textCreditos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 160, 390, 200);

        labelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backgroundLogin.jpg"))); // NOI18N
        labelBackground.setText("jLabel2");
        getContentPane().add(labelBackground);
        labelBackground.setBounds(0, 0, 720, 470);

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBackground;
    private javax.swing.JLabel labelInfoSenha;
    private javax.swing.JLabel labelInfoTitulo;
    private javax.swing.JLabel lavelInfoUsuario;
    private javax.swing.JTextPane textCreditos;
    // End of variables declaration//GEN-END:variables
}
