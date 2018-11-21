
package EDA;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public enum ClassePersonagem {
    GUERREIRO(1, "Guerreiro"), ARQUEIRO(2, "Arqueiro"), MAGO(3, "Mago");
    
    int id;
    String tipo;
    
    ClassePersonagem(int id, String tipo){
        this.id = id;
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return tipo;
    }
}
