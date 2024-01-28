import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;

public class MenstrualCycle {
    private static Scanner input = new Scanner(System.in);
    private static int currentYear = LocalDate.now().getYear();
    private static String fullName;

    private static String gender;
    private static int lastPeriodDay;
    private static int lastPeriodMonth;
    private static int averageCycle;
    private static int age;


    public static void main(String[] args) {
        try {


            System.out.print("Enter the first day of your last period: ");
            int lastPeriodDay = input.nextInt();
            System.out.println(lastPeriodDay);
        }catch (InputMismatchException e){
            System.out.println("wrong value");
        }

        displayWelcomingCode();
        displayFirstSetOfQuestions();
        System.out.println(calculateAndDisplayCycleInfo(getLastPeriodMonth(), getLastPeriodDay()));
    }

    public static void setFullName(String fullName) {
        MenstrualCycle.fullName = fullName;
    }

    public static void setGender(String gender) {
        MenstrualCycle.gender = gender;
    }

    public static int getLastPeriodDay() {
        return lastPeriodDay;
    }

    public static void setLastPeriodDay(int lastPeriodDay) {
        MenstrualCycle.lastPeriodDay = lastPeriodDay;
    }

    public static int getLastPeriodMonth() {
        return lastPeriodMonth;
    }

    public static void setLastPeriodMonth(int lastPeriodMonth) {
        MenstrualCycle.lastPeriodMonth = lastPeriodMonth;
    }

    public static int getAverageCycle() {
        return averageCycle;
    }

    public static void setAverageCycle(int averageCycle) {
        MenstrualCycle.averageCycle = averageCycle;
    }

    public static void setAge(int age) {
        MenstrualCycle.age = age;
    }

    private static String getFullName() {
        System.out.print("Kindly Enter Your Full Name: ");
        fullName = input.nextLine();
        return fullName;
    }

    private static String getGender() {
        System.out.print("Kindly Enter Your Gender (male/female): ");
        gender = input.nextLine().toUpperCase();
        if (gender.equals("F")) {
            return gender;
        } else if (gender.equals("M")) {
            System.out.println("Kindly Exit, This App is Not Suitable for Your Gender.");
            System.exit(0);
            return gender;
        } else {
            System.out.println("Invalid Input. Please Enter 'M' for Male or 'F' for Female.");
            return getGender();
        }

    }


    private static int getAge() {
        age = input.nextInt();
        if (age < 10 || age > 65) {
            System.out.println("Sorry, This App Is Not Suitable For Your Age.");
            System.exit(0);
        }
        return age;
    }

    public static void displayWelcomingCode() {
        System.out.println("Welcome To BeeJays MenstrualCycle App!");
        fullName = getFullName();
        System.out.println("Welcome " + fullName);
        gender = getGender();
        System.out.print("Kindly Enter Your Age : ");
        age = getAge();
    }

    static void displayFirstSetOfQuestions() {
        System.out.print("Enter the first day of your last period: ");
        int lastPeriodDay = input.nextInt();
        if (lastPeriodDay < 1 || lastPeriodDay > 31) {
            System.out.println("Invalid input. Day should be between 1 and 31 days.");


        }
        setLastPeriodDay(lastPeriodDay);


        System.out.print("Enter the month of your last period: ");
        int lastPeriodMonth = input.nextInt();
        if (lastPeriodMonth < 1 || lastPeriodMonth > 12) {
            System.out.println("Invalid input. Month should be between 1 and 12 days.");
            System.out.println();
        }
        setLastPeriodMonth(lastPeriodMonth);

        System.out.print("How long is your average cycle (between 20 - 41 days): ");
        int averageCycle = input.nextInt();
        if (averageCycle < 20 || averageCycle > 41) {
            System.out.println("Invalid input. Average Cycle should be between 20 and 41 days.");
            System.out.println();
        }
        setAverageCycle(averageCycle);


    }

    static LocalDate calculateAndDisplayCycleInfo(int lastPeriodMonth, int lastPeriodDay) {
        LocalDate checkPeriodDate = LocalDate.of(currentYear, lastPeriodMonth, lastPeriodDay);
        LocalDate nextPeriodDate = checkPeriodDate.plusDays(averageCycle);
        LocalDate ovulationDate = checkPeriodDate.plusDays(averageCycle - 14);
        LocalDate safeDate = checkPeriodDate.plusDays(ovulationDate.getDayOfMonth() - 5);

        System.out.println("\nCycle Information:");
        System.out.println("Congratulations! You Are Not Pregnant");
        System.out.println("Last Period Date: " + checkPeriodDate);
        System.out.println("Next Period Date: " + nextPeriodDate);
        System.out.println("Ovulation Date: " + ovulationDate);
        System.out.println("Safe Date: " + safeDate);
        return nextPeriodDate;
    }
}
