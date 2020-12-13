
package mataorcs.java;

public class Guerreiro 
{
    //atributos
    Espada espada = new Espada();
    Orc monstro = new Orc(5, 100, 10, false);  
    String nickName;
    int vida;
    int ataqueTotal = 20;
    int acumulaXp;
    int nivelG;
    int potions;
    boolean alive = true;
    boolean up1 = false;
    boolean up2 = false;
    boolean up3 = false;
    
    //Construtor
    Guerreiro(String nome, int vida, int potions){
        this.nickName = nome;
        this.vida = vida;
        this.potions = potions;
    }
    //Método toString
    public String toString(){
        return  "\n\n" +
                "|| Nome do Guerreiro: " + nickName + " ||\n" + 
                "|| ESPADA ATUAL: " + espada.nomeEspada + " ||\n" + 
                "|| ATAQUE ESPADA: " + espada.ataque + " ||\n" + 
                "|| XP do Guerreiro: " + acumulaXp + " ||\n" + 
                "|| ATAQUE : " + ataqueTotal + " ||\n" + 
                "|| Nível: " + nivelG + " ||\n" + 
                "|| LIFE: " + this.vida + " VIDA DO ORC: " + this.monstro.life + " ||\n\n";
    }
    void atacar(){
        if(monstro.alive == false && this.alive == true){
            monstro = new Orc(5, 100, 10, true);
            System.out.println("|||VOCÊ ESTÁ LUTANDO CONTRA UM NOVO MONSTRO|||");
        }
        
        if(this.alive == false){
            System.out.println("VOCÊ ESTAR MORTO");
            return;
        }
         
        this.monstro.life -= this.ataqueTotal;
        System.out.println("\nTome isso seu seboso!");
        
        this.vida -= this.monstro.dano;
        System.out.println("Droga, tomei porrada!");
        System.out.println("\n");
        
        System.out.println(" >>>> SUA VIDA: " + this.vida + " VIDA MONSTRO: " + monstro.life + " <<<");
        
        if(this.vida <= 0){
            System.out.println("VOCÊ MORREU!");
            this.vida = 0;
            this.alive = false;

        }
        if(monstro.life <= 0){
            System.out.println("VOCÊ MATOU O ORC E GANHOU " + monstro.exp + "DE EXPERIÊNCIA");
            monstro.life = 0;
            this.acumulaXp += monstro.exp;
            monstro.alive = false;
        }
    }
    void regenerar(){
        if(this.potions == 0){
            System.out.println("Suas Porções Acabaram!");
        }else if(this.vida == 100){
            System.out.println("NÃO PRECISO DISSO");
        }else{
            this.vida = 100;
            this.potions -= 1;
            System.out.println("Vida está completa");
        }
    }
    void uparG(){
        //10 de xp para nível 1
        //25 de xp para nível 2
        //70 de xp para nível 3
        
        if((this.acumulaXp >= 10 && this.acumulaXp < 25) && up1 == false){
            System.out.println("SEU PERSONAGEM SUBIU DE NÍVEL!");
            this.nivelG += 1;
            espada.UparE(this);
            this.ataqueTotal += espada.ataque;
            up1 = true;
            
        }else if((this.acumulaXp >= 25 && this.acumulaXp < 70) && up2 == false){
            System.out.println("SEU PERSONAGEM SUBIU DE NÍVEL!");
            this.nivelG += 1;
            espada.UparE(this);
            this.ataqueTotal += espada.ataque;
            up2 = true;
            
        }else if(this.acumulaXp >= 70 && up3 == false){
            System.out.println("SEU PERSONAGEM SUBIU DE NÍVEL!");
            this.nivelG += 1;
            espada.UparE(this);
            this.ataqueTotal += espada.ataque;
            up3 = true;
            
        }else{
            System.out.println("Você não tem experiência suficiente para Upar");
        }
    }
    
}
