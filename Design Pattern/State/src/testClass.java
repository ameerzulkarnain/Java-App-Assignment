
public class testClass {
	public static void main (String[] args) {
		BusinessAccount busiAcc = new BusinessAccount("Acc-01");
		
		busiAcc.setBalance(3000.00);
		busiAcc.display();
		busiAcc.deposit(2000.00);
		busiAcc.withdraw(4000.00);
		busiAcc.withdraw(500.00);
		busiAcc.withdraw(1000.00);
		busiAcc.withdraw(200.00);
		busiAcc.withdraw(800.00);
	}
}
