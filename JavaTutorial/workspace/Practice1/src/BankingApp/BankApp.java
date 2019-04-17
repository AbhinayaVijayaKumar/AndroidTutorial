package BankingApp;
import java.util.Scanner;

/*
 * Program that deals with the transactions of a bank. Firstly the starting 
 * checking and savings balances are displayed and the application prompts the user 
 * to enter the type  of transaction, whether a withdrawal or deposit is to be made,
 * and whether the transaction will be posted to the checking or savings account,
 * and the amount of the transaction. When the transactions are done, the
 * application displays the total fees and payments for the month followed by
 * the final balances for the month.
 */

public class BankApp {

	public static void main(String[] args) {
		// display a welcome message to the user
		System.out.println("Welcome to the Account Application: ");
		System.out.println();

		// create Account, Savings and Checking objects
		Account a = new Account();
		Savings s = new Savings();
		Checking c = new Checking();

		// display the starting balances
		System.out.println("Starting Balances");
		print(a);

		/*
		 * get the transaction details from the user if it is withdrawal or
		 * deposit, then ask for the account type whether it is savings account
		 * or checking account and then ask for the amount to deposit or
		 * withdraw
		 */

		System.out.println("Enter the transaction for the month: \n ");

		String choice = "y";
		// continue until the user wants to quit
		while (choice.equalsIgnoreCase("y")) {

			Scanner sc = new Scanner(System.in);
			String transactionType = Validator.getChoiceString(sc,
					"Withdrawal or Deposit? (w/d): ", "w", "d");
			// withdrawal transaction
			if (transactionType.equalsIgnoreCase("w")) {
				String accountType = Validator.getChoiceString(sc,
						"Checking or Savings? (c/s): ", "c", "s");
				// check if the user wants to withdraw from checking account
				// and get the amount
				if (accountType.equalsIgnoreCase("c")) {
					double amount = Validator.getDoubleWithinRange(sc,
							"Amount: ", 0, Account.getCheckingBalance());
					c.setAmount(amount);
					// call the withdraw method
					double sum = c.withdraw();
					Account.setCheckingBalance(sum);
					// compute the final balances
					c.finalBalance();
				}
				// check if the user wants to withdraw from savings account and
				// get the amount
				else if (accountType.equalsIgnoreCase("s")) {
					double amount = Validator.getDoubleWithinRange(sc,
							"Amount: ", 0, Account.getSavingsBalance());
					s.setAmount(amount);
					// call the withdraw method
					double sum = s.withdraw();
					Account.setSavingsBalance(sum);
					// compute the final balances
					c.finalBalance();
				} else {
					System.out
							.println("This entry is invalid. Please try again");
				}
				// deposit transaction
			} else if (transactionType.equalsIgnoreCase("d")) {
				String accountType = Validator.getChoiceString(sc,
						"Checking or Savings? (c/s): ", "c", "s");
				double amount = Validator.getDoubleWithinRange(sc, "Amount ",
						0, 10000);
				// check if the user wants to deposit into checking account and
				// get the amount
				if (accountType.equalsIgnoreCase("c")) {
					c.setAmount(amount);
					// call the deposit method
					double sum = c.deposit();
					Account.setCheckingBalance(sum);
					// compute the final balances
					s.finalBalance();

				}
				// check if the user wants to deposit into savings account and
				// get the amount
				else if (accountType.equalsIgnoreCase("s")) {
					s.setAmount(amount);
					// call the deposit method
					double sum = s.deposit();
					Account.setSavingsBalance(sum);
					// compute the final balances
					s.finalBalance();
				} else {
					System.out
							.println("This entry is invalid. Please try again");
				}
			} else {
				System.out.println("This entry is invalid. Please try again");
			}
			choice = Validator.getRequiredString(sc, "Continue? (y/n): ");
			System.out.println();

		}
		// display the checking fee and savings interest payment for the month
		System.out.println("Monthly Payments and Fees");
		System.out.println("Checking fee: " + c.getFormattedCHECKING_FEE());
		System.out.println("Savings interest payment: "
				+ s.getFormattedSavingsInterest());
		System.out.println();
		// display the final balances after all the transactions
		System.out.println("Final balances");
		print(c);
		print(s);

	}

	// print the output on the console
	private static void print(Account a) {
		System.out.println(a.toString());
	}
}
