
package EDA;

import java.util.Random;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class Peitoral extends Equipamento{
    private int protecao;
    private ParteCorpo areaProtecao;
    
    public Peitoral(String nome, int lvl) {
        super(nome, lvl);
        Random x = new Random();
        protecao = x.nextInt(lvl + 10) + 1;
        valorCompra = x.nextInt(protecao + 100) + 1;
        areaProtecao = ParteCorpo.TORSO;
    }
    
        /**
     * Retorna o valor de proteção do equipamento.
     * @return 
     */
    public int getProtecao() {
        return protecao;
    }
    
    /**
     * Define o valor de proteção do equipamento.
     * @param protecao 
     */
    public void setProtecao(int protecao) {
        this.protecao = protecao;
    }
}
