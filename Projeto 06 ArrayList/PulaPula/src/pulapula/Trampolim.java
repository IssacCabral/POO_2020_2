
package pulapula;
import java.util.ArrayList;

public class Trampolim 
{
    private ArrayList<Crianca> waiting;
    private ArrayList<Crianca> playing;
    private double caixaPula;
    
    //Construtor
    public Trampolim(){
        this.waiting = new ArrayList<>();
        this.playing = new ArrayList<>();
    }
    
    //Chegando no brinquedo
    public void arrive(Crianca kid){
        waiting.add(0, kid);
    }
    
    //Tira da fila de espera e colocar na fila brincando
    public void in(){
        if(this.waiting.isEmpty()){
            System.out.println("Fail: não tem criança para entrar");
            return;
        }
        
        /*Pega a primeira criança da lista de espera que fica na última posição
        da lista de espera e adiciona ela à lista de quem está brincando.*/
        Crianca primeiraCrianca = waiting.get(waiting.size() - 1);
        playing.add(0, primeiraCrianca);
        
        primeiraCrianca.setSaldo(2);
        //Removendo a criança tirada da lista de espera
        waiting.remove(waiting.size() - 1);

    }
    
    //Tira da fila brincando e coloca na fila de espera
    public void out(){
        if(playing.isEmpty()){
            System.out.println("Fail: a lista está vazia");
            return;
        }
        Crianca primeiraCrianca = playing.get(playing.size() - 1);
        
        waiting.add(0, primeiraCrianca);
        playing.remove(primeiraCrianca);
    }
    
    //Remove a crianca pra ela ir embora
    public void remove(String name){
        for(Crianca crianca: waiting){
            if(crianca.getName().equals(name)){
                Crianca sair = crianca;
                waiting.remove(crianca);
                caixaPula += crianca.getSaldo();
                return;
            }
        }
        
        for(Crianca crianca: playing){
            if(crianca.getName().equals(name)){
                Crianca sair = crianca;
                playing.remove(crianca);
                caixaPula += crianca.getSaldo();
                return;
            }
        }
        
        System.out.println("fail: Crianca não foi encontrada");
    }
    
    //Mostrar o saldo da criança por meio de um nome
    public void saldoCrianca(String nome){
        for(Crianca crianca: waiting){
            if(crianca.getName().equals(nome)){
                System.out.println("R$" + crianca.getSaldo());
                return;
            }
        }
        
        for(Crianca crianca: playing){
            if(crianca.getName().equals(nome)){
                System.out.println("R$" + crianca.getSaldo());
                return;
            }
        }
        System.out.println("A criança não foi encontrada");
    }
    
    //Mostrar o valor em caixa arrecadado com as crianças
    public double saldoCaixa(){
        return this.saldoCaixa();
    }
    
    //Removendo todas as crianças e atribuindo os valores dos saldos ao caixa
    public void removeAll(){
        if(waiting.isEmpty() && playing.isEmpty()){
            System.out.println("Não tem o que remover, tudo vazio!");
            return;
        }
        double sumWaiting = 0;
        double sumPlaying = 0;
        double sumAll;
        
        for(Crianca crianca: waiting){
            sumWaiting += crianca.getSaldo();
        }
        for(Crianca crianca: playing){
            sumPlaying += crianca.getSaldo();
        }
        
        sumAll = sumWaiting + sumPlaying;
        caixaPula += sumAll;
        waiting.clear();
        playing.clear();
    }
    
    //toString
    public String toString(){
        return "=>" + this.waiting + "=>" + this.playing +
                "\n" + "CAIXA: " + "R$ " + caixaPula;
    }
    
}
