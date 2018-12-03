
package DAO;

import Business.BusinessFacade;
import EDA.Arma;
import EDA.Elmo;
import EDA.Equipamento;
import EDA.Grevas;
import EDA.Itens;
import EDA.Peitoral;
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
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class DAOMemory implements DAOInterface{
    static DAOMemory instance = null;
    ArrayList<Usuario> arrayUsuario = new ArrayList<>();
    private File arquivoUsuarios = new File("RegistroUsuarios.txt");
    private File arquivoInventario = new File("RegistroInventario.txt");
    ArrayList<Personagem> arrayPersonagem = new ArrayList<>();
    
    ArrayList<Itens> arrayItensLoja = new ArrayList<>();
    ArrayList<Equipamento> arrayEquipamentoLoja = new ArrayList<>();
    Usuario usuarioLogado;
    
    private DAOMemory(){

    }
    
//========== MÉTODOS ===========================================================
    
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
        registrarUsuarios();
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
    
    /**
     * Registra o usuário.
     */
    @Override
    public void registrarUsuarios(){
        try {
            int j;
            FileWriter fos = new FileWriter(arquivoUsuarios);
            BufferedWriter oos = new BufferedWriter(fos);   
          
            for (j=0;j<arrayUsuario.size();j++) {
                oos.write(arrayUsuario.get(j).salvaString());
                oos.newLine();
            }

            oos.close(); 
        } catch(Exception ex) {
        }
        
    }
    
    /**
     * Carrega os usuários.
     * @throws FileNotFoundException 
     */
    @Override
    public void carregarRegistros() throws FileNotFoundException{
        Scanner scan = new Scanner(new FileReader(arquivoUsuarios)).useDelimiter("\\;|\\n");
        
        while(scan.hasNext()){
            String usuario = scan.next();
            String senha = scan.next();
            String ovo = scan.next();
            arrayUsuario.add(new Usuario(usuario, senha));
        }
        
        scan.close();
    }

    /*
    public void registrarInventario(Personagem personagem){
        try {
            int j;
            FileWriter fos = new FileWriter(arquivoInventario);
            BufferedWriter oos = new BufferedWriter(fos);   
          
            for (j=0;j<personagem.getInventario().size();j++) {
                oos.write(personagem.getInventario().get(j).salvaString());
                oos.newLine();
            }

            oos.close(); 
        } catch(Exception ex) {
        }
        
    }

    public void carregarInventario() throws FileNotFoundException{
        Scanner scan = new Scanner(new FileReader(arquivoInventario)).useDelimiter("\\;|\\n");
        
        while(scan.hasNext()){
            String nome = scan.next();
            int lvl = Integer.parseInt(scan.next());
                int propriedade = Integer.parseInt(scan.next());
            int valor = Integer.parseInt(scan.next());
            String ovo = scan.next();
            if()
            personagem.getInventario().add(new Equipamento());
        }
        
        scan.close();
    }*/
    
    /**
     * Define o acervo de equipamentos da loja.
     * @param quant
     * @param lvl 
     */
    @Override
    public void setArrayLojaEquip(int quant, int lvl){
        arrayEquipamentoLoja.clear();
        Random x = new Random();
        
        for(int i = 0; i < quant; i++){
            arrayEquipamentoLoja.add(new Arma(x.nextInt(lvl + 10) + 1));
            arrayEquipamentoLoja.add(new Elmo(x.nextInt(lvl + 10) + 1));
            arrayEquipamentoLoja.add(new Peitoral(x.nextInt(lvl + 10) + 1));
            arrayEquipamentoLoja.add(new Grevas(x.nextInt(lvl + 10) + 1));
        }
    }
    
    /**
     * Retorna o acervo de equipamentos da loja.
     * @return 
     */
    @Override
    public ArrayList getArrayLojaEquip(){
        return arrayEquipamentoLoja;
    } 
    
    /**
     * Define o acervo de itens da loja;
     * @param quant 
     */
    @Override
    public void setArrayLojaItens(int quant){
        arrayItensLoja.clear();
        for(int i = 0; i < quant; i++){
            arrayItensLoja.add(new Itens());
        }
    }
    
    /**
     * Retorna o acervo de itens da loja.
     * @return 
     */
    @Override
    public ArrayList getArrayLojaItens(){
        return arrayItensLoja;
    }
    
    /**
     * Retorna o equipamento da posição passada do acervo de equipamentos da
     * loja.
     * @param index
     * @return 
     */
    @Override
    public Equipamento getArrayEquipIndex(int index){
        return arrayEquipamentoLoja.get(index);
    }
    
    /**
     * Retorna o equipamento da posição passada do acervo de itens da loja.
     * @param index
     * @return 
     */
    @Override
    public Itens getArrayItensIndex(int index){
        return arrayItensLoja.get(index);
    }
    
    /**
     * Remove o equipamento da posição passada do acervo de equipamentos da
     * loja.
     * @param index 
     */
    @Override
    public void removeEquipArrayLoja(int index){
        arrayEquipamentoLoja.remove(index);
    }
    
    /**
     * Remove o item da posição passada do acerfvo de equipamentos da loja.
     * @param index 
     */
    @Override
    public void removeItensArrayLoja(int index){
        arrayItensLoja.remove(index);
    }
    
    /**
     * Realiza a compra do equipamento localizado na posição passada.
     * @param index
     * @param personagem
     * @return 
     */
    public boolean comprarEquipamento(int index, Personagem personagem){
        Equipamento aux = BusinessFacade.getArrayEquipIndex(index);
        if(personagem.getDinheiro() >=  aux.getValorCompra()){
            personagem.getInventario().add(aux);
            removeEquipArrayLoja(index);
            personagem.setDinheiro(personagem.getDinheiro() -  aux.getValorCompra());
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Realiza a compra do item localizado na posição passada.
     * @param index
     * @param personagem
     * @return 
     */
    public boolean comprarItens(int index, Personagem personagem){
        Itens aux = getArrayItensIndex(index);
        if(personagem.getDinheiro() >= aux.getValorCompra()){
            personagem.getConsumiveis().add(aux);
            if(aux.getQuantidade() > 0){
                aux.setQuantidade(aux.getQuantidade() - 1);
            } else {
                removeItensArrayLoja(index);
            }
            personagem.setDinheiro(personagem.getDinheiro() - aux.getValorCompra());
            return true;
        }else {
            return false;
        }
    }
    
    /**
     * Remove o equipamento da posição passada do array relacionado ao
     * inventário de equipamentos do jogador.
     * @param index
     * @param personagem 
     */
    @Override
    public void removeEquipInventario(int index, Personagem personagem){
        personagem.getInventario().remove(index);
    }
    
    /**
     * Remove o item da posição passada do array relacionado ao inventário
     * de itens do jogador.
     * @param index
     * @param personagem 
     */
    @Override
    public void removeItensCosumiveis(int index, Personagem personagem){
        personagem.getConsumiveis().remove(index);
    }
    
    /**
     * Adiciona o equipamento passado ao inventário de equipamentos do jogador.
     * @param equip
     * @param personagem 
     */
    @Override
    public void addEquipInventario(Equipamento equip, Personagem personagem){
        personagem.getInventario().add(equip);
    }
    
    /**
     * Adiciona o item passado ao inventário de itens do jogador.
     * @param itens
     * @param personagem 
     */
    @Override
    public void addItensConsumiveis(Itens itens, Personagem personagem){
        personagem.getConsumiveis().add(itens);
    }
}
