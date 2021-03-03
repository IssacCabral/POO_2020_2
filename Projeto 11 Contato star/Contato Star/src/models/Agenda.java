package models;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Agenda
{
    private TreeMap<String, Contact> contacts;

    public Agenda(){
        this.contacts = new TreeMap<>();
    }

    public void addContact(Contact contact) throws Exception {
        
        //Quando não existe o contato no Map e vamos adiciona-lo
        if(this.contacts.get(contact.getName()) == null){
            this.contacts.put(contact.getName(), contact);
            return;
        }

        //Quando o contato já existe e vamos adicionar os telefones no contato existente
        for(Fone fone: contact.getFones()){
            this.contacts.get(contact.getName()).addFone(fone.getLabel(), 
            fone.getNumber());
        }
    }

    public void rmContact(String name)throws Exception{
        if(this.contacts.get(name) == null){
            throw new Exception("Fail: the contact " + name + " does not exist");
        }
        this.contacts.remove(name);
    }

    public Contact getContact(String name)throws Exception{
        if(this.contacts.get(name) == null){
            throw new Exception("Contato não existe");
        }
        return contacts.get(name);
    }

    public TreeMap<String, Contact> getContacts(){return this.contacts;}

    public Map<String, Contact> search(String pattern) {
        //pattern = pattern.toLowerCase();
        Map<String, Contact> searchContato = new TreeMap<>();
    
        for (Map.Entry<String, Contact> contato : contacts.entrySet()) {
          boolean founded = false;
          if (contato.getKey().contains(pattern))
            founded = true;
          for (Fone fone : contato.getValue().getFones()) {
            if (fone.getLabel().contains(pattern) || fone.getNumber().contains(pattern))
              founded = true;
          }
    
          if (founded) {
            searchContato.put(contato.getKey(), contato.getValue());
          }
        }
    
        return searchContato;
      }

    public String toString(){
        String aux = "";

        for(String key: contacts.keySet()){
            aux += contacts.get(key) + "\n";
        }
        return aux;
    }
}

