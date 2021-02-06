
package saladecinema;

import java.util.ArrayList;

public class Cinema 
{
    //Atributos
    public ArrayList <Cliente> clientes;
    
    //Construtor
    public Cinema(int value){
        clientes = new ArrayList<>();
       
        for(int i = 0; i < value; i++){
            clientes.add(null);
        }
    }
        
    public void reservar(String nome, String id, int indice){
        //Checando o cliente a partir do id
        for(Cliente cliente: clientes){
            if(cliente != null){
               if(cliente.getId().equals(id) || cliente.getNome().equals(nome)){
                System.out.println("Fail: A cadeira ja está ocupada");
                return;
                } 
            }
        }
        //Adicionando um novo cliente
        if(clientes.get(indice) == null){
            Cliente cliente = new Cliente(nome, id);
            clientes.set(indice, cliente);
            
        }
    }
    
    public void cancelar(String id){
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i) != null){
                if(clientes.get(i).getId().equals(id)){
                    clientes.set(i, null);
                    return;
                }
            }
        }
        System.out.println("Fail: cliente não encontrado");
    }
    
    //toString
    public String toString(){
        String saida = "[";
        
        for(Cliente pessoa: clientes ){
            if(pessoa == null){
                saida += "- ";
            }else{
                saida += " ";
            }
        }
      
        return saida;
    }
}


