package Day03;

import Day03.VanDe03.FlyWithNoway;
import Day03.VanDe03.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyWithNoway();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Model Duck");

    }

}
