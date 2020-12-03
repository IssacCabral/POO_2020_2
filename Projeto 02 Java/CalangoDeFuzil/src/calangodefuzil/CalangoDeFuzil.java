
package calangodefuzil;

import java.util.Scanner;
import java.util.Random;

public class CalangoDeFuzil{
    int nBalas = 12;
    int nCabecas;
    int nPatas = 6;
    int meuTiro;
    int colete;
    Random random = new Random();
    
    void atirar(){
        this.meuTiro = random.nextInt(4)+1;
        this.colete = random.nextInt(5)+1;
        
        if(nPatas == 2){
            System.out.println("Incapacitado para atirar, regenere-se!");
            return;
        }
        if(nBalas == 0){
            System.out.println("HEY BRO, PRECISO DE BALAS!");
        }else{
            nBalas -= 1;
            
            if(meuTiro == 1 || meuTiro == 2){
                nCabecas += 1;
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
        nPatas = 4;
        System.out.println("Agora você já tem todas as patas");
    }
    void alvejado(){
        nPatas -= 1; 
        System.out.println("DROGA FUI ALVEJADO! AGORA SÓ TENHO " + nPatas + " PATAS");
    }
    
    public String toString(){
        return "BALAS: " + nBalas + "/" + "CABEÇAS: " + nCabecas + "/" + "PATAS: " + nPatas;
    }
    public static void main(String[] args)
    {
        CalangoDeFuzil magaiva = new CalangoDeFuzil();
        Scanner user = new Scanner(System.in);
        
        for(int i = 0; i < 50; i++){
            System.out.println("Voce tem " + magaiva.nBalas + " Balas");
            magaiva.atirar();
            if(magaiva.nPatas == 2){
                magaiva.atirar();
                magaiva.regenerar();
            }    
            if(magaiva.nBalas == 0){
                magaiva.atirar();
                magaiva.recarregar();
            }
        }
        System.out.println(magaiva);
        
    }
}