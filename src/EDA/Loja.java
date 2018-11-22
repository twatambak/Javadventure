package EDA;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mathes Bencke e Thiago Luis Watambak
 */
public class Loja{
    private int valor = 0;
    private String nomeItem;
    private int atributos; 
    ArrayList<Equipamento> arrayLoja = new ArrayList<>();
    
    public Iterator getIteratorLoja(){
        Iterator itLoja = arrayLoja.iterator();
        return itLoja;
    }
    
    
}
