package accounts;

public class SpecialAccount extends BankAccount {
	private int points;
	private int checkCount;
	private static final int CASH_POINT = 10;
	private static final int CHECK_POINT = 5;

	public SpecialAccount(int id, float balance,int points){
		super(id,balance);
		this.points=points;
		this.checkCount=0;
	}
	
	public int getPoints(){
		return points;
	}
	public float depositMoney(float amount){
		points+=(int)(amount / CASH_POINT);
		return super.depositMoney(amount);
	}
	public float depositCheck(float amount){
		points+=(int)(amount / CASH_POINT);
		if((++checkCount % CHECK_POINT) == 0)
			points++;
		return super.depositMoney(amount);
	}
	
	@Override
	public String toString(){
		return "Account Type: Special Account \n" + super.toString() 
				+ "\nPoints: " + points;
	}
	@Override
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(!(obj instanceof SpecialAccount))
			return false;
		SpecialAccount other = (SpecialAccount)obj;
		return (Double.compare(balance, other.balance)==0
				&& points==other.points
				&& checkCount==other.checkCount);
	}
	@Override
	public int hashCode(){
		int hash=super.hashCode();
		hash=hash*31 + points;
		hash=hash*31 + checkCount;
		return hash;
	}
}
