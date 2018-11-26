/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDA;

/**
 *
 * @author Bencke
 */
public abstract class Armadura extends Equipamento{
    int protecao;
    EnumParteCorpo areaProtecao;

    /**
     * @return the protecao
     */
    public int getProtecao() {
        return protecao;
    }

    /**
     * @param protecao the protecao to set
     */
    public void setProtecao(int protecao) {
        this.protecao = protecao;
    }

    /**
     * @return the areaProtecao
     */
    public EnumParteCorpo getAreaProtecao() {
        return areaProtecao;
    }

    /**
     * @param areaProtecao the areaProtecao to set
     */
    public void setAreaProtecao(EnumParteCorpo areaProtecao) {
        this.areaProtecao = areaProtecao;
    }
    
    
}
