package BankingApp;
import java.text.NumberFormat;

public class Account {
	/*
	 * declare the starting balances for checking and savings account declare
	 * the constants Checking fee and Savings Interest
	 */
	private static double checkingBalance = 1000.00;
	private static double savingsBalance = 1000.00;
	private final double CHECKING_FEE = 1;
	private final double SAVINGS_INTEREST = .01;
	private double amount;

	public Account() {
		amount = 0;
	}

	public double getCHECKING_FEE() {
		return CHECKING_FEE;
	}

	public String getFormattedCHECKING_FEE() {
		String checkingFee = formatAmount(this.CHECKING_FEE);
		return checkingFee;
	}

	public double getSAVINGS_INTEREST() {
		return SAVINGS_INTEREST;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public static double getCheckingBalance() {
		return checkingBalance;
	}

	public static void setCheckingBalance(double checkingBalance) {
		Account.checkingBalance = checkingBalance;
	}

	public static double getSavingsBalance() {
		return savingsBalance;
	}

	public static void setSavingsBalance(double savingsBalance) {
		Account.savingsBalance = savingsBalance;
	}

	// return the checking and savings balances
	@Override
	public String toString() {
		return "Checking: " + formatAmount(Account.getCheckingBalance()) + "\n"
				+ "Savings: " + formatAmount(Account.getSavingsBalance())
				+ "\n";

	}

	// format number method
	public String formatAmount(double x) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		currency.setMaximumFractionDigits(2);
		return currency.format(x);
	}
}
