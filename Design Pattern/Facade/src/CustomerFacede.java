
public class CustomerFacede {
	Account acc;
	Address add;
	CreditCard cc;
	
	public CustomerFacede(Account acc, Address add, CreditCard cc) {
		this.acc = acc;
		this.add = add;
		this.cc = cc;
	}
	
	public void process() {
		System.out.println("First name = "+acc.getFirstName()+", Last Name = "+acc.getLastName());
		System.out.println("Address = "+add.getAddress()+", City = "+add.getCity()+", State = "+add.getState());
		System.out.println("Card type = "+cc.getCardType()+", Card number = "+cc.getCardNumber()+", Card expiry date = "+cc.getCardExpDate());
		
		if(acc.isValid() == true && add.isValid() == true && cc.isValid() == true) {
			System.out.println("==> Valid Customer Data: Data Saved Successfully");
		}else {
			System.out.println("==> Invalid Customer Data: Data Could Not Be Saved");
		}
	}
}
