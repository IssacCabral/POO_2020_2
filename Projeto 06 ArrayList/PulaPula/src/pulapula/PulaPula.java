
package pulapula;
import java.util.Scanner;

public class PulaPula 
{
    public static void main(String[] args) {
        Trampolim pp = new Trampolim();
        Scanner scann = new Scanner(System.in);
        
        while(true){
            String[] ui = scann.nextLine().split(" ");
            
            if(ui[0].equals("arrive")){
                pp.arrive(new Crianca(ui[1], Integer.parseInt(ui[2])));
            }else if(ui[0].equals("in")){
                pp.in();
            }else if(ui[0].equals("out")){
                pp.out();
            }else if(ui[0].equals("remove")){
                pp.remove(ui[1]);
            }else if(ui[0].equals("show")){
                System.out.println(pp);
            }else if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("saldo")){
                pp.saldoCrianca(ui[1]);
            }else if(ui[0].equals("caixa")){
                System.out.println(pp.saldoCaixa());
            }else if(ui[0].equals("fechar")){
                pp.removeAll();
            }
            
            else
                System.out.println("fail: comando inválido!!");
        }

    }
    
}
