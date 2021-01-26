
package junkfood;

public class Espiral 
{
    public String nome;
    public int quantidade;
    public float preco;
    
    //Construtor
    public Espiral(String nome, int qnt, float price){
        this.nome = nome;
        this.quantidade = qnt;
        this.preco = price;
    }
    
    public String toString(){
        return this.nome + " : " + this.quantidade + " U : " + this.preco + " RS";
    } 
}
