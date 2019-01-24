
public class NoTransactionFeeState implements State{
	BusinessAccount ba;
	
	public NoTransactionFeeState(BusinessAccount ba) {
		this.ba = ba;
	}
	
	public boolean deposit(double amount) {
		double amt = amount;
		ba.setBalance(ba.getBalance() + amt);
		
		if(ba.getBalance() < ba.MIN_BALANCE) {
			ba.setBalance(ba.getBalance() - ba.TRANS_FEE_NORMAL);
			System.out.println("Transaction Fee (RM2.00) was charged due to account status (less than minimum balance)");
		}
		System.out.println("An amount "+String.format("%.2f", amt)+" is deposited");
		ba.display();
		return true;
	}
	
	public boolean withdraw(double amount) {
		double amt = amount;
		ba.setBalance(ba.getBalance() - amt);
		
		if(ba.getBalance() > 0 && ba.getBalance() < ba.MIN_BALANCE) {
			ba.setState(ba.getTransactionFeeState());
		}
		
		if(ba.getBalance() < 0 ) {
			ba.setState(ba.getOverDrawnState());
		}
		System.out.println("An amount "+String.format("%.2f", amt)+" is withdrawn");
		ba.display();
		return true;
	}
}
