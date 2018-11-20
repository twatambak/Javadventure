
package EDA;

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
    
    public Personagem(String nome, int vitalidade, int inteligencia, int destreza, int forca){
        Arma armaInicial = new Arma("Espada do Aventureiro Pobre", 5);
        arma = armaInicial;
        
        Elmo elmoInicial = new Elmo("Elmo do Aventureiro Pobre", 5);
        elmo = elmoInicial;
        
        Peitoral peitoralInicial = new Peitoral("Peitoral do Aventureiro Pobre", 5);
        peito = peitoralInicial;
        
        Grevas grevasInicial = new Grevas("Grevas do Aventureiro Pobre", 5);
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
    
}
