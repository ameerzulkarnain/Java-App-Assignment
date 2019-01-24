
public class CreditCard {
	String cardType;
	String cardNumber;
	String cardExpDate;
	final String ACCOUNT_DATA_FILE = "AccountData.txt";
	public static final String VISA = "Visa";
	public static final String MASTER = "Master";
	
	public CreditCard(String ccType, String ccNum, String ccExpDate) {
		cardType = ccType;
		cardNumber = ccNum;
		cardExpDate = ccExpDate;
	}
	
	public boolean isValid() {
		if(getCardType().equals(VISA) || getCardType().equals(MASTER)) {
			System.out.println("Valid Credit Card");
			return (getCardNumber().trim().length() == 16);
		}
		System.out.println("Invalid Credit Card");
		return false;
	}
	
	public void save() {
		String dataLine = getCardType() + ", " + getCardNumber() + ", " + getCardExpDate();
		System.out.println(dataLine);
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	
	public String getCardExpDate() {
		return cardExpDate;
	}
}
