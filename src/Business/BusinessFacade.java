
package Business;

import DAO.DAOInterface;
import DAO.DAOMemory;
import EDA.Equipamento;
import EDA.Itens;
import EDA.Personagem;
import EDA.Usuario;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class BusinessFacade {
    static DAOInterface instance = DAOMemory.getInstance();

//========== MÉTODOS ===========================================================
    
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
    
    /**
     * Carrega os registros dos usuários.
     * @throws FileNotFoundException 
     */
    public static void carregarUsuarios() throws FileNotFoundException{
        instance.carregarRegistros();
    }
    
    /**
     * Atualiza as informações dos registros de usuários.
     */
    public static void atualizarRegistros(){
        instance.registrarUsuarios();
    }
    
    /**
     * Retorna o acervo de equipamentos da loja.
     * @return 
     */
    public static ArrayList getArrayLojaEquip(){
        return instance.getArrayLojaEquip();
    }
    
    /**
     * Retorna o acervo de itens da loja.
     * @return 
     */
    public static ArrayList getArrayLojaItens(){
        return instance.getArrayLojaItens();
    }
    
    /**
     * Define o acervo de equipamentos da loja.
     * @param quant
     * @param lvl 
     */
    public static void setArrayLojaEquip(int quant, int lvl){
        instance.setArrayLojaEquip(quant, lvl);
    }
    
    /**
     * Define o acervo de itens da loja.
     * @param quant 
     */
    public static void setArrayLojaItens(int quant){
        instance.setArrayLojaItens(quant);
    }
    
    /**
     * Retorna o objeto na posição passada no array de equipamentos.
     * @param index
     * @return 
     */
    public static Equipamento getArrayEquipIndex(int index){
        return instance.getArrayEquipIndex(index);
    }
    
    /**
     * Retorna o objeto na posição passada no array de itens.
     * @param index
     * @return 
     */
    public static Itens getArrayItensIndex(int index){
        return instance.getArrayItensIndex(index);
    }
    
    /**
     * Remove o objeto na posição passada do acervo de equipamentos da loja.
     * @param index 
     */
    public static void removeEquipArrayLoja(int index){
        instance.removeEquipArrayLoja(index);
    }
    
    /**
     * Remove o objeto na posição passada do acervo de itens da loja.
     * @param index 
     */
    public static void removeItensArrayLoja(int index){
        instance.removeItensArrayLoja(index);
    }
    
    /**
     * Realiza a compra de determinado equipamento da loja.
     * @param index
     * @param personagem
     * @return 
     */
    public static boolean comprarEquipamento(int index, Personagem personagem){
        return instance.comprarEquipamento(index, personagem);
    }
    
    /**
     * Realiza a compra de determinado item da loja.
     * @param index
     * @param personagem
     * @return 
     */
    public static boolean comprarItens(int index, Personagem personagem){
        return instance.comprarItens(index, personagem);
    }
    
    /**
     * Remove o equipamento da posição passada do array relacionado ao 
     * inventário de equipamentos do jogador.
     * @param index
     * @param personagem 
     */
    public static void removeEquipInventario(int index, Personagem personagem){
        instance.removeEquipInventario(index, personagem);
    }
    
    /**
     * Remove o item da posição passada do array relacionado ao inventário de 
     * itens do jogador.
     * @param index
     * @param personagem 
     */
    public static void removeItensConsumiveis(int index, Personagem personagem){
        instance.removeItensCosumiveis(index, personagem);
    }
    
    /**
     * Adiciona determinado equipamento ao inventário de equipamentos do
     * jogador.
     * @param equip
     * @param personagem 
     */
    public static void addEquipInventario(Equipamento equip, Personagem personagem){
        instance.addEquipInventario(equip, personagem);
    }
    
    /**
     * Adiciona determinado item ao inventário de consumíveis do jogador.
     * @param itens
     * @param personagem 
     */
    public static void addItensConsumiveis(Itens itens, Personagem personagem){
        instance.addItensConsumiveis(itens, personagem);
    }
}
