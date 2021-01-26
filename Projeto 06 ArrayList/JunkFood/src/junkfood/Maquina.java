
package junkfood;

import java.util.ArrayList;

public class Maquina 
{
    //Tributes
    private ArrayList<Espiral> esp;
    private float saldoCliente;
    private float lucro;
    private int maxProdutos;
    
    //Construct
    public Maquina(int maxProdutos, int qtdEspirais){
        this.maxProdutos = maxProdutos;
        
        esp = new ArrayList<>();
        for(int i = 0; i < qtdEspirais; i++){
            this.esp.add(new Espiral("Empty", 0, 0f));
        }
    }
    
    public String toString(){
        String espirais = "Saldo: " + this.saldoCliente + "\n";
        
        for(int i = 0 ; i < esp.size(); i++){
            espirais += i + " [" + esp.get(i) + "]\n";
        }
        return espirais;
    }
    
    public void inserirDinheiro(float valor){
        if(valor < 0){
            System.out.println("Fail: valor inválido");
            return;
        }
        
        this.saldoCliente += valor;
    }
    
    public void pedirTroco(){
        if(this.saldoCliente != 0){
            System.out.println("Você recebeu " + this.saldoCliente + "R$");
            this.saldoCliente = 0;
            return;
        }
        
        System.out.println("Você não tem nenhum saldo");
    }
    
    public void alterarEspiral(int indice, String nome, int qtd, float preco){
        boolean aux;
        
        if(indice >= esp.size()){
            System.out.println("fail: Índice inválido");
            return;
        }
        
        for(int i = 0; i < esp.size(); i++){
            if(esp.get(i) == esp.get(indice)){
                esp.get(indice).nome = nome;
                esp.get(indice).quantidade = qtd;
                esp.get(indice).preco = preco;
                return;
            }
        }
    }
    
    public void limparEspiral(int indice){
        if(indice >= esp.size()){
            System.out.println("fail: Índice inválido");
            return;
        }
        
        esp.get(indice).nome = "empty";
        esp.get(indice).quantidade = 0;
        esp.get(indice).preco = 0f;
        
    }
    
    public void comprar(int indice){
        if(indice >= esp.size()){
            System.out.println("fail: Índice inválido");
            return;
        }
        
        if(esp.get(indice).quantidade == 0){
            System.out.println("fail: sem produto");
            return;
        }
        
        if(this.saldoCliente < esp.get(indice).preco){
            System.out.println("fail: saldo insuficiente");
            return;
        }
        
        if(esp.get(indice).quantidade >= 1){
            esp.get(indice).quantidade -= 1;
            this.saldoCliente -= esp.get(indice).preco;
            System.out.println("voce comprou um "+ esp.get(indice).nome);
        }
        
    } 
}
