package models;

import java.util.ArrayList;
import java.util.TreeMap;

public class Bilheteria 
{
    ArrayList<Venda> vendas;
    private TreeMap<String, Pessoa> pessoas;
    private TreeMap<String, Evento> eventos;
    private double caixa;

    public Bilheteria(){
        this.pessoas = new TreeMap<>();
        this.eventos = new TreeMap<>();
        this.vendas = new ArrayList<>();
    }

    public void addPessoa(String nome, String pagaMeia) throws Exception {
        if(pessoas.containsKey(nome)){
            throw new Exception("Fail: Pessoa " + nome + " já existe");
        }
        if(pagaMeia.equals("meia")){
            pessoas.put(nome, new Pessoa(nome, true));
        }else if(pagaMeia.equals("inteira")){
            pessoas.put(nome, new Pessoa(nome, false));
        }
    }

    public String showPessoas(){
        String aux = "";
        for(String key: pessoas.keySet()){
            aux += pessoas.get(key);
        }
        return aux; 
    }

    public void addEvento(String id) throws Exception{
        if(eventos.containsKey(id)){
            throw new Exception("Fail: O evento " + id + " já existe");
        }
        eventos.put(id, new Evento(id));
    }

    public String showEventos(){
        String aux = "";

        for(String key: eventos.keySet()){
            aux += eventos.get(key) + "\n";
        }
        return aux;
    }

    public void addSetor(String idEvento, String idSetor, double preco, int capacidade) throws Exception{
        if(!eventos.containsKey(idEvento)){
            throw new Exception("Fail: O evento " + idEvento + " não existe"); 
        }
        if(preco < 0 || capacidade <= 0){
            throw new Exception("Fail: Algum dos parâmetros está inválido");
        }
        eventos.get(idEvento).addSetor(new Setor(idSetor, preco, capacidade));
    }

    public void vender(String cliente, String evento, String setor) throws Exception{
        if(!pessoas.containsKey(cliente)){
            System.out.println("Fail: a pessoa " + cliente + " não existe!");
        }
        if(!eventos.containsKey(evento)){
            System.out.println("Fail: o evento " + evento + " não existe");
        }
        if(!eventos.get(evento).getSetores().containsKey(setor)){
            System.out.println("Fail: o setor " + setor + " não existe");
        }
        if(pessoas.get(cliente).getMeia()){
            Venda venda = new Venda(pessoas.get(cliente), eventos.get(evento),eventos.get(evento).getSetores().get(setor));
            eventos.get(evento).getSetores().get(setor).vender();
            this.caixa += eventos.get(evento).getSetores().get(setor).getPreco() / 2;
            vendas.add(venda);
            
        }else{
            Venda venda = new Venda(pessoas.get(cliente), eventos.get(evento),eventos.get(evento).getSetores().get(setor));
            eventos.get(evento).getSetores().get(setor).vender();
            this.caixa += eventos.get(evento).getSetores().get(setor).getPreco();
            vendas.add(venda);
        }
    }

    public String showVendas(){
        String aux = "";

        for(Venda venda: vendas){
            aux += venda;
        }
        aux += "R$ " + this.caixa;
        return aux;
    }
}
