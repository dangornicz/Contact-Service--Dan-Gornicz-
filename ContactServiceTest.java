package contact.pkg;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	String id = "dangornicz";
	String firstName = "Dan";
	String lastName = "Gornicz";
	String phoneNum = "1800800000";
	String address = "1 Main St. NY, NY 09900";
	String testVar = "changeitup";
	ContactService contactService = new ContactService();
	
	@Test
	void testAddContact() {
		contactService.addContact(id, firstName, lastName, phoneNum, address);
		Contact contact = contactService.getContactObject(id);
		
		assertEquals(id, contact.getId());
		assertEquals(firstName, contact.getFirstName());
		assertEquals(lastName, contact.getLastName());
		assertEquals(phoneNum, contact.getPhoneNum());
		assertEquals(address, contact.getAddress());	
	}
	
	@Test
	void testAddContactDuplicateId() {
		contactService.addContact(id, firstName, lastName, phoneNum, address);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact(id, firstName, lastName, phoneNum, address);
		});
	}
	
	@Test
	void testDeleteContact() {
		contactService.addContact(id, firstName, lastName, phoneNum, address);
		//addition of contact tested implicitly by if-statement in deleteContact() method
		
		contactService.deleteContact(id);
		Map<String, Contact> contactMap = contactService.getContactMap();
		assertFalse(contactMap.containsKey(id));
	}
	
	@Test
	void testDeleteContactIdNonexistent() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.deleteContact(id);
		});
	}
	
	@Test
	void testUpdateFirstName() {
		contactService.addContact(id, firstName, lastName, phoneNum, address);
		//addition of contact tested implicitly by if-statement in update method
		
		contactService.updateFirstName(id, testVar);
		Contact contact = contactService.getContactObject(id);
		assertEquals(testVar, contact.getFirstName());
	}
	
	@Test
	void testUpdateFirstNameIdNonexistent() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.updateFirstName(id, testVar);
		});	
	}
	
	@Test
	void testUpdateLastName() {
		contactService.addContact(id, firstName, lastName, phoneNum, address);
		//addition of contact tested implicitly by if-statement in update method
		
		contactService.updateLastName(id, testVar);
		Contact contact = contactService.getContactObject(id);
		assertEquals(testVar, contact.getLastName());
	}
	
	@Test
	void testUpdateLastNameIdNonexistent() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.updateLastName(id, testVar);
		});	
	}
	
	@Test
	void testUpdatePhoneNum() {
		contactService.addContact(id, firstName, lastName, phoneNum, address);
		//addition of contact tested implicitly by if-statement in update method
		
		contactService.updatePhoneNum(id, testVar);
		Contact contact = contactService.getContactObject(id);
		assertEquals(testVar, contact.getPhoneNum());
	}
	
	@Test
	void testUpdatePhoneNumIdNonexistent() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.updatePhoneNum(id, testVar);
		});	
	}
	
	@Test
	void testUpdateAddress() {
		contactService.addContact(id, firstName, lastName, phoneNum, address);
		//addition of contact tested implicitly by if-statement in update method
		
		contactService.updateAddress(id, testVar);
		Contact contact = contactService.getContactObject(id);
		assertEquals(testVar, contact.getAddress());
	}
	
	@Test
	void testUpdateAddressIdNonexistent() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.updateAddress(id, address);
		});	
	}

}
