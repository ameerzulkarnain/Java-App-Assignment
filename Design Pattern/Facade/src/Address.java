
public class Address {
	String address;
	String city;
	String state;
	final String ACCOUNT_DATA_FILE = "AccountData.txt";
	
	public Address(String addr, String cty, String st) {
		address = addr;
		city = cty;
		state = st;
	}
	
	public boolean isValid() {
		if(getState().trim().length() < 2) {
			System.out.println("Invalid Address/City/State");
			return false;
		}
		System.out.println("Valid Address/City/State");
		return true;
	}
	
	public void save() {
		String dataLine = getAddress() + ", " + getCity() + ", " + getState();
		System.out.println(dataLine);
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
}
