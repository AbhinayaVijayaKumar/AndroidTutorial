package BankingApp;
/* Savings class which implements the IAccount interface which contains 
withdraw, deposit and finalbalance methods. All the transactions for the
savings account are taken care of and the final balances are computed */

public class Savings extends Account implements IAccount {

	private double sum = super.getSavingsBalance();
	private double finalBalance;
	private double savingsInterest = 0;

	public Savings() {
		super();
		finalBalance = 0;
	}
	
	// subtract the amount entered by the user from the existing balance
	public double withdraw() {
		sum = super.getSavingsBalance() - super.getAmount();
		return sum;
	}
	
	// add the amount entered by the user to the existing balance
	public double deposit() {
		sum = super.getSavingsBalance() + super.getAmount();
		return sum;
	}

	// calculate the savings interest
	public double calcSavingsInterest() {
		savingsInterest = super.getSAVINGS_INTEREST() * sum;
		return savingsInterest;
	}

	// get the formatted savings interest
	public String getFormattedSavingsInterest() {
		String savingsInterest = super.formatAmount(this.calcSavingsInterest());
		return savingsInterest;
	}
    
	// compute final balance by adding the savings interest payments.
	public double finalBalance() {
		finalBalance = sum + savingsInterest;
		return finalBalance;
	}
	
	// get the formatted final balance
	public String getFormattedBalance() {
		String fb = super.formatAmount(this.finalBalance());
		return fb;
	}
    
	// return the savings balance 
	@Override
	public String toString() {
		return "Savings: " + getFormattedBalance() + "\n";

	}

}
