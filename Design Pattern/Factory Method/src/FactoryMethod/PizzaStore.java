package FactoryMethod;

public abstract class PizzaStore {
	abstract Pizza createPizza(String item);
	
	public Pizza orderPizza(String pizzatype) {
		Pizza pz = createPizza(pizzatype);
		
		System.out.println("--- Making a " + pz.getName() + " ---");
		pz.prepare();
		pz.bake();
		pz.cut();
		pz.box();
		return pz;
	}
	
	
}
