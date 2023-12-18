import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FirePokemon extends Pokemon
{
    List<String> attacks = Arrays.asList("inferno", "pyroBall","fireLash","flameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
        super.setType("fire");
    }

    List<String> getAttacks() {
        return attacks;
    }

    public void inferno(Pokemon name, Pokemon enemy)
    {
        int damage;
        System.out.println(name.getName()+" attacks "+enemy.getName()+" with Inferno.");
        //damage calculation: select a random double from 0 to 1 using the Math.random() method,then  multiply with the attackers level and a vulnerability factor depending on enemy type. Then it's rounded off to the nearest integer.

        switch (enemy.getType())
        {
            case "grass":
                damage = (int) Math.round(1.5 * Math.random() * name.getLevel());
                break;
            case "water":
                damage = (int) Math.round(1.2 * Math.random() * name.getLevel());
                break;
            case "electric":
                damage = (int) Math.round(0.8 * Math.random() * name.getLevel());
                break;
            default:
                damage = (int) Math.round(0.5 * Math.random() * name.getLevel());
                break;
        }
        System.out.println(enemy.getName()+" gets hit for "+damage+"hp!");
        //substract damage from enemy hitpoints. hp can become negative
        enemy.setHp(enemy.getHp()-damage);
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");
    }



    public void pyroBall(Pokemon name, Pokemon enemy)
    {
        int damage;
        System.out.println(name.getName()+" attacks "+enemy.getName()+" with Pyroball.");
        //damage calculation: select a random double from 0 to 1 using the Math.random() method,then  multiply with the attackers level and a vulnerability factor depending on enemy type. Then it's rounded off to the nearest integer.

        switch (enemy.getType())
        {
            case "grass":
                damage = (int) Math.round(1.5 * Math.random() * name.getLevel());
                break;
            case "water":
                damage = (int) Math.round(1.2 * Math.random() * name.getLevel());
                break;
            case "electric":
                damage = (int) Math.round(0.8 * Math.random() * name.getLevel());
                break;
            default:
                damage = (int) Math.round(0.5 * Math.random() * name.getLevel());
                break;
        }
        System.out.println(enemy.getName()+" gets hit for "+damage+"hp!");
        //substract damage from enemy hitpoints. hp can become negative
        enemy.setHp(enemy.getHp()-damage);
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");


    }

    public void fireLash(Pokemon name, Pokemon enemy)
    {
        int damage;
        System.out.println(name.getName()+" attacks "+enemy.getName()+" with Firelash.");
        //damage calculation: select a random double from 0 to 1 using the Math.random() method,then  multiply with the attackers level and a vulnerability factor depending on enemy type. Then it's rounded off to the nearest integer.

        switch (enemy.getType())
        {
            case "grass":
                damage = (int) Math.round(1.5 * Math.random() * name.getLevel());
                break;
            case "water":
                damage = (int) Math.round(1.2 * Math.random() * name.getLevel());
                break;
            case "electric":
                damage = (int) Math.round(0.8 * Math.random() * name.getLevel());
                break;
            default:
                damage = (int) Math.round(0.5 * Math.random() * name.getLevel());
                break;
        }
        System.out.println(enemy.getName()+" gets hit for "+damage+"hp!");
        //substract damage from enemy hitpoints. hp can become negative
        enemy.setHp(enemy.getHp()-damage);
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");

    }

    public void flameThrower(Pokemon name, Pokemon enemy)
    {
        int damage;
        System.out.println(name.getName()+" attacks "+enemy.getName()+" with flameThrower.");
        //damage calculation: select a random double from 0 to 1 using the Math.random() method,then  multiply with the attackers level and a vulnerability factor depending on enemy type. Then it's rounded off to the nearest integer.

        switch (enemy.getType())
        {
            case "grass":
                damage = (int) Math.round(1.5 * Math.random() * name.getLevel());
                break;
            case "water":
                damage = (int) Math.round(1.2 * Math.random() * name.getLevel());
                break;
            case "electric":
                damage = (int) Math.round(0.8 * Math.random() * name.getLevel());
                break;
            default:
                damage = (int) Math.round(0.5 * Math.random() * name.getLevel());
                break;
        }
        System.out.println(enemy.getName()+" gets hit for "+damage+"hp!");
        //substract damage from enemy hitpoints. hp can become negative
        enemy.setHp(enemy.getHp()-damage);
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" hitpoints remaining.");

    }

}
