
package EDA;

import java.util.Random;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class Itens{
    private String nome;
    private int valorCompra;
    private EnumEficiencia eficiencia;
    private int quantidade;
    private EnumTipoItem tipo;
    
    public Itens(){
        Random x = new Random();
        tipo = EnumTipoItem.aleatoriza(x.nextInt(4) + 1);
        eficiencia = EnumEficiencia.aleatoriza(x.nextInt(5) + 1);
        quantidade = x.nextInt(10)+1;
        valorCompra = x.nextInt(eficiencia.getEficiencia() + 10) * 10;  
        
        this.nome = "" + tipo.toString() + " " + eficiencia.toString();
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

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the valorCompra
     */
    public int getValorCompra() {
        return valorCompra;
    }

    /**
     * @param valorCompra the valorCompra to set
     */
    public void setValorCompra(int valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    
}
