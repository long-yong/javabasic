package cls.animal;

public class Gorilla extends Mammal {

    public void throwSomething(){
        System.out.println("Throw something once!");
        lostEnergy(5);
    }

    public void eatBananas() {
        System.out.println("Eat Bananas once!");
        addEnergy(10);
    }

    public void climb() {
        System.out.println("Climb tree once!");
        lostEnergy(10);
    }
}
