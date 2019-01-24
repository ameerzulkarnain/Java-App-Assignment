
public class DinersClub extends CreditCard{
	boolean cardLength(boolean valid, String cardNum) {
		if(cardNum.length() != 14){
			System.out.println("Invalid card number.");
			valid = false;
		}
		return valid;
	}
	
	boolean cardPrefix(boolean valid, int prefix) {
		if((prefix != 30) && (prefix != 36) && (prefix != 38)) {
			System.out.println("Invalid prefix.");
			valid = false;
		}
		return valid;
	}
}