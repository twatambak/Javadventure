
package DAO;

import EDA.Personagem;
import EDA.Usuario;
import java.util.Iterator;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public interface DAOInterface {
    public boolean inserirUsuario(String login, String senha);
    public Usuario getUsuario(String usuario);
    public Iterator getIteratorUsuario();
    
    public Usuario getUsuarioLogado();
    public void setUsuarioLogado(Usuario usuario);
    
    public boolean validarCredenciais(String usuario, String senha);
    
    public boolean inserirPersonagem(Personagem personagem);

}
