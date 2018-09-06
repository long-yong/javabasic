package cls.animal;

public class Samurai extends Human {

    private static int counter = 0;

    public Samurai() {
        super();
        setHealth(200);
        counter ++ ;
    }

    public void deathBlow(Human other) {
        other.killed();
        health /= 2;
    }

    public void meditate() {
        health += health/2;
    }

    public static int howMany() {
        return counter;
    }
}
