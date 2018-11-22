
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

public class Peitoral extends Equipamento{
    private int protecao;
    private EnumParteCorpo areaProtecao;
    
    private static ArrayList<String> arrayPeitorais = new ArrayList<>();
    private File arquivoPeitorais = new File("Peitorais.txt");
    
    public Peitoral() {
        try {
            Scanner leitor = new Scanner(new FileReader(arquivoPeitorais)).useDelimiter("\\n");
            this.lvl = BusinessFacade.getUsuarioLogado().getPersonagem().getLvl();
         
            Random x = new Random();
            protecao = x.nextInt(lvl + 10) + 1;
            valorCompra = x.nextInt(protecao + 100) + 100;
            areaProtecao = EnumParteCorpo.TORSO;       
         
        
            while(leitor.hasNext()){
                String nomeS = leitor.next();
                arrayPeitorais.add(nomeS);
            }
                
            try {
                if(this.lvl <= 0 && this.lvl <= 9){
                    this.nome = arrayPeitorais.get(x.nextInt(10));
                } else if(this.lvl <= 10 && this.lvl <= 19){
                    this.nome = arrayPeitorais.get(x.nextInt(10) + 10);
                } else if(this.lvl <= 20 && this.lvl <= 29){
                    this.nome = arrayPeitorais.get(x.nextInt(10) + 20);
                } else if(this.lvl <= 30 && this.lvl <= 39){
                    this.nome = arrayPeitorais.get(x.nextInt(10) + 30);
                } else if(this.lvl <= 40 && this.lvl <= 49){
                    this.nome = arrayPeitorais.get(x.nextInt(10) + 40);
                } else {
                    this.nome = "Peitoral do desconhecido";
                }
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Erro crítico. Falha na integridade dos arquivos.", "Algo de errado não está certo", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro crítico. Falha na integridade dos arquivos.", "Algo de errado não está certo", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Peitoral(String nome, int protecao, int valorCompra, int lvl, EnumParteCorpo areaProtecao){
        this.nome = nome;
        this.protecao = protecao;
        this.valorCompra = valorCompra;
        this.lvl = lvl;
        this.areaProtecao = areaProtecao;
    }

//========== Getters e Setters: Proteção =======================================
    
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
