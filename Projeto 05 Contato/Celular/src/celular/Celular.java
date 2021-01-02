
package celular;
import java.util.Scanner;

public class Celular 
{
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Contato meuContato = new Contato(" ");
        
        while(true){        
            String linha = scann.nextLine();
            String[] ui = linha.split(" ");
            int status = 0;
            
            switch (ui[0]) {
                case "init":
                    meuContato = new Contato(ui[1]);
                    break;
                case "add":
                    meuContato.addFone(ui[1], ui[2]);
                    break;
                case "removeI":
                    meuContato.removeFone(Integer.parseInt(ui[1]));
                    break;
                case "removeN":
                    meuContato.removeFone(ui[1]);
                    break;
                case "show":
                    System.out.println(meuContato);
                    break;
                case "end":
                    status = 1;
                    break;
                default:
                    System.out.println("Fail: digite novamente");
                    break;
            }
            if(status == 1)
                break;
        }
        
    }
}
