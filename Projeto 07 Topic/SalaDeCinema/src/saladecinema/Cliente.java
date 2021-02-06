
package saladecinema;

public class Cliente 
{
    private String id;
    private String nome;
    
    public String getNome(){
        return this.nome;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    //Construtor
    public Cliente(String nome, String id){
        this.nome = nome;
        this.id = id;
    }
    
    //toString
    public String toString(){
        return nome + ":" + id;
    }
}
