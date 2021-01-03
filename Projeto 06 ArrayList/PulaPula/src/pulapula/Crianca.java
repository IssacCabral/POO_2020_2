
package pulapula;

public class Crianca 
{
    private String name;
    private int age;
    private double saldoCrianca;
    
    //Construtor
    Crianca(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    //Getters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getSaldo(){
        return this.saldoCrianca;
    }
    
    //Setter
    public void setSaldo(double value){
        this.saldoCrianca += value;
    }
    
    //toString
    public String toString(){
        return name + ": " + age + " ANOS ||" + " SALDO R$ " + saldoCrianca;
    }
}
