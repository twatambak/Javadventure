
package EDA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @authos Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class Grevas extends Equipamento{
    private int protecao;
    private ParteCorpo areaProtecao;
    
    private static ArrayList<String> arrayGrevas = new ArrayList<>();
    private File arquivoGrevas = new File("Grevas.txt");
    
    public Grevas(String nome, int lvl) throws FileNotFoundException {
        super(lvl);
        Random x = new Random();
        protecao = x.nextInt(lvl + 10) + 1;
        valorCompra = x.nextInt(protecao + 100) + 1;
        areaProtecao = ParteCorpo.PERNAS;
        
        Scanner leitor = new Scanner(new FileReader(arquivoGrevas)).useDelimiter("\n");
        
        while(leitor.hasNext()){
            String aux = leitor.next();
            arrayGrevas.add(aux);
        }
        
        this.nome = arrayGrevas.get(x.nextInt(arrayGrevas.size()));
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
