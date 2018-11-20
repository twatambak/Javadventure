
package Business;

import DAO.DAOInterface;
import DAO.DAOMemory;
import EDA.Usuario;
import javax.swing.JOptionPane;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class BusinessFacade {
    static DAOInterface instance = DAOMemory.getInstance();

//=============================== MÉTODOS ======================================
    
    /**
     * Realiza o login do Usuário.
     * @param usuario
     * @param senha
     * @return 
     */
    public static boolean login(String usuario, String senha){
        if(instance.validarCredenciais(usuario, senha)){
            JOptionPane.showMessageDialog(null, "Logado com sucesso. Bem-vindo " + usuario + ".", "Logado com sucesso", JOptionPane.DEFAULT_OPTION);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao logar. Verifique suas informações.", "Erro no login", JOptionPane.DEFAULT_OPTION);
            return false;
        }
    }
    
    /**
     * Realiza o cadastro do usuário.
     * @param login
     * @param senha
     * @return 
     */
    public static boolean cadastroUsuario(String login, String senha){
        if(instance.inserirUsuario(login, senha)){
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.", "Cadastro bem-sucedido", JOptionPane.DEFAULT_OPTION);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Retorna o usuário logado.
     * @return 
     */
    public static Usuario getUsuarioLogado(){
        return instance.getUsuarioLogado();
    }
    
}
