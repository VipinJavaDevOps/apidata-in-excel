package career.data.inexcel.model;

public class Excelheadermodel {
    
	private String name;
	private String email;
	private String mobileNumber;
	private String city;
	private String state;
	private String chooseFile;
	private String massage;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the chooseFile
	 */
	public String getChooseFile() {
		return chooseFile;
	}
	/**
	 * @param chooseFile the chooseFile to set
	 */
	public void setChooseFile(String chooseFile) {
		this.chooseFile = chooseFile;
	}
	/**
	 * @return the massage
	 */
	public String getMassage() {
		return massage;
	}
	/**
	 * @param massage the massage to set
	 */
	public void setMassage(String massage) {
		this.massage = massage;
	}
	/**
	 * @param name
	 * @param email
	 * @param mobileNumber
	 * @param city
	 * @param state
	 * @param chooseFile
	 * @param massage
	 */
	public Excelheadermodel(String name, String email, String mobileNumber, String city, String state,
			String chooseFile, String massage) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.city = city;
		this.state = state;
		this.chooseFile = chooseFile;
		this.massage = massage;
	}
	/**
	 * 
	 */
	public Excelheadermodel() {
		// TODO Auto-generated constructor stub
	}

}
