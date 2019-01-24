
public class AddressClassAdapterTest {
	public static void main(String [] args) {
		Customer ali = new Customer("Google", "1600 Amphitheatre Parkway", "94043", "CA", "US");
		Customer abu = new Customer("Google", "1600 Amphitheatre Parkway", "94043", "CA", "Canada");

		ali.isValidAddress();
		ali.printData();

		abu.isValidAddress();
		abu.printData();


	}
}
