package headfirst.designpatterns.decorator.starbuzz;

import java.io.FilterInputStream;

public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		//FilterInputStream
		/*Beverage beverage = new Espresso();//浓缩咖啡
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
 */
		Beverage beverage2 = new DarkRoast();//深焙咖啡
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println("+++"+beverage2.getDescription()+ 
				" $" + beverage2.cost());
 
	/*	Beverage beverage3 = new HouseBlend();//综合咖啡
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());*/
	}
}
