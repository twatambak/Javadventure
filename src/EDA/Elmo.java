
package EDA;

import Business.BusinessFacade;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class Elmo extends Equipamento{
    private int protecao;
    private ParteCorpo areaProtecao;
    
    private static ArrayList<Elmo> arrayElmo = new ArrayList<>();
    private static ArrayList<String> arrayNome = new ArrayList<>();
    private File arquivoElmos = new File("Elmos.txt");
    
    public Elmo() throws FileNotFoundException {
        try {
            Scanner leitor = new Scanner(new FileReader(arquivoElmos)).useDelimiter("\\n");
            this.lvl = BusinessFacade.getUsuarioLogado().getPersonagem().getLvl();
            
            Random x = new Random();

            protecao = x.nextInt(lvl + 10) + 1;
            valorCompra = x.nextInt(protecao + 100) + 1;
            areaProtecao = ParteCorpo.CABECA;       
            
        
            while(leitor.hasNext()){
                String nomeS = leitor.next();
                arrayNome.add(nomeS);
            }
        
            this.nome = arrayNome.get(x.nextInt(arrayNome.size()));
        } catch (NullPointerException e) {
        }
        
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
    
    public String salvaString(){
        return "" + getNome() + ";" + getDescricao() + ";";
    }
}
