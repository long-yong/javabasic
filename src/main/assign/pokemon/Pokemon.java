package assign.pokemon;

public class Pokemon {

    private static int counter  = 0;

    protected String name;
    protected int health;
    protected String type;

    public Pokemon(String myName,int myHealth,String myType) {
        counter++;
        name = myName;
        health = myHealth;
        type = myType;
    }

    public void attackPokemon(Pokemon pokemon) {   health-=10;    }

    public String getName() {  return name; }
    public void setName(String newName) {  name = newName;  }

    public int getHealth() {  return health; }
    public void setHealth(int newHealth) {  health = newHealth;  }

    public String getType() {  return type; }
    public void setType(String newType) {  type = newType; }

}
