package accounts;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(int id, float balance){
		super(id,balance);
	}
	public SavingsAccount(SavingsAccount acc){
		super(acc);
	}
	
	public float extractMoney(float amount) throws InsufficientFundsException{
		if((Float.compare(getBalance(),amount))>=0)
		{
			return super.extractMoney(amount);
		}
		else
			throw new InsufficientFundsException();
	}
	
	@Override
	public String toString(){
		return "Account Type: Savings Account" + "\n" + super.toString();
	}
	@Override
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(!(obj instanceof SavingsAccount))
			return false;
		SavingsAccount account=(SavingsAccount)obj;
		return (id==account.id && Float.compare(balance,account.balance)==0);
	}
	@Override
	public int hashCode(){
		return super.hashCode();
	}
}
