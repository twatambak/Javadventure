
package EDA;

import static EDA.EnumTipoItem.ANTIDOTO;
import static EDA.EnumTipoItem.BANDAGEM;
import static EDA.EnumTipoItem.CURA;
import static EDA.EnumTipoItem.STAMINA;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public enum EnumEficiencia {
    EXTREMA(1, "Extrema", 500), FORTE(2, "Forte", 250), MEDIA(3, "Média", 100), BAIXA(4, "Baixa", 50), RIDICULA(5, "Ridícula", 25);
    
    int id;
    String tipo;
    int eficiencia;
    
    EnumEficiencia(int id, String tipo,int eficiencia){
        this.id = id;
        this.tipo = tipo;
        this.eficiencia = eficiencia;
    }

    public static EnumEficiencia aleatoriza(int id){
        switch(id){
            case 1:
                return EXTREMA;
            case 2:
                return FORTE;
            case 3:
                return MEDIA;
            case 4:
                return BAIXA;
            case 5:
                return RIDICULA;
            default:
                return MEDIA;
        }
    }
    
    public int getEficiencia(){
        return eficiencia;
    }
    
    public String toString(){
        return tipo;
    }
}
