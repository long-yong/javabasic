package cls.animal;

public class GorillaTest {

    public static void main(String[] args) {

        Gorilla Gorge = new Gorilla();
        Gorge.displayEnergy();

        for(int i=0;i<3;i++) Gorge.throwSomething();
        Gorge.displayEnergy();

        for(int i=0;i<2;i++) Gorge.eatBananas();
        Gorge.displayEnergy();

        Gorge.climb();
        Gorge.displayEnergy();

    }
}
