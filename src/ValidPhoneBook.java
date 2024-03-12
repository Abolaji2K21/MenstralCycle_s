import java.util.ArrayList;

public class ValidPhoneBook {
    private final ArrayList<String> contactNames;
    private final ArrayList<String> phoneNumbers;

    public ValidPhoneBook() {
        contactNames = new ArrayList<>();
        phoneNumbers = new ArrayList<>();
    }

    public void addContact(String contactName, String phoneNumber) {
        if (contactName.isEmpty()){
            throw new IllegalArgumentException("You need a name ");
        } else if (phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("You need a phone number ");
        }
        contactNames.add(contactName);
        phoneNumbers.add(phoneNumber);
    }

    public String searchContact(String contactName) {
        for (int i = 0; i < contactNames.size(); i++) {
            if (contactNames.get(i).equalsIgnoreCase(contactName)) {
                return "Name: " + contactNames.get(i) + "\nNumber: " + phoneNumbers.get(i);
            }
        }
        return "No contact found";
    }

    public String viewContacts() {
        if (contactNames.isEmpty()) {
            return "Phonebook is empty";
        }
        StringBuilder allContacts = new StringBuilder();
        for (int i = 0; i < contactNames.size(); i++) {
            allContacts.append("Name: ").append(contactNames.get(i)).append("\nNumber: ").append(phoneNumbers.get(i)).append("\n\n");
        }
        return allContacts.toString();
    }

    public void eraseContact(String contactName) {
        int index = contactNames.indexOf(contactName);
        if (index == -1) {
            throw new IllegalArgumentException("Contact not found");
        }
        contactNames.remove(index);
        phoneNumbers.remove(index);
    }



    public void editContactName(String contactName, String newName) {
        int index = contactNames.indexOf(contactName);
        if (index != -1) {
            contactNames.set(index, newName);
        } else {
            throw new IllegalArgumentException("Contact not found");
        }
    }

    public void editContactPhoneNumber(String contactName, String newNumber) {
        int index = contactNames.indexOf(contactName);
        if (index != -1) {
            phoneNumbers.set(index, newNumber);
        } else {
            throw new IllegalArgumentException("Contact not found");
        }
    }

    public ArrayList<String> getContactNames() {
        return contactNames;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }
}
