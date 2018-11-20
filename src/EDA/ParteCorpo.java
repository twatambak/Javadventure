
package EDA;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public enum ParteCorpo {
    CABECA(1, "Cabeça"), TORSO(2, "Torso"), PERNAS(3, "Pernas");
    
    int id;
    String parte;
    
    ParteCorpo(int id, String parte){
      this.id = id;
      this.parte = parte;
    }
    
    @Override
    public String toString(){
        return parte;
    }
}
