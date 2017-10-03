package accounts;

public class CheckingAccount extends BankAccount {
	
	public CheckingAccount(int id,float balance){
		super(id,balance);
	}
	public CheckingAccount(CheckingAccount acc){
		super(acc);
	}
	
	@Override
	public String toString(){
		return "Account Type: Checking Account" + "\n" + super.toString();
	}
	@Override
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(!(obj instanceof CheckingAccount))
			return false;
		CheckingAccount account=(CheckingAccount)obj;
		return (id==account.id && Float.compare(balance,account.balance)==0);
	}
	@Override
	public int hashCode(){
		return super.hashCode();
	}
}
