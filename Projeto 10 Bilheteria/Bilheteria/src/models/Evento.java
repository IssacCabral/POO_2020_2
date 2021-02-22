package models;

import java.util.TreeMap;

public class Evento 
{
    private String nome;
    private TreeMap<String, Setor> setores; 
    
    public Evento(String nome){
        this.nome = nome;
        this.setores = new TreeMap<>();
    }

    //getters
    public String getNome(){return this.nome;}
    public TreeMap<String, Setor> getSetores(){return this.setores;}

    //Setters
    public void setNome(String nome){this.nome = nome;}

    public void addSetor(Setor setor) throws Exception{
        if(setores.containsKey(setor.getNome())){
            throw new Exception ("Fail: Setor já existe!");
        }
        setores.put(setor.getNome(), setor);
    }

    public String toString(){
        String aux = this.nome + "\n";

        for(String key: setores.keySet()){
            aux += setores.get(key) + "\n";
        }
        return aux;
    }
}
