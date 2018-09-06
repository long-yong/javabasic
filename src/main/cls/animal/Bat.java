package cls.animal;

public class Bat extends Mammal {

    public Bat() {
        super(300);
    }

    public void fly() {
        System.out.println("Fly once!");
        lostEnergy(50);
    }

    public void eatHumans() {
        System.out.println("Eat humans once!");
        addEnergy(25);
    }

    public void attackTown() {
        System.out.println("Look! Bat is attacking us! Our town is on fire!");
        lostEnergy(100);
    }
}
