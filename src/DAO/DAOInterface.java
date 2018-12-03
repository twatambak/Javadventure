
package DAO;

import EDA.Equipamento;
import EDA.Itens;
import EDA.Personagem;
import EDA.Usuario;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
    
    public void registrarUsuarios();
    public void carregarRegistros() throws FileNotFoundException;
    
    public ArrayList getArrayLojaEquip();
    public void setArrayLojaEquip(int quant, int lvl);
    
    public ArrayList getArrayLojaItens();
    public void setArrayLojaItens(int quant);
    
    public Equipamento getArrayEquipIndex(int index);
    
    public Itens getArrayItensIndex(int index);
    
    public void removeEquipArrayLoja(int index);
    public void removeItensArrayLoja(int index);
    
    public boolean comprarEquipamento(int index, Personagem personagem);
    public boolean comprarItens(int index, Personagem personagem);
    
    public void removeEquipInventario(int index, Personagem personagem);
    public void removeItensCosumiveis(int index, Personagem personagem);
    
    public void addEquipInventario(Equipamento equip, Personagem personagem);
    public void addItensConsumiveis(Itens itens, Personagem personagem);
    
}
