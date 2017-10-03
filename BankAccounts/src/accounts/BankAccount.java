package accounts;

public abstract class BankAccount {
	protected int id;
	protected float balance;
	
	public BankAccount(int id, float balance){
		this.id=id;
		this.balance=balance;
	}
	public BankAccount(BankAccount acc){
		this.id=acc.id;
		this.balance=acc.balance;
	}
	
	public float getBalance(){
		return balance;
	}
	public int getId(){
		return id;
	}
	public float depositMoney(float amount){
		balance+=amount;
		return balance;
	}
	public float extractMoney(float amount) throws InsufficientFundsException{
		balance-=amount;
		return balance;
	}
	
	@Override
	public String toString(){
		return "ID: " + id + "\nBalance: " + "$" + balance;
	}
	@Override
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(!(obj instanceof BankAccount))
			return false;
		BankAccount account=(BankAccount)obj;
		return (id==account.id && Float.compare(balance,account.balance)==0);
	}
	@Override
	public int hashCode(){
		int hash=17;
		hash=hash*31 + id;
		hash=hash*31 + Float.floatToIntBits(balance);
		return hash;
	}
}
