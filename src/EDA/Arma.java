
package EDA;

import java.util.Random;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */
public class Arma extends Equipamento{
    private int dano;
    
    public Arma(String nome, int lvl){
        super(nome, lvl);
        Random x = new Random();
        dano = x.nextInt(lvl + 10) + 1;
        valorCompra = x.nextInt(dano + 50) + 1;
    }

//=========================== GETTERS E SETTERS ================================     
    
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
   
}
