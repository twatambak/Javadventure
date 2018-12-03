
package EDA;

/**
 * @author Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public abstract class Armadura extends Equipamento{
    EnumParteCorpo areaProtecao;

//========== GETTERS E SETTERS: Área de Proteção ===============================    
    
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
