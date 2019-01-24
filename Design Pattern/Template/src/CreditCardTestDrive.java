
public class CreditCardTestDrive {

	public static void main(String[] args) {
		Visa visa = new Visa();
		MasterCard mastercard = new MasterCard();
		DinersClub dinerclub = new DinersClub();
		
		cardDetails("VisaCard","1234123412341234",34,11,2004);
		visa.validateCard("1234123412341234",34,11,2004);
		System.out.println();
		cardDetails("VisaCard","1234567890123456",56,11,2020);
		visa.validateCard("1234567890123456",56,11,2020);
		System.out.println();
		cardDetails("VisaCard","4234567890123456",4,11,2020);
		visa.validateCard("4234567890123456",4,11,2020);
		System.out.println();
		cardDetails("MasterCard","5448755330349315",53,4,2021);
		mastercard.validateCard("5448755330349315",53,4,2021);
		System.out.println();
		cardDetails("DinersClubCard","30263720264678",36,5,2025);
		dinerclub.validateCard("30263720264678",36,5,2025);
	}
	
	public static void cardDetails(String cardType, String cardNum, int prefix, int month, int year) {
		System.out.println("Card type = "+cardType+", Card number = "+cardNum+", Expiry month = "+month+", Expiry year = "+year);
	}

}
