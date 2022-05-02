package byJins.factory;

/**
 * 추상 클래스
 */
public abstract class TransCreator {
    // TransProduct 생성하는 팩토리 메소드(bicycle or taxi);
    public abstract TransProduct transCreate(String trans);
}
