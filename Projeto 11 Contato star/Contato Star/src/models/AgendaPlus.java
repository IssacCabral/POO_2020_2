package models;

import java.util.TreeMap;

public class AgendaPlus extends Agenda
{
    private TreeMap<String, ContactPlus> bookmarks;

    public AgendaPlus(){
        this.bookmarks = new TreeMap<>();
    }

    @Override
    public void rmContact(String name)throws Exception{
        if(!this.getContacts().containsKey(name)){
            throw new Exception("Não tem não!");
        }
        if(bookmarks.containsKey(name)){
            bookmarks.remove(name);
        }
        if(this.getContacts().containsKey(name)){
            this.getContacts().remove(name);
        }
    }

    public void bookmark(String id)throws Exception{
        if(!this.getContacts().containsKey(id)){
            throw new Exception("Não existe fi");
        }
        Contact contact = this.getContacts().get(id);
        ContactPlus contactplus = new ContactPlus(id, contact.getFones());
        contactplus.setStarred(true);
        bookmarks.put(id, contactplus);
    }

    public void unBookmark(String id)throws Exception{
        if(!this.bookmarks.containsKey(id)){
            throw new Exception("Num tem não");
        }
        bookmarks.remove(id);
    }

    public TreeMap<String, ContactPlus> getBookmarks(){return this.bookmarks;}

    @Override
    public String toString(){
        String aux = "";

        for(Contact contact : this.getContacts().values()){
            if(bookmarks.containsKey(contact.getName())){
                aux += "@ " + this.bookmarks.get(contact.getName()) + "\n";
            }else{
                aux += "- " + contact + "\n";
            }
        }
        return aux;
    }

}