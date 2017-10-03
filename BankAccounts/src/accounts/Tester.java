package accounts;

public class Tester {

	public static void main(String[] args) {
		
		SavingsAccount acc1 = new SavingsAccount(1,1000);
		SavingsAccount acc2 = new SavingsAccount(2,50);
		SpecialAccount acc3 = new SpecialAccount(0,0,0);
		Bank bank= new Bank();
		System.out.println(acc1.equals(acc2));
		
		acc3.depositMoney(105);
		for(int i=0; i<25; i++)
			acc3.depositCheck(10);
		try
		{
			System.out.println(acc1.extractMoney(400));
			System.out.println(acc2.extractMoney(100));
			System.out.println(bank.extractMoney(acc2,100));
		}catch (InsufficientFundsException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println(acc1);
		System.out.println(acc1.hashCode());
		System.out.println(acc3);

	}

}
