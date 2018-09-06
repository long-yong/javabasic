package cls.animal;

public class Ninja extends Human{

    public Ninja() {
        super();
        setStealth(10);
    }

    public void steal(Human other) {
        health += other.stealth;
        other.health -= 10;
    }

    public void runAway() {
        health -= 10;
    }

}
