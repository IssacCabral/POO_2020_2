
package saladecinema;

import java.util.Scanner;

public class SalaDeCinema 
{

    public static void main(String[] args) {
        Cinema meuCinema = null;
        Scanner scann = new Scanner(System.in);
     
        while(true)
        {
            String[] linha = scann.nextLine().split(" ");
            
            if(linha[0].equals("init")){
                meuCinema = new Cinema(Integer.parseInt(linha[1]));
            }else if(linha[0].equals("show")){
                System.out.println(meuCinema);
            }else if(linha[0].equals("cancelar")){
                meuCinema.cancelar(linha[1]);
            }else if(linha[0].equals("reservar")){
                meuCinema.reservar(linha[1], linha[2], Integer.parseInt(linha[3]));
            }else if(linha[0].equals("end"))
                break;
        }
       
    }
    
}
