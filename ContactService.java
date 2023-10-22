package contact.pkg;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	Map<String, Contact> contactMap = new HashMap<String, Contact>();
	
	//Method for testing - allows the testing file "ContactServiceTest.java" access to the created 'Contact' object and it's values
	public Contact getContactObject(String id) {
		Contact contact = contactMap.get(id);
		return contact;
	}
	
	//Method for testing - allows the testing file "ContactServiceTest.java" access to the created 'contactMap' and it's keys and values
	public Map<String, Contact> getContactMap() {
		return contactMap;
	}
	
	public void addContact(String id, String firstName, String lastName, String phoneNum, String address) {
		Contact newContact = new Contact(id, firstName, lastName, phoneNum, address);
		if(contactMap.containsKey(id)) {
			throw new IllegalArgumentException("This ID value already exists, please choose new ID");
		} else {
			contactMap.put(id, newContact);
		}	
	}
	
	public void deleteContact(String id) {
		if(contactMap.containsKey(id)) {
			contactMap.remove(id);
		} else {
			throw new IllegalArgumentException("This ID value is not associated with any contact");
		}
	}
	
	public void updateFirstName(String id, String newFirstName) {
		if(contactMap.containsKey(id)) {
			contactMap.get(id).setFirstName(newFirstName);
		} else {
			throw new IllegalArgumentException("This ID value is not associated with any contact");
		}
	}
	
	public void updateLastName(String id, String newLastName) {
		if(contactMap.containsKey(id)) {
			contactMap.get(id).setLastName(newLastName);
		} else {
			throw new IllegalArgumentException("This ID value is not associated with any contact");
		}
	}
	
	public void updatePhoneNum(String id, String newPhoneNum) {
		if(contactMap.containsKey(id)) {
			contactMap.get(id).setPhoneNum(newPhoneNum);
		} else {
			throw new IllegalArgumentException("This ID value is not associated with any contact");
		}
	}
	
	public void updateAddress(String id, String newAddress) {
		if(contactMap.containsKey(id)) {
			contactMap.get(id).setAddress(newAddress);
		} else {
			throw new IllegalArgumentException("This ID value is not associated with any contact");
		}
	}
}
