
package Business;

import DAO.DAOInterface;
import DAO.DAOMemory;
import EDA.Equipamento;
import EDA.Itens;
import EDA.Personagem;
import EDA.Usuario;
import EDA.Ser;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
    
    public static void carregarUsuarios() throws FileNotFoundException{
        instance.carregarRegistros();
    }
    
    public static void atualizarRegistros(){
        instance.registrarUsuarios();
    }
    
    public static ArrayList getArrayLojaEquip(){
        return instance.getArrayLojaEquip();
    }
    
    public static ArrayList getArrayLojaItens(){
        return instance.getArrayLojaItens();
    }
    
    public static void setArrayLojaEquip(int quant, int lvl){
        instance.setArrayLojaEquip(quant, lvl);
    }
    
    public static void setArrayLojaItens(int quant){
        instance.setArrayLojaItens(quant);
    }
    
    public static Equipamento getArrayEquipIndex(int index){
        return instance.getArrayEquipIndex(index);
    }
    
    public static Itens getArrayItensIndex(int index){
        return instance.getArrayItensIndex(index);
    }
    
    public static void removeEquipArrayLoja(int index){
        instance.removeEquipArrayLoja(index);
    }
    
    public static void removeItensArrayLoja(int index){
        instance.removeItensArrayLoja(index);
    }
    
    public static boolean comprarEquipamento(int index, Personagem personagem){
        return instance.comprarEquipamento(index, personagem);
    }
    
    public static boolean comprarItens(int index, Personagem personagem){
        return instance.comprarItens(index, personagem);
    }
    
    public static void removeEquipInventario(int index, Personagem personagem){
        instance.removeEquipInventario(index, personagem);
    }
    
    public static void removeItensConsumiveis(int index, Personagem personagem){
        instance.removeItensCosumiveis(index, personagem);
    }
    
    public static void addEquipInventario(Equipamento equip, Personagem personagem){
        instance.addEquipInventario(equip, personagem);
    }
    
    public static void addItensConsumiveis(Itens itens, Personagem personagem){
        instance.addItensConsumiveis(itens, personagem);
    }
}
