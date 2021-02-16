package classes;

import java.util.ArrayList;

public class Contact 
{
    private String name;
    private ArrayList<Fone> fones;

    public Contact(String name){
        this.name = name;
        fones = new ArrayList<Fone>();
    }

    public void addFone(String label, String number){
        if(!Fone.validate(number)){
            System.out.println("Número inválido bitch!!!");
            return;
        }

        fones.add(new Fone(label, number));
    }

    public String getName(){return this.name;}
    public ArrayList<Fone> getFones(){return this.fones;}

    public boolean rmFone(int index){
        if(index > fones.size() || index < 0){
            System.out.println("Invalid Index!");
            return false;
        }
        fones.remove(fones.get(index));
        return true;
    }

    public String toString(){
        String aux = "- " + this.name + " ";
        
        for(int i = 0; i < fones.size(); i++){
            aux += "[" + i + ":" + fones.get(i) + "] "; 
        }
        return aux;
    }
}
