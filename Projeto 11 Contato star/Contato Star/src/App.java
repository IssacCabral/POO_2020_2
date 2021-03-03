
import models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception {
        ArrayList<Fone> fones = new ArrayList<>();
        AgendaPlus agenda = new AgendaPlus();

        fones.add(new Fone("Tim:888"));
        fones.add(new Fone("Claro:777"));
        fones.add(new Fone("oi:999"));
        
        Contact contact1 = new Contact("Mateus", fones);
        agenda.addContact(contact1);
        agenda.bookmark("Mateus");

        Contact contact2 = new Contact("Maria", fones);
        agenda.addContact(contact2);

        System.out.println(agenda);

        agenda.unBookmark("Mateus");
        System.out.println(agenda);

        System.out.println(agenda.getContact("Maria"));

        System.out.println(agenda.search("mar"));
        

    }
}
