
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
    
    @Override
    public String toString(){
        return tipo;
    }
}
