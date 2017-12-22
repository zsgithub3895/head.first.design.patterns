package head.first.design.patterns.strategy;

public class RedHeadDuck extends Duck{
	
	RedHeadDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior){
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}
	
	@Override
	public void display() {
		System.out.println("红头鸭");
	}
	
}
