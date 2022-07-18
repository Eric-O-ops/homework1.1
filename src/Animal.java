public abstract class Animal {
    private int age;
    private String name;
    private String areaLive;

    public Animal(int age, String name, String areaLive) {
        this.age = age;
        this.name = name;
        this.areaLive = areaLive;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAreaLive() {
        return areaLive;
    }
}
