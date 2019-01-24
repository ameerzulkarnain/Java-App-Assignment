
public class Account {
	String firstName;
	String lastName;
	final String ACCOUNT_DATA_FILE = "AccountData.txt";
	
	public Account(String fname, String lname) {
		firstName = fname;
		lastName = lname;
	}
	
	public boolean isValid() {
		if(getLastName().trim().length() < 2) {
			System.out.println("Invalid FirstName/LastName");
			return false;
		}
		System.out.println("Valid FirstName/LastName");
		return true;
	}
	
	public void save() {
		String dataLine = getLastName() + ", " + getFirstName();
		System.out.println(dataLine);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
}
