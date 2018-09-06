package cls.animal;

public class BatTest {

    public static void main(String[] args) {

        Bat bats = new Bat();

        bats.displayEnergy();

        for(int i=0;i<3;i++) bats.attackTown();

        for(int i=0;i<2;i++) bats.eatHumans();

        for(int i=0;i<2;i++) bats.fly();

        bats.displayEnergy();
    }
}
