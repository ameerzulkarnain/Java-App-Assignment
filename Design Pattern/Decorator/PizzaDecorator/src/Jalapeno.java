
public class Jalapeno extends ToppingDecorator{
	public Jalapeno(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public int getCost() {
		return pizza.getCost()+4;
	}
	
	public String getDescription() {
		return pizza.getDescription()+"\nTopping: Jalapeno - RM 4";
	}
}
