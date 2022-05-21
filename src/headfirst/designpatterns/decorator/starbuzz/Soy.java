package headfirst.designpatterns.decorator.starbuzz;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == Size.TALL) {
			return .10 + beverage.cost();
		} else if (beverage.getSize() == Size.GRANDE) {
			return .15 + beverage.cost();
		} else if (beverage.getSize() == Size.VENTI) {
			return .20 + beverage.cost();
		}
		return cost;
	}
}
