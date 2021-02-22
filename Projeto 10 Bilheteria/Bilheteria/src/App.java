
import models.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Bilheteria bilheteria = new Bilheteria();
        Scanner scann = new Scanner(System.in);

        while(true){
            try{
                String[] tokens = scann.nextLine().split(" ");

                if(tokens[0].equals("addPessoa")){
                    bilheteria.addPessoa(tokens[1],tokens[2]);
                }else if(tokens[0].equals("pessoas")){
                    System.out.println(bilheteria.showPessoas());
                }else if(tokens[0].equals("end")){
                    return;
                }else if(tokens[0].equals("addEvento")){
                    bilheteria.addEvento(tokens[1]);
                }else if(tokens[0].equals("addSetor")){
                    bilheteria.addSetor(tokens[1], tokens[2], 
                    Double.parseDouble(tokens[3]), Integer.parseInt(tokens[4]));
                }else if(tokens[0].equals("eventos")){
                    System.out.println(bilheteria.showEventos());
                }else if(tokens[0].equals("vender")){
                    bilheteria.vender(tokens[1], tokens[2], tokens[3]);
                }else if(tokens[0].equals("vendas")){
                    System.out.println(bilheteria.showVendas());
                }
            }catch(IndexOutOfBoundsException e){
                System.out.println("Provavelmente voce esqueceu algum parametro!");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
