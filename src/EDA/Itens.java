
package EDA;

import java.util.Random;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class Itens extends Equipamento{
    private EnumEficiencia eficiencia;
    private int quantidade;
    private EnumTipoItem tipo;
    
    public Itens(){
        Random x = new Random();
        tipo = EnumTipoItem.aleatoriza(x.nextInt(4) + 1);
        eficiencia = EnumEficiencia.aleatoriza(x.nextInt(5) + 1);
        quantidade = 1;
        
        this.nome = "" + tipo.toString() + " " + tipo.toString();
    }

//========== Getters e Setters: Eficiência =====================================
    
    /**
     * @return the eficiencia
     */
    public EnumEficiencia getEficiencia() {
        return eficiencia;
    }

    /**
     * @param eficiencia the eficiencia to set
     */
    public void setEficiencia(EnumEficiencia eficiencia) {
        this.eficiencia = eficiencia;
    }

//========== Getters e Setters: Quantidade =====================================
    
    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

//========== Getters e Setters: Tipo ===========================================
    
    /**
     * @return the tipo
     */
    public EnumTipoItem getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(EnumTipoItem tipo) {
        this.tipo = tipo;
    }
    
    
}
