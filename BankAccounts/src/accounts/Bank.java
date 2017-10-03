package accounts;

public  class Bank {
	
	public Bank(){
		
	}
	public float extractMoney(BankAccount account, float amount) throws InsufficientFundsException{
		return account.extractMoney(amount);
	}

}
