
package EDA;

import java.util.Random;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */
public class Arma {
    private String nome;
    private int dano;
    private int valorCompra;
    private int lvl;
    
    public Arma(String nome, int lvl){
        Random x = new Random();
        this.nome = nome;
        this.lvl = lvl;
        dano = x.nextInt(lvl + 10) + 1;
        valorCompra = x.nextInt(dano + 50) + 1;
    }

//=========================== GETTERS E SETTERS ================================     
    
    /**
     * Retorna o nome da arma.
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da arma.
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o dano da arma.
     * @return the dano
     */
    public int getDano() {
        return dano;
    }

    /**
     * Define o dano da arma.
     * @param dano the dano to set
     */
    public void setDano(int dano) {
        this.dano = dano;
    }

    /**
     * Retorna o valor de compra da arma.
     * @return the valorCompra
     */
    public int getValorCompra() {
        return valorCompra;
    }

    /**
     * Define o valor de compra da arma.
     * @param valorCompra the valorCompra to set
     */
    public void setValorCompra(int valorCompra) {
        this.valorCompra = valorCompra;
    }

    /**
     * Retorna o nível da arma.
     * @return the lvl
     */
    public int getLvl() {
        return lvl;
    }

    /**
     * Define o nível da arma.
     * @param lvl the lvl to set
     */
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    
    
}
