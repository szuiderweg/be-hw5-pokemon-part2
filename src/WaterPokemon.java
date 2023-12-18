import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon
{
    List<String> attacks = Arrays.asList("surf", "hydropump","hydrocanon","raindance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        super.setType("water");
    }
    List<String> getAttacks() {
        return attacks;
    }

   public void surf(Pokemon name, Pokemon enemy){}

   public void hydroPump(Pokemon name, Pokemon enemy){}

   public void hydroCanon(Pokemon name, Pokemon enemy){}

   public void rainDance(Pokemon name, Pokemon enemy){}




}
