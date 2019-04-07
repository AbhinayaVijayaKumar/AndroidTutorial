package BankingApp;
/* Checking class which implements the IAccount interface which contains 
 withdraw, deposit and finalbalance methods. All the transactions for the
 checking account are taken care of and the final balances are computed */

public class Checking extends Account implements IAccount {
	private double sum = super.getCheckingBalance();
	private double finalBalance;

	public Checking() {
		super();
		finalBalance = 0;
	}

	// subtract the amount entered by the user from the existing balance
	public double withdraw() {
		sum = super.getCheckingBalance() - super.getAmount();
		return sum;
	}

	// add the amount entered by the user to the existing balance
	public double deposit() {
		sum = super.getCheckingBalance() + super.getAmount();
		return sum;
	}

	// compute final balance after including the fees
	public double finalBalance() {
		finalBalance = sum - super.getCHECKING_FEE();
		return finalBalance;
	}

	// get the formatted final balance
	public String getFormattedBalance() {
		String fb = super.formatAmount(this.finalBalance());
		return fb;
	}
     
	// return the checking balance 
	@Override
	public String toString() {
		return "Checking: " + getFormattedBalance();

	}

}
