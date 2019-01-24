
public class AccountManager {
	public static void main(String[] args) {
		
		Account acc = new Account("John", "Smith");
		Address add = new Address("101 Jalan Bukit", "Shah Alam", "Selangor");
		CreditCard cc = new CreditCard("Visa", "1111222233334444", "01/09/2020");
		
		Account acc2 = new Account("Vijaya", "K");
		Address add2 = new Address("1 Jalan University", "Kuala Lumpur", "Wilayah Persekutuan");
		CreditCard cc2 = new CreditCard("Master", "9999888877776666", "01/01/2022");
		
		Account acc3 = new Account("Aryati", "Ahmad");
		Address add3 = new Address("35 Wisma Jaya", "Petaling Jaya", "Selangor");
		CreditCard cc3 = new CreditCard("Master", "555566667777", "01/05/2023");
		
		CustomerFacede cf = new CustomerFacede(acc, add, cc);
		CustomerFacede cf2 = new CustomerFacede(acc2, add2, cc2);
		CustomerFacede cf3 = new CustomerFacede(acc3, add3, cc3);
		
		System.out.println("First customer:");
		cf.process();
		
		System.out.println("\nSecond customer:");
		cf2.process();
		
		System.out.println("\nThird customer:");
		cf3.process();
		
	}
}
