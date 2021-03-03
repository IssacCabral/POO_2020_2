package models;

import java.util.ArrayList;

public class ContactPlus extends Contact 
{
    private boolean starred;

    public ContactPlus(String name, ArrayList<Fone> fones) throws Exception {
        super(name, fones);
    }

    public void setStarred(boolean value){
        this.starred = value;
    }
    public boolean getStarred(){
        return this.starred;
    }

    @Override
    public String toString(){
        String aux = "";
        aux += this.getName() + " ";

        for(int i = 0; i < this.getFones().size(); i++){
            aux += "[" + i + ":" + this.getFones().get(i).getLabel() + ":" + 
                    this.getFones().get(i).getNumber() + "] ";
        }

        return aux;

    }
}