
package EDA;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public abstract class Equipamento {
    String nome;
    String descricao;
    int lvl;
    int valorCompra;
    
//========== Getters e Setters: Nome ===========================================
    
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

//========== Getters e Setters: Descrição ======================================
    
    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

//========== Getters e Setters: Level ==========================================
    
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
    
//========== Getters e Setters: Valor Compra ===================================
    
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

}   
