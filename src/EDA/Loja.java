package EDA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Mathes Bencke e Thiago Luis Watambak
 */
public class Loja{
    ArrayList<Itens> arrayItens = new ArrayList<>();
    ArrayList<Equipamento> arrayEquipamento = new ArrayList<>();
    Personagem personagem;
    public Loja(Personagem personagem){
        Random x = new Random();
        this.personagem = personagem;
        arrayEquipamento.add(new Arma(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Arma(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Arma(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Arma(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Elmo(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Elmo(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Elmo(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Elmo(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Peitoral(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Peitoral(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Peitoral(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Peitoral(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Grevas(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Grevas(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Grevas(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Grevas(x.nextInt(personagem.getLvl() + 10) + 1));

        
        arrayItens.add(new Itens());
        arrayItens.add(new Itens());
        arrayItens.add(new Itens());
        arrayItens.add(new Itens());        
    }
    
    public ArrayList getArrayEquipamento(){
        return arrayEquipamento;
    }
    
    public Equipamento getIndexEquipamento(int index){
        return arrayEquipamento.get(index);
    }
    
    public Itens getIndexItens(int index){
        return arrayItens.get(index);
    }
    
    public ArrayList getArrayItens(){
        return arrayItens;
    }
    
    public void removeEquipamentos(int index){
        arrayEquipamento.remove(index);
    }
}
