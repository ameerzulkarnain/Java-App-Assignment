import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class CreditCard {
	final void validateCard(String cardNum, int prefix, int month, int year){
		boolean valid = true;
		valid = expDate(valid, month, year);
		valid = cardLength(valid, cardNum);
		valid = cardPrefix(valid, prefix);
		validateCharacters();
		valid = checkDigit(valid, cardNum);
		accountStanding(valid);
	}
	
	boolean expDate(boolean valid, int month, int year) {
		String nowMonth = new SimpleDateFormat("MM").format(new Date());
		int currentMonth = Integer.parseInt(nowMonth);  
		
		String nowYear = new SimpleDateFormat("yyyy").format(new Date());
		int currentYear = Integer.parseInt(nowYear);  
		
		if((month > currentMonth) && (year < currentYear)){
			System.out.println("Invalid Expiry Date.");
			valid = false;
		}
		return valid;
	}
	
	void validateCharacters() {
		//System.out.println("0 through 9");
	}
	
	boolean checkDigit(boolean valid, String cardNum) {
		boolean result = true;
		int sum = 0;
		int multiplier = 1;
		int strLen = cardNum.length();
		
		for (int i = 0; i < strLen; i++) {
			String digit = cardNum.substring(strLen - i - 1, strLen - i);
			int currProduct = new Integer(digit).intValue() * multiplier;
			
			if (currProduct >= 10) {
				sum += (currProduct % 10) + 1;
			}
			else {
				sum += currProduct;
			}
				
			if (multiplier == 1) {
				multiplier++;
			}
			else {
				multiplier--;
			}
				
		}
		if ((sum % 10) != 0) {
			result = false;
			valid = false;
			System.out.println("Invalid Check Sum.");
		}
		
		return valid;
	}
	
	abstract boolean cardLength(boolean valid, String cardNum);
	abstract boolean cardPrefix(boolean valid, int prefix);
//	abstract boolean accountStanding(boolean valid);
	void accountStanding(boolean valid) {
		if(valid == true) {
			System.out.println("This credit card is valid");
		}else {
			System.out.println("This credit card is invalid");
		}
	}
}
