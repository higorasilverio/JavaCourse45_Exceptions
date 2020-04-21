package entities.exceptions;

public class WithdrawError extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public WithdrawError(String msg) {
		super(msg);
	}

}
