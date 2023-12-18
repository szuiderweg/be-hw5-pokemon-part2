import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon
{

    List<String> attacks = Arrays.asList("thunderpunch","electroball","thunder","volttackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        super.setType("electric");
    }

    List<String> getAttacks() {
        return attacks;
    }

   public void thunderPunch(Pokemon name, Pokemon enemy){}
   public void electroBall(Pokemon name, Pokemon enemy){}
   public void thunder(Pokemon name, Pokemon enemy){}
   public void voltTackle(Pokemon name, Pokemon enemy){}

}
