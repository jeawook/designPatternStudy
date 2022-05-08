package headFirst.duck;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("no fly");
    }
}