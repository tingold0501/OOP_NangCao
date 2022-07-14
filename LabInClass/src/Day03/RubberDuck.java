package Day03;

import Day03.VanDe03.FlyWithNoway;
import Day03.VanDe03.Quack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyWithNoway();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub

    }

}
