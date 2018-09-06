package cls.animal;

public class Mammal extends Animal {

    public Mammal() { super(100); }
    public Mammal(int myEnergy) { super(myEnergy); }

    public int displayEnergy() {
        System.out.println("Energy lever: " + getEnergy()+"\n");
        return getEnergy();
    }

}
