package cls.animal;

public class HumanTest {

    public static void main(String[] args) {

        Human John = new Human();
        System.out.println("\nJohn's info:");
        John.displayInfo();

        Human Masha = new Human();
        System.out.println("\nMasha's info:");
        Masha.displayInfo();

        John.attackHuman(Masha);
        System.out.println("\nAfter John attack Masha, John's info:");
        John.displayInfo();
    }

}
