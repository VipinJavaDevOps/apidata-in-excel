package career.data.inexcel.customException;

public class ValidationErrorMessage extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public ValidationErrorMessage(String message) {
		super(message);
	}

}
