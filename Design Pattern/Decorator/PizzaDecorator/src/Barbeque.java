
public class Barbeque extends ToppingDecorator {
	public Barbeque(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public int getCost() {
		return pizza.getCost()+6;
	}
	
	public String getDescription() {
		return pizza.getDescription()+"\nTopping: Barbeque - RM 6";
	}
}
