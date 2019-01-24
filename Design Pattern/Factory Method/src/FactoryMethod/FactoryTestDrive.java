package FactoryMethod;

public class FactoryTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+pizza.getName());
	}

}
