
package EDA;

import Business.BusinessFacade;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class Elmo extends Armadura{

    private static ArrayList<String> arrayElmos = new ArrayList<>();
    private File arquivoElmos = new File("Elmos.txt");
    
    public Elmo(int lvl) {
        try {
            Scanner leitor = new Scanner(new FileReader(arquivoElmos)).useDelimiter("\\n");
            this.lvl = lvl;
         
            Random x = new Random();
            protecao = x.nextInt(lvl + 10) + 1;
            valorCompra = x.nextInt(protecao + 100) + 100;
            areaProtecao = EnumParteCorpo.CABECA;       
         
        
            while(leitor.hasNext()){
                String nomeS = leitor.next();
                arrayElmos.add(nomeS);
            }
            
            this.nome = arrayElmos.get(x.nextInt(arrayElmos.size()));

        } catch (HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro crítico. Falha na integridade dos arquivos.", "Algo de errado não está certo nos Elmos", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Elmo(String nome, int protecao, int valorCompra, int lvl, EnumParteCorpo areaProtecao){
        this.nome = nome;
        this.protecao = protecao;
        this.valorCompra = valorCompra;
        this.lvl = lvl;
        this.areaProtecao = areaProtecao;
    }


}
