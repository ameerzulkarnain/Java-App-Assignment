
public class MasterCard extends CreditCard{
	boolean cardLength(boolean valid, String cardNum) {
		if(cardNum.length() != 16){
			System.out.println("Invalid card number.");
			valid = false;
		}
		return valid;
	}
	
	boolean cardPrefix(boolean valid, int prefix) {
		if((prefix != 51) && (prefix != 52) && (prefix != 53) && (prefix != 54) && (prefix != 55) ) {
			System.out.println("Invalid prefix.");
			valid = false;
		}
		return valid;
	}
}