package byJins.abstractFactory;

public class StateFactory extends AbstractFactory{
    @Override
    public HamProduct createHam() {
        return new StateHamProduct();
    }

    @Override
    public BreadProduct createBread() {
        return new StateBreadProduct();
    }
}
