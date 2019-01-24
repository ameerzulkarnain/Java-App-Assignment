
public class VehicleSystem {
	public static void main(String[] args) {
		Vehicle SR = new StreetRacer();
		Vehicle F1 = new FormulaOne();
		Vehicle Air = new Aircraft();
		
		SR.display();
		SR.performDrive();
		F1.display();
		F1.performDrive();
		Air.display();
		Air.performFly();
		System.out.println("I am a helicopter which is flying. I am arriving at the runway.");
		Air.performDrive();
	}
}
