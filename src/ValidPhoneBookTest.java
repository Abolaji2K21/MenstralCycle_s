import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidPhoneBookTest {

    @Test
    void addContact_ValidInput_ShouldAddContact() {
        ValidPhoneBook phoneBook = new ValidPhoneBook();
        phoneBook.addContact("Bee_Jay", "1234567890");
        assertTrue(phoneBook.getContactNames().contains("Bee_Jay"));
        assertTrue(phoneBook.getPhoneNumbers().contains("1234567890"));
    }

    @Test
    void addContact_MultipleContacts_ShouldAddAllContacts() {
        ValidPhoneBook phoneBook = new ValidPhoneBook();
        phoneBook.addContact("Bee_Jay", "1234567890");
        phoneBook.addContact("Jane Smith", "9876543210");
        assertEquals(2, phoneBook.getContactNames().size());
        assertEquals(2, phoneBook.getPhoneNumbers().size());
    }

    @Test
    void searchContact_ExistingContact_ShouldReturnContactInfo() {
        ValidPhoneBook phoneBook = new ValidPhoneBook();
        phoneBook.addContact("Jane Smith", "9876543210");
        String expected = "Name: Jane Smith\nNumber: 9876543210";
        assertEquals(expected, phoneBook.searchContact("Jane Smith"));
    }

    @Test
    void searchContact_NonExistingContact_ShouldReturnNoContactFound() {
        ValidPhoneBook phoneBook = new ValidPhoneBook();
        assertEquals("No contact found", phoneBook.searchContact("Bee_Jay"));
    }

    @Test
    void eraseContact_ExistingContact_ShouldRemoveContact() {
        ValidPhoneBook phoneBook = new ValidPhoneBook();
        phoneBook.addContact("Bee_Jay", "1234567890");
        phoneBook.eraseContact("Bee_Jay");
        assertFalse(phoneBook.getContactNames().contains("Bee_Jay"));
        assertFalse(phoneBook.getPhoneNumbers().contains("1234567890"));
    }

    @Test
    void editContactName_ExistingContact_ShouldUpdateContactName() {
        ValidPhoneBook phoneBook = new ValidPhoneBook();
        phoneBook.addContact("Bee_Jay", "1234567890");
        phoneBook.editContactName("Bee_Jay", "Jane Smith");
        assertTrue(phoneBook.getContactNames().contains("Jane Smith"));
    }

    @Test
    void editContactPhoneNumber_ExistingContact_ShouldUpdatePhoneNumber() {
        ValidPhoneBook phoneBook = new ValidPhoneBook();
        phoneBook.addContact("Bee_Jay", "1234567890");
        phoneBook.editContactPhoneNumber("Bee_Jay", "9876543210");
        assertTrue(phoneBook.getPhoneNumbers().contains("9876543210"));
    }

    @Test
    void viewContacts_EmptyPhonebook_ShouldReturnEmptyMessage() {
        ValidPhoneBook phoneBook = new ValidPhoneBook();
        assertEquals("Phonebook is empty", phoneBook.viewContacts());
    }

    @Test
    void viewContacts_NonEmptyPhonebook_ShouldReturnContacts() {
        ValidPhoneBook phoneBook = new ValidPhoneBook();
        phoneBook.addContact("Bee_Jay", "1234567890");
        String expected = "Name: Bee_Jay\nNumber: 1234567890\n\n";
        assertEquals(expected, phoneBook.viewContacts());
    }

    @Test
    void eraseContact_NonExistingContact_ShouldNotModifyPhonebook() {
        ValidPhoneBook phoneBook = new ValidPhoneBook();
        phoneBook.addContact("Bee_Jay", "1234567890");
        assertThrows(IllegalArgumentException.class, () -> phoneBook.eraseContact("Jane Smith"));
    }

    @Test
    void editContactName_NonExistingContact_ShouldNotModifyPhonebook() {
        ValidPhoneBook phoneBook = new ValidPhoneBook();
        phoneBook.addContact("Bee_Jay", "1234567890");
        assertThrows(IllegalArgumentException.class, ()->phoneBook.editContactName("Jane Smith", "New Name"));
    }

    @Test
    void editContactPhoneNumber_NonExistingContact_ShouldNotModifyPhonebook() {
        ValidPhoneBook phoneBook = new ValidPhoneBook();
        phoneBook.addContact("Bee_Jay", "1234567890");
        assertThrows(IllegalArgumentException.class, ()->phoneBook.editContactPhoneNumber("Jane Smith", "9876543210"));
    }

    @Test
    void addContact_EmptyName_ShouldNotAddContact() {
        ValidPhoneBook phoneBook = new ValidPhoneBook();
        assertThrows(IllegalArgumentException.class, () -> phoneBook.addContact("", "1234567890"));
    }

    @Test
    void addContact_EmptyPhoneNumber_ShouldNotAddContact() {
        ValidPhoneBook phoneBook = new ValidPhoneBook();
        assertThrows(IllegalArgumentException.class, () ->phoneBook.addContact("John Doe", ""));

    }
}
