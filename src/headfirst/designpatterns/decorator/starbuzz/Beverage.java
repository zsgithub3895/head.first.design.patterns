package headfirst.designpatterns.decorator.starbuzz;

/**
 * @author Administrator
 * Beverage(饮料)   delegate:n.代表,代表团成员   v.委托，授权
 */
public abstract class Beverage {
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
