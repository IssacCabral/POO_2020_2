package models;

public class Venda 
{
    private Pessoa cliente;
    private Evento evento;
    private Setor setor;
    private double valor;

    public Venda(Pessoa cliente, Evento evento, Setor setor){
        this.cliente = cliente;
        this.evento = evento;
        this.setor = setor;
    }

    //Getters
    public Pessoa getCliente(){return this.cliente;}
    public Evento getEvento(){return this.evento;}
    public Setor getSetor(){return this.setor;}
    public double getValor(){return this.valor;}

    //Setters
    public void setCliente(Pessoa cliente){this.cliente = cliente;}
    public void setEvento(Evento evento){this.evento = evento;}
    public void setSetor(Setor setor){this.setor = setor;}
    public void setValor(double valor){this.valor = valor;}
    
    public String toString(){
        return "[" + this.cliente.getNome() + ", " + this.evento.getNome() + ", " + 
                     this.setor.getNome() + "]\n" ;
    }
}
