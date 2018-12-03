
package EDA;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */
public class Usuario {
    private String login;
    private String senha;
    private Personagem personagem;

    
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

//=========================== GETTERS E SETTERS ================================  
    
    /**
     * Retorna o login do usuário.
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define o login do usuário.
     * @param login the nome to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Retorna a senha do usuário.
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha do usuário.
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Retorna o personagem do usuário.
     * @return the personagem
     */
    public Personagem getPersonagem() {
        return personagem;
    }

    /**
     * Define o personagem do usuário.
     * @param personagem the personagem to set
     */
    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }
    
    public String salvaString(){
        return "" + getLogin() + ";" + getSenha() + "; ";
    }
    
}
