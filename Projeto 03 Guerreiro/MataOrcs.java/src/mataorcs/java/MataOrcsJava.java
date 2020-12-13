
package mataorcs.java;
import java.util.Scanner;

public class MataOrcsJava 
{
    public static void main(String[] args) {
        Guerreiro magaiva = new Guerreiro("Magaiva", 100, 5);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n++++++ BEM VINDO AO MATA ORCS ++++++\n");
        System.out.println("SUAS OPÇÕES: \n");
        System.out.println(">>> end - PARA ENCERRAR O GAME");
        System.out.println(">>> atacar - PARA BATER NO MOSNTRO");
        System.out.println(">>> regenerar - PARA REGENERAR A SUA VIDA");
        System.out.println(">>> show - PARA MOSTRAR OS SEUS STATUS");
        System.out.println(">>> Show orc - PARA VER OS ATRIBUTOS DO MONSTRO");
        
        while(true)
        {
            String line = scanner.nextLine();
               
            if(line.equals("end")){
                break;
            }else if(line.equals("atacar")){
                magaiva.atacar();
            }else if(line.equals("regenerar")){
                magaiva.regenerar();
            }else if(line.equals("upar")){
                magaiva.uparG();
            }else if(line.equals("show")){
                System.out.println(magaiva);
            }else if(line.equals("Show orc")){
                System.out.println(magaiva.monstro);
            }else{
                System.out.println("Fail: entrada inválida!");
            }

            
        }
    }
}
