public abstract class Pokemon
    //todo: type property final maken
{
    private final String name;
    private final int level;
    private int hp;
    private final String food;
    private final String sound;
    private String type;//todo constructors zo maken dat type een final kan zijn, zomaar final maken werkt nu niet omdat de constructors in de subclasses het type moet kunnen setten.

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
