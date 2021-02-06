import java.util.Scanner;

public class Controller 
{
    public static void main(String[] args){
        Topic minhaTopic = null;
        Scanner scann = new Scanner(System.in);

        do{
            String[] tokens = scann.nextLine().split(" ");

            if(tokens[0].equals("init")){
                minhaTopic = new Topic(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
            }else if(tokens[0].equals("show")){
                System.out.println(minhaTopic);
            }else if(tokens[0].equals("in")){
                minhaTopic.in(tokens[1], Integer.parseInt(tokens[2]));
            }else if(tokens[0].equals("out")){
                minhaTopic.out(tokens[1]);
            }else if(tokens[0].equals("end")){
                return;
            }else{
                System.out.println("Fail: entrada inválida");
            }

        }while(true);
        
    }
}
