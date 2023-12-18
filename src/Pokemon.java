public class Pokemon //todo superclass maken die algemene pokemons definieert. voor ieder subtype komen er subclasses
    //todo: properties final maken (incl. level)
{
    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;
    private String type;//todo constructors zo maken dat type een final kan zijn

    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
