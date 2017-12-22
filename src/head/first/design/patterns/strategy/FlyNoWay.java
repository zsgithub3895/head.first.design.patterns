package head.first.design.patterns.strategy;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		 System.out.println("I can't fly!");
	}

	@Override
	public void high() {
		System.out.println("0");
	}

}
