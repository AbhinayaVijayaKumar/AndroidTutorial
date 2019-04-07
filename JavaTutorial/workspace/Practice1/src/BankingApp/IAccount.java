package BankingApp;
// interface which contains methods to withdraw, deposit and compute the final balances
public interface IAccount {
	
	public abstract double withdraw();

	public abstract double deposit();

	public abstract double finalBalance();

}
