package Day03;

public class TestDriveDuck {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        ModelDuck modelDuck = new ModelDuck();
        mallardDuck.performQuack();
        rubberDuck.performQuack();
        decoyDuck.performQuack();
        modelDuck.display();
    }
}
