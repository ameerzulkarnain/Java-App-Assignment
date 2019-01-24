
public class TransactionFeeState implements State{
	BusinessAccount ba;
	
	public TransactionFeeState(BusinessAccount ba) {
		this.ba = ba;
	}
	
	public boolean deposit(double amount) {
		double amt = amount;
		ba.setBalance(ba.getBalance() + amt - ba.TRANS_FEE_NORMAL);
		
		if(ba.getBalance() > ba.MIN_BALANCE) {
			ba.setState(ba.getNoTransactionFeeState());
		}
		System.out.println("An amount "+String.format("%.2f", amt)+" is deposited");
		ba.display();
		return true;
	}
	
	public boolean withdraw(double amount) {
		double amt = amount;
		ba.setBalance(ba.getBalance() - amt - ba.TRANS_FEE_NORMAL);
		
		if(ba.getBalance() < 0 ) {
			ba.setState(ba.getOverDrawnState());
			System.out.println("Attention: Your Account is Overdrawn");
		}
		
		System.out.println("An amount "+String.format("%.2f", amt)+" is withdrawn");
		ba.display();
		return true;
	}
}