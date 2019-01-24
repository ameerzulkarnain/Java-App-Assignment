
public class Customer {

	public static final String US = "US";
	public static final String CANADA = "Canada";
	private String address;
	private String name;
	private String zip, state, type;

	public Customer (String inp_name, String inp_address, String inp_zip, String inp_state, String inp_type) {
		name = inp_name;
		address = inp_address;
		zip = inp_zip;
		state = inp_state;
		type = inp_type;
	}

	public boolean isValidAddress() {

		AddressValidator validator = getValidator(type);
		return validator.isValidAddress(address, zip, state);

	}

	private AddressValidator getValidator(String custType) {
		AddressValidator validator = null;
		if(custType.equals(Customer.US)) {
			validator = new USAddress();
		}
		if(custType.equals(Customer.CANADA))
			validator =  new CanadaAdapter();
 		return validator;

	}

	public void printData() {
		System.out.println("name : "+name);
		System.out.println("address : "+address);
		System.out.println("zip : "+zip);
		System.out.println("state :"+state);
		System.out.println("type :"+type);
		if(isValidAddress())
			System.out.println("Valid customer data");
		else
			System.out.println("Invalid customer data");
	}


}
