package headfirst.designpatterns.decorator.starbuzz;

/**
 * @author Administrator
 * Mocha 摩卡(咖啡)  adj.用咖啡调味的
 */
public class Mocha extends CondimentDecorator {
	Beverage beverage;
 
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
