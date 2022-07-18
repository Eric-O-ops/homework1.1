public class Main {
    public static void main(String[] args) {
        Zoo almaty = new Zoo("Almaty");
        Zoo tashkent = new Zoo("Tashkent");


        Reptile objectA = new Reptile(12,"Name","Amazon",almaty);

        Crocodile objectB = new Crocodile(13,"Body","Africa", tashkent ,Season.SUMMER);
        Crocodile objectC = new Crocodile(15, "Crock", "US",almaty ,Season.SPRING);

        System.out.println(objectA.getInfo() + "\n"  + objectA.getCommand(1) + "\n---------------------");

        System.out.println(objectB.getInfo() + "\n" + objectB.getCommand("Shhhhhhh") + "\n---------------------");

        System.out.println(objectC.getInfo() + "\n"  );


    }
}