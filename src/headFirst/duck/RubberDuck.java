package headFirst.duck;

public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squack();
    }

    @Override
    public void display() {
        System.out.println("RubberDuck");
    }

}
