
public class Aircraft extends Vehicle{
	
	public Aircraft() {
		flying = new CanFly();
		driving = new Driveable();
	}
	
	public void display() {
		System.out.print("I am a helicopter. ");
	}

}
