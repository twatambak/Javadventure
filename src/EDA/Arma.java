
package EDA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class Arma extends Equipamento{
    private int dano;
    
    private static ArrayList<String> arrayArmas = new ArrayList<>();
    private File arquivoArmas = new File("Armas.txt");
    
    public Arma(int lvl) throws FileNotFoundException{
        this.lvl = lvl;
        Random x = new Random();
        dano = x.nextInt(lvl + 10) + 1;
        valorCompra = x.nextInt(dano + 50) + 1;
        
        Scanner leitor = new Scanner(new FileReader(arquivoArmas)).useDelimiter("\n");
        
        while(leitor.hasNext()){
            String aux = leitor.next();
            arrayArmas.add(aux);
        }
        
        this.nome = arrayArmas.get(x.nextInt(arrayArmas.size()));
    }

//========== Getters e Setters: Dano ===========================================    
    
    /**
     * Retorna o dano da arma.
     * @return the dano
     */
    public int getDano() {
        return dano;
    }

    /**
     * Define o dano da arma.
     * @param dano the dano to set
     */
    public void setDano(int dano) {
        this.dano = dano;
    }
}
