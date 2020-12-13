
package mataorcs.java;

public class Orc
{
    int exp;
    int life;
    int dano;
    boolean alive;
    
    //Construtor do Orc
    Orc(int exp, int life, int dano, boolean alive){
        this.exp = exp;
        this.life = life;
        this.dano = dano;
        this.alive = alive;
    }
    public String toString(){
        return "XP do Orc: " + exp + "||" + "Life Orc: " + life;
    }
}
