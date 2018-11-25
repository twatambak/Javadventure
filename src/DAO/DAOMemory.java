
package DAO;

import EDA.Personagem;
import EDA.Usuario;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class DAOMemory implements DAOInterface{
    static DAOMemory instance = null;
    ArrayList<Usuario> arrayUsuario = new ArrayList<>();
    private File arquivoUsuarios = new File("RegistroUsuarios.txt");
    ArrayList<Personagem> arrayPersonagem = new ArrayList<>();
    Usuario usuarioLogado;
    
    private DAOMemory(){

    }
    
//=============================== MÉTODOS ======================================
    
    /**
     * Retorna uma instância de DAOMemory.
     * @return 
     */
    public static DAOMemory getInstance(){
        if(instance == null){
            instance = new DAOMemory();
        }
        return instance;
    }
    
    /**
     * Retorna um iterador sobre o array de Usuários.
     * @return 
     */
    @Override
    public Iterator getIteratorUsuario(){
        Iterator itUsuario = arrayUsuario.iterator();
        return itUsuario;
    }
    
    /**
     * Retorna um iterador sobre o array de Personagens.
     * @return 
     */
    public Iterator getIteratorPersonagem(){
        Iterator itPersonagem = arrayPersonagem.iterator();
        return itPersonagem;
    }
    
    /**
     * Adiciona o Usuário passado no array de usuários. 
     * @param login
     * @param senha
     * @return 
     */
    @Override
    public boolean inserirUsuario(String login, String senha) {
        Iterator it = getIteratorUsuario();
        if(senha.length() >= 6){
            while(it.hasNext()){
                Usuario aux = (Usuario) it.next();
                if(aux.getLogin().contentEquals(login) || aux.getLogin() == null){
                    JOptionPane.showMessageDialog(null, "O usuário informado já está cadastrado ou o campo está nulo.", "Erro de cadastro", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "A senha deve contar ao menos seis caracteres.", "Erro no cadastro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        Usuario usuario = new Usuario(login, senha);
        arrayUsuario.add(usuario);
        return true;
    }
    
    /**
     * Retorna o Usuário.
     * @param usuario
     * @return usuario
     */
    @Override
    public Usuario getUsuario(String usuario) {
        Iterator it = arrayPersonagem.iterator();
        while(it.hasNext()){
            Usuario aux = (Usuario) it.next();
            if(aux.getLogin().equals(usuario)){
                return aux;
            }
        }
        return null;
    }
    
    /**
     * Retorna o Usuário que efetuou o login.
     * @return 
     */
    @Override
    public Usuario getUsuarioLogado(){
        return usuarioLogado;
    }
    
    /**
     * Define o usuário logado.
     * @param usuario 
     */
    @Override
    public void setUsuarioLogado(Usuario usuario){
        this.usuarioLogado = usuario;
    }
    
    /**
     * Valida as credenciais de acesso do Usuário.
     * @param usuario
     * @param senha 
     * @return  
     */
    @Override
    public boolean validarCredenciais(String usuario, String senha) {
        Iterator it = getIteratorUsuario();
        while(it.hasNext()){
            Usuario aux = (Usuario) it.next();
            if(aux.getLogin().equals(usuario) && aux.getSenha().equals(senha)){
                setUsuarioLogado(aux);
                return true;
            }
        }
        return false;
    }

    /**
     * Adiciona o Personagem passado no array de personagens.
     * @param personagem 
     * @return  
     */
    @Override
    public boolean inserirPersonagem(Personagem personagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public void registrarUsuarios(){
        try {
            FileWriter fileUsuarios = new FileWriter(arquivoUsuarios);
            BufferedWriter buffUsuarios = new BufferedWriter(fileUsuarios);
            for(int i = 0; i < arrayUsuario.size(); i++){
                JOptionPane.showMessageDialog(null, arrayUsuario.get(i).salvaString());
                buffUsuarios.write(arrayUsuario.get(i).salvaString());
            }
        } catch (IOException e) {
        }
    }
    
    @Override
    public void carregarRegistros() throws FileNotFoundException{
        Scanner scan = new Scanner(new FileReader(arquivoUsuarios)).useDelimiter("\\;|\\n");
        
        while(scan.hasNext()){
            String usuario = scan.next();
            String senha = scan.next();
            
            arrayUsuario.add(new Usuario(usuario, senha));
        }
    }
}
