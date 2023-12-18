import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon
{
    List<String> attacks = Arrays.asList("leafstorm", "solarbeam","leechseed","leaveblade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        super.setType("grass");
    }

    List<String> getAttacks() {
        return attacks;
    }
    public void leafStorm(Pokemon name, Pokemon enemy)
    {
        System.out.println(name.getName()+" attacks "+enemy.getName()+" with Leaf Storm.");

        int damage = switch (enemy.getType()) {
            case "electric" -> (int) Math.round(1.5 * Math.random() * name.getLevel());
            case "fire" -> (int) Math.round(1.2 * Math.random() * name.getLevel());
            case "water" -> (int) Math.round(0.8 * Math.random() * name.getLevel());
            default -> (int) Math.round(0.5 * Math.random() * name.getLevel());
        };

        System.out.println(enemy.getName()+" gets hit for "+damage+" hp!");
        //substract damage from enemy hitpoints. hp can become negative
        enemy.setHp(enemy.getHp()-damage);
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");
    }

    public void solarBeam(Pokemon name, Pokemon enemy)
    {
        System.out.println(name.getName()+" attacks "+enemy.getName()+" with Solar Beam.");

        int damage = switch (enemy.getType()) {
            case "electric" -> (int) Math.round(1.5 * Math.random() * name.getLevel());
            case "fire" -> (int) Math.round(1.2 * Math.random() * name.getLevel());
            case "water" -> (int) Math.round(0.8 * Math.random() * name.getLevel());
            default -> (int) Math.round(0.5 * Math.random() * name.getLevel());
        };

        System.out.println(enemy.getName()+" gets hit for "+damage+" hp!");
        //substract damage from enemy hitpoints. hp can become negative
        enemy.setHp(enemy.getHp()-damage);
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");
    }

    public void leechSeed(Pokemon name, Pokemon enemy)
    {
        System.out.println(name.getName()+" attacks "+enemy.getName()+" with  Leach Seed.");
        int damage = (int) Math.round(1 + 0.2 * name.getLevel());//calculate hp leached; 1/5 of attacker's level + 1


        System.out.println(enemy.getName()+" gets hit for "+damage+" hp!");
        //substract damage from enemy hitpoints. hp can become negative
        enemy.setHp(enemy.getHp()-damage);
        name.setHp(name.getHp()+damage);//add damage to attackers hp
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy)
    {
        System.out.println(name.getName()+" attacks "+enemy.getName()+" with Leave Blade.");

        int damage = switch (enemy.getType()) {
            case "electric" -> (int) Math.round(1.5 * Math.random() * name.getLevel());
            case "fire" -> (int) Math.round(1.2 * Math.random() * name.getLevel());
            case "water" -> (int) Math.round(0.8 * Math.random() * name.getLevel());
            default -> (int) Math.round(0.5 * Math.random() * name.getLevel());
        };

        System.out.println(enemy.getName()+" gets hit for "+damage+" hp!");
        //substract damage from enemy hitpoints. hp can become negative
        enemy.setHp(enemy.getHp()-damage);
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");
    }

}
