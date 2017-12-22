package head.first.design.patterns.strategy;

public class MuteQuack implements QuackBehavior{
	@Override
	public void quack() {
		System.out.println("无法呱呱叫！");		
	}

}
