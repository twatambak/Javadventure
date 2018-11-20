
package EDA;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class Equipamento {
    private String nome;
    private int lvl;
    int valorCompra;
    
    public Equipamento(String nome, int lvl ){
        this.nome = nome;
        this.lvl = lvl;
    }

//=========================== GETTERS E SETTERS ================================ 
    
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
}   
