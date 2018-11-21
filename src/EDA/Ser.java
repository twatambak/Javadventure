
package EDA;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

abstract class Ser {
    String nome;
    int lvl;
    int atk;
    int hpMaximo;
    int hp;
    int forca;
    int destreza;
    int inteligencia;
    int vitalidade;
    TipoStatus status;

//========== Getters e Setters: Nome ===========================================

    /**
     * Define o nome do ser.
     * @return 
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Retorna o nome do ser.
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

//========== Getters e Setters: Level ==========================================
    
    /**
     * Retorna o nível do ser.
     * @return 
     */
    public int getLvl() {
        return lvl;
    }
    
    /**
     * Define o nível do ser.
     * @param lvl 
     */
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

//========== Getters e Setters: Ataque =========================================
    
    /**
     * Retorna a força de ataque do ser.
     * @return 
     */
    public int getAtk() {
        return atk;
    }
    
    /**
     * Define a força de ataque do ser.
     * @param atk 
     */
    public void setAtk(int atk) {
        this.atk = atk;
    }

//========== Getters e Setters: HP =============================================
    
    /**
     * Retorna os pontos de vida do ser.
     * @return 
     */
    public int getHp() {
        return hp;
    }
    
    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

//========== Getters e Setters: HP Máximo ======================================
    
    /**
     * 
     * @return 
     */
    public int getHpMaximo(){
        return hpMaximo;
    }
    
    /**
     * Define os pontos de vida do ser.
     */
    public void setHpMaximo() {
        hpMaximo = vitalidade * 100;
    }

//========== Getters e Setters: Força ==========================================
    
    /**
     * Retorna o nível de força do ser.
     * @return 
     */
    public int getForca() {
        return forca;
    }

    /**
     * Define o nível de força do ser.
     * @param forca 
     */
    public void setForca(int forca) {
        this.forca = forca;
    }

//========== Getters e Setters: Destreza =======================================    
    
    /**
     * Retorna o nível de destreza do ser.
     * @return 
     */
    public int getDestreza() {
        return destreza;
    }
    
    /**
     * Define o nível de destreza do ser.
     * @param destreza 
     */
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

//========== Getters e Setters: Inteligência ===================================
    
    /**
     * Retorna o nível de inteligência do ser.
     * @return 
     */
    public int getInteligencia() {
        return inteligencia;
    }
    
    /**
     * Define o nível de inteligência do ser.
     * @param inteligencia 
     */
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

//========== Getters e Setters: Vitalidade =====================================    
    
    /**
     * Retorna o nível de vitalidade do ser.
     * @return 
     */
    public int getVitalidade() {
        return vitalidade;
    }

    /**
     * Define o nível de vitalidade do ser.
     * @param vitalidade 
     */
    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

//========== Getetrs e Setters: Status =========================================

    /**
     * @return the status
     */
    public TipoStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(TipoStatus status) {
        this.status = status;
    }
    
    
}

