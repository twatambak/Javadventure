
package EDA;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class Batalha {
    private Ser jogador;
    private Ser monstro;
    
    public Batalha(Ser jogador, Ser monstro){
        this.jogador = jogador;
        this.monstro = monstro;
    }

//========== GETTERS E SETTERS: Jogador ========================================    
    
    /**
     * @return the jogador
     */
    public Ser getJogador() {
        return jogador;
    }

    /**
     * @param jogador
     */
    public void setJogador(Ser jogador) {
        this.jogador = jogador;
    }

//========== GETTERS E SETTERS: Monstro ========================================    
    
    /**
     * @return the monstro
     */
    public Ser getMonstro() {
        return monstro;
    }

    /**
     * @param monstro
     */
    public void setMonstro(Ser monstro) {
        this.monstro = monstro;
    }
    
//========== MÉTODOS ===========================================================

    public static void batalhaAtacar(){
        
    }
    
    public static void batalhaDefender(){
        
    }
    
}
