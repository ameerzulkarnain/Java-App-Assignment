
public class FreshTomato extends ToppingDecorator{
	public FreshTomato(Pizza pizza) {
		this.pizza = pizza;
	}
	public int getCost() {
		return 3+pizza.getCost();
	}
	public String getDescription() {
		return pizza.getDescription() +"\nTopping: Fresh tomato - RM 3";
	}
}
