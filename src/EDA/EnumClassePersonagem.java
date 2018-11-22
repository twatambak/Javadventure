
package EDA;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public enum EnumClassePersonagem {
    GUERREIRO(1, "Guerreiro"), ARQUEIRO(2, "Arqueiro"), MAGO(3, "Mago");
    
    int id;
    String tipo;
    
    EnumClassePersonagem(int id, String tipo){
        this.id = id;
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return tipo;
    }
}
