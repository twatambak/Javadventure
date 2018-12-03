
package EDA;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class Personagem extends Ser{

    public int dinheiro;

    private int skillpoints;
    private int xp;
    private ArrayList<Equipamento> inventario = new ArrayList<>();
    private ArrayList<Itens> consumiveis = new ArrayList<>();
    
    public Personagem(String nome, int vitalidade, int inteligencia, int destreza, int forca, Icon aparencia) throws FileNotFoundException{
        this.nome = nome;
        
        this.destreza = destreza;
        this.vitalidade = vitalidade;
        this.forca = forca;
        this.inteligencia = inteligencia;
        
        defesa = false;
        
        hpMaximo = vitalidade * 100;
        hp = hpMaximo;
 
        qtdPot = 5;
        lvl = 1;
        xp = 0;
        dinheiro = 1000;
        status = EnumStatus.NORMAL;
        
        Arma armaInicial = new Arma(this.lvl);
        arma = armaInicial;
        
        Elmo elmoInicial = new Elmo("Touca de Fazendeiro", 2, 0, 1, EnumParteCorpo.CABECA);
        elmo = elmoInicial;
        
        Peitoral peitoralInicial = new Peitoral("Traje de Fazendeiro", 2, 0, 1, EnumParteCorpo.TORSO);
        peito = peitoralInicial;
        
        Grevas grevasInicial = new Grevas("Botas de Fazendeiro", 2, 0, 1, EnumParteCorpo.PERNAS);
        bota = grevasInicial;
        
        protecaoTotal = elmoInicial.getPropriedade() + peitoralInicial.getPropriedade() + grevasInicial.getPropriedade();
        
        atk = arma.getPropriedade() + forca;
        
        this.aparencia = aparencia;
    }
    



//========== Getters e Setters: Ataque =========================================
 
    /**
     * @return the xp
     */
    public int getXp() {
        return xp;
    }

    /**
     * @param xp the xp to set
     */
    public void setXp(int xp) {
        this.xp = xp;
    }

//========== Getters e Setters: Dinheiro =======================================
    
    /**
     * Retorna o dinheiro do jogador.
     * @return 
     */
    public int getDinheiro() {
        return dinheiro;
    }

    /**
     * Define o dinheiro do jogador.
     * @param dinheiro 
     */
    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

//========== Getters e Setters: Skillpoints ====================================
    
    /**
     * Retorna os pontos de habilidade do jogador.
     * @return skillpoints
     */
    public int getSkillpoints(){
        return skillpoints;
    }
    
    /**
     * Define os pontos de habilidade do jogador.
     * @param skillpoints
     */
    public void setSkillpoints(int skillpoints){
        this.skillpoints = skillpoints;
    }

//========== Métodos ===========================================================



    /**
     * @return the inventario
     */
    public ArrayList<Equipamento> getInventario() {
        return inventario;
    }

    /**
     * @param inventario the inventario to set
     */
    public void setInventario(ArrayList<Equipamento> inventario) {
        this.inventario = inventario;
    }

    public Icon aparencia(){
        return aparencia;
    }
    
    public void upar(int skill){
        this.setSkillpoints(this.getSkillpoints() - 1);
        switch(skill){
            case 1:
                this.setForca(this.getForca() + 1);
                break;
            case 2:
                this.setDestreza(this.getDestreza() + 1);
                break;
            case 3:
                this.setInteligencia(this.getInteligencia() + 1);
                break;
            case 4:
                this.setVitalidade(this.getVitalidade() + 1);
                break;
        }
    }

    /**
     * @return the consumiveis
     */
    public ArrayList<Itens> getConsumiveis() {
        return consumiveis;
    }

    /**
     * @param consumiveis the consumiveis to set
     */
    public void setConsumiveis(ArrayList<Itens> consumiveis) {
        this.consumiveis = consumiveis;
    }
    
    
}
