package headFirst.duck;

public class RedHeadDuck extends Duck implements Flyable, QuackaBle{
    @Override
    public void display() {
        System.out.println("RedheadDuck");
    }
}
