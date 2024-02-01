import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PhoneBook_sTest {

    @Test
    void testIfTheAppWorks() {
        PhoneBook_s myPhoneBook_s = new PhoneBook_s();
        assertNotNull(myPhoneBook_s);
    }

    @Test
    void testThatUserChoiceIsValid(){
        PhoneBook_s myPhoneBook_s = new PhoneBook_s();

        myPhoneBook_s.setUserChoice(1);
        assertEquals(1, myPhoneBook_s.getUserChoice());

    }

    @Test
    void testThatUserChoiceIsNotValid() {
        PhoneBook_s myPhoneBook_s = new PhoneBook_s();

       myPhoneBook_s.setUserChoice(6);
       assertNotEquals(0, myPhoneBook_s.getUserChoice());
    }

    @Test
    void deleteEntry() {
    }

    @Test
    void checkEntry() {
    }

    @Test
    void displayContacts() {
    }

    @Test
    void TestcreateContact() {
        PhoneBook_s myPhoneBook_s = new PhoneBook_s();

        myPhoneBook_s.createContact();

    }
}