package contact.pkg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	String id = "dangornicz";
	String firstName = "Dan";
	String lastName = "Gornicz";
	String phoneNum = "1800800000";
	String address = "1 Main St. NY, NY 09900";
	String tooLong = "thisiswaytoolonganditneedstobeshorter";
	String testVar = "changeitup";
	
	@Test
	void testContactClass() {
		Contact contact = new Contact(id, firstName, lastName, phoneNum, address);
		
		assertEquals(id, contact.getId());
		assertEquals(firstName, contact.getFirstName());
		assertEquals(lastName, contact.getLastName());
		assertEquals(phoneNum, contact.getPhoneNum());
		assertEquals(address, contact.getAddress());
	}
	
	@Test
	void testContactClassIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, firstName, lastName, phoneNum, address); 
		});
	}
	
	@Test
	void testContactClassIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(tooLong, firstName, lastName, phoneNum, address); 
		});
	}
	
	@Test
	void testContactClassFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, null, lastName, phoneNum, address); 
		});
	}
	
	@Test
	void testContactClassFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, tooLong, lastName, phoneNum, address); 
		});
	}
	
	@Test
	void testContactClassLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, null, phoneNum, address); 
		});
	}
	
	@Test
	void testContactClassLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, tooLong, phoneNum, address); 
		});
	}
	
	@Test
	void testContactClassPhoneNumNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, null, address); 
		});
	}
	
	@Test
	void testContactClassPhoneNumTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, tooLong, address);  
		});
	}
	
	@Test
	void testContactClassAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, phoneNum, null); 
		});
	}
	
	@Test
	void testContactClassAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, phoneNum, tooLong); 
		});
	}
	
	@Test
	void testContactClassSetters() {
		Contact contact = new Contact(id, firstName, lastName, phoneNum, address);
		
		contact.setFirstName(testVar);
		contact.setLastName(testVar);
		contact.setPhoneNum(testVar);
		contact.setAddress(testVar);
		
		assertEquals(testVar, contact.getFirstName());
		assertEquals(testVar, contact.getLastName());
		assertEquals(testVar, contact.getPhoneNum());
		assertEquals(testVar, contact.getAddress());
	}
	
	@Test
	void testContactClassSetFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phoneNum, address);
			contact.setFirstName(null);
		});
	}
	
	@Test
	void testContactClassSetFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phoneNum, address);
			contact.setFirstName(tooLong);
		});
	}
	
	@Test
	void testContactClassSetLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phoneNum, address);
			contact.setLastName(null);
		});
	}
	
	@Test
	void testContactClassSetLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phoneNum, address);
			contact.setLastName(tooLong);
		});
	}
	
	@Test
	void testContactClassSetPhoneNumNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phoneNum, address);
			contact.setPhoneNum(null);
		});
	}
	
	@Test
	void testContactClassSetPhoneNumTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phoneNum, address);
			contact.setPhoneNum(tooLong);
		});
	}
	
	@Test
	void testContactClassSetAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phoneNum, address);
			contact.setAddress(null);
		});
	}
	
	@Test
	void testContactClassSetAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phoneNum, address);
			contact.setAddress(tooLong);
		});
	}

}
