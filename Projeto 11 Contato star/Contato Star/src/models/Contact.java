package models;

import java.util.ArrayList;

public class Contact
{
    private ArrayList<Fone> fones;
    private String name;
    
    public String getName(){return this.name;}
    public ArrayList<Fone> getFones(){return this.fones;}

    public Contact(String name, ArrayList<Fone> fones)throws Exception{
        this.fones = new ArrayList<>();
        for(Fone fone: fones){
            if(!Fone.validate(fone.getNumber())){
                throw new Exception("Provavelmente você errou Um número");
            }
            this.fones.add(fone);
        }
        this.name = name;
    }

    public void addFone(String label, String number)throws Exception {
        if(Fone.validate(number)){
            fones.add(new Fone(label, number));
            return;
        }
        throw new Exception("Número inválido");
    }

    public void rmFone(int index)throws Exception{
        if(index < 0 || index > fones.size() - 1){
            throw new Exception("Index inválido");
        }
        fones.remove(index);
    }

    public String toString(){
        String aux = this.name + " ";

        for(int i = 0; i < fones.size(); i++){
            aux += "[" + i + ":" + fones.get(i).getLabel() + ":" + 
                    fones.get(i).getNumber() + "] ";
        }
        return aux;
    }
}