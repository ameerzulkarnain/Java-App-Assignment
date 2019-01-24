
public class Visa extends CreditCard{
	boolean cardLength(boolean valid, String cardNum) {
		if((cardNum.length() != 16) && (cardNum.length() != 13)) {
			System.out.println("Invalid card number.");
			valid = false;
		}
		return valid;
	}
	
	boolean cardPrefix(boolean valid, int prefix) {
		if(prefix != 4) {
			System.out.println("Invalid prefix.");
			valid = false;
		}
		return valid;
	}
}
