package head.first.design.patterns.strategy;

public class Test {

	public static void main(String[] args) {
		// 创建行为类
        FlyBehavior flyNoWay = new FlyNoWay();
        FlyBehavior flyWithWing = new FlyWithWings();
        QuackBehavior muteQuack = new MuteQuack();
        QuackBehavior quack = new Quack();
        
        RedHeadDuck rd = new RedHeadDuck(flyWithWing,quack);
        rd.display();
        rd.performFly();
        rd.performQuack();
        rd.setFlyBehavior(flyNoWay);
        rd.setQuackBehavior(muteQuack);
        rd.performFly();
        rd.performQuack();
	}

}
