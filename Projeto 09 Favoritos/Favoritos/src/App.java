import Models.*;
import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scann = new Scanner(System.in);
        ArrayList<Fone> fones = new ArrayList<>();

        while(true){
            String[] tokens = scann.nextLine().split(" ");

            if(tokens[0].equals("add")){
                for(int i = 2; i < tokens.length; i++){
                    fones.add(new Fone(tokens[2]));
                }
                agenda.addContact(tokens[1], fones);
                fones.clear();
            }else if(tokens[0].equals("show")){
                System.out.println(agenda);
            }else if(tokens[0].equals("end")){
                break;
            }else if(tokens[0].equals("star")){
                agenda.bookmark(tokens[1]);
            }else if(tokens[0].equals("rmContato")){
                agenda.rmContato(tokens[1]);
            }else if(tokens[0].equals("starred")){
                String aux = "";
                for(String key: agenda.getBookmark().keySet()){
                    aux += "❇️ " + agenda.getBookmark().get(key) + "\n";
                }
                System.out.println(aux);
            }else if(tokens[0].equals("unstar")){
                agenda.unBookmark(tokens[1]);
            }
        }
    }
}
