
package EDA;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public enum EnumTipoItem {
    CURA(1, "Poção de Cura"), STAMINA(2, "Poção de Stamina"), BANDAGEM(3, "Bandagem"), ANTIDOTO(4, "Antídoto");
    
    int id;
    String tipo;
    
    EnumTipoItem(int id, String tipo){
        this.id = id;
        this.tipo = tipo;
    }
    
    public static EnumTipoItem aleatoriza(int id){
        switch(id){
            case 1:
                return CURA;
            case 2:
                return STAMINA;
            case 3:
                return BANDAGEM;
            case 4:
                return ANTIDOTO;
            default:
                return CURA;
        }
    }
    
    public String toString(){
        return tipo;
    }
}
