package assign.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {

    @Override
    public abstract Pokemon createPokemon(String name, int health, String type);

    @Override
    public abstract String pokemonInfo(Pokemon pokemon);

    @Override
    public abstract void listPokemon();

}
