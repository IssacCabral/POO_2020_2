package Models;

public class Fone 
{
    //Atributos
    private String label;
    private String number;


    //Métodos
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
    
    public Fone(String label){
        String[] tokens = label.split(":");

        this.label = tokens[0];
        this.number = tokens[1];
    }

    public Fone(String label, String number){
        this.label = label;
        this.number = number;
    }

    public String getLabel(){return this.label;}
    public String getNumber(){return this.number;}

    public String toString(){
        return this.label + ":" + this.number;
    }
}
