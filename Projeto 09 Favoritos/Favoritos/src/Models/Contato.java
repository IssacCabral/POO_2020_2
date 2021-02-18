package Models;

import java.util.ArrayList;

public class Contato 
{
    private String name;
    private ArrayList<Fone> fones;
    private boolean starred;
    
    public Contato(String name){
        this.name = name;
        this.fones = new ArrayList<>();
    }

    public void addFone(String label, String number){
        if(!Fone.validate(number)){
            System.out.println("Número inválido!!");
            return;
        }
        fones.add(new Fone(label, number));
    }

    public void rmFone(int index){
        if(index < 0 || index > fones.size()){
            System.out.println("Index inválido!");
            return;
        }
        fones.remove(index);
    }

    public void setStarred(boolean value){this.starred = value;}
    public boolean getStarred(){return this.starred;}

    public String toString(){
        String aux = this.name + " ";

        for(int i = 0; i < fones.size(); i++){
            aux += "[" + i + ":" + fones.get(i) + "] ";
        }
        return aux;
    }
    
}
