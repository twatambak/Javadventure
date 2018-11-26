
package EDA;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public enum EnumParteCorpo {
    CABECA(1, "Cabeça"), TORSO(2, "Torso"), PERNAS(3, "Pernas");
    
    int id;
    String parte;
    
    EnumParteCorpo(int id, String parte){
      this.id = id;
      this.parte = parte;
    }
    
    public static EnumParteCorpo aleatoriza(int id){
        switch(id){
            case 1:
                return CABECA;
            case 2:
                return TORSO;
            case 3:
                return PERNAS;
            default:
                return TORSO;
        }
    }
    
    @Override
    public String toString(){
        return parte;
    }
}
