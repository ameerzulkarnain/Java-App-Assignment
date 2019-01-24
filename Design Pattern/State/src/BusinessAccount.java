
public class BusinessAccount {
	public static final double MIN_BALANCE = 2000.00;
	public static final double OVERDRAW_LIMIT = -1000.00;
	public static final double TRANS_FEE_NORMAL = 2.00;
	public static final double TRANS_FEE_OVERDRAW = 5.00;
	public static final String ERR_OVERDRAW_LIMIT_EXCEED = "Error: Transaction cannot be processed. Overdraw limit exceeded.";
	
	private State noTransactionFeeState;
	private State transactionFeeState;
	private State overDrawnState;
	State state;
	private String accountNumber;
	private double balance;
	
	public BusinessAccount (String accountNum) {
		accountNumber = accountNum;
		noTransactionFeeState =  new NoTransactionFeeState(this);
		transactionFeeState =  new TransactionFeeState(this);
		overDrawnState =  new OverDrawnState(this);
		
		state = noTransactionFeeState;
	}
	
	public void setState(State newState) {
		this.state = newState;
	}
	
	public State getState() {
		return state;
	}
	
	public State getNoTransactionFeeState() {
		return noTransactionFeeState;
	}
	
	public State getTransactionFeeState() {
		return transactionFeeState;
	}
	
	public State getOverDrawnState() {
		return overDrawnState;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public boolean deposit(double amount) {
		return state.deposit(amount);
	}
	
	public boolean withdraw(double amount) {
		return state.withdraw(amount);
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void display() {
		System.out.println("Account number: "+getAccountNumber()+", Balance: RM "+String.format("%.2f", getBalance()));
		System.out.println();
	}
			
}
