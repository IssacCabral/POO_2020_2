package classes;

import java.util.*;

public class Phonebook
{
    private ArrayList<Contact> contacts;

    public Phonebook(){
        contacts = new ArrayList<Contact>();
    }

    public void addContact(String name, ArrayList<Fone> fones){
        Contact contact = this.getContact(name);

        //Caso não existe, cria novo contato e adiciona os telefones
        if(contact == null){
            contact = new Contact(name);
            for(Fone fone: fones){
                contact.addFone(fone.label, fone.number);
            }
            this.contacts.add(contact);
            
            Collections.sort(contacts, new ComparatorPeople());
            return;
        }
        
        //Caso já existe, adiciona os telefones no contato existente
        for(Fone fone: fones){
            contact.addFone(fone.label, fone.number);
        }
        
        Collections.sort(contacts, new ComparatorPeople());
        return;
    }

    public Contact getContact(String name){
        for(Contact contact: contacts){
            if(contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }

    private int findContact(String name){
        for(int i = 0; i< contacts.size(); i++){
            if(contacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void rmContact(String name){
        int index = findContact(name);
        
        if(index != -1){
            contacts.remove(index);
            return;
        }

        System.out.println("Contact NOT Found!");
    }

    public ArrayList<Contact> search(String pattern) {
        ArrayList<Contact> encontrados = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().indexOf(pattern) != -1) {
                encontrados.add(contact);
            }
        }
        if (!Fone.validate(pattern))
            System.out.println("Número não está no padrão");

        else if (Fone.validate(pattern)) {
            for (int i = 0; i < contacts.size(); i++) {
                for (Fone fon : contacts.get(i).getFones()) {
                    if (fon.number.indexOf(pattern) != -1) {
                        encontrados.add(contacts.get(i));
                    }
                }
            }
        }
        return encontrados;
    }

    public String toString(){
        String aux = "";

        for(Contact contact: contacts){
            aux += contact + "\n";
        }
        return aux;
    }
}
