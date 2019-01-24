
public abstract class Pizza {
	public String name;
	public String description = "Default pizza";
	
	public String getDescription() {
		return description;
	}
	
	public abstract int getCost();
}
