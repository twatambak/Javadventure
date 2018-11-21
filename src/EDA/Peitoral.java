
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

public class Peitoral extends Equipamento{
    private int protecao;
    private ParteCorpo areaProtecao;
    
    private static ArrayList<String> arrayPeitorais = new ArrayList<>();
    private File arquivoPeitorais = new File("Peitorais.txt");
    
    public Peitoral(String nome, int lvl) throws FileNotFoundException {
        super(lvl);
        Random x = new Random();
        protecao = x.nextInt(lvl + 10) + 1;
        valorCompra = x.nextInt(protecao + 100) + 1;
        areaProtecao = ParteCorpo.TORSO;
        
        Scanner leitor = new Scanner(new FileReader(arquivoPeitorais)).useDelimiter("\n");
        
        while(leitor.hasNext()){
            String aux = leitor.next();
            arrayPeitorais.add(aux);
        }
        
        this.nome = arrayPeitorais.get(x.nextInt(arrayPeitorais.size()));
    }
    
        /**
     * Retorna o valor de proteção do equipamento.
     * @return 
     */
    public int getProtecao() {
        return protecao;
    }
    
    /**
     * Define o valor de proteção do equipamento.
     * @param protecao 
     */
    public void setProtecao(int protecao) {
        this.protecao = protecao;
    }
}
