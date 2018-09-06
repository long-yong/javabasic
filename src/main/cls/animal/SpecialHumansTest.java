package cls.animal;

public class SpecialHumansTest {
    public static void main(String[] args) {

        Wizard Sam = new Wizard();
        System.out.println("\nWizard Sam's info:");
        Sam.displayInfo();

        Human Mary = new Human();
        System.out.println("\nHuman Mary's info:");
        Mary.displayInfo();

        Sam.heal(Mary);
        System.out.println("\nAfter Sam heal Mary, Mary's info:");
        Mary.displayInfo();

        Sam.fireball(Mary);
        System.out.println("\nAfter Sam fireball Mary, Mary's info:");
        Mary.displayInfo();

        Ninja Joe = new Ninja();
        System.out.println("\nNinja Joe's info:");
        Joe.displayInfo();

        Joe.steal(Mary);
        System.out.println("\nAfter Joe stole from Mary ...");
        System.out.println("\nJoe's info:");
        Joe.displayInfo();
        System.out.println("\nMary's info:");
        Mary.displayInfo();

        Joe.runAway();
        System.out.println("\nAfter Joe run away, Joe's info:");
        Joe.displayInfo();

        Samurai Smith = new Samurai();
        System.out.println("\nSamurai Smith's info:");
        Smith.displayInfo();

        Smith.deathBlow(Joe);
        System.out.println("\nAfter Smith deathBlow Joe ... ");
        System.out.println("\nSmith's info:");
        Smith.displayInfo();
        System.out.println("\nJoe's info:");
        Joe.displayInfo();

        Smith.meditate();
        System.out.println("\nAfter Meditate, Smith's info:");
        Smith.displayInfo();

        System.out.println("\nWe totally created " + Samurai.howMany() + " Samurai(s) \n");
    }
}
