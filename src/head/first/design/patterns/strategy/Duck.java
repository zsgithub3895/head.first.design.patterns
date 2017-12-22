package head.first.design.patterns.strategy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	abstract void display();
	
	public void swim() {
		System.out.println("All ducks float,even decoys! ");
	}

	public void performFly() {
		flyBehavior.fly();
		flyBehavior.high();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
