
package EDA;

import java.io.FileNotFoundException;
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
        
        hp = vitalidade * 100;
        atk = arma.getDano() + forca;
        
        lvl = 1;
        xp = 0;
        
        status = TipoStatus.NORMAL;
    }
    
//=========================== GETTERS E SETTERS ================================ 
    
    /**
     * Retorna a quantidade de poções de cura do jogador.
     * @return 
     */
    public int getQtdPot() {
        return qtdPot;
    }
    
    /**
     * Define a quantidade de poções de cura do jogador.
     * @param qtdPot 
     */
    public void setQtdPot(int qtdPot) {
        this.qtdPot = qtdPot;
    }
    
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
    
    /**
     * Define o ataque.
     */
    public void atualizaAtk(){
        atk = arma.getDano() + forca;
    }
    
    /**
     * Atualiza a quantidade de pontos de vida do jogador baseando-se na skill
     * de Vitalidade do mesmo. Se o jogador aumentar os pontos de Vitalidade,
     * consequentemente o HP será aumentado também.
     */
    public void atualizarHp(){
        setHp(vitalidade * 100);
    }
    
    /**
     * Adiciona o valor passado aos pontos de vida do Jogador. Como o prórpio 
     * nome da função já diz se trata de um método de cura. 
     */
    public void curar(){
        if(hp < vitalidade * 100 && getQtdPot() >= 1){
            setHp(hp + (vitalidade * 50));
        } else if(hp > vitalidade * 100){
            JOptionPane.showMessageDialog(null, "Sua vida está cheia", "Calma meu querido. Tu não precisa usar poções no momento.", JOptionPane.PLAIN_MESSAGE);
        } else if(getQtdPot() < 1){
            JOptionPane.showMessageDialog(null, "Você não possui nenhum item de cura no momento.", "Opa meu patrão. Tu devia comprar uns itens de cura aí. Vai que o caldo engrossa.", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    /**
     * Define os pontos de habilidade do jogador.
     * @param skillpoints
     */
    public void setSkillpoints(int skillpoints){
        this.skillpoints = skillpoints;
    }
    
    /**
     * Retorna os pontos de habilidade do jogador.
     * @return skillpoints
     */
    public int getSkillpoints(){
        return skillpoints;
    }

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
}
