package Day03;

import Day03.VanDe03.FlyWithNoway;
import Day03.VanDe03.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyWithNoway());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Display DecoyDuck");

    }
}
