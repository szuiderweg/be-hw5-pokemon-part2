import java.util.List;

interface PokemonGym
{
    Pokemon selectPokemon(String pokemon, PokemonTrainer trainer);

    Pokemon chooseGymPokemon (PokemonGymOwner gymOwner);

    Pokemon choosePokemon(PokemonTrainer trainer);

    void enteredTheGym(PokemonTrainer player);

    void printPokemon(List<Pokemon> pokemons);

    void fightRound(PokemonTrainer trainer, PokemonGymOwner owner, Pokemon pokemon, Pokemon gymPokemon);

    void performAttackPlayer(Pokemon pokemon, Pokemon gymPokemon, String attack);

    void gymOwnerAttacks(Pokemon gymPokemon, Pokemon pokemon);

    void attackOrChange(Pokemon pokemon, Pokemon gymPokemon, PokemonTrainer trainer, PokemonGymOwner gym);

    int randomAttackByGymOwner();

    String chooseAttackPlayer(Pokemon p);

}
