package career.data.inexcel.response;

public class ExcelResponse {
	private String status;
	private String statusCode;
	private String message;
	private String description;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 
	 */
	public ExcelResponse() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param status
	 * @param statusCode
	 * @param message
	 * @param description
	 */
	public ExcelResponse(String status, String statusCode, String message, String description) {
		super();
		this.status = status;
		this.statusCode = statusCode;
		this.message = message;
		this.description = description;
	}
	/**
	 * @param status
	 * @param statusCode
	 * @param message
	 */
	public ExcelResponse(String status, String statusCode, String message) {
		super();
		this.status = status;
		this.statusCode = statusCode;
		this.message = message;
	}
	/**
	 * @param status
	 * @param statusCode
	 */
	public ExcelResponse(String status, String statusCode) {
		super();
		this.status = status;
		this.statusCode = statusCode;
	}

}
