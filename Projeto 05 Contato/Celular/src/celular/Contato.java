
package celular;
import java.util.ArrayList;

public class Contato 
{
    private String name;
    private ArrayList<Fone> fones;
    
    //Construtor
    public Contato(String name){
        this.name = name;
        this.fones = new ArrayList<>();
    }
    
    public void addFone(String label, String number){
        if(Fone.validate(number) == true){
            Fone novoFone = new Fone(label, number);
            fones.add(novoFone);
        }else{
            System.out.println("Fail: número inválido");
        }
    }
    
    public Fone getFone(int index){
        if(index >= 0 && index <= fones.size()){
            return fones.get(index);
        }
        System.out.println("Fail: index inválido");
        return null;
    }
    
    public Fone getFone(String label){
        for(Fone fone: fones){
            if(fone.getLabel().equals(label)){
                return fone;
            }
        }
        System.out.println("fail: Label inválida");
        return null;
    }
    
    public boolean removeFone(int index){
        if(index >= 0 && index <= fones.size()){
            fones.remove(index);
            return true;
        }
        System.out.println("fail: index inválido");
        return false;
    }
    
    public boolean removeFone(String number){
        if(Fone.validate(number)){
           for(Fone fone: fones){
               if(fone.getNumber().equals(number)){
                   fones.remove(fone);
                   return true;
               }
           }
        }
        System.out.println("Não foi encontrado um número");
        return false;
    }
    
    public String toString(){
        String saida = this.name + "\n";
        int i = 0;
        
        for(int k = 0; k < fones.size(); k++){
            saida += "[" + i + ": " + fones.get(k) + "]";
            i++;
        }
        return saida;
    }
}
