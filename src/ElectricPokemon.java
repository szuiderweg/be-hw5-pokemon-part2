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

   public void thunderPunch(Pokemon name, Pokemon enemy)
   {

       System.out.println(name.getName()+" attacks "+enemy.getName()+" with Thunderpunch.");
       //damage calculation: select a random double from 0 to 1 using the Math.random() method,then  multiply with the attackers level and a vulnerability factor depending on enemy type. Then it's rounded off to the nearest integer.

       int damage = switch (enemy.getType()) {
           case "water" -> (int) Math.round(1.5 * Math.random() * name.getLevel());
           case "grass" -> (int) Math.round(1.2 * Math.random() * name.getLevel());
           case "fire" -> (int) Math.round(0.8 * Math.random() * name.getLevel());
           default -> (int) Math.round(0.5 * Math.random() * name.getLevel());
       };
       System.out.println(enemy.getName()+" gets hit for "+damage+" hp!");
       //substract damage from enemy hitpoints. hp can become negative
       enemy.setHp(enemy.getHp()-damage);
       System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");

   }
   public void electroBall(Pokemon name, Pokemon enemy)
   {
       System.out.println(name.getName()+" attacks "+enemy.getName()+" with Electroball.");
       //damage calculation: select a random double from 0 to 1 using the Math.random() method,then  multiply with the attackers level and a vulnerability factor depending on enemy type. Then it's rounded off to the nearest integer.

       int damage = switch (enemy.getType())
       {
           case "water" -> (int) Math.round(1.5 * Math.random() * name.getLevel());
           case "grass" -> (int) Math.round(1.2 * Math.random() * name.getLevel());
           case "fire" -> (int) Math.round(0.8 * Math.random() * name.getLevel());
           default -> (int) Math.round(0.5 * Math.random() * name.getLevel());
       };
       System.out.println(enemy.getName()+" gets hit for "+damage+" hp!");
       //substract damage from enemy hitpoints. hp can become negative
       enemy.setHp(enemy.getHp()-damage);
       System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");
   }
   public void thunder(Pokemon name, Pokemon enemy)
   {
       System.out.println(name.getName()+" attacks "+enemy.getName()+" with Electroball.");
       //damage calculation: select a random double from 0 to 1 using the Math.random() method,then  multiply with the attackers level and a vulnerability factor depending on enemy type. Then it's rounded off to the nearest integer.

       int damage = switch (enemy.getType()) {
           case "water" -> (int) Math.round(1.5 * Math.random() * name.getLevel());
           case "grass" -> (int) Math.round(1.2 * Math.random() * name.getLevel());
           case "fire" -> (int) Math.round(0.8 * Math.random() * name.getLevel());
           case "electric" -> (int) Math.round(-1 * (1 + 0.2 * name.getLevel()));
           //special case an electric enemy gains hitpoints since in this case the damage is negative.
           default -> (int) Math.round(0.5 * Math.random() * name.getLevel());
       };

       if(enemy.getType().equals("electric"))
       {
           System.out.println(enemy.getName()+" gets a hitpoint boost of "+Math.abs(damage)+" hp!"); //math.abs returns the absolute value (removes the minus sign)
       }
       else
       {
           System.out.println(enemy.getName()+" gets hit for "+damage+"hp!");
       }

       //substract damage from enemy hitpoints. hp can become negative
       enemy.setHp(enemy.getHp()-damage);
       System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");
   }
   public void voltTackle(Pokemon name, Pokemon enemy)
   {
       System.out.println(name.getName()+" attacks "+enemy.getName()+" with Electroball.");
       //damage calculation: select a random double from 0 to 1 using the Math.random() method,then  multiply with the attackers level and a vulnerability factor depending on enemy type. Then it's rounded off to the nearest integer.

       int damage = switch (enemy.getType()) {
           case "water" -> (int) Math.round(1.5 * Math.random() * name.getLevel());
           case "grass" -> (int) Math.round(1.2 * Math.random() * name.getLevel());
           case "fire" -> (int) Math.round(0.8 * Math.random() * name.getLevel());
           default -> (int) Math.round(0.5 * Math.random() * name.getLevel());
       };
       System.out.println(enemy.getName()+" gets hit for "+damage+" hp!");
       //substract damage from enemy hitpoints. hp can become negative
       enemy.setHp(enemy.getHp()-damage);
       System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");
   }

}
