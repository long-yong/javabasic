package cls.animal;

public class Wizard extends Human {

    public Wizard() {
        super();
        setHealth(50);
        setIntelligence(8);
    }

    public void heal(Human other) {
        other.health += getIntelligence();
    }

    public void fireball(Human other) {
        other.health -= 3*getIntelligence();
    }

}
