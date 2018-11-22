
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

public class Arma extends Equipamento{
    private int dano;
    private EnumTipoArma tipo;
    
    private static ArrayList<String> arrayArmas = new ArrayList<>();
    private File arquivoArmas = new File("Armas.txt");
    
    public Arma() {
        try {
            Scanner leitor = new Scanner(new FileReader(arquivoArmas)).useDelimiter("\\n");
            this.lvl = BusinessFacade.getUsuarioLogado().getPersonagem().getLvl();
         
            Random x = new Random();
            dano = x.nextInt(lvl + 10) + 1;
            valorCompra = x.nextInt(dano + 100) + 100;
            
            while(leitor.hasNext()){
                String nomeS = leitor.next();
                arrayArmas.add(nomeS);
            }
                
            try {
                if(this.lvl <= 0 && this.lvl <= 9){
                    this.nome = arrayArmas.get(x.nextInt(10));
                } else if(this.lvl <= 10 && this.lvl <= 19){
                    this.nome = arrayArmas.get(x.nextInt(10) + 10);
                } else if(this.lvl <= 20 && this.lvl <= 29){
                    this.nome = arrayArmas.get(x.nextInt(10) + 20);
                } else if(this.lvl <= 30 && this.lvl <= 39){
                    this.nome = arrayArmas.get(x.nextInt(10) + 30);
                } else if(this.lvl <= 40 && this.lvl <= 49){
                    this.nome = arrayArmas.get(x.nextInt(10) + 40);
                } else {
                    this.nome = "Espada do desconhecido";
                }
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Erro crítico. Falha na integridade dos arquivos.", "Algo de errado não está certo", JOptionPane.ERROR_MESSAGE);
            }
            
            if(this.nome.equalsIgnoreCase("Espada")){
                tipo = EnumTipoArma.CORTANTE;
            } else if(this.nome.equalsIgnoreCase("Machado")){
                tipo = EnumTipoArma.CORTANTE;
            } else if(this.nome.equalsIgnoreCase("Lança")){
                tipo = EnumTipoArma.PERFURANTE;
            } else if(this.nome.equalsIgnoreCase("Punhal")){
                tipo = EnumTipoArma.PERFURANTE;
            } else if(this.nome.equalsIgnoreCase("Clava")){
                tipo = EnumTipoArma.CONTUNDENTE;
            } else if(this.nome.equalsIgnoreCase("Bastão")){
                tipo = EnumTipoArma.CONTUNDENTE;
            }
        } catch (HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro crítico. Falha na integridade dos arquivos.", "Algo de errado não está certo", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Arma(String nome, int dano, int valorCompra, int lvl, EnumTipoArma tipo){
        this.nome = nome;
        this.dano = dano;
        this.valorCompra = valorCompra;
        this.lvl = lvl;
        this.tipo = tipo;
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
