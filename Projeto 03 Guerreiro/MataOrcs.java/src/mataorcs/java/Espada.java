
package mataorcs.java;

public class Espada 
{
    int ataque;
    int nivelE = 0;
    String nomeEspada = "Punhos vazios";
    
    void UparE(Guerreiro guerreiro){
        if(guerreiro.alive == false){
            System.out.println("VOCÊ ESTÁ MORTO");
            return;
        }
        if(guerreiro.nivelG == 1){
            this.ataque = 5;
            this.nivelE = 1;
            nomeEspada = "Pedaço de Pau";
            
            System.out.println("Parabéns Ganhou um nível na espada!");
            System.out.println("Aproveite bem o pedaço de pau ");
            System.out.println("Ela tem o ataque de " + this.ataque);
        }
        if(guerreiro.nivelG == 2){
            this.ataque = 15;
            this.nivelE = 2;
            nomeEspada = "Serrinha de Mesa";
            
            System.out.println("Parabéns ganhou um nível na espada!");
            System.out.println("Aproveite bem a Serrinha de Mesa");
            System.out.println("Ela tem o ataque de " + this.ataque);
        }
        if(guerreiro.nivelG == 3){
            this.ataque = 30;
            this.nivelE = 3;
            nomeEspada = "Agulha Perfurante";
            
            System.out.println("Parabéns Ganhou um nível na espada!");
            System.out.println("Aproveite bem a Agulha Perfurante");
            System.out.println("Ela tem o ataque de " + this.ataque);
        }
    }
    
}
