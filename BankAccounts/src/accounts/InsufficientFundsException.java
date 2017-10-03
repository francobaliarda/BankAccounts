package accounts;

@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception {
	private static final String MESSAGE = "Error: Account is out of funds.";
	
	public InsufficientFundsException (){
		super(MESSAGE);
	}
}
