package models;

public class Pessoa 
{
    private String nome;
    private boolean meia;
    
    public Pessoa(String nome, boolean pagaMeia){
        this.nome = nome;
        this.meia = pagaMeia;
    }

    //Getters
    public String getNome(){return this.nome;}
    public boolean getMeia(){return this.meia;}
    
    //Setters
    public void setNome(String nome){this.nome = nome;}
    public void setMeia(boolean pagaMeia){this.meia = pagaMeia;}

    public String toString(){
        return "[" + this.nome + ", " + (this.meia ? "meia": "inteira") + "]\n";
    }
}
