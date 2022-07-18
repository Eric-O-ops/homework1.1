public final class Crocodile extends Reptile {
    private Season loveSeason;

    public Crocodile(int age, String name, String areaLive, Zoo zoo, Season loveSeason) {
        super(age, name, areaLive, zoo);
        this.loveSeason = loveSeason;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nLove season: " + loveSeason;


    }

}
