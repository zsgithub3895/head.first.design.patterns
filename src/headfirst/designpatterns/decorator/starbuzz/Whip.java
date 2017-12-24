package headfirst.designpatterns.decorator.starbuzz;
 
/**
 * @author Administrator
 *  Whip  奶泡  v. 把…打起泡沫
 */
public class Whip extends CondimentDecorator {
	Beverage beverage;
 
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
