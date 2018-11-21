
package EDA;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class Personagem extends Ser{
    private Arma arma;
    private Elmo elmo;
    private Peitoral peito;
    private Grevas bota;
    public int qtdPot;
    public int dinheiro;
    private int protecaoTotal;
    private int skillpoints;
    private int xp;
    private ClassePersonagem classe;
    private ArrayList<Equipamento> arrayEquipamento = new ArrayList<>();
    
    public Personagem(String nome, int vitalidade, int inteligencia, int destreza, int forca) throws FileNotFoundException{
        Arma armaInicial = new Arma(5);
        arma = armaInicial;
        
        Elmo elmoInicial = new Elmo(5);
        elmo = elmoInicial;
        
        Peitoral peitoralInicial = new Peitoral(5);
        peito = peitoralInicial;
        
        Grevas grevasInicial = new Grevas(5);
        bota = grevasInicial;
        
        protecaoTotal = elmoInicial.getProtecao() + peitoralInicial.getProtecao() + grevasInicial.getProtecao();
        
        this.nome = nome;
        
        this.destreza = destreza;
        this.vitalidade = vitalidade;
        this.forca = forca;
        this.inteligencia = inteligencia;
        
        hpMaximo = vitalidade * 100;
        hp = hpMaximo;
        atk = arma.getDano() + forca;
        
        lvl = 1;
        xp = 0;
        
        status = TipoStatus.NORMAL;
    }
    
//========== Getters e Setters: Armas ==========================================
    
    /**
     * Retorna a arma equipada.
     * @return the arma
     */
    public Arma getArma() {
        return arma;
    }

    /**
     * Define a arma equipada.
     * @param arma the arma to set
     */
    public void setArma(Arma arma) {
        this.arma = arma;
        atk = arma.getDano() + forca;
    }    

//========== Getters e Setters: Elmo ===========================================
    
    /**
     * Retorna o elmo equipado.
     * @return the elmo
     */
    public Elmo getElmo() {
        return elmo;
    }

    /**
     * Define o elmo equipado.
     * @param elmo the elmo to set
     */
    public void setElmo(Elmo elmo) {
        this.elmo = elmo;
        protecaoTotal = protecaoTotal + this.elmo.getProtecao();
    }
    
//========== Getters e Setters: Peitoral =======================================

    /**
     * Retorna o peitoral equipado.
     * @return the peito
     */
    public Peitoral getPeito() {
        return peito;
    }

    /**
     * Define o peitoral equipado.
     * @param peito the peito to set
     */
    public void setPeito(Peitoral peito) {
        this.peito = peito;
        protecaoTotal = protecaoTotal + this.peito.getProtecao();
    }

//========== Getters e Setters: Grevas =========================================    
    
    /**
     * Retorna as grevas equipadas.
     * @return the bota
     */
    public Grevas getBota() {
        return bota;
        
    }

    /**
     * Define as grevas equipadas.
     * @param bota the bota to set
     */
    public void setBota(Grevas bota) {
        this.bota = bota;
        protecaoTotal = protecaoTotal + this.bota.getProtecao();
    }

//========== Getters e Setters: Proteção Total =================================
    
    /**
     * Retorna a proteção total.
     * @return the protecaoTotal
     */
    public int getProtecaoTotal() {
        return protecaoTotal;
    }

    /**
     * Define a proteção total.
     * @param protecaoTotal the protecaoTotal to set
     */
    public void setProtecaoTotal(int protecaoTotal) {
        this.protecaoTotal = protecaoTotal;
    }
    
//========== Getters e Setters: Ataque =========================================
    
    /**
     * Atualiza o ataque com base na Força e no dano da arma.
     */
    public void atualizaAtk(){
        atk = arma.getDano() + forca;
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
    
}
