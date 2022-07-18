public class Reptile extends Animal{
    private Zoo zoo;


    public Reptile(int age, String name, String areaLive, Zoo zoo) {
        super(age, name, areaLive);
        this.zoo = zoo;
    }

    public String getInfo() {
        return "Age: " + getAge() +
                "\nName: " + getName() +
                "\nArea live: " + getAreaLive();
    }
    public final String getCommand(String command ){
        return command;
    }
    public int getCommand(int amoutCommand){

        return amoutCommand;
    }





}
