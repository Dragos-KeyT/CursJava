package curs12.package1;

public class CurrentAccount implements Account {

	public double balance;
	
	@Override
	public void deposit(double amount) throws InvalidAmountException {

		if(amount <= 0) {
			throw new InvalidAmountException(amount + " is not valid!");
		}
		balance = balance + amount;
		
		System.out.println("----------------");
		
	/*	if(amount >0) {
			balance = balance + amount;

		}else {
			throw new InvalidAmountException(amount + " is not valid!");

		} */
		
	}

	@Override
	public void withdraw(double amount) throws InsuficientFundsException {

		if(balance <amount) {
			throw new InsuficientFundsException(" You don`t have sufficent funds!");
		}
		balance =  balance - amount;

	}

	@Override
	public void checkBalance() {

		System.out.println("Current balance is :" + balance);
		
	}

}
