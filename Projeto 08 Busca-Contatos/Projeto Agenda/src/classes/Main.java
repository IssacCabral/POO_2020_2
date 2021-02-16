package classes;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Phonebook myBook = new Phonebook();
        Scanner scann = new Scanner(System.in);
        ArrayList<Fone> fones = new ArrayList<Fone>();
   
        while(true){
            String[] tokens = scann.nextLine().split(" ");

            if(tokens[0].equals("add")){
                for(int i = 2; i < tokens.length; i++){
                    fones.add(new Fone(tokens[i]));
                }
                myBook.addContact(tokens[1], fones);
                fones.clear();
            }else if(tokens[0].equals("show")){
                System.out.println(myBook);
            }else if(tokens[0].equals("rmfone")){
                myBook.getContact(tokens[1]).rmFone(Integer.parseInt(tokens[2]));
            }else if(tokens[0].equals("rm")){
                myBook.rmContact(tokens[1]);
            }else if(tokens[0].equals("end")){
                break;
            }else if(tokens[0].equals("search")){
                myBook.search(tokens[1]);
            }else{
                System.out.println("Invalid text!!!!!");
            }

        }
    }
}
