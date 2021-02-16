package classes;

public class Fone 
{
    public String label;
    public String number;

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
    
    //Construtores
    public Fone(String serial){
        String[] ui = serial.split(":");
        this.label = ui[0];
        this.number = ui[1];
    }
    public Fone(String label, String number){
        this.label = label;
        this.number = number;
    }

    public String toString(){
        return this.label + ":" + this.number;
    }
}
