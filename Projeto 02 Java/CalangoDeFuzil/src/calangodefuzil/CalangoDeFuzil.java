
package calangodefuzil;

import java.util.Scanner;
import java.util.Random;

public class CalangoDeFuzil{
    int nBalas;
    int nCabecas;
    int nPatas;
    int meuTiro;
    int colete;
    Random random = new Random();
    
    //Construtor, mesmo nome da classe = sombreamento de variável
    CalangoDeFuzil(int nBalas, int nPatas){//Parâmetros
        this.nBalas = nBalas;
        this.nPatas = nPatas;
    }
    
    void atirar(){
        this.meuTiro = random.nextInt(4)+1;
        this.colete = random.nextInt(5)+1;
        
        if(nPatas == 2){
            System.out.println("Incapacitado para atirar, regenere-se!");
            return;
        }
        if(nBalas == 0){
            System.out.println("HEY BRO, PRECISO DE BALAS!");
            return;
        }else{
            nBalas -= 1;
            
            if(meuTiro == 1 || meuTiro == 2){
                this.nCabecas += 1;
                System.out.println("WOOW, HEAD SHOT!!");
                if(this.colete == 1)
                    alvejado();    
            }else{
                System.out.println("HUU...ERREI O ALVO...");
                if(this.colete == 1)
                    alvejado();
            }
        }
    }
    
    void recarregar(){
        if(this.nBalas == 12){
            System.out.println("JÁ ESTOU ARMADO ATÉ OS DENTES");
        }else{
            this.nBalas = 12;
            System.out.println("AGORA JÁ ESTOU RECARREGADO!");
        }
    }
    void regenerar(){
        nPatas = 6;
        System.out.println("Agora você já tem todas as patas");
    }
    void alvejado(){
        nPatas -= 1; 
        System.out.println("DROGA FUI ALVEJADO! AGORA SÓ TENHO " + nPatas + " PATAS");
    }
    
    public String toString(){
        return "BALAS: " + nBalas + "/" + "CABEÇAS: " + nCabecas + "/" + "PATAS: " + nPatas;
    }
    public static void main(String[] args){
        CalangoDeFuzil magaiva = new CalangoDeFuzil(12, 6);
        Scanner user = new Scanner(System.in);
        
        while(true)
        {
            String line = user.nextLine();
            String[] ui = line.split(" ");
            
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("atirar")){
                magaiva.atirar();
            }else if(ui[0].equals("recarregar")){
                magaiva.recarregar();
            }else if(ui[0].equals("regenerar")){
                magaiva.regenerar();
            }else if(ui[0].equals("show")){
                System.out.println(magaiva);
            }else{
                System.out.println("Fail: Comando inválido!");
            }
        }
    }
}