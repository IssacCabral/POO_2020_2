
package celular;

public class Fone 
{
    private String label;
    private String number;
    
    public Fone(String label, String number){
        this.label = label;
        this.number = number;
    }
    
    public String toString(){
        return label + " -- " + number;
    }
    
    public String getLabel(){
        return this.label;
    }
    
    public String getNumber(){
        return this.number;
    }
    
    //Valida o número
    public static boolean validate(String number){
        String validos = "0123456789()-";
        for(int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            if(validos.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }
        
}
