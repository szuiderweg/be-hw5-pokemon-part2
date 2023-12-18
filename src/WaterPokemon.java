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

   public void surf(Pokemon name, Pokemon enemy)
   {
       System.out.println(name.getName()+" attacks "+enemy.getName()+" with Surf.");

       int damage = switch (enemy.getType()) {
           case "fire" -> (int) Math.round(1.5 * Math.random() * name.getLevel());
           case "electric" -> (int) Math.round(1.2 * Math.random() * name.getLevel());
           case "grass" -> (int) Math.round(0.8 * Math.random() * name.getLevel());
           default -> (int) Math.round(0.5 * Math.random() * name.getLevel());
       };

       System.out.println(enemy.getName()+" gets hit for "+damage+" hp!");
       //substract damage from enemy hitpoints. hp can become negative
       enemy.setHp(enemy.getHp()-damage);
       System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");
   }

   public void hydroPump(Pokemon name, Pokemon enemy)
   {
       System.out.println(name.getName()+" attacks "+enemy.getName()+" with Hydropump.");

       int damage = switch (enemy.getType()) {
           case "fire" -> (int) Math.round(1.5 * Math.random() * name.getLevel());
           case "electric" -> (int) Math.round(1.2 * Math.random() * name.getLevel());
           case "grass" -> (int) Math.round(0.8 * Math.random() * name.getLevel());
           default -> (int) Math.round(0.5 * Math.random() * name.getLevel());
       };

       System.out.println(enemy.getName()+" gets hit for "+damage+" hp!");
       //substract damage from enemy hitpoints. hp can become negative
       enemy.setHp(enemy.getHp()-damage);
       System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");
   }

   public void hydroCanon(Pokemon name, Pokemon enemy)
   {
       System.out.println(name.getName()+" attacks "+enemy.getName()+" with Hydro cannon.");

       int damage = switch (enemy.getType()) {
           case "fire" -> (int) Math.round(1.5 * Math.random() * name.getLevel());
           case "electric" -> (int) Math.round(1.2 * Math.random() * name.getLevel());
           case "grass" -> (int) Math.round(0.8 * Math.random() * name.getLevel());
           default -> (int) Math.round(0.5 * Math.random() * name.getLevel());
       };

       System.out.println(enemy.getName()+" gets hit for "+damage+" hp!");
       //substract damage from enemy hitpoints. hp can become negative
       enemy.setHp(enemy.getHp()-damage);
       System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");
   }

   public void rainDance(Pokemon name, Pokemon enemy)
   {
       int damage;
       System.out.println(name.getName()+" showers "+enemy.getName()+" with a refreshing Raindance.");

       switch (enemy.getType()) {
           case "fire":
             damage = (int) Math.round(1.5 * Math.random() * name.getLevel());
             System.out.println(enemy.getName()+" gets hit for "+damage+" hp!");

           case "electric":
               damage = 0;
               System.out.println(" Raindance has no effect at all.");

           case "grass":
               damage = (int) Math.round(-1 * (1 + 0.2 * name.getLevel()));//hitpoint boost
           default:
               damage = (int) Math.round(0.5 * Math.random() * name.getLevel());
               System.out.println(enemy.getName()+" gets hit for "+damage+" hp!");
       };

       //substract damage from enemy hitpoints. hp can become negative
       enemy.setHp(enemy.getHp()-damage);
      if(enemy.getType() != "electric")//message is only needed for non-electric types
      {
       System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");
      }
   }
}
