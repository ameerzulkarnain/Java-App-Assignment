
public class Paneer extends ToppingDecorator {
	public Paneer(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public int getCost() {
		return 2+pizza.getCost();
	}
	
	public String getDescription() {
		return pizza.getDescription()+"\nTopping: Paneer - RM 2";
	}

}
