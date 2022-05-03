package byJins.abstractFactory;

public class KoreaFactory extends AbstractFactory{
    @Override
    public HamProduct createHam() {
        return new KoreaHamProduct();
    }

    @Override
    public BreadProduct createBread() {
        return new KoreaBreadProduct();
    }
}
