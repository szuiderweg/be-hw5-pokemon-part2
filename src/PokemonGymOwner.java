import java.util.List;

public class PokemonGymOwner extends PokemonTrainer
{
    private final String town;

    public PokemonGymOwner(String player, String town,List<Pokemon> pokemons)
    {
        super(player, pokemons);
        this.town = town;
    }

    public String getTown()
    {
        return town;
    }

}
