import java.util.Scanner;

public class PhoneBook {

    private String name;
    private String phoneNumber;

    private String emailAddress;
    private String contactManagement;
    private String searchAndFilter;
    private String contactDetails;
    private String securityAndPrivacy;
    private long addNewNumber;


    private Scanner input = new Scanner(System.in);

    public String getContactManagement() {
        return contactManagement;
    }

    public void setContactManagement(String contactManagement) {
        this.contactManagement = contactManagement;
    }

    private void setAddNewNumber(long addNewNumber){
        this.addNewNumber = addNewNumber;
    }

    private long addNewNumber(){
        return addNewNumber;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getSecurityAndPrivacy() {
        return securityAndPrivacy;
    }

    public void setSecurityAndPrivacy(String securityAndPrivacy) {
        this.securityAndPrivacy = securityAndPrivacy;
    }

    public void displayWelcomingMessage() {
        PhoneBook myPhoneBook = new PhoneBook();

        System.out.println("Welcome To Phone_Book :");
        System.out.println("Kindly Enter 1 To Add New Number :");
        System.out.println("Kindly Enter 2 To Edit Existing Number :");

        int userChoice = input.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Enter contact name:");
                name = input.nextLine();
                System.out.println("Enter phone number:");
                phoneNumber = input.nextLine();
                System.out.println("Enter phone number:");
               emailAddress = input.nextLine();
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>" );
                System.out.println("Saved Successfully" );

                break;
            case 2:

                System.out.println("Enter the contact name you wish to edit:");
                name = input.nextLine();
                System.out.println("Enter the correct phone number :");
                phoneNumber = input.nextLine();
                System.out.println("Enter the correct email address:");
                emailAddress = input.nextLine();
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>" );
                System.out.println("Saved Successfully" );

                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
