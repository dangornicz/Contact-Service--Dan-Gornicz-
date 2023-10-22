package contact.pkg;

public class Contact {
	
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;

	public Contact(String id, String firstName, String lastName, String phoneNum, String address) {
		if(id == null || id.length() > 10) {
			throw new IllegalArgumentException("ID field is required and cannot be longer than 10 charcters");
	    }
	    if(firstName == null || firstName.length() > 10) {
	        throw new IllegalArgumentException("First name field is required and cannot be longer than 10 charcters");
	    }
	    if(lastName == null || lastName.length() > 10) {
	        throw new IllegalArgumentException("Last name field is required and cannot be longer than 10 charcters");
	    }
	    if(phoneNum == null || phoneNum.length() != 10) {
	        throw new IllegalArgumentException("Phone number field is required and must be exactly 10 charcters");
	    }
	    if(address == null || address.length() > 30) {
	        throw new IllegalArgumentException("Address field is required and cannot be longer than 30 charcters");
	    }
	    
	    this.id = id;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.phoneNum = phoneNum;
	    this.address = address;
	}
	
	//get methods
	public String getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getAddress() {
		return address;
	}
	
	//set methods (no setter for id value)
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length() > 10) {
	        throw new IllegalArgumentException("First name field is required and cannot be longer than 10 charcters");
	    } else {
	    	this.firstName = firstName;
	    }
	}
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {
	        throw new IllegalArgumentException("Last name field is required and cannot be longer than 10 charcters");
	    } else {
	    	this.lastName = lastName;
	    }
	}
	public void setPhoneNum(String phoneNum) {
		if(phoneNum == null || phoneNum.length() != 10) {
	        throw new IllegalArgumentException("Phone number field is required and must be exactly 10 charcters");
	    } else {
	    	this.phoneNum = phoneNum;
	    }
	}
	public void setAddress(String address) {
		if(address == null || address.length() > 30) {
	        throw new IllegalArgumentException("Address field is required and cannot be longer than 30 charcters");
	    } else {
	    	this.address = address;
	    }
	}
}
