package cls.animal;

public class Animal {

    protected int energyLevel;

    public Animal() {  }
    public Animal(int myEnergy) {  energyLevel = myEnergy; }

    public void setEnergy(int myEnergy) { energyLevel = myEnergy;  }
    public int getEnergy() {
        return energyLevel;
    }

    public void addEnergy(int val) { energyLevel += val;  }
    public void lostEnergy(int val) { energyLevel -= val; }

}
