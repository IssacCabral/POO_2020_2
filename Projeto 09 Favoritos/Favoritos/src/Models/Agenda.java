package Models;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Agenda 
{
    private TreeMap<String, Contato> contatos = new TreeMap<>();
    private TreeMap<String, Contato> bookmark = new TreeMap<>();

    public Contato getContato(String name){
        Contato contato = contatos.get(name);

        if(contato != null){
            return contato;
        }
        return null;
    }

    public void addContact(String name, ArrayList<Fone> fones){
        Contato contato = this.getContato(name);

        //Caso não existe, cria novo contato e adiciona os telefones
        if(contato == null){
            contato = new Contato(name);
            for(Fone fone: fones){
                contato.addFone(fone.getLabel(), fone.getNumber());
            }
            contatos.put(name, contato);
            return;
        }
        //Caso já existe, adiciona os telefones no contato existente
        for(Fone fone: fones){
            contato.addFone(fone.getLabel(), fone.getNumber());
        }
        return;
    }

    public boolean rmContato(String name){
        if(this.contatos.containsKey(name)){
            contatos.remove(name);
            bookmark.remove(name);
            return true;
        }
        System.out.println("Contato não encontrado!!");
        return false;
    }

    public void bookmark(String id){
        if(contatos.get(id) != null){
            if(!contatos.get(id).getStarred()){
                contatos.get(id).setStarred(true);
                bookmark.put(id, contatos.get(id));
                return;
            }
        }
        System.out.println("fail: contato " + id + " Não existe");
        return;
    }

    public void unBookmark(String id){
        if(contatos.get(id) != null){
            if(contatos.get(id).getStarred()){
                contatos.get(id).setStarred(false);
                bookmark.remove(id);
                return;
            }
        }
        System.out.println("fail: contato " + id + " Não existe");
        return;
    }

    public TreeMap<String, Contato> getContatos(){return this.contatos;}
    public TreeMap<String, Contato> getBookmark(){return this.bookmark;}

    public String toString(){
        String aux = "";

        for(String key: contatos.keySet()){
            if(contatos.get(key).getStarred() == true){
                aux += "❇️ " + contatos.get(key) + "\n";
            }else{
                aux += "🔰 " + contatos.get(key) + "\n";
            }
        }
        return aux;
    }


}
