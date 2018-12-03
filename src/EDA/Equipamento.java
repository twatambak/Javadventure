
package EDA;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public abstract class Equipamento {
    String nome;
    int propriedade;
    int lvl;
    int valorCompra;
    
//========== GETTERS E SETTERS: Nome ===========================================
    
    /**
     * Retorna o nome do equipamento.
     * @return 
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Define o nome do equipamento.
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

//========== GETTERS E SETTERS: Level ==========================================
    
    /**
     * Retorna o nível do equipamento.
     * @return 
     */
    public int getLvl() {
        return lvl;
    }
    
    /**
     * Define o nível do equipamento.
     * @param lvl 
     */
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    
//========== GETTERS E SETTERS: Valor Compra ===================================
    
    /**
     * Retorna o valor de compra do equipamento.
     * @return 
     */
    public int getValorCompra() {
        return valorCompra;
    }
    
    /**
     * Define o valor de compra do equipamento.
     * @param valorCompra 
     */
    public void setValorCompra(int valorCompra) {
        this.valorCompra = valorCompra;
    }

//========== GETTERS E SETTERS: Propriedade ====================================    
    
    /**
     * @return the propriedade
     */
    public int getPropriedade() {
        return propriedade;
    }

    /**
     * @param propriedade the propriedade to set
     */
    public void setPropriedade(int propriedade) {
        this.propriedade = propriedade;
    }
    
    public String salvaString(){
        return "" + getNome() + ";" + getLvl() + ";" + getPropriedade() + ";" + getValorCompra() + "; ";
     }
}   
