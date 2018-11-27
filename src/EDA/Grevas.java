
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
 * @authos Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class Grevas extends Armadura{
    
    
    private static ArrayList<String> arrayGrevas = new ArrayList<>();
    private File arquivoGrevas = new File("Grevas.txt");
    
    public Grevas(int lvl) {
        try {
            Scanner leitor = new Scanner(new FileReader(arquivoGrevas)).useDelimiter("\\n");
            this.lvl = lvl;
         
            Random x = new Random();
            protecao = x.nextInt(lvl + 10) + 1;
            valorCompra = x.nextInt(protecao + 100) + 100;
            areaProtecao = EnumParteCorpo.PERNAS;       
         
        
            while(leitor.hasNext()){
                String nomeS = leitor.next();
                arrayGrevas.add(nomeS);
            }
        } catch (HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro crítico. Falha na integridade dos arquivos.", "Algo de errado não está certo nas Grevas", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Grevas(String nome, int protecao, int valorCompra, int lvl, EnumParteCorpo areaProtecao){
        this.nome = nome;
        this.protecao = protecao;
        this.valorCompra = valorCompra;
        this.lvl = lvl;
        this.areaProtecao = areaProtecao;
    }

}
