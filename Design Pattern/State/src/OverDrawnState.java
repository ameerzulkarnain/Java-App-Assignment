
public class OverDrawnState implements State{
	BusinessAccount ba;
	
	public OverDrawnState(BusinessAccount ba) {
		this.ba = ba;
	}
	
	public boolean deposit(double amount) {
		double amt = amount;
		ba.setBalance(ba.getBalance() + amt - ba.TRANS_FEE_OVERDRAW);
		System.out.println("Transaction Fee (RM5.00) was charged due to account status(Overdrawn)");
		
		if(ba.getBalance() > ba.MIN_BALANCE) {
			ba.setState(ba.getNoTransactionFeeState());
		}
		
		if(ba.getBalance() > 0 && ba.getBalance() < ba.MIN_BALANCE) {
			ba.setState(ba.getTransactionFeeState());
		}
		
		System.out.println("An amount "+String.format("%.2f", amt)+" is deposited");
		ba.display();
		return true;
	}
	
	public boolean withdraw(double amount) {
		double amt = amount;
		ba.setBalance(ba.getBalance() - amt - ba.TRANS_FEE_OVERDRAW);
		
		
		if(ba.getBalance() < ba.OVERDRAW_LIMIT) {
			System.out.println(ba.ERR_OVERDRAW_LIMIT_EXCEED);
		}else {
			System.out.println("Transaction Fee (RM5.00) was charged due to account status(Overdrawn)");
			System.out.println("An amount "+String.format("%.2f", amt)+" is withdrawn");
			ba.display();
		}
		
		
		return true;
	}
}