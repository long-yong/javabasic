package cls.animal;

public class Human extends Mammal {

    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;

    public Human() {
        strength = 3;
        stealth = 3;
        intelligence = 3;
        health = 100;
    }

    public void attackHuman(Human other) {  health -= other.strength;  }

    public void setStrength(int newStrength) {  strength = newStrength; }
    public int getStrength() {  return strength;  }

    public void setStealth(int newStealth) {  stealth = newStealth; }
    public int getStealth() {  return stealth;  }

    public void setIntelligence(int newIntelligence) {  intelligence = newIntelligence; }
    public int getIntelligence() {  return intelligence;  }

    public void setHealth(int newHealth) {  health = newHealth; }
    public int getHealth() {  return health;  }

    public void killed() {
        strength = 0;
        stealth = 0;
        intelligence = 0;
        health = 0;
        energyLevel = 0;
    }

    public void displayInfo() {
        System.out.println("Health: "+ health);
        System.out.println("Strength: "+ strength);
        System.out.println("Stealth: "+ stealth);
        System.out.println("Intelligence: "+ intelligence);
    }


}
