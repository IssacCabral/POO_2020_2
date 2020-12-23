package mainclass;
import java.util.Scanner;

public class MainClass 
{
    public static void main(String[] args) {
        Tamagochi fofinho = null;
        Scanner scann = new Scanner(System.in);
        
        while(true)
        {
            String linha = scann.nextLine();
            String[] op = linha.split(" ");
            
            if(op[0].equals("init")){
                fofinho = new Tamagochi(Integer.parseInt(op[1]),Integer.parseInt(op[2]),Integer.parseInt(op[3]));
            }else if(op[0].equals("show")){
                System.out.println(fofinho);
            }else if(op[0].equals("comer")){
                fofinho.comer();
            }else if(op[0].equals("brincar")){
                fofinho.brincar();
            }else if(op[0].equals("dormir")){
                fofinho.dormir();
            }else if(op[0].equals("banho")){
                fofinho.tomarBanho();
            }else if(op[0].equals("end")){
                break;
            }else{
                System.out.println("Fail: comando inválido!");
            }
        }
    }
}