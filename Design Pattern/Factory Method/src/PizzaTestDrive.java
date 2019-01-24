
public class PizzaTestDrive {
	public static void main(String[] args) {
		
		//SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chStore = new ChicagoPizzaStore();
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println();
		pizza = chStore.orderPizza("cheese");
	}
}
