package assign.pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {

    private static ArrayList<Pokemon> pokemonList = new ArrayList<>();

    @Override
    public Pokemon createPokemon(String name, int health, String type) {
        Pokemon pokemon = new Pokemon(name,health,type);
        pokemonList.add(pokemon);
        return pokemon;
    }

    @Override
    public String pokemonInfo(Pokemon pokemon) {
        String str = "Name: " + pokemon.name + "  Health: "+ pokemon.health +"  Type: " + pokemon.type;
        return str;
    }

    @Override
    public void listPokemon() {
        for(Pokemon pokemon:pokemonList) {
            System.out.println(pokemonInfo(pokemon));
        }
    }

}
