
class Pass
{
    private int age;
    private String name = "";

    //Getters e setters
    public int getAge(){return this.age;}
    public void setAge(int age){this.age = age;}
    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}

    //Construct
    public Pass(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return this.name + ":" + this.age;
    }
}
