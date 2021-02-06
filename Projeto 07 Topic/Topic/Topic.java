import java.util.ArrayList;
import java.util.prefs.PreferencesFactory;

public class Topic
{
    private ArrayList<Pass> preferredChairs;
    private ArrayList<Pass> normalChairs;
    private final int minimalAge = 70;

    //Construct
    public Topic(int lotacao, int amountPreferential){
        preferredChairs = new ArrayList<Pass>();
        normalChairs = new ArrayList<Pass>();

        for(int i = 0; i < lotacao - amountPreferential; i++){
            normalChairs.add(null);
        }
        for(int i = 0; i < amountPreferential; i++){
            preferredChairs.add(null);
        }
    }
    
    //toString
    public String toString(){
        String aux = "[ ";

        for(Pass pass: this.preferredChairs){
            if(pass == null){
                aux += "@ ";
                continue;
            }
                aux += "@ " + pass +" ";
        }
        for(Pass pass: this.normalChairs){
            if(pass == null){
                aux += "= ";
                continue;
            }
                aux += "= " + pass + " ";
        }

        aux += "]";
        return aux;
    }

    public boolean in(String name,int age){
        Pass pass = new Pass(name, age);

        int inPrefferential = preferredChairs.indexOf(null);
        int inNormal = normalChairs.indexOf(null);

        //Caso em que o passageiro já está na Topic
        for(Pass p: preferredChairs){
            if(p != null){
                if(p.getName().equals(name)){
                    System.out.println("The passenger is already on topic");
                    return false;
                }
            }
        }
        for(Pass p: normalChairs){
            if(p != null){
                if(p.getName().equals(name)){
                    System.out.println("The passenger is already on topic");
                    return false;
                }
            }
        }

        //Caso em que não há nenhuma vaga na fila normal nem na presencial
        if(inPrefferential == -1 && inNormal == -1){
            System.out.println("Fail: No vacancies");
            return false;
        }

        //Caso em que a pessoa é idosa e existe vaga na preferencial
        else if(age >= minimalAge && inPrefferential != -1){
            preferredChairs.set(inPrefferential, pass);
            return true;
        }
        //Caso em que a pessoa é idosa e não existe vaga na preferencial
        else if(age >= minimalAge && inPrefferential == -1 && inNormal != -1){
            normalChairs.set(inNormal, pass);
            return true;
        }

        //Caso em que a pessoa não é idosa e existe vaga nas normais
        else if(age < minimalAge && inNormal != -1){
            normalChairs.set(inNormal, pass);
            return true;
        }

        //Caso em que a pessoa não é idosa e não existe vaga nas normais e existe na preferencial
        else if(age < minimalAge && inNormal == -1 && inPrefferential != -1){
            preferredChairs.set(inPrefferential, pass);
            return true;
        }

        return false;
    }

    public void out(String name){
        for(int i = 0; i < preferredChairs.size(); i++){
            if(preferredChairs.get(i) == null){
                continue;
            }
            if(preferredChairs.get(i).getName().equals(name)){
                preferredChairs.set(i, null);
                return;
            }
        }
        for(int i = 0; i < normalChairs.size(); i++){
            if(normalChairs.get(i) == null){
                continue;
            }
            if(normalChairs.get(i).getName().equals(name)){
                normalChairs.set(i, null);
                return;
            }
        }

        System.out.println("Fail: name not found!");
    }
}