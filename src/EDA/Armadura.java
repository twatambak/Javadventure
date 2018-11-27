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
    EnumParteCorpo areaProtecao;


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
