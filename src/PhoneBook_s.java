import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBook_s {
    private static int userChoice;
    private static String name;
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> contactName = new ArrayList<>();
    private static ArrayList<Long> contactNumber = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            userChoice = welcome();
            switch (userChoice) {
                case 1:
                    if (displayContacts()) {
                        System.out.println("Loading >>>>>>>>>>>>>>>>>>>>>>>>>>>" );
                        System.out.println("Displayed successfully.");

                    } else {
                        System.out.println("Loading >>> >>>  >>>>  >>>>>>>>>> >>>>>>>" );
                        System.out.println("Failed to load contacts.");
                        System.out.println("No contacts available.");

                    }
                    input.nextLine();
                    break;
                case 2:
                    if (createContact()) {
                        System.out.println("Creating Contact.");
                        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>" );
                        System.out.println("Contacted Created Successfully" );
                        System.out.println();
                    } else {
                        System.out.println("Loading >>> >>>  >>>>  >>>>>>>>>> >>>>>>>" );
                        System.out.println("Failed to create contact.");

                    }
                    input.nextLine();
                    break;
                case 3:
                    if (checkEntry()) {
                        System.out.println("Searching  >>>>>>>>>>>>>>>>>>>>>>>>>>>" );
                        System.out.println("Wawu!!! Contact found.");
                    } else {
                        System.out.println("Searching  >>>>>>>>>>>>>>>>>>>>>>>>>>>" );
                        System.out.println("Whoops!!! Contact not found.");
                    }
                    input.nextLine();
                    break;
                case 4:
                    if (deleteEntry()) {
                        System.out.println("Loading >>>>>>>>>>>>>>>>>>>>>>>>>>>" );
                        System.out.println("Contact deleted successfully.");
                    } else {
                        System.out.println("Loading >>> >>>  >>>>  >>>>>>>>>> >>>>>>>" );

                        System.out.println("Failed to delete contact.");
                    }
                    input.nextLine();
                    break;
                case 5:
                    System.out.println("Exiting >>> >>>  >>>>  >>>>>>>>>> >>>>>>>");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
    public static void setUserChoice(int choice){
        userChoice = choice;
    }
    public static int getUserChoice(){
        return userChoice;
    }

    public static int welcome() {
        System.out.println("Welcome To Phone_Book :");
        System.out.println(">>> Bjay Contact Book Command are : 1,2,3,4 or 5 <<<");
        System.out.println(">>> What Would You Like To Do? <<<");
        System.out.println("[1]. Display Your Existing Contacts");
        System.out.println("[2]. Create a New Contact");
        System.out.println("[3]. Check An Entry ");
        System.out.println("[4]. Delete An Entry");
        System.out.println("[5]. Exit");
        System.out.println();
        System.out.print("Enter Your Entry here (1, 2, 3, 4 or 5):  ");
        return input.nextInt();
    }

    public static boolean deleteEntry() {
        input.nextLine();
        System.out.print("Enter contact name to delete: ");
        name = input.next();
        int index = contactName.indexOf(name);
        if (index != -1) {
            contactName.remove(index);
            contactNumber.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkEntry() {
        input.nextLine();
        System.out.print("Enter contact name to check: ");
        name = input.next();
        return contactName.contains(name);

    }

    public static boolean displayContacts() {
        System.out.println("Existing Contacts:");
        if (!contactName.isEmpty()) {
            for (int check = 0; check < contactName.size(); check ++) {
                System.out.println("Name: " + contactName.get(check));
                System.out.println();
                System.out.println("Number: " + contactNumber.get(check));

            }
            return true;
        } else {
            return false;
        }
    }

    public static boolean createContact() {
        input.nextLine();
        System.out.print("Enter contact name: ");
        name = input.nextLine();
        System.out.print("Enter contact number: ");
        Long num = input.nextLong();
        contactName.add(name);
        contactNumber.add(num);
        return true;
    }
}
