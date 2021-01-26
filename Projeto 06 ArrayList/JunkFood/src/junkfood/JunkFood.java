
package junkfood;

import java.util.Scanner;

public class JunkFood 
{

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Maquina maquina = null;
        
        while(true){
            String linha = scann.nextLine();
            String[] tokens = linha.split(" ");
            
            if(tokens[0].equals("init")){
                maquina = new Maquina(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
            }else if(tokens[0].equals("show")){
                System.out.println(maquina);
            }else if(tokens[0].equals("set")){
                //float f = Float.valueOf(tokens[4]).floatValue();
                maquina.alterarEspiral(Integer.parseInt(tokens[1]), tokens[2], Integer.parseInt(tokens[3]), 
                Float.parseFloat(tokens[4]));
            }else if(tokens[0].equals("limpar")){
                maquina.limparEspiral(Integer.parseInt(tokens[1]));
            }
        
        }
        
        
        
    }
    
}
