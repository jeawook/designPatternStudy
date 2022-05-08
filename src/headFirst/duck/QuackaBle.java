package headFirst.duck;

public interface QuackaBle {
    default void quack() {
        System.out.println("quack");
    }
}
