
package EDA;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public enum TipoArma {
    PERFURANTE(1, "Perfurante"), CORTANTE(2, "Cortante"), CONTUNDENTE(3, "Contundente");
    
    int id;
    String tipo;
    
    TipoArma(int id, String tipo){
        this.id = id;
        this.tipo = tipo;
    }
    
    public static TipoArma aleatoriza(int id){
        switch(id){
            case 1:
                return PERFURANTE;
            case 2:
                return CORTANTE;
            case 3:
                return CONTUNDENTE;
            default:
                return CORTANTE;
        }
    }
    
    @Override
    public String toString(){
        return tipo;
    }
}
