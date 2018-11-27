
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

public class Peitoral extends Armadura{
 
    
    private static ArrayList<String> arrayPeitorais = new ArrayList<>();
    private File arquivoPeitorais = new File("Peitorais.txt");
    
    public Peitoral(int lvl) {
        try {
            Scanner leitor = new Scanner(new FileReader(arquivoPeitorais)).useDelimiter("\\n");
            this.lvl = lvl;
         
            Random x = new Random();
            protecao = x.nextInt(lvl + 5) + lvl;
            valorCompra = x.nextInt(protecao + 100) + 100;
            areaProtecao = EnumParteCorpo.TORSO;       
         
        
            while(leitor.hasNext()){
                String nomeS = leitor.next();
                arrayPeitorais.add(nomeS);
            }

        } catch (HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro crítico. Falha na integridade dos arquivos.", "Algo de errado não está certo no Peitoral", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Peitoral(String nome, int protecao, int valorCompra, int lvl, EnumParteCorpo areaProtecao){
        this.nome = nome;
        this.protecao = protecao;
        this.valorCompra = valorCompra;
        this.lvl = lvl;
        this.areaProtecao = areaProtecao;
    }


}
