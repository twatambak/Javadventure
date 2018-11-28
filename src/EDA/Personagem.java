
package EDA;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class Personagem extends Ser{

    public int dinheiro;

    private int skillpoints;
    private int xp;
    private EnumClassePersonagem classe;
    private ArrayList<Equipamento> inventario = new ArrayList<>();
    
    public Personagem(String nome, int vitalidade, int inteligencia, int destreza, int forca) throws FileNotFoundException{
        this.nome = nome;
        
        this.destreza = destreza;
        this.vitalidade = vitalidade;
        this.forca = forca;
        this.inteligencia = inteligencia;
        
        defesa = false;
        
        hpMaximo = vitalidade * 100;
        hp = hpMaximo;
 
        
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
    }
    



//========== Getters e Setters: Ataque =========================================
    
    /**
     * Atualiza o ataque com base na Força e no dano da arma.
     */
    public void atualizaAtk(){
        atk = arma.getPropriedade() + forca;
    }

//========== Getters e Setters: XP =============================================
    
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
     * @return the classe
     */
    public EnumClassePersonagem getClasse() {
        return classe;
    }

    /**
     * @param classe the classe to set
     */
    public void setClasse(EnumClassePersonagem classe) {
        this.classe = classe;
    }

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


}
