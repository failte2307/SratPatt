package Observer;

public class Customer {
	
	private int customerId;
	
	private String name;
	
	private String email;
	
	private String mobileNo;
	
	private String address;
	
	private int creditRating;
	
	private boolean isEmail; 
	
	private boolean isMobileNo;
	
	private boolean isAddress;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(int creditRating) {
		this.creditRating = creditRating;
	}

	public boolean isEmail() {
		return isEmail;
	}

	public void setEmail(boolean isEmail) {
		this.isEmail = isEmail;
	}

	public boolean isMobileNo() {
		return isMobileNo;
	}

	public void setMobileNo(boolean isMobileNo) {
		this.isMobileNo = isMobileNo;
	}

	public boolean isAddress() {
		return isAddress;
	}

	public void setAddress(boolean isAddress) {
		this.isAddress = isAddress;
	}

	public Customer(int customerId, String name, String email, String mobileNo, String address, int creditRating,
			boolean isEmail, boolean isMobileNo, boolean isAddress) {
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.address = address;
		this.creditRating = creditRating;
		this.isEmail = isEmail;
		this.isMobileNo = isMobileNo;
		this.isAddress = isAddress;
	}
	
	
	
	

}