package head.first.design.patterns.strategy;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		 System.out.println("I'm flying!");
	}

	@Override
	public void high() {
		 System.out.println("1000~2000m");
	}
	
}
