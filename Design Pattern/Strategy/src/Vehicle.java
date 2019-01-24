
public abstract class Vehicle {
	
	Driving driving;
	Flying flying;
	
	public Vehicle() {
	}
	
	public abstract void display();
	
	public void performDrive() {
		driving.drive();
	}
	
	public void performFly() {
		flying.fly();
	}
	
//	public void setDrive(Driving dr) {
//		driving = dr;
//	}
//	
//	public void setFly(Flying fl) {
//		flying = fl;
//	}
}
