
public class TestPizzaDecorator {

	public static void main(String[] args) {
		Pizza pizza = new ChickenFiesta();
		pizza = new Jalapeno(pizza);
		pizza = new FreshTomato(pizza);
		System.out.println("Pizza: " + pizza.getDescription() + "\nTotal: RM " + pizza.getCost());
		
		System.out.println();
		
		Pizza pizza2 = new FarmHouse();
		pizza2 = new Jalapeno(pizza2);
		pizza2 = new FreshTomato(pizza2);
		pizza2 = new Paneer(pizza2);
		pizza2 = new Barbeque(pizza2);
		System.out.println("Pizza: " + pizza2.getDescription() + "\nTotal: RM " + pizza2.getCost());
	}

}
