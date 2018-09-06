package assign.pokemon;

public class PokemonTest {
    public static void main(String[] args) {

        Pokedex pokedex = new Pokedex();

        Pokemon pokemon1 = pokedex.createPokemon("Mary", 100, "girl");
        System.out.println(pokedex.pokemonInfo(pokemon1));
        System.out.println(" ");

        Pokemon pokemon2 = pokedex.createPokemon("John", 200, "boy");
        System.out.println(pokedex.pokemonInfo(pokemon2));
        System.out.println(" ");

        Pokemon pokemon3 = pokedex.createPokemon("Bug", 80, "enemy");
        System.out.println(pokedex.pokemonInfo(pokemon3));

        System.out.println("\nBug attacked Mary:");
        pokemon3.attackPokemon(pokemon1);

        System.out.println("\nPokemons info list:");
        pokedex.listPokemon();

    }
}
