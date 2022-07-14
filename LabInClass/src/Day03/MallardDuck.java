package Day03;

import Day03.VanDe03.FlyWithWings;
import Day03.VanDe03.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Display MallarDuck");
    }
}
