package headFirst.duck;

public class MallardDuck extends Duck implements Flyable, QuackaBle {
    @Override
    public void swim() {
        System.out.println("MallardDuck");
    }
}
