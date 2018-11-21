
package EDA;

import java.util.Random;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class Monstro extends Ser{
    private int xpDrop;
    private int coinDrop;
    
    public Monstro(String nome, int level){
        Random x = new Random();
        this.nome = nome;
        
        lvl = x.nextInt(level + 5) + 1;
        
        forca = x.nextInt(lvl * 2) + 1;
        destreza = x.nextInt(lvl * 2) + 1;
        vitalidade = x.nextInt(lvl * 2) + 1;
        inteligencia = x.nextInt(lvl * 2) + 1;
        hp = vitalidade * 100;
        
        xpDrop = lvl + forca + destreza + vitalidade + inteligencia;
        coinDrop = lvl * 10;
        
        atk = forca * 2;
        
        status = TipoStatus.NORMAL;
    }

//========== Getters e Setters: Drop de XP =====================================    
    
    /**
     * @return the xpDrop
     */
    public int getXpDrop() {
        return xpDrop;
    }

    /**
     * @param xpDrop the xpDrop to set
     */
    public void setXpDrop(int xpDrop) {
        this.xpDrop = xpDrop;
    }

//========== Getters e Setters: Drop de Dinheiro ===============================
    
    /**
     * @return the coinDrop
     */
    public int getCoinDrop() {
        return coinDrop;
    }

    /**
     * @param coinDrop the coinDrop to set
     */
    public void setCoinDrop(int coinDrop) {
        this.coinDrop = coinDrop;
    }
    
}
