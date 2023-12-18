import java.util.List;

public class PokemonTrainer
{
    public String playerName;
    final List<Pokemon> pokemons;

    public PokemonTrainer(String player, List<Pokemon> pokemons)
    {
        this.playerName = player;
        this.pokemons = pokemons;
    }

    public String getName()
    {
        return playerName;
    }

    public void setName(String playerName)
    {
        this.playerName = playerName;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
