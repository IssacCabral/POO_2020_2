
package mainclass;

public class Tamagochi 
{
    //Máximos
    private int energiaMax, saciedadeMax, limpezaMax;
    
    //Atributos
    private int energia, saciedade, limpeza;
    private int diamonds;
    private int idade;
    private boolean alive;
    
    //Construtor//
    Tamagochi(int energia, int saciedade, int limpeza){
        this.energiaMax = energia;
        this.saciedadeMax = saciedade;
        this.limpezaMax = limpeza;
        
        this.energia = energiaMax;
        this.saciedade = saciedadeMax;
        this.limpeza = limpezaMax;
        this.alive = true;
    }
    
    //Getters
    public int getDiamonds(){return this.diamonds;}
    public int getIdade(){return this.idade;}
    public int getEnergia(){return this.energia;}
    public int getSaciedade(){return this.saciedade;}
    public int getLimpeza(){return this.limpeza;}
    public boolean getAlive(){return this.alive;}
    public int getEnergiaMax(){return this.energiaMax;}
    public int getSaciedadeMax(){return this.saciedadeMax;}
    public int getLimpezaMax(){return this.limpezaMax;}
    
    //Setters
    private void setEnergia(int value){
        this.energia += value;
        
        if(this.getEnergia() > this.getEnergiaMax()){
            this.energia = this.getEnergiaMax();
        }
        if(this.energia <= 0){
            this.alive = false;
            this.energia = 0;
            System.out.println("fail: O pet morreu cansado!!");
        }   
    }
    
    private void setSaciedade(int value){
        this.saciedade += value;
        
        if(this.getSaciedade() > this.getSaciedadeMax()){
            this.saciedade = this.saciedadeMax;
        }
        
        if(this.saciedade <= 0){
            this.alive = false;
            this.saciedade = 0;
            System.out.println("fail: O pet teve morte por inanição!!");
        }
    }
    private void setLimpeza(int value){
        this.limpeza += value;
        
        if(this.getLimpeza() > this.getLimpezaMax()){
            this.limpeza = this.limpezaMax;
        }
        if(this.getLimpeza() <= 0){
            this.alive = false;
            this.limpeza = 0;
            System.out.println("fail: O pet morreu de Ceroto!!");
        }
    }
    
    //Interface   
    
    //altera em -1 a energia, +4 a saciedade, -2 a limpeza, +0 diamantes,  +1 a idade
    public void comer(){
        if(this.alive == false){
            System.out.println("fail: Seu Pet estar morto!");
            return;
        }
        
        this.setEnergia(-1);
        this.setSaciedade(+4);
        this.setLimpeza(-2);
        this.idade += 1;
    }
    
    //O comando brincar altera em -2 energia, -1 saciedade,-3 limpeza, +1 diamante, +1 idade
    public void brincar(){
        if(this.alive == false){
            System.out.println("fail: Seu Pet estar morto!");
            return;
        }
        
        this.setEnergia(-2);
        this.setSaciedade(-1);
        this.setLimpeza(-3);
        this.diamonds += 1;
        this.idade += 1;
    }
    
    //aumenta energia até o máximo e idade aumenta do número de turnos que o pet dormiu.
    public void dormir(){
        if(this.alive == false){
            System.out.println("fail: Seu Pet estar morto!");
            return;
        }
        if((this.getEnergiaMax() - this.getEnergia()) <= 4){
            System.out.println("fail: Pet sem sono!!");
            return;
        }
        
        this.setEnergia(this.getEnergiaMax());
        this.idade += this.getEnergiaMax()- this.getEnergia();
    }
    
    //alteram em -3 energia, -1 na saciedade, MAX na limpeza, +0 diamantes, +2 na idade.
    public void tomarBanho(){
        if(this.alive == false){
            System.out.println("fail: Seu Pet estar morto!");
            return;
        }
        if((this.getLimpezaMax()- this.getLimpeza()) <= 5){
            System.out.println("fail: O Pet ainda está limpinho!!");
            return;
        }
        
        this.setEnergia(-3);
        this.setSaciedade(-1);
        this.setLimpeza(this.getLimpezaMax());
        this.idade += 2;
        
    }
    
    //toString
    public String toString(){
        return "E: " + energia + "/" + energiaMax + ", " + "S: " + saciedade + 
                "/" + saciedadeMax + ", "
               + "L: " + limpeza + "/" + limpezaMax + ", " + "D: "+ diamonds + ", " + 
               "I: " + idade; 
    }
    
}
