package models;

public class Setor 
{
    private String nome;
    private double preco;
    private int qtd;
    private int capacidade;
    
    public Setor(String nome, double preco, int capacidade){
        this.nome = nome;
        this.preco = preco;
        this.capacidade = capacidade;
    }

    //Getters
    public String getNome(){return this.nome;}
    public double getPreco(){return this.preco;}
    public int getQtd(){return this.qtd;}
    public int getCapacidade(){return this.capacidade;}

    //Setters
    public void setNome(String nome){this.nome = nome;}
    public void setPreco(Double preco){this.preco = preco;}
    public void setQtd(int qtd){this.qtd = qtd;}
    public void setCapacidade(int capacidade){this.capacidade = capacidade;}
    
    public void vender(){
        if(this.qtd == this.capacidade){
            throw new RuntimeException("Fail: Já está com capacidade máxima");
        }
        this.qtd +=1;
    }

    public String toString(){
        return "- " + "[" + this.nome + ":" + this.preco + ":" + 
                this.qtd + "/" + this.capacidade + "]";
    }
}
