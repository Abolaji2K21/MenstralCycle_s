import java.util.Scanner;

public class ValidPhoneApp {
    private static Scanner input = new Scanner(System.in);
    private static ValidPhoneBook phoneBook = new ValidPhoneBook();


    public static void main(String[] args) {

        while (true) {
            System.out.println("\nPhonebook Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. View Contacts");
            System.out.println("4. Erase Contact");
            System.out.println("5. Edit Contact Name");
            System.out.println("6. Edit Contact Phone Number");
            System.out.println("7. Exit");
            System.out.print("\nEnter your choice (1-7): ");

            int userInput = input.nextInt();
            input.nextLine();

            switch (userInput) {
                case 1:
                    addContact();
                    break;
                case 2:
                    searchContact();
                    break;
                case 3:
                    viewContacts();
                    break;
                case 4:
                    eraseContact();
                    break;
                case 5:
                    editContactName();
                    break;
                case 6:
                    editContactPhoneNumber();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter contact name: ");
        String name = input.nextLine();
        System.out.print("Enter contact phone number: ");
        String phoneNumber = input.nextLine();
        try {
            phoneBook.addContact(name, phoneNumber);
            System.out.println("Contact added successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void searchContact() {
        System.out.print("Enter contact name to search: ");
        String searchName = input.nextLine();
        System.out.println(phoneBook.searchContact(searchName));
    }

    private static void viewContacts() {
        System.out.println(phoneBook.viewContacts());
    }

    private static void eraseContact() {
        System.out.print("Enter contact name to erase: ");
        String eraseName = input.nextLine();
        try {
            phoneBook.eraseContact(eraseName);
            System.out.println("Contact erased successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Contact not found.");
        }
    }

    private static void editContactName() {
        System.out.print("Enter contact name to edit: ");
        String editName = input.nextLine();
        try {
            System.out.print("Enter new name: ");
            String newName = input.nextLine();
            phoneBook.editContactName(editName, newName);
            System.out.println("Contact name updated successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void editContactPhoneNumber() {
        System.out.print("Enter contact name to edit: ");
        String editNumberName = input.nextLine();
        try {
            System.out.print("Enter new phone number: ");
            String newNumber = input.nextLine();
            phoneBook.editContactPhoneNumber(editNumberName, newNumber);
            System.out.println("Contact phone number updated successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
