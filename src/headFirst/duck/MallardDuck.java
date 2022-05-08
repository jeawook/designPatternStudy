package headFirst.duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void swim() {
        System.out.println("MallardDuck");
    }

    @Override
    public void display() {

    }
}
